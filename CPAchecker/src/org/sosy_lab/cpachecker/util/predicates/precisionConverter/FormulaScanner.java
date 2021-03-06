/* The following code was generated by JFlex 1.6.1 */

package org.sosy_lab.cpachecker.util.predicates.precisionConverter;

import java_cup.runtime.*;
import java_cup.runtime.ComplexSymbolFactory.Location;

@javax.annotation.Generated("JFlex")
@SuppressWarnings(value = { "all" })
@edu.umd.cs.findbugs.annotations.SuppressFBWarnings(value = {"DLS_DEAD_LOCAL_STORE"})

/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.6.1
 * from the specification file <tt>/home/cxcfan/Research/IntFix/cpachecker/src/org/sosy_lab/cpachecker/util/predicates/precisionConverter/Scanner.jflex</tt>
 */
class FormulaScanner implements java_cup.runtime.Scanner {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;
  public static final int STRING = 2;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0,  0,  1, 1
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\11\0\1\1\1\2\1\1\1\1\1\3\22\0\1\1\1\4\1\31"+
    "\1\0\3\4\1\0\1\12\1\13\2\4\1\0\1\24\1\10\1\4"+
    "\1\6\11\7\2\0\5\4\32\4\1\0\1\32\1\0\2\4\1\0"+
    "\1\14\1\4\1\22\1\21\1\16\1\25\2\4\1\30\2\4\1\23"+
    "\1\4\1\27\3\4\1\17\1\15\1\20\1\26\5\4\1\0\1\11"+
    "\1\0\1\4\6\0\1\1\44\0\1\4\12\0\1\4\4\0\1\4"+
    "\5\0\27\4\1\0\37\4\1\0\u01ca\4\4\0\14\4\16\0\5\4"+
    "\7\0\1\4\1\0\1\4\201\0\5\4\1\0\2\4\2\0\4\4"+
    "\1\0\1\4\6\0\1\4\1\0\3\4\1\0\1\4\1\0\24\4"+
    "\1\0\123\4\1\0\213\4\10\0\246\4\1\0\46\4\2\0\1\4"+
    "\7\0\47\4\110\0\33\4\5\0\3\4\55\0\53\4\25\0\12\5"+
    "\4\0\2\4\1\0\143\4\1\0\1\4\17\0\2\4\7\0\2\4"+
    "\12\5\3\4\2\0\1\4\20\0\1\4\1\0\36\4\35\0\131\4"+
    "\13\0\1\4\16\0\12\5\41\4\11\0\2\4\4\0\1\4\5\0"+
    "\26\4\4\0\1\4\11\0\1\4\3\0\1\4\27\0\31\4\107\0"+
    "\23\4\121\0\66\4\3\0\1\4\22\0\1\4\7\0\12\4\4\0"+
    "\12\5\1\0\20\4\4\0\10\4\2\0\2\4\2\0\26\4\1\0"+
    "\7\4\1\0\1\4\3\0\4\4\3\0\1\4\20\0\1\4\15\0"+
    "\2\4\1\0\3\4\4\0\12\5\2\4\23\0\6\4\4\0\2\4"+
    "\2\0\26\4\1\0\7\4\1\0\2\4\1\0\2\4\1\0\2\4"+
    "\37\0\4\4\1\0\1\4\7\0\12\5\2\0\3\4\20\0\11\4"+
    "\1\0\3\4\1\0\26\4\1\0\7\4\1\0\2\4\1\0\5\4"+
    "\3\0\1\4\22\0\1\4\17\0\2\4\4\0\12\5\25\0\10\4"+
    "\2\0\2\4\2\0\26\4\1\0\7\4\1\0\2\4\1\0\5\4"+
    "\3\0\1\4\36\0\2\4\1\0\3\4\4\0\12\5\1\0\1\4"+
    "\21\0\1\4\1\0\6\4\3\0\3\4\1\0\4\4\3\0\2\4"+
    "\1\0\1\4\1\0\2\4\3\0\2\4\3\0\3\4\3\0\14\4"+
    "\26\0\1\4\25\0\12\5\25\0\10\4\1\0\3\4\1\0\27\4"+
    "\1\0\20\4\3\0\1\4\32\0\2\4\6\0\2\4\4\0\12\5"+
    "\25\0\10\4\1\0\3\4\1\0\27\4\1\0\12\4\1\0\5\4"+
    "\3\0\1\4\40\0\1\4\1\0\2\4\4\0\12\5\1\0\2\4"+
    "\22\0\10\4\1\0\3\4\1\0\51\4\2\0\1\4\20\0\1\4"+
    "\21\0\2\4\4\0\12\5\12\0\6\4\5\0\22\4\3\0\30\4"+
    "\1\0\11\4\1\0\1\4\2\0\7\4\37\0\12\5\21\0\60\4"+
    "\1\0\2\4\14\0\7\4\11\0\12\5\47\0\2\4\1\0\1\4"+
    "\2\0\2\4\1\0\1\4\2\0\1\4\6\0\4\4\1\0\7\4"+
    "\1\0\3\4\1\0\1\4\1\0\1\4\2\0\2\4\1\0\4\4"+
    "\1\0\2\4\11\0\1\4\2\0\5\4\1\0\1\4\11\0\12\5"+
    "\2\0\4\4\40\0\1\4\37\0\12\5\26\0\10\4\1\0\44\4"+
    "\33\0\5\4\163\0\53\4\24\0\1\4\12\5\6\0\6\4\4\0"+
    "\4\4\3\0\1\4\3\0\2\4\7\0\3\4\4\0\15\4\14\0"+
    "\1\4\1\0\12\5\6\0\46\4\1\0\1\4\5\0\1\4\2\0"+
    "\53\4\1\0\u014d\4\1\0\4\4\2\0\7\4\1\0\1\4\1\0"+
    "\4\4\2\0\51\4\1\0\4\4\2\0\41\4\1\0\4\4\2\0"+
    "\7\4\1\0\1\4\1\0\4\4\2\0\17\4\1\0\71\4\1\0"+
    "\4\4\2\0\103\4\45\0\20\4\20\0\125\4\14\0\u026c\4\2\0"+
    "\21\4\1\0\32\4\5\0\113\4\6\0\10\4\7\0\15\4\1\0"+
    "\4\4\16\0\22\4\16\0\22\4\16\0\15\4\1\0\3\4\17\0"+
    "\64\4\43\0\1\4\4\0\1\4\3\0\12\5\46\0\12\5\6\0"+
    "\130\4\10\0\51\4\1\0\1\4\5\0\106\4\12\0\37\4\47\0"+
    "\12\5\36\4\2\0\5\4\13\0\54\4\25\0\7\4\10\0\12\5"+
    "\46\0\27\4\11\0\65\4\53\0\12\5\6\0\12\5\15\0\1\4"+
    "\135\0\57\4\21\0\7\4\4\0\12\5\51\0\36\4\15\0\2\4"+
    "\12\5\54\4\32\0\44\4\34\0\12\5\3\0\3\4\12\5\44\4"+
    "\153\0\4\4\1\0\4\4\3\0\2\4\11\0\300\4\100\0\u0116\4"+
    "\2\0\6\4\2\0\46\4\2\0\6\4\2\0\10\4\1\0\1\4"+
    "\1\0\1\4\1\0\1\4\1\0\37\4\2\0\65\4\1\0\7\4"+
    "\1\0\1\4\3\0\3\4\1\0\7\4\3\0\4\4\2\0\6\4"+
    "\4\0\15\4\5\0\3\4\1\0\7\4\53\0\2\1\107\0\1\4"+
    "\15\0\1\4\20\0\15\4\145\0\1\4\4\0\1\4\2\0\12\4"+
    "\1\0\1\4\3\0\5\4\6\0\1\4\1\0\1\4\1\0\1\4"+
    "\1\0\4\4\1\0\13\4\2\0\4\4\5\0\5\4\4\0\1\4"+
    "\64\0\2\4\u0a7b\0\57\4\1\0\57\4\1\0\205\4\6\0\4\4"+
    "\3\0\2\4\14\0\46\4\1\0\1\4\5\0\1\4\2\0\70\4"+
    "\7\0\1\4\20\0\27\4\11\0\7\4\1\0\7\4\1\0\7\4"+
    "\1\0\7\4\1\0\7\4\1\0\7\4\1\0\7\4\1\0\7\4"+
    "\120\0\1\4\u01d5\0\2\4\52\0\5\4\5\0\2\4\4\0\126\4"+
    "\6\0\3\4\1\0\132\4\1\0\4\4\5\0\51\4\3\0\136\4"+
    "\21\0\33\4\65\0\20\4\u0200\0\u19b6\4\112\0\u51cd\4\63\0\u048d\4"+
    "\103\0\56\4\2\0\u010d\4\3\0\20\4\12\5\2\4\24\0\57\4"+
    "\20\0\37\4\2\0\106\4\61\0\11\4\2\0\147\4\2\0\4\4"+
    "\1\0\36\4\2\0\2\4\105\0\13\4\1\0\3\4\1\0\4\4"+
    "\1\0\27\4\35\0\64\4\16\0\62\4\34\0\12\5\30\0\6\4"+
    "\3\0\1\4\4\0\12\5\34\4\12\0\27\4\31\0\35\4\7\0"+
    "\57\4\34\0\1\4\12\5\6\0\5\4\1\0\12\4\12\5\5\4"+
    "\1\0\51\4\27\0\3\4\1\0\10\4\4\0\12\5\6\0\27\4"+
    "\3\0\1\4\3\0\62\4\1\0\1\4\3\0\2\4\2\0\5\4"+
    "\2\0\1\4\1\0\1\4\30\0\3\4\2\0\13\4\7\0\3\4"+
    "\14\0\6\4\2\0\6\4\2\0\6\4\11\0\7\4\1\0\7\4"+
    "\1\0\53\4\1\0\4\4\4\0\2\4\132\0\43\4\15\0\12\5"+
    "\6\0\u2ba4\4\14\0\27\4\4\0\61\4\u2104\0\u016e\4\2\0\152\4"+
    "\46\0\7\4\14\0\5\4\5\0\1\4\1\0\12\4\1\0\15\4"+
    "\1\0\5\4\1\0\1\4\1\0\2\4\1\0\2\4\1\0\154\4"+
    "\41\0\u016b\4\22\0\100\4\2\0\66\4\50\0\14\4\164\0\5\4"+
    "\1\0\207\4\23\0\12\5\7\0\32\4\6\0\32\4\13\0\131\4"+
    "\3\0\6\4\2\0\6\4\2\0\6\4\2\0\3\4\43\0\14\4"+
    "\1\0\32\4\1\0\23\4\1\0\2\4\1\0\17\4\2\0\16\4"+
    "\42\0\173\4\u0185\0\35\4\3\0\61\4\57\0\40\4\20\0\21\4"+
    "\1\0\10\4\6\0\46\4\12\0\36\4\2\0\44\4\4\0\10\4"+
    "\60\0\236\4\2\0\12\5\126\0\50\4\10\0\64\4\234\0\u0137\4"+
    "\11\0\26\4\12\0\10\4\230\0\6\4\2\0\1\4\1\0\54\4"+
    "\1\0\2\4\3\0\1\4\2\0\27\4\12\0\27\4\11\0\37\4"+
    "\141\0\26\4\12\0\32\4\106\0\70\4\6\0\2\4\100\0\1\4"+
    "\17\0\4\4\1\0\3\4\1\0\33\4\54\0\35\4\3\0\35\4"+
    "\43\0\10\4\1\0\34\4\33\0\66\4\12\0\26\4\12\0\23\4"+
    "\15\0\22\4\156\0\111\4\u03ba\0\65\4\56\0\12\5\23\0\55\4"+
    "\40\0\31\4\7\0\12\5\11\0\44\4\17\0\12\5\20\0\43\4"+
    "\3\0\1\4\14\0\60\4\16\0\4\4\13\0\12\5\1\4\45\0"+
    "\22\4\1\0\31\4\204\0\57\4\21\0\12\5\13\0\10\4\2\0"+
    "\2\4\2\0\26\4\1\0\7\4\1\0\2\4\1\0\5\4\3\0"+
    "\1\4\37\0\5\4\u011e\0\60\4\24\0\2\4\1\0\1\4\10\0"+
    "\12\5\246\0\57\4\121\0\60\4\24\0\1\4\13\0\12\5\46\0"+
    "\53\4\25\0\12\5\u01d6\0\100\4\12\5\25\0\1\4\u01c0\0\71\4"+
    "\u0507\0\u0399\4\u0c67\0\u042f\4\u33d1\0\u0239\4\7\0\37\4\1\0\12\5"+
    "\146\0\36\4\22\0\60\4\20\0\4\4\14\0\12\5\11\0\25\4"+
    "\5\0\23\4\u0370\0\105\4\13\0\1\4\102\0\15\4\u4060\0\2\4"+
    "\u0bfe\0\153\4\5\0\15\4\3\0\11\4\7\0\12\4\u1766\0\125\4"+
    "\1\0\107\4\1\0\2\4\2\0\1\4\2\0\2\4\2\0\4\4"+
    "\1\0\14\4\1\0\1\4\1\0\7\4\1\0\101\4\1\0\4\4"+
    "\2\0\10\4\1\0\7\4\1\0\34\4\1\0\4\4\1\0\5\4"+
    "\1\0\1\4\3\0\7\4\1\0\u0154\4\2\0\31\4\1\0\31\4"+
    "\1\0\37\4\1\0\31\4\1\0\37\4\1\0\31\4\1\0\37\4"+
    "\1\0\31\4\1\0\37\4\1\0\31\4\1\0\10\4\2\0\62\5"+
    "\u1000\0\305\4\u053b\0\4\4\1\0\33\4\1\0\2\4\1\0\1\4"+
    "\2\0\1\4\1\0\12\4\1\0\4\4\1\0\1\4\1\0\1\4"+
    "\6\0\1\4\4\0\1\4\1\0\1\4\1\0\1\4\1\0\3\4"+
    "\1\0\2\4\1\0\1\4\2\0\1\4\1\0\1\4\1\0\1\4"+
    "\1\0\1\4\1\0\1\4\1\0\2\4\1\0\1\4\2\0\4\4"+
    "\1\0\7\4\1\0\4\4\1\0\4\4\1\0\1\4\1\0\12\4"+
    "\1\0\21\4\5\0\3\4\1\0\5\4\1\0\21\4\u1144\0\ua6d7\4"+
    "\51\0\u1035\4\13\0\336\4\u3fe2\0\u021e\4\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\u05f0\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\2\0\1\1\2\2\1\3\2\4\1\1\1\5\1\6"+
    "\2\3\1\7\1\10\1\11\2\0\3\3\1\12\1\11"+
    "\1\13\11\3\1\14\11\3\1\15\1\16";

  private static int [] zzUnpackAction() {
    int [] result = new int[45];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\33\0\66\0\66\0\121\0\154\0\207\0\242"+
    "\0\275\0\66\0\66\0\330\0\363\0\u010e\0\66\0\u0129"+
    "\0\u0144\0\275\0\66\0\u015f\0\u017a\0\66\0\66\0\u0144"+
    "\0\u0195\0\u01b0\0\u01cb\0\u01e6\0\u0201\0\u021c\0\u0237\0\u0252"+
    "\0\u026d\0\154\0\u0288\0\u02a3\0\u02be\0\u02d9\0\u02f4\0\u030f"+
    "\0\u032a\0\u0345\0\u0360\0\154\0\154";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[45];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\3\2\4\1\5\1\6\1\3\1\7\1\10\1\6"+
    "\1\11\1\12\1\13\1\14\4\6\1\15\7\6\2\3"+
    "\31\16\1\17\1\20\35\0\1\4\34\0\5\6\3\0"+
    "\15\6\12\0\1\21\30\0\2\10\1\21\22\0\11\22"+
    "\1\23\21\22\4\0\5\6\3\0\1\6\1\24\13\6"+
    "\6\0\5\6\3\0\2\6\1\25\12\6\2\0\31\16"+
    "\33\0\1\26\1\27\6\0\2\30\27\0\5\6\3\0"+
    "\1\6\1\31\13\6\6\0\5\6\3\0\6\6\1\32"+
    "\2\6\1\33\3\6\6\0\5\6\3\0\2\6\1\34"+
    "\12\6\6\0\5\6\3\0\7\6\1\35\5\6\6\0"+
    "\5\6\3\0\14\6\1\36\6\0\5\6\3\0\3\6"+
    "\1\37\11\6\6\0\5\6\3\0\1\40\14\6\6\0"+
    "\5\6\3\0\13\6\1\41\1\6\6\0\5\6\3\0"+
    "\4\6\1\42\10\6\6\0\5\6\3\0\3\6\1\43"+
    "\11\6\6\0\5\6\3\0\2\6\1\44\12\6\6\0"+
    "\5\6\3\0\2\6\1\45\12\6\6\0\5\6\3\0"+
    "\10\6\1\46\4\6\6\0\5\6\3\0\10\6\1\47"+
    "\4\6\6\0\5\6\3\0\11\6\1\50\3\6\6\0"+
    "\5\6\3\0\11\6\1\51\3\6\6\0\5\6\3\0"+
    "\12\6\1\52\2\6\6\0\5\6\3\0\12\6\1\53"+
    "\2\6\6\0\5\6\3\0\13\6\1\54\1\6\6\0"+
    "\5\6\3\0\13\6\1\55\1\6\2\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[891];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\2\0\2\11\5\1\2\11\3\1\1\11\1\1\2\0"+
    "\1\11\2\1\2\11\26\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[45];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** the textposition at the last accepting state */
  private int zzMarkedPos;
  
  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /** number of newlines encountered up to the start of the matched text */
  private int yyline;

  /** the number of characters up to the start of the matched text */
  private int yychar;

  /**
   * the number of characters from the last newline up to the start of the 
   * matched text
   */
  private int yycolumn;

  /** 
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;
  
  /** 
   * The number of occupied positions in zzBuffer beyond zzEndRead.
   * When a lead/high surrogate has been read from the input stream
   * into the final zzBuffer position, this will have a value of 1;
   * otherwise, it will have a value of 0.
   */
  private int zzFinalHighSurrogate = 0;

  /** the stack of open (nested) input streams to read from */
  private java.util.Stack<ZzFlexStreamInfo> zzStreams
    = new java.util.Stack<ZzFlexStreamInfo>();

  /**
   * inner class used to store info for nested
   * input streams
   */
  private static final class ZzFlexStreamInfo {
    java.io.Reader zzReader;
    int zzEndRead;
    int zzStartRead;
    int zzCurrentPos;
    int zzMarkedPos;
    int yyline;
    int yychar;
    int yycolumn;
    char [] zzBuffer;
    boolean zzAtBOL;
    boolean zzAtEOF;
    boolean zzEOFDone;
    int zzFinalHighSurrogate;

    /** sets all values stored in this class */
    ZzFlexStreamInfo(java.io.Reader zzReader, int zzEndRead, int zzStartRead,
                  int zzCurrentPos, int zzMarkedPos, char [] zzBuffer, 
                  boolean zzAtBOL, boolean zzAtEOF, boolean zzEOFDone,
                  int zzFinalHighSurrogate, int yyline, int yychar, int yycolumn) {
      this.zzReader      = zzReader;
      this.zzEndRead     = zzEndRead;
      this.zzStartRead   = zzStartRead;
      this.zzCurrentPos  = zzCurrentPos;
      this.zzMarkedPos   = zzMarkedPos;
      this.zzBuffer      = zzBuffer;
      this.zzAtBOL       = zzAtBOL;
      this.zzAtEOF       = zzAtEOF;
      this.zzEOFDone     = zzEOFDone;
      this.zzFinalHighSurrogate = zzFinalHighSurrogate;
      this.yyline        = yyline;
      this.yychar        = yychar;
      this.yycolumn      = yycolumn;
    }
  }

  /* user code: */
  private StringBuilder string = new StringBuilder();
  private ComplexSymbolFactory sf;

  public FormulaScanner(java.io.Reader r, ComplexSymbolFactory sf) {
    this(r);
    this.sf = sf;
  }
  
  private Location getStartLocation() {
    return new Location("", yyline+1,yycolumn+1-yylength());
  }

  private Location getEndLocation() {
    return new Location("", yyline+1,yycolumn+1);
  }
  
  private Symbol symbol(int sym, String name) {
    return sf.newSymbol(name, sym, getStartLocation(), getEndLocation(), name);
  }
  


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  FormulaScanner(java.io.Reader in) {
    this.zzReader = in;
  }


  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x110000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 2442) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }


  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   * 
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead-zzStartRead);

      /* translate stored positions */
      zzEndRead-= zzStartRead;
      zzCurrentPos-= zzStartRead;
      zzMarkedPos-= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length - zzFinalHighSurrogate) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzBuffer.length * 2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
    }

    /* fill the buffer with new input */
    int requested = zzBuffer.length - zzEndRead;
    int numRead = zzReader.read(zzBuffer, zzEndRead, requested);

    /* not supposed to occur according to specification of java.io.Reader */
    if (numRead == 0) {
      throw new java.io.IOException("Reader returned 0 characters. See JFlex examples for workaround.");
    }
    if (numRead > 0) {
      zzEndRead += numRead;
      /* If numRead == requested, we might have requested to few chars to
         encode a full Unicode character. We assume that a Reader would
         otherwise never return half characters. */
      if (numRead == requested) {      
        if (Character.isHighSurrogate(zzBuffer[zzEndRead - 1])) {
          --zzEndRead;
          zzFinalHighSurrogate = 1;
        }
      }
      /* potentially more input available */
      return false;
    }

    /* numRead < 0 ==> end of stream */
    return true;
  }

    
  /**
   * Closes the input stream.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true;            /* indicate end of file */
    zzEndRead = zzStartRead;  /* invalidate buffer    */

    if (zzReader != null)
      zzReader.close();
  }


  /**
   * Stores the current input stream on a stack, and
   * reads from a new stream. Lexical state, line,
   * char, and column counting remain untouched.
   *
   * The current input stream can be restored with
   * yypopStream (usually in an <<EOF>> action).
   *
   * @param reader the new input stream to read from
   *
   * @see #yypopStream()
   */
  public final void yypushStream(java.io.Reader reader) {
    zzStreams.push(
      new ZzFlexStreamInfo(zzReader, zzEndRead, zzStartRead, zzCurrentPos,
                        zzMarkedPos, zzBuffer, zzAtBOL, zzAtEOF, zzEOFDone,
                        zzFinalHighSurrogate, yyline, yychar, yycolumn)
    );
    zzAtBOL  = true;
    zzAtEOF  = false;
    zzBuffer = new char[ZZ_BUFFERSIZE];
    zzReader = reader;
    zzEndRead = zzStartRead = 0;
    zzCurrentPos = zzMarkedPos = 0;
    zzFinalHighSurrogate = 0;
    yyline = yychar = yycolumn = 0;
  }
    

  /**
   * Closes the current input stream and continues to
   * read from the one on top of the stream stack. 
   *
   * @throws java.util.EmptyStackException
   *         if there is no further stream to read from.
   *
   * @throws java.io.IOException
   *         if there was an error in closing the stream.
   *
   * @see #yypushStream(java.io.Reader)
   */
  public final void yypopStream() throws java.io.IOException {
    zzReader.close();
    ZzFlexStreamInfo s = (ZzFlexStreamInfo) zzStreams.pop();
    zzBuffer      = s.zzBuffer;
    zzReader      = s.zzReader;
    zzEndRead     = s.zzEndRead;
    zzStartRead   = s.zzStartRead;
    zzCurrentPos  = s.zzCurrentPos;
    zzMarkedPos   = s.zzMarkedPos;
    zzAtBOL       = s.zzAtBOL;
    zzAtEOF       = s.zzAtEOF;
    zzEOFDone     = s.zzEOFDone;
    zzFinalHighSurrogate = s.zzFinalHighSurrogate;
    yyline        = s.yyline;
    yychar        = s.yychar;
    yycolumn      = s.yycolumn;
  }


  /**
   * Returns true iff there are still streams left 
   * to read from on the stream stack.
   */
  public final boolean yymoreStreams() {
    return !zzStreams.isEmpty();
  }


  /**
   * Resets the scanner to read from a new input stream.
   * Does not close the old reader.
   *
   * All internal variables are reset, the old input stream 
   * <b>cannot</b> be reused (internal buffer is discarded and lost).
   * Lexical state is set to <tt>ZZ_INITIAL</tt>.
   *
   * Internal scan buffer is resized down to its initial length, if it has grown.
   *
   * @param reader   the new input stream 
   *
   * @see #yypushStream(java.io.Reader)
   * @see #yypopStream()
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzAtBOL  = true;
    zzAtEOF  = false;
    zzEOFDone = false;
    zzEndRead = zzStartRead = 0;
    zzCurrentPos = zzMarkedPos = 0;
    zzFinalHighSurrogate = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
    if (zzBuffer.length > ZZ_BUFFERSIZE)
      zzBuffer = new char[ZZ_BUFFERSIZE];
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final String yytext() {
    return new String( zzBuffer, zzStartRead, zzMarkedPos-zzStartRead );
  }


  /**
   * Returns the character at position <tt>pos</tt> from the 
   * matched text. 
   * 
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch. 
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer[zzStartRead+pos];
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of 
   * yypushback(int) and a match-all fallback rule) this method 
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  } 


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Contains user EOF-code, which will be executed exactly once,
   * when the end of file is reached
   */
  private void zzDoEOF() throws java.io.IOException {
    if (!zzEOFDone) {
      zzEOFDone = true;
      yyclose();
    }
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public java_cup.runtime.Symbol next_token() throws java.io.IOException {
    int zzInput;
    int zzAction;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      // cached fields:
      int zzCurrentPosL;
      int zzMarkedPosL = zzMarkedPos;
      int zzEndReadL = zzEndRead;
      char [] zzBufferL = zzBuffer;
      char [] zzCMapL = ZZ_CMAP;

      boolean zzR = false;
      int zzCh;
      int zzCharCount;
      for (zzCurrentPosL = zzStartRead  ;
           zzCurrentPosL < zzMarkedPosL ;
           zzCurrentPosL += zzCharCount ) {
        zzCh = Character.codePointAt(zzBufferL, zzCurrentPosL, zzMarkedPosL);
        zzCharCount = Character.charCount(zzCh);
        switch (zzCh) {
        case '\u000B':
        case '\u000C':
        case '\u0085':
        case '\u2028':
        case '\u2029':
          yyline++;
          yycolumn = 0;
          zzR = false;
          break;
        case '\r':
          yyline++;
          yycolumn = 0;
          zzR = true;
          break;
        case '\n':
          if (zzR)
            zzR = false;
          else {
            yyline++;
            yycolumn = 0;
          }
          break;
        default:
          zzR = false;
          yycolumn += zzCharCount;
        }
      }

      if (zzR) {
        // peek one character ahead if it is \n (if we have counted one line too much)
        boolean zzPeek;
        if (zzMarkedPosL < zzEndReadL)
          zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        else if (zzAtEOF)
          zzPeek = false;
        else {
          boolean eof = zzRefill();
          zzEndReadL = zzEndRead;
          zzMarkedPosL = zzMarkedPos;
          zzBufferL = zzBuffer;
          if (eof) 
            zzPeek = false;
          else 
            zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        }
        if (zzPeek) yyline--;
      }
      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;
  
      zzState = ZZ_LEXSTATE[zzLexicalState];

      // set up zzAction for empty match case:
      int zzAttributes = zzAttrL[zzState];
      if ( (zzAttributes & 1) == 1 ) {
        zzAction = zzState;
      }


      zzForAction: {
        while (true) {
    
          if (zzCurrentPosL < zzEndReadL) {
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
            zzCurrentPosL += Character.charCount(zzInput);
          }
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
        zzAtEOF = true;
            zzDoEOF();
              {
                return symbol(FormulaSymbols.EOF, yytext());
              }
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1: 
            { return symbol(FormulaSymbols.error, yytext());
            }
          case 15: break;
          case 2: 
            { /* ignore */
            }
          case 16: break;
          case 3: 
            { return symbol(FormulaSymbols.SYMBOL, yytext());
            }
          case 17: break;
          case 4: 
            { return symbol(FormulaSymbols.NUMERAL, yytext());
            }
          case 18: break;
          case 5: 
            { return symbol(FormulaSymbols.LPAR, yytext());
            }
          case 19: break;
          case 6: 
            { return symbol(FormulaSymbols.RPAR, yytext());
            }
          case 20: break;
          case 7: 
            { string.append( yytext() );
            }
          case 21: break;
          case 8: 
            { String value = string.toString();
                                   string = null;
                                   yybegin(YYINITIAL);
                                   return symbol(FormulaSymbols.STRING, value);
            }
          case 22: break;
          case 9: 
            { string.append('\\');
            }
          case 23: break;
          case 10: 
            { string.append('\"');
            }
          case 24: break;
          case 11: 
            { return symbol(FormulaSymbols.DECIMAL, yytext());
            }
          case 25: break;
          case 12: 
            { return symbol(FormulaSymbols.ASSERT, yytext());
            }
          case 26: break;
          case 13: 
            { return symbol(FormulaSymbols.DEFINEFUN, yytext());
            }
          case 27: break;
          case 14: 
            { return symbol(FormulaSymbols.DECLAREFUN, yytext());
            }
          case 28: break;
          default:
            zzScanError(ZZ_NO_MATCH);
        }
      }
    }
  }


}
