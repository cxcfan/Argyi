/*
 *  CPAchecker is a tool for configurable software verification.
 *  This file is part of CPAchecker.
 *
 *  Copyright (C) 2007-2015  Dirk Beyer
 *  All rights reserved.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 *
 *
 *  CPAchecker web page:
 *    http://cpachecker.sosy-lab.org
 */
package org.sosy_lab.cpachecker.cpa.range;

import java.util.Collection;

import org.sosy_lab.common.ShutdownNotifier;
import org.sosy_lab.common.configuration.Configuration;
import org.sosy_lab.common.configuration.InvalidConfigurationException;
import org.sosy_lab.common.configuration.Option;
import org.sosy_lab.common.configuration.Options;
import org.sosy_lab.common.log.LogManager;
import org.sosy_lab.cpachecker.cfa.CFA;
import org.sosy_lab.cpachecker.cfa.model.CFAEdge;
import org.sosy_lab.cpachecker.cfa.model.CFANode;
import org.sosy_lab.cpachecker.core.defaults.AutomaticCPAFactory;
import org.sosy_lab.cpachecker.core.defaults.DelegateAbstractDomain;
import org.sosy_lab.cpachecker.core.defaults.MergeJoinOperator;
import org.sosy_lab.cpachecker.core.defaults.MergeSepOperator;
import org.sosy_lab.cpachecker.core.defaults.SingletonPrecision;
import org.sosy_lab.cpachecker.core.defaults.StaticPrecisionAdjustment;
import org.sosy_lab.cpachecker.core.defaults.StopSepOperator;
import org.sosy_lab.cpachecker.core.interfaces.AbstractDomain;
import org.sosy_lab.cpachecker.core.interfaces.AbstractState;
import org.sosy_lab.cpachecker.core.interfaces.CPAFactory;
import org.sosy_lab.cpachecker.core.interfaces.ConfigurableProgramAnalysisWithBAM;
import org.sosy_lab.cpachecker.core.interfaces.MergeOperator;
import org.sosy_lab.cpachecker.core.interfaces.Precision;
import org.sosy_lab.cpachecker.core.interfaces.PrecisionAdjustment;
import org.sosy_lab.cpachecker.core.interfaces.Reducer;
import org.sosy_lab.cpachecker.core.interfaces.StateSpacePartition;
import org.sosy_lab.cpachecker.core.interfaces.StopOperator;
import org.sosy_lab.cpachecker.core.interfaces.TransferRelation;
import org.sosy_lab.cpachecker.core.interfaces.pcc.ProofChecker;
import org.sosy_lab.cpachecker.exceptions.CPAException;
import org.sosy_lab.cpachecker.exceptions.CPATransferException;

@Options(prefix="cpa.range")
public class RangeCPA implements ConfigurableProgramAnalysisWithBAM, ProofChecker {

  public static CPAFactory factory() {
    return AutomaticCPAFactory.forType(RangeCPA.class);
  }

  @Option(secure=true, name="merge", toUppercase=true, values={"SEP", "JOIN"},
      description="which type of merge operator to use for RangeAnalysis")
  private String mergeType = "SEP";

  private AbstractDomain abstractDomain;
  private MergeOperator mergeOperator;
  private StopOperator stopOperator;
  private TransferRelation transferRelation;
  private PrecisionAdjustment precisionAdjustment;
  private final RangeReducer reducer;

  private RangeCPA(Configuration config, LogManager logger, ShutdownNotifier shutdownNotifier, CFA cfa) throws InvalidConfigurationException {
    config.inject(this);
    abstractDomain = DelegateAbstractDomain.getInstance();
    mergeOperator = mergeType.equals("SEP") ? MergeSepOperator.getInstance() : new MergeJoinOperator(abstractDomain);
    stopOperator = new StopSepOperator(abstractDomain);
    transferRelation = new RangeTransferRelation(config);
    precisionAdjustment = StaticPrecisionAdjustment.getInstance();
    reducer = new RangeReducer();
  }

  @Override
  public AbstractDomain getAbstractDomain() {
    // TODO Auto-generated method stub
    return abstractDomain;
  }

  @Override
  public TransferRelation getTransferRelation() {
    // TODO Auto-generated method stub
    return transferRelation;
  }

  @Override
  public MergeOperator getMergeOperator() {
    // TODO Auto-generated method stub
    return mergeOperator;
  }

  @Override
  public StopOperator getStopOperator() {
    // TODO Auto-generated method stub
    return stopOperator;
  }

  @Override
  public PrecisionAdjustment getPrecisionAdjustment() {
    // TODO Auto-generated method stub
    return precisionAdjustment;
  }

  @Override
  public AbstractState getInitialState(CFANode pNode, StateSpacePartition pPartition) {
    // TODO Auto-generated method stub
    return new RangeState();
  }

  @Override
  public Precision getInitialPrecision(CFANode pNode, StateSpacePartition pPartition) {
    // TODO Auto-generated method stub
    return SingletonPrecision.getInstance();
  }

  @Override
  public Reducer getReducer() {
    // TODO Auto-generated method stub
    return reducer;
  }

  @Override
  public boolean areAbstractSuccessors(AbstractState pState, CFAEdge pCfaEdge,
      Collection<? extends AbstractState> pSuccessors) throws CPATransferException, InterruptedException {
    // TODO Auto-generated method stub
    try {
      Collection<? extends AbstractState> computedSuccessors = transferRelation.getAbstractSuccessorsForEdge(pState, SingletonPrecision.getInstance(), pCfaEdge);
      boolean found;
      for(AbstractState comp : computedSuccessors) {
        found = false;
        for(AbstractState e : pSuccessors) {
          if(isCoveredBy(comp, e)) {
            found = true;
            break;
          }
        }
        if(!found) {
          return false;
        }
      }
    } catch(CPAException e) {
      throw new CPATransferException("Cannot compare abstract successors", e);
    }
    return true;
  }

  @Override
  public boolean isCoveredBy(AbstractState pState, AbstractState pOtherState)
      throws CPAException, InterruptedException {
    // TODO Auto-generated method stub
    return abstractDomain.isLessOrEqual(pState, pOtherState);
  }

}
