
//----------------------------------------------------
// The following code was generated by CUP v0.11b 20150326 (SVN rev 63)
//----------------------------------------------------

package org.sosy_lab.cpachecker.util.predicates.precisionConverter;

import java.io.Reader;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import java_cup.runtime.ComplexSymbolFactory;
import java_cup.runtime.Scanner;
import java_cup.runtime.Symbol;
import java_cup.runtime.SymbolFactory;
import javax.annotation.Nullable;
import org.sosy_lab.common.Pair;
import org.sosy_lab.common.log.LogManager;
import org.sosy_lab.common.log.LogManagerWithoutDuplicates;
import org.sosy_lab.cpachecker.util.predicates.precisionConverter.SymbolEncoding.Type;
import org.sosy_lab.cpachecker.util.predicates.precisionConverter.SymbolEncoding.UnknownFormulaSymbolException;
import org.sosy_lab.solver.api.FormulaType;
import com.google.common.io.CharSource;
import java_cup.runtime.ComplexSymbolFactory.Location;
import java_cup.runtime.XMLElement;

/** CUP v0.11b 20150326 (SVN rev 63) generated parser.
  */
@javax.annotation.Generated("JFlex")
@SuppressWarnings(value = {"all"} )
@edu.umd.cs.findbugs.annotations.SuppressFBWarnings(value = {"EI_EXPOSE_REP", "MS_PKGPROTECT", "SIC_INNER_SHOULD_BE_STATIC"})
public class FormulaParser extends java_cup.runtime.lr_parser {

 public final Class getSymbolContainer() {
    return FormulaSymbols.class;
}

  /** Default constructor. */
  @Deprecated
  public FormulaParser() {super();}

  /** Constructor which sets the default scanner. */
  @Deprecated
  public FormulaParser(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public FormulaParser(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\024\000\002\004\003\000\002\002\004\000\002\004" +
    "\003\000\002\004\003\000\002\006\007\000\002\005\010" +
    "\000\002\007\006\000\002\010\006\000\002\011\004\000" +
    "\002\011\002\000\002\012\003\000\002\012\007\000\002" +
    "\013\004\000\002\013\002\000\002\014\003\000\002\014" +
    "\003\000\002\014\006\000\002\003\003\000\002\003\003" +
    "\000\002\002\003" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\052\000\004\013\006\001\002\000\004\002\ufffe\001" +
    "\002\000\004\002\054\001\002\000\010\004\013\005\011" +
    "\006\012\001\002\000\004\002\uffff\001\002\000\004\002" +
    "\001\001\002\000\004\007\014\001\002\000\012\007\014" +
    "\010\030\011\031\013\040\001\002\000\004\007\014\001" +
    "\002\000\014\007\uffee\010\uffee\011\uffee\013\uffee\014\uffee" +
    "\001\002\000\004\013\017\001\002\000\004\014\035\001" +
    "\002\000\010\007\014\013\021\014\ufff8\001\002\000\004" +
    "\014\033\001\002\000\004\007\025\001\002\000\010\007" +
    "\014\013\021\014\ufff8\001\002\000\014\007\ufff7\010\ufff7" +
    "\011\ufff7\013\ufff7\014\ufff7\001\002\000\004\014\ufff9\001" +
    "\002\000\004\007\026\001\002\000\006\010\030\011\031" +
    "\001\002\000\004\014\032\001\002\000\014\007\ufff0\010" +
    "\ufff0\011\ufff0\013\ufff0\014\ufff0\001\002\000\014\007\uffef" +
    "\010\uffef\011\uffef\013\uffef\014\uffef\001\002\000\014\007" +
    "\ufff6\010\ufff6\011\ufff6\013\ufff6\014\ufff6\001\002\000\006" +
    "\007\014\013\021\001\002\000\014\007\ufffa\010\ufffa\011" +
    "\ufffa\013\ufffa\014\ufffa\001\002\000\004\002\ufffd\001\002" +
    "\000\014\007\ufff3\010\ufff3\011\ufff3\013\ufff3\014\ufff3\001" +
    "\002\000\004\014\047\001\002\000\012\007\014\010\030" +
    "\011\031\013\040\001\002\000\014\007\ufff2\010\ufff2\011" +
    "\ufff2\013\ufff2\014\ufff2\001\002\000\014\007\014\010\030" +
    "\011\031\013\040\014\ufff4\001\002\000\014\007\014\010" +
    "\030\011\031\013\040\014\ufff4\001\002\000\004\014\045" +
    "\001\002\000\014\007\ufff1\010\ufff1\011\ufff1\013\ufff1\014" +
    "\ufff1\001\002\000\004\014\ufff5\001\002\000\004\002\ufffb" +
    "\001\002\000\004\013\017\001\002\000\012\007\014\010" +
    "\030\011\031\013\040\001\002\000\004\014\053\001\002" +
    "\000\004\002\ufffc\001\002\000\004\002\000\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\052\000\012\004\004\005\007\006\006\007\003\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\004\002\047\001" +
    "\001\000\010\002\040\003\035\014\036\001\001\000\004" +
    "\002\014\001\001\000\002\001\001\000\004\010\015\001" +
    "\001\000\002\001\001\000\010\002\022\011\017\012\021" +
    "\001\001\000\002\001\001\000\002\001\001\000\010\002" +
    "\022\011\023\012\021\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\004\003\026\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\006\002\022\012\033\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\010\002\040\003\035\014\041\001\001\000\002\001" +
    "\001\000\012\002\040\003\035\013\043\014\042\001\001" +
    "\000\012\002\040\003\035\013\045\014\042\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\004\010\050\001\001\000\010\002\040\003" +
    "\035\014\051\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$FormulaParser$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$FormulaParser$actions(this);
    }

  /** Invoke a user supplied parse action. */
  public java_cup.runtime.Symbol do_action(
    int                        act_num,
    java_cup.runtime.lr_parser parser,
    java.util.Stack            stack,
    int                        top)
    throws java.lang.Exception
  {
    /* call code in generated class */
    return action_obj.CUP$FormulaParser$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 1;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}



  private LogManager logger;
  Converter converter; 

  public FormulaParser(Scanner scanner, SymbolFactory sf, Converter pConverter, LogManager pLogger) {
      super(scanner, sf);
      logger = pLogger;
      converter = pConverter;
  }

  @Override
  public void report_error(String message, Object info) {
    String errorString = message;
    if (info != null) {
      errorString += " near " + info;
    }
    logger.log(Level.WARNING, errorString);
  }

  /**
   * This method converts a formula with the given converter.
   * If the converter is NULL or the formula is a solver-specific string, it is returned unchanged.
   * Otherwise the converter converts the formula, for example from Integer-logic to BV-logic.
   * If a symbol cannot be parsed, the returned formula-string is NULL.
   */
  public static String convertFormula(@Nullable Converter converter, String line, LogManagerWithoutDuplicates pLogger) {

    if (converter == null) {
      return line;
    }

    if (!line.startsWith("(define-fun ") && !line.startsWith("(declare-fun ") && !line.startsWith("(assert ")) {
      // ignore solver-specific lines
      return line;
    }

    return convert0(converter, line, pLogger);
  }

  private static String convert0(Converter converter, String line, LogManagerWithoutDuplicates pLogger)
      throws AssertionError {
    try (Reader input = CharSource.wrap(line).openStream()) {
      ComplexSymbolFactory sf = new ComplexSymbolFactory();
      Scanner scanner = new FormulaScanner(input, sf);
      FormulaParser parser = new FormulaParser(scanner, sf, converter, pLogger);
      Symbol symbol = parser.parse();
      return ((String) symbol.value);
    } catch (UnknownFormulaSymbolException e) {
      //if (e.getMessage().contains("unknown symbol in formula: .def_")) {
        // ignore Mathsat5-specific helper symbols,
        // they are based on 'real' unknown symbols.
      //} else {
        pLogger.logOnce(Level.INFO, e.getMessage());
      //}
      return null;
    } catch (Exception e) {
      throw new AssertionError("There was a problem while parsing the formula '''" + line + "'''.", e);
    }
  }

  Converter getConverter(){
      return converter;
  }



/** Cup generated class to encapsulate user supplied action code.*/
@SuppressWarnings({"rawtypes", "unchecked", "unused"})
class CUP$FormulaParser$actions {
  private final FormulaParser parser;

  /** Constructor */
  CUP$FormulaParser$actions(FormulaParser parser) {
    this.parser = parser;
  }

  /** Method 0 with the actual generated action code for actions 0 to 300. */
  public final java_cup.runtime.Symbol CUP$FormulaParser$do_action_part00000000(
    int                        CUP$FormulaParser$act_num,
    java_cup.runtime.lr_parser CUP$FormulaParser$parser,
    java.util.Stack            CUP$FormulaParser$stack,
    int                        CUP$FormulaParser$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$FormulaParser$result;

      /* select the action based on the action number */
      switch (CUP$FormulaParser$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // goal ::= definefun 
            {
              String RESULT =null;
		String n = (String)((java_cup.runtime.Symbol) CUP$FormulaParser$stack.peek()).value;
		 RESULT = n; 
              CUP$FormulaParser$result = parser.getSymbolFactory().newSymbol("goal",2, RESULT);
            }
          return CUP$FormulaParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // $START ::= goal EOF 
            {
              Object RESULT =null;
		String start_val = (String)((java_cup.runtime.Symbol) CUP$FormulaParser$stack.elementAt(CUP$FormulaParser$top-1)).value;
		RESULT = start_val;
              CUP$FormulaParser$result = parser.getSymbolFactory().newSymbol("$START",0, RESULT);
            }
          /* ACCEPT */
          CUP$FormulaParser$parser.done_parsing();
          return CUP$FormulaParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // goal ::= declarefun 
            {
              String RESULT =null;
		String n = (String)((java_cup.runtime.Symbol) CUP$FormulaParser$stack.peek()).value;
		 RESULT = n; 
              CUP$FormulaParser$result = parser.getSymbolFactory().newSymbol("goal",2, RESULT);
            }
          return CUP$FormulaParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // goal ::= assert 
            {
              String RESULT =null;
		String n = (String)((java_cup.runtime.Symbol) CUP$FormulaParser$stack.peek()).value;
		 RESULT = n; 
              CUP$FormulaParser$result = parser.getSymbolFactory().newSymbol("goal",2, RESULT);
            }
          return CUP$FormulaParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // declarefun ::= LPAR DECLAREFUN symbol funtype RPAR 
            {
              String RESULT =null;
		String n = (String)((java_cup.runtime.Symbol) CUP$FormulaParser$stack.elementAt(CUP$FormulaParser$top-2)).value;
		Type<String> ft = (Type<String>)((java_cup.runtime.Symbol) CUP$FormulaParser$stack.elementAt(CUP$FormulaParser$top-1)).value;
		 RESULT = "(declare-fun " + parser.getConverter().convertFunctionDeclaration(n, ft) + ")"; 
              CUP$FormulaParser$result = parser.getSymbolFactory().newSymbol("declarefun",4, RESULT);
            }
          return CUP$FormulaParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // definefun ::= LPAR DEFINEFUN symbol funtype term RPAR 
            {
              String RESULT =null;
		String n = (String)((java_cup.runtime.Symbol) CUP$FormulaParser$stack.elementAt(CUP$FormulaParser$top-3)).value;
		Type<String> ft = (Type<String>)((java_cup.runtime.Symbol) CUP$FormulaParser$stack.elementAt(CUP$FormulaParser$top-2)).value;
		Pair<String,Type<FormulaType< ? >>> f = (Pair<String,Type<FormulaType< ? >>>)((java_cup.runtime.Symbol) CUP$FormulaParser$stack.elementAt(CUP$FormulaParser$top-1)).value;
		 RESULT = "(define-fun " + parser.getConverter().convertFunctionDefinition(n, ft, f) + ")"; 
              CUP$FormulaParser$result = parser.getSymbolFactory().newSymbol("definefun",3, RESULT);
            }
          return CUP$FormulaParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // assert ::= LPAR ASSERT term RPAR 
            {
              String RESULT =null;
		Pair<String,Type<FormulaType< ? >>> f = (Pair<String,Type<FormulaType< ? >>>)((java_cup.runtime.Symbol) CUP$FormulaParser$stack.elementAt(CUP$FormulaParser$top-1)).value;
		 RESULT = "(assert " + f.getFirst() + ")"; 
              CUP$FormulaParser$result = parser.getSymbolFactory().newSymbol("assert",5, RESULT);
            }
          return CUP$FormulaParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // funtype ::= LPAR types RPAR type 
            {
              Type<String> RESULT =null;
		List<String> lst = (List<String>)((java_cup.runtime.Symbol) CUP$FormulaParser$stack.elementAt(CUP$FormulaParser$top-2)).value;
		String t = (String)((java_cup.runtime.Symbol) CUP$FormulaParser$stack.peek()).value;
		 RESULT = new Type<String>(t, lst); 
              CUP$FormulaParser$result = parser.getSymbolFactory().newSymbol("funtype",6, RESULT);
            }
          return CUP$FormulaParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // types ::= type types 
            {
              List<String> RESULT =null;
		String t = (String)((java_cup.runtime.Symbol) CUP$FormulaParser$stack.elementAt(CUP$FormulaParser$top-1)).value;
		List<String> lst = (List<String>)((java_cup.runtime.Symbol) CUP$FormulaParser$stack.peek()).value;
		 lst.add(0,t); RESULT = lst; 
              CUP$FormulaParser$result = parser.getSymbolFactory().newSymbol("types",7, RESULT);
            }
          return CUP$FormulaParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // types ::= 
            {
              List<String> RESULT =null;
		 RESULT = new LinkedList<String>(); 
              CUP$FormulaParser$result = parser.getSymbolFactory().newSymbol("types",7, RESULT);
            }
          return CUP$FormulaParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // type ::= symbol 
            {
              String RESULT =null;
		String n = (String)((java_cup.runtime.Symbol) CUP$FormulaParser$stack.peek()).value;
		 RESULT = n; 
              CUP$FormulaParser$result = parser.getSymbolFactory().newSymbol("type",8, RESULT);
            }
          return CUP$FormulaParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // type ::= LPAR SYMBOL SYMBOL numeral RPAR 
            {
              String RESULT =null;
		String uscore = (String)((java_cup.runtime.Symbol) CUP$FormulaParser$stack.elementAt(CUP$FormulaParser$top-3)).value;
		String bv = (String)((java_cup.runtime.Symbol) CUP$FormulaParser$stack.elementAt(CUP$FormulaParser$top-2)).value;
		String n = (String)((java_cup.runtime.Symbol) CUP$FormulaParser$stack.elementAt(CUP$FormulaParser$top-1)).value;
		 RESULT = "(_ BitVec " + n + ")"; 
              CUP$FormulaParser$result = parser.getSymbolFactory().newSymbol("type",8, RESULT);
            }
          return CUP$FormulaParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // terms ::= term terms 
            {
              List<Pair<String,Type<FormulaType< ? >>>> RESULT =null;
		Pair<String,Type<FormulaType< ? >>> t = (Pair<String,Type<FormulaType< ? >>>)((java_cup.runtime.Symbol) CUP$FormulaParser$stack.elementAt(CUP$FormulaParser$top-1)).value;
		List<Pair<String,Type<FormulaType< ? >>>> lst = (List<Pair<String,Type<FormulaType< ? >>>>)((java_cup.runtime.Symbol) CUP$FormulaParser$stack.peek()).value;
		 lst.add(0,t); RESULT = lst; 
              CUP$FormulaParser$result = parser.getSymbolFactory().newSymbol("terms",9, RESULT);
            }
          return CUP$FormulaParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // terms ::= 
            {
              List<Pair<String,Type<FormulaType< ? >>>> RESULT =null;
		 RESULT = new LinkedList<Pair<String, Type<FormulaType<?>>>>(); 
              CUP$FormulaParser$result = parser.getSymbolFactory().newSymbol("terms",9, RESULT);
            }
          return CUP$FormulaParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 14: // term ::= numeral 
            {
              Pair<String,Type<FormulaType< ? >>> RESULT =null;
		String n = (String)((java_cup.runtime.Symbol) CUP$FormulaParser$stack.peek()).value;
		 RESULT = parser.getConverter().convertNumeral(n); 
              CUP$FormulaParser$result = parser.getSymbolFactory().newSymbol("term",10, RESULT);
            }
          return CUP$FormulaParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 15: // term ::= symbol 
            {
              Pair<String,Type<FormulaType< ? >>> RESULT =null;
		String n = (String)((java_cup.runtime.Symbol) CUP$FormulaParser$stack.peek()).value;
		 RESULT = parser.getConverter().convertSymbol(n); 
              CUP$FormulaParser$result = parser.getSymbolFactory().newSymbol("term",10, RESULT);
            }
          return CUP$FormulaParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 16: // term ::= LPAR term terms RPAR 
            {
              Pair<String,Type<FormulaType< ? >>> RESULT =null;
		Pair<String,Type<FormulaType< ? >>> op = (Pair<String,Type<FormulaType< ? >>>)((java_cup.runtime.Symbol) CUP$FormulaParser$stack.elementAt(CUP$FormulaParser$top-2)).value;
		List<Pair<String,Type<FormulaType< ? >>>> lst = (List<Pair<String,Type<FormulaType< ? >>>>)((java_cup.runtime.Symbol) CUP$FormulaParser$stack.elementAt(CUP$FormulaParser$top-1)).value;
		 RESULT = parser.getConverter().convertTerm(op, lst); 
              CUP$FormulaParser$result = parser.getSymbolFactory().newSymbol("term",10, RESULT);
            }
          return CUP$FormulaParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 17: // numeral ::= NUMERAL 
            {
              String RESULT =null;
		String n = (String)((java_cup.runtime.Symbol) CUP$FormulaParser$stack.peek()).value;
		 RESULT = n; 
              CUP$FormulaParser$result = parser.getSymbolFactory().newSymbol("numeral",1, RESULT);
            }
          return CUP$FormulaParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 18: // numeral ::= DECIMAL 
            {
              String RESULT =null;
		String n = (String)((java_cup.runtime.Symbol) CUP$FormulaParser$stack.peek()).value;
		 RESULT = n; 
              CUP$FormulaParser$result = parser.getSymbolFactory().newSymbol("numeral",1, RESULT);
            }
          return CUP$FormulaParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 19: // symbol ::= SYMBOL 
            {
              String RESULT =null;
		String n = (String)((java_cup.runtime.Symbol) CUP$FormulaParser$stack.peek()).value;
		 RESULT = n; 
              CUP$FormulaParser$result = parser.getSymbolFactory().newSymbol("symbol",0, RESULT);
            }
          return CUP$FormulaParser$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number "+CUP$FormulaParser$act_num+"found in internal parse table");

        }
    } /* end of method */

  /** Method splitting the generated action code into several parts. */
  public final java_cup.runtime.Symbol CUP$FormulaParser$do_action(
    int                        CUP$FormulaParser$act_num,
    java_cup.runtime.lr_parser CUP$FormulaParser$parser,
    java.util.Stack            CUP$FormulaParser$stack,
    int                        CUP$FormulaParser$top)
    throws java.lang.Exception
    {
              return CUP$FormulaParser$do_action_part00000000(
                               CUP$FormulaParser$act_num,
                               CUP$FormulaParser$parser,
                               CUP$FormulaParser$stack,
                               CUP$FormulaParser$top);
    }
}

}
