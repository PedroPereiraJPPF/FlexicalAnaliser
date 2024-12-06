// DO NOT EDIT
// Generated by JFlex 1.9.1 http://jflex.de/
// source: src/main/flex/main.jflex

package com.analisadorlexico.LexicalAnaliser;

import java.io.StringReader;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;
import com.analisadorlexico.LexicalAnaliser.Token;


@SuppressWarnings("fallthrough")
public class Lexer {

  /** This character denotes the end of file. */
  public static final int YYEOF = -1;

  /** Initial size of the lookahead buffer. */
  private static final int ZZ_BUFFERSIZE = 16384;

  // Lexical states.
  public static final int YYINITIAL = 0;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = {
     0, 0
  };

  /**
   * Top-level table for translating characters to character classes
   */
  private static final int [] ZZ_CMAP_TOP = zzUnpackcmap_top();

  private static final String ZZ_CMAP_TOP_PACKED_0 =
    "\1\0\37\u0100\1\u0200\267\u0100\10\u0300\u1020\u0100";

  private static int [] zzUnpackcmap_top() {
    int [] result = new int[4352];
    int offset = 0;
    offset = zzUnpackcmap_top(ZZ_CMAP_TOP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackcmap_top(String packed, int offset, int [] result) {
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
   * Second-level tables for translating characters to character classes
   */
  private static final int [] ZZ_CMAP_BLOCKS = zzUnpackcmap_blocks();

  private static final String ZZ_CMAP_BLOCKS_PACKED_0 =
    "\11\0\2\1\2\2\1\1\22\0\1\1\7\0\2\3"+
    "\2\0\1\3\3\0\4\4\1\5\1\4\1\6\3\4"+
    "\1\7\1\0\1\10\1\11\1\10\2\0\1\12\1\13"+
    "\1\14\1\15\1\16\2\17\1\20\1\21\1\17\1\22"+
    "\1\23\1\24\1\25\1\26\1\27\1\17\1\30\1\31"+
    "\1\32\1\33\1\34\1\17\1\35\1\36\1\17\1\3"+
    "\1\0\1\3\1\0\1\37\1\0\1\40\1\41\1\42"+
    "\1\43\1\44\1\45\1\46\1\47\1\50\1\51\1\52"+
    "\1\53\1\54\1\55\1\56\1\57\1\60\1\61\1\62"+
    "\1\63\1\64\1\65\1\66\1\67\1\70\1\71\1\3"+
    "\1\0\1\3\7\0\1\2\u01a2\0\2\2\326\0\u0100\2";

  private static int [] zzUnpackcmap_blocks() {
    int [] result = new int[1024];
    int offset = 0;
    offset = zzUnpackcmap_blocks(ZZ_CMAP_BLOCKS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackcmap_blocks(String packed, int offset, int [] result) {
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
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\1\2\1\3\1\4\1\5\1\4\14\6"+
    "\24\7\1\10\16\6\1\11\4\6\27\7\1\11\13\7"+
    "\1\0\13\6\15\7\1\12\16\7\6\6\1\12\1\6"+
    "\3\7\1\12\15\7\1\13\2\7\7\6\1\7\1\0"+
    "\5\7\1\12\6\7\1\11\6\6\1\0\3\7\1\12"+
    "\7\7\4\6\1\0\6\7\4\6\1\0\1\12\4\7"+
    "\4\6\1\0\10\7\2\6\1\0\3\7\2\6\1\0"+
    "\3\7\1\6\1\12\1\7\1\6";

  private static int [] zzUnpackAction() {
    int [] result = new int[252];
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
    "\0\0\0\72\0\164\0\72\0\72\0\256\0\350\0\u0122"+
    "\0\u015c\0\u0196\0\u01d0\0\u020a\0\u0244\0\u027e\0\u02b8\0\u02f2"+
    "\0\u032c\0\u0366\0\u03a0\0\u03da\0\u0414\0\u044e\0\u0488\0\u04c2"+
    "\0\u04fc\0\u0536\0\u0570\0\u05aa\0\u05e4\0\u061e\0\u0658\0\u0692"+
    "\0\u06cc\0\u0706\0\u0740\0\u077a\0\u07b4\0\u07ee\0\u0828\0\u0862"+
    "\0\u089c\0\u08d6\0\u0910\0\u094a\0\u0984\0\u09be\0\u09f8\0\u0a32"+
    "\0\u0a6c\0\u0aa6\0\u0ae0\0\u0b1a\0\u0b54\0\u0b8e\0\u015c\0\u0bc8"+
    "\0\u0c02\0\u0c3c\0\u0c76\0\u0cb0\0\u0cea\0\u0d24\0\u0d5e\0\u0d98"+
    "\0\u0dd2\0\u0e0c\0\u0e46\0\u0e80\0\u0eba\0\u0ef4\0\u0f2e\0\u0f68"+
    "\0\u0fa2\0\u0fdc\0\u1016\0\u1050\0\u108a\0\u10c4\0\u10fe\0\u1138"+
    "\0\u1172\0\u11ac\0\u044e\0\u11e6\0\u1220\0\u125a\0\u1294\0\u12ce"+
    "\0\u1308\0\u1342\0\u137c\0\u13b6\0\u13f0\0\u142a\0\u0862\0\u1464"+
    "\0\u149e\0\u14d8\0\u1512\0\u154c\0\u1586\0\u15c0\0\u15fa\0\u1634"+
    "\0\u166e\0\u16a8\0\u16e2\0\u171c\0\u1756\0\u1790\0\u17ca\0\u1804"+
    "\0\u183e\0\u1878\0\u18b2\0\u18ec\0\u1926\0\u1960\0\u199a\0\u19d4"+
    "\0\u1a0e\0\u1a48\0\u1a82\0\u1abc\0\u1af6\0\u1b30\0\u1b6a\0\u1ba4"+
    "\0\u1bde\0\u1c18\0\u1c52\0\u1c8c\0\u1cc6\0\u1d00\0\u1d3a\0\u1d74"+
    "\0\u1dae\0\u1de8\0\u1e22\0\u1e5c\0\u015c\0\u1e96\0\u1ed0\0\u1f0a"+
    "\0\u1f44\0\u044e\0\u1f7e\0\u1fb8\0\u1ff2\0\u202c\0\u2066\0\u20a0"+
    "\0\u20da\0\u2114\0\u214e\0\u2188\0\u21c2\0\u21fc\0\u2236\0\72"+
    "\0\u2270\0\u22aa\0\u22e4\0\u231e\0\u2358\0\u2392\0\u23cc\0\u2406"+
    "\0\u2440\0\u247a\0\u24b4\0\u24ee\0\u2528\0\u2562\0\u259c\0\u25d6"+
    "\0\u2610\0\u264a\0\u2684\0\u26be\0\u26f8\0\u2732\0\u276c\0\72"+
    "\0\u27a6\0\u27e0\0\u281a\0\u2854\0\u288e\0\u28c8\0\u2902\0\u293c"+
    "\0\u2976\0\u29b0\0\u29ea\0\u2a24\0\u2a5e\0\u2a98\0\u2ad2\0\u2b0c"+
    "\0\u2b46\0\u2b80\0\u2bba\0\u2bf4\0\u2c2e\0\u2c68\0\u2ca2\0\u2cdc"+
    "\0\u2d16\0\u2d50\0\u2d8a\0\u2dc4\0\u2dfe\0\u2e38\0\u2e72\0\u2eac"+
    "\0\u2ee6\0\u2f20\0\u2f5a\0\u2f94\0\u2fce\0\u3008\0\u3042\0\u307c"+
    "\0\u30b6\0\u30f0\0\u312a\0\u3164\0\u319e\0\u31d8\0\u3212\0\u324c"+
    "\0\u3286\0\u32c0\0\u32fa\0\u3334\0\u336e\0\u33a8\0\u33e2\0\u341c"+
    "\0\u3456\0\u3490\0\u34ca\0\u3504\0\u353e\0\u3578\0\u19d4\0\u35b2"+
    "\0\u35ec\0\72\0\u3626\0\u3660";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[252];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length() - 1;
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /**
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpacktrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\2\1\3\1\4\1\5\3\6\1\2\1\7\1\5"+
    "\1\10\1\11\1\12\1\13\1\14\2\11\1\15\2\11"+
    "\1\16\1\17\1\20\2\11\1\21\1\22\1\11\1\23"+
    "\2\11\1\2\1\24\1\25\1\26\1\27\1\30\1\31"+
    "\1\32\1\33\1\34\2\26\1\35\1\36\1\37\1\40"+
    "\1\41\1\26\1\42\1\43\1\44\1\45\1\46\1\26"+
    "\1\47\2\26\73\0\1\3\74\0\3\6\74\0\1\5"+
    "\64\0\3\50\3\0\11\11\1\51\1\11\1\52\11\11"+
    "\1\53\13\11\1\51\1\11\1\52\14\11\4\0\3\50"+
    "\3\0\25\11\1\53\32\11\4\0\3\50\3\0\25\11"+
    "\1\53\13\11\1\54\16\11\4\0\3\50\3\0\25\11"+
    "\1\53\10\11\1\55\21\11\4\0\3\50\3\0\23\11"+
    "\1\56\1\11\1\53\20\11\1\57\6\11\1\56\2\11"+
    "\4\0\3\50\3\0\25\11\1\53\15\11\1\60\14\11"+
    "\4\0\3\50\3\0\1\61\6\11\1\62\15\11\1\53"+
    "\1\61\7\11\1\62\21\11\4\0\3\50\3\0\2\11"+
    "\1\63\7\11\1\64\1\11\1\65\10\11\1\53\1\66"+
    "\15\11\1\65\13\11\4\0\3\50\3\0\16\11\1\67"+
    "\6\11\1\53\21\11\1\67\10\11\4\0\3\50\3\0"+
    "\14\11\1\70\10\11\1\53\16\11\1\70\5\11\1\71"+
    "\5\11\4\0\3\50\3\0\6\11\1\72\16\11\1\53"+
    "\7\11\1\72\22\11\4\0\3\50\3\0\1\73\24\11"+
    "\1\53\1\73\31\11\12\0\11\26\1\74\1\26\1\75"+
    "\11\26\1\0\13\26\1\74\1\26\1\76\14\26\12\0"+
    "\25\26\1\0\1\77\15\26\1\100\11\26\1\101\1\26"+
    "\12\0\25\26\1\0\32\26\12\0\25\26\1\0\1\102"+
    "\3\26\1\103\11\26\1\104\13\26\12\0\23\26\1\105"+
    "\1\26\1\0\27\26\1\105\2\26\12\0\25\26\1\0"+
    "\13\26\1\106\16\26\12\0\3\26\1\107\6\26\1\110"+
    "\11\26\1\111\1\0\32\26\12\0\25\26\1\0\4\26"+
    "\1\112\25\26\12\0\25\26\1\0\15\26\1\113\14\26"+
    "\12\0\25\26\1\0\1\114\15\26\1\115\13\26\12\0"+
    "\1\116\6\26\1\117\15\26\1\0\1\116\7\26\1\117"+
    "\21\26\12\0\14\26\1\120\10\26\1\0\4\26\1\121"+
    "\11\26\1\122\13\26\12\0\16\26\1\123\6\26\1\0"+
    "\21\26\1\123\4\26\1\124\3\26\12\0\25\26\1\0"+
    "\16\26\1\125\13\26\12\0\25\26\1\0\3\26\1\126"+
    "\26\26\12\0\14\26\1\127\10\26\1\0\7\26\1\130"+
    "\6\26\1\127\4\26\1\131\6\26\12\0\6\26\1\132"+
    "\16\26\1\0\7\26\1\132\6\26\1\133\13\26\12\0"+
    "\25\26\1\0\15\26\1\134\14\26\12\0\1\135\24\26"+
    "\1\0\1\135\31\26\12\0\25\26\1\0\22\26\1\136"+
    "\7\26\4\0\3\50\3\0\25\137\1\0\32\137\4\0"+
    "\3\50\3\0\11\11\1\67\13\11\1\53\13\11\1\67"+
    "\16\11\4\0\3\50\3\0\3\11\1\67\21\11\1\53"+
    "\3\11\1\67\26\11\12\0\25\53\1\0\32\53\4\0"+
    "\3\50\3\0\25\11\1\53\1\140\31\11\4\0\3\50"+
    "\3\0\25\11\1\53\22\11\1\141\7\11\4\0\3\50"+
    "\3\0\1\142\24\11\1\53\1\142\31\11\4\0\3\50"+
    "\3\0\25\11\1\53\24\11\1\143\5\11\4\0\3\50"+
    "\3\0\25\11\1\53\3\11\1\144\26\11\4\0\3\50"+
    "\3\0\23\11\1\67\1\11\1\53\27\11\1\67\2\11"+
    "\4\0\3\50\3\0\13\11\1\67\11\11\1\53\15\11"+
    "\1\67\14\11\4\0\3\50\3\0\13\11\1\145\11\11"+
    "\1\53\32\11\4\0\3\50\3\0\20\11\1\146\4\11"+
    "\1\53\32\11\4\0\3\50\3\0\20\11\1\67\4\11"+
    "\1\53\23\11\1\67\6\11\4\0\3\50\3\0\25\11"+
    "\1\53\14\11\1\147\15\11\4\0\3\50\3\0\12\11"+
    "\1\150\12\11\1\53\14\11\1\150\15\11\4\0\3\50"+
    "\3\0\25\11\1\53\1\11\1\151\30\11\4\0\3\50"+
    "\3\0\1\65\24\11\1\53\1\65\31\11\4\0\3\50"+
    "\3\0\11\11\1\152\13\11\1\53\13\11\1\152\16\11"+
    "\12\0\11\26\1\123\13\26\1\0\13\26\1\123\16\26"+
    "\12\0\3\26\1\123\21\26\1\0\3\26\1\123\26\26"+
    "\12\0\3\26\1\123\21\26\1\0\3\26\1\123\24\26"+
    "\1\153\1\26\12\0\25\26\1\0\22\26\1\154\7\26"+
    "\12\0\25\26\1\0\16\26\1\155\13\26\12\0\25\26"+
    "\1\0\23\26\1\156\6\26\12\0\25\26\1\0\23\26"+
    "\1\157\6\26\12\0\25\26\1\0\2\26\1\160\27\26"+
    "\12\0\25\26\1\0\24\26\1\161\5\26\12\0\1\162"+
    "\24\26\1\0\1\162\31\26\12\0\25\26\1\0\16\26"+
    "\1\163\13\26\12\0\25\26\1\0\1\164\31\26\12\0"+
    "\25\26\1\0\16\26\1\165\13\26\12\0\25\26\1\0"+
    "\4\26\1\166\25\26\12\0\25\26\1\0\27\26\1\167"+
    "\2\26\12\0\25\26\1\0\23\26\1\170\6\26\12\0"+
    "\25\26\1\0\15\26\1\171\14\26\12\0\25\26\1\0"+
    "\15\26\1\172\14\26\12\0\23\26\1\123\1\26\1\0"+
    "\27\26\1\123\2\26\12\0\13\26\1\123\11\26\1\0"+
    "\15\26\1\123\14\26\12\0\20\26\1\123\4\26\1\0"+
    "\23\26\1\123\6\26\12\0\25\26\1\0\6\26\1\173"+
    "\23\26\12\0\20\26\1\123\4\26\1\0\15\26\1\174"+
    "\3\26\1\175\1\26\1\123\6\26\12\0\25\26\1\0"+
    "\13\26\1\176\16\26\12\0\25\26\1\0\22\26\1\177"+
    "\7\26\12\0\25\26\1\0\5\26\1\200\24\26\12\0"+
    "\12\26\1\201\12\26\1\0\14\26\1\201\15\26\12\0"+
    "\25\26\1\0\16\26\1\202\13\26\12\0\25\26\1\0"+
    "\21\26\1\203\10\26\12\0\1\120\24\26\1\0\1\120"+
    "\31\26\12\0\25\26\1\0\12\26\1\204\17\26\12\0"+
    "\25\26\1\0\22\26\1\205\7\26\12\0\11\26\1\206"+
    "\13\26\1\0\13\26\1\206\16\26\12\0\25\26\1\0"+
    "\3\26\1\176\26\26\4\0\3\50\3\0\25\11\1\53"+
    "\22\11\1\207\7\11\4\0\3\50\3\0\25\11\1\53"+
    "\11\11\1\210\20\11\4\0\3\50\3\0\2\11\1\211"+
    "\22\11\1\53\2\11\1\211\27\11\4\0\3\50\3\0"+
    "\25\11\1\53\10\11\1\212\21\11\4\0\3\50\3\0"+
    "\25\11\1\53\10\11\1\213\21\11\4\0\3\50\3\0"+
    "\25\11\1\53\1\66\31\11\4\0\3\50\3\0\14\11"+
    "\1\214\10\11\1\53\32\11\4\0\3\50\3\0\25\11"+
    "\1\53\4\11\1\215\25\11\4\0\3\50\3\0\4\11"+
    "\1\67\20\11\1\53\4\11\1\67\25\11\4\0\3\50"+
    "\3\0\2\11\1\216\22\11\1\53\32\11\4\0\3\50"+
    "\3\0\21\11\1\150\3\11\1\53\24\11\1\150\5\11"+
    "\12\0\21\26\1\217\3\26\1\0\32\26\12\0\25\26"+
    "\1\0\4\26\1\220\25\26\12\0\25\26\1\0\13\26"+
    "\1\221\16\26\12\0\25\26\1\0\4\26\1\222\25\26"+
    "\12\0\25\26\1\0\4\26\1\223\25\26\12\0\25\26"+
    "\1\0\10\26\1\224\21\26\12\0\25\26\1\0\1\26"+
    "\1\225\30\26\12\0\2\26\1\226\22\26\1\0\2\26"+
    "\1\226\27\26\12\0\25\26\1\0\1\227\31\26\12\0"+
    "\25\26\1\0\30\26\1\222\1\26\12\0\25\26\1\0"+
    "\15\26\1\230\14\26\12\0\25\26\1\0\1\231\31\26"+
    "\12\0\1\26\1\232\23\26\1\0\32\26\12\0\25\26"+
    "\1\0\4\26\1\233\25\26\12\0\25\26\1\0\6\26"+
    "\1\234\23\26\12\0\25\26\1\0\6\26\1\222\23\26"+
    "\12\0\25\26\1\0\1\235\31\26\12\0\13\26\1\236"+
    "\1\26\1\41\7\26\1\0\32\26\12\0\25\26\1\0"+
    "\14\26\1\237\15\26\7\0\1\240\2\0\25\26\1\0"+
    "\32\26\12\0\25\26\1\0\10\26\1\235\21\26\7\0"+
    "\1\240\2\0\25\26\1\0\22\26\1\176\7\26\12\0"+
    "\4\26\1\123\20\26\1\0\4\26\1\123\25\26\12\0"+
    "\25\26\1\0\21\26\1\227\10\26\12\0\25\26\1\0"+
    "\10\26\1\115\21\26\12\0\25\26\1\0\4\26\1\241"+
    "\25\26\12\0\25\26\1\0\10\26\1\242\21\26\12\0"+
    "\21\26\1\201\3\26\1\0\24\26\1\201\5\26\4\0"+
    "\3\50\3\0\25\11\1\53\22\11\1\243\7\11\4\0"+
    "\3\50\3\0\25\11\1\53\16\11\1\244\13\11\4\0"+
    "\3\50\3\0\20\11\1\245\4\11\1\53\23\11\1\245"+
    "\6\11\4\0\3\50\3\0\25\11\1\53\25\11\1\246"+
    "\4\11\4\0\3\50\3\0\25\11\1\53\25\11\1\247"+
    "\4\11\4\0\3\50\3\0\10\11\1\250\14\11\1\53"+
    "\32\11\4\0\3\50\3\0\25\11\1\53\13\11\1\251"+
    "\16\11\12\0\16\26\1\252\6\26\1\0\32\26\6\0"+
    "\1\253\3\0\25\26\1\0\32\26\12\0\25\26\1\0"+
    "\4\26\1\254\25\26\12\0\20\26\1\255\4\26\1\0"+
    "\32\26\12\0\25\26\1\0\14\26\1\256\15\26\12\0"+
    "\25\26\1\0\13\26\1\156\16\26\12\0\20\26\1\257"+
    "\4\26\1\0\23\26\1\257\6\26\12\0\25\26\1\0"+
    "\23\26\1\222\6\26\12\0\25\26\1\0\23\26\1\260"+
    "\6\26\12\0\25\26\1\0\21\26\1\261\10\26\12\0"+
    "\25\26\1\0\10\26\1\262\21\26\12\0\25\26\1\0"+
    "\6\26\1\263\23\26\12\0\25\26\1\0\24\26\1\264"+
    "\5\26\12\0\25\26\1\0\23\26\1\265\6\26\12\0"+
    "\25\26\1\0\4\26\1\121\25\26\12\0\25\26\1\0"+
    "\1\266\31\26\12\0\25\26\1\0\15\26\1\222\14\26"+
    "\12\0\25\26\1\0\6\26\1\267\23\26\4\0\3\50"+
    "\1\270\2\0\25\11\1\53\32\11\4\0\3\50\3\0"+
    "\25\11\1\53\10\11\1\271\21\11\4\0\3\50\3\0"+
    "\11\11\1\272\13\11\1\53\13\11\1\272\16\11\4\0"+
    "\3\50\3\0\25\11\1\53\1\273\31\11\4\0\3\50"+
    "\3\0\25\11\1\53\10\11\1\274\21\11\4\0\3\50"+
    "\3\0\4\11\1\275\20\11\1\53\32\11\4\0\3\50"+
    "\3\0\25\11\1\53\1\276\31\11\12\0\7\26\1\222"+
    "\15\26\1\0\32\26\5\0\1\277\76\0\25\26\1\0"+
    "\1\241\31\26\12\0\25\26\1\0\10\26\1\300\21\26"+
    "\12\0\25\26\1\0\1\301\31\26\12\0\11\26\1\302"+
    "\13\26\1\0\13\26\1\302\16\26\12\0\25\26\1\0"+
    "\7\26\1\303\22\26\12\0\12\26\1\304\12\26\1\0"+
    "\32\26\12\0\25\26\1\0\15\26\1\305\14\26\12\0"+
    "\25\26\1\0\4\26\1\306\25\26\12\0\25\26\1\0"+
    "\1\307\31\26\12\0\25\26\1\0\10\26\1\310\21\26"+
    "\12\0\25\26\1\0\13\26\1\311\16\26\12\0\25\26"+
    "\1\0\15\26\1\312\14\26\4\0\3\50\3\0\25\11"+
    "\1\53\15\11\1\313\14\11\4\0\3\50\3\0\24\11"+
    "\1\67\1\53\30\11\1\67\1\11\4\0\3\50\3\0"+
    "\25\11\1\53\13\11\1\314\16\11\4\0\3\50\3\0"+
    "\25\11\1\53\3\11\1\315\26\11\4\0\3\50\3\0"+
    "\13\11\1\215\11\11\1\53\32\11\4\0\3\50\3\0"+
    "\25\11\1\53\22\11\1\316\7\11\13\0\1\317\70\0"+
    "\25\26\1\0\14\26\1\320\15\26\12\0\25\26\1\0"+
    "\13\26\1\222\16\26\12\0\24\26\1\123\1\0\30\26"+
    "\1\123\1\26\12\0\3\26\1\107\21\26\1\0\32\26"+
    "\12\0\25\26\1\0\16\26\1\321\13\26\12\0\25\26"+
    "\1\0\1\322\31\26\12\0\25\26\1\0\21\26\1\222"+
    "\10\26\12\0\25\26\1\0\6\26\1\156\23\26\12\0"+
    "\25\26\1\0\25\26\1\323\4\26\12\0\25\26\1\0"+
    "\10\26\1\324\21\26\12\0\25\26\1\0\4\26\1\325"+
    "\25\26\4\0\3\50\3\0\25\11\1\53\23\11\1\326"+
    "\6\11\4\0\3\50\3\0\25\11\1\53\4\11\1\327"+
    "\25\11\4\0\3\50\3\0\25\11\1\53\24\11\1\330"+
    "\5\11\4\0\3\50\3\0\25\11\1\53\22\11\1\331"+
    "\7\11\50\0\1\332\33\0\25\26\1\0\4\26\1\333"+
    "\25\26\12\0\25\26\1\0\15\26\1\334\14\26\12\0"+
    "\25\26\1\0\21\26\1\164\10\26\12\0\25\26\1\0"+
    "\4\26\1\335\25\26\12\0\25\26\1\0\31\26\1\336"+
    "\12\0\25\26\1\0\3\26\1\337\26\26\4\0\3\50"+
    "\3\0\2\11\1\340\22\11\1\53\32\11\4\0\3\50"+
    "\3\0\25\11\1\53\15\11\1\341\14\11\4\0\3\50"+
    "\3\0\25\11\1\53\1\342\31\11\4\0\3\50\3\0"+
    "\14\11\1\343\10\11\1\53\32\11\55\0\1\344\26\0"+
    "\17\26\1\345\5\26\1\0\32\26\12\0\25\26\1\0"+
    "\23\26\1\346\6\26\12\0\7\26\1\347\15\26\1\0"+
    "\32\26\12\0\25\26\1\0\4\26\1\350\25\26\12\0"+
    "\1\26\1\351\5\26\1\352\1\26\1\353\5\26\1\354"+
    "\5\26\1\0\32\26\4\0\3\50\3\0\25\11\1\53"+
    "\13\11\1\355\16\11\4\0\3\50\3\0\25\11\1\53"+
    "\23\11\1\356\6\11\4\0\3\50\3\0\25\11\1\53"+
    "\13\11\1\207\16\11\4\0\3\50\3\0\25\11\1\53"+
    "\5\11\1\243\24\11\40\0\1\357\43\0\25\26\1\0"+
    "\23\26\1\360\6\26\12\0\25\26\1\0\7\26\1\222"+
    "\22\26\12\0\25\26\1\0\15\26\1\361\14\26\12\0"+
    "\25\26\1\0\3\26\1\362\26\26\12\0\25\26\1\0"+
    "\30\26\1\101\1\26\12\0\25\26\1\0\15\26\1\227"+
    "\14\26\12\0\25\26\1\0\16\26\1\115\13\26\12\0"+
    "\25\26\1\0\7\26\1\130\22\26\4\0\3\50\3\0"+
    "\25\11\1\53\1\363\31\11\4\0\3\50\3\0\20\11"+
    "\1\364\4\11\1\53\32\11\61\0\1\365\22\0\25\26"+
    "\1\0\1\366\31\26\12\0\25\26\1\0\23\26\1\367"+
    "\6\26\12\0\17\26\1\370\5\26\1\0\32\26\4\0"+
    "\3\50\3\0\25\11\1\53\22\11\1\371\7\11\4\0"+
    "\3\50\3\0\25\11\1\53\16\11\1\243\13\11\70\0"+
    "\1\372\13\0\25\26\1\0\14\26\1\373\15\26\12\0"+
    "\25\26\1\0\23\26\1\131\6\26\4\0\3\50\3\0"+
    "\25\11\1\53\22\11\1\374\7\11\12\0\25\26\1\0"+
    "\17\26\1\222\12\26\4\0\3\50\3\0\25\11\1\53"+
    "\4\11\1\207\25\11";

  private static int [] zzUnpacktrans() {
    int [] result = new int[13978];
    int offset = 0;
    offset = zzUnpacktrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpacktrans(String packed, int offset, int [] result) {
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


  /** Error code for "Unknown internal scanner error". */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  /** Error code for "could not match input". */
  private static final int ZZ_NO_MATCH = 1;
  /** Error code for "pushback value was too large". */
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /**
   * Error messages for {@link #ZZ_UNKNOWN_ERROR}, {@link #ZZ_NO_MATCH}, and
   * {@link #ZZ_PUSHBACK_2BIG} respectively.
   */
  private static final String ZZ_ERROR_MSG[] = {
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state {@code aState}
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\1\11\1\1\2\11\131\1\1\0\100\1\1\11"+
    "\12\1\1\0\14\1\1\11\6\1\1\0\17\1\1\0"+
    "\12\1\1\0\11\1\1\0\12\1\1\0\5\1\1\0"+
    "\4\1\1\11\2\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[252];
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

  /** Input device. */
  private java.io.Reader zzReader;

  /** Current state of the DFA. */
  private int zzState;

  /** Current lexical state. */
  private int zzLexicalState = YYINITIAL;

  /**
   * This buffer contains the current text to be matched and is the source of the {@link #yytext()}
   * string.
   */
  private char zzBuffer[] = new char[Math.min(ZZ_BUFFERSIZE, zzMaxBufferLen())];

  /** Text position at the last accepting state. */
  private int zzMarkedPos;

  /** Current text position in the buffer. */
  private int zzCurrentPos;

  /** Marks the beginning of the {@link #yytext()} string in the buffer. */
  private int zzStartRead;

  /** Marks the last character in the buffer, that has been read from input. */
  private int zzEndRead;

  /**
   * Whether the scanner is at the end of file.
   * @see #yyatEOF
   */
  private boolean zzAtEOF;

  /**
   * The number of occupied positions in {@link #zzBuffer} beyond {@link #zzEndRead}.
   *
   * <p>When a lead/high surrogate has been read from the input stream into the final
   * {@link #zzBuffer} position, this will have a value of 1; otherwise, it will have a value of 0.
   */
  private int zzFinalHighSurrogate = 0;

  /** Number of newlines encountered up to the start of the matched text. */
  private int yyline;

  /** Number of characters from the last newline up to the start of the matched text. */
  private int yycolumn;

  /** Number of characters up to the start of the matched text. */
  @SuppressWarnings("unused")
  private long yychar;

  /** Whether the scanner is currently at the beginning of a line. */
  @SuppressWarnings("unused")
  private boolean zzAtBOL = true;

  /** Whether the user-EOF-code has already been executed. */
  @SuppressWarnings("unused")
  private boolean zzEOFDone;

  /* user code: */
    private Map<String, Integer> keywords = new TreeMap<>();
    private Map<String, Integer> classes = new TreeMap<>();
    private Map<String, Integer> properties = new TreeMap<>();
    private Map<String, Integer> especialSymbols = new TreeMap<>();
    private Map<String, Integer> individuals = new TreeMap<>();
    private Map<String, Integer> namespaces = new TreeMap<>();
    private Map<String, Integer> datatypes = new TreeMap<>();
    private Map<String, Integer> cardinalities = new TreeMap<>();

    private Map<String, Map<String, Integer>> symbolTable = new TreeMap<>();

    public Map<String, Map<String, Integer>> getSymbolTable() {
        return symbolTable;
    }


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public Lexer(java.io.Reader in) {
    this.zzReader = in;
  }


  /** Returns the maximum size of the scanner buffer, which limits the size of tokens. */
  private int zzMaxBufferLen() {
    return Integer.MAX_VALUE;
  }

  /**  Whether the scanner buffer can grow to accommodate a larger token. */
  private boolean zzCanGrow() {
    return true;
  }

  /**
   * Translates raw input code points to DFA table row
   */
  private static int zzCMap(int input) {
    int offset = input & 255;
    return offset == input ? ZZ_CMAP_BLOCKS[offset] : ZZ_CMAP_BLOCKS[ZZ_CMAP_TOP[input >> 8] | offset];
  }

  /**
   * Refills the input buffer.
   *
   * @return {@code false} iff there was new input.
   * @exception java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead - zzStartRead);

      /* translate stored positions */
      zzEndRead -= zzStartRead;
      zzCurrentPos -= zzStartRead;
      zzMarkedPos -= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length - zzFinalHighSurrogate && zzCanGrow()) {
      /* if not, and it can grow: blow it up */
      char newBuffer[] = new char[Math.min(zzBuffer.length * 2, zzMaxBufferLen())];
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
      if (requested == 0) {
        throw new java.io.EOFException("Scan buffer limit reached ["+zzBuffer.length+"]");
      }
      else {
        throw new java.io.IOException(
            "Reader returned 0 characters. See JFlex examples/zero-reader for a workaround.");
      }
    }
    if (numRead > 0) {
      zzEndRead += numRead;
      if (Character.isHighSurrogate(zzBuffer[zzEndRead - 1])) {
        if (numRead == requested) { // We requested too few chars to encode a full Unicode character
          --zzEndRead;
          zzFinalHighSurrogate = 1;
        } else {                    // There is room in the buffer for at least one more char
          int c = zzReader.read();  // Expecting to read a paired low surrogate char
          if (c == -1) {
            return true;
          } else {
            zzBuffer[zzEndRead++] = (char)c;
          }
        }
      }
      /* potentially more input available */
      return false;
    }

    /* numRead < 0 ==> end of stream */
    return true;
  }


  /**
   * Closes the input reader.
   *
   * @throws java.io.IOException if the reader could not be closed.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true; // indicate end of file
    zzEndRead = zzStartRead; // invalidate buffer

    if (zzReader != null) {
      zzReader.close();
    }
  }


  /**
   * Resets the scanner to read from a new input stream.
   *
   * <p>Does not close the old reader.
   *
   * <p>All internal variables are reset, the old input stream <b>cannot</b> be reused (internal
   * buffer is discarded and lost). Lexical state is set to {@code ZZ_INITIAL}.
   *
   * <p>Internal scan buffer is resized down to its initial length, if it has grown.
   *
   * @param reader The new input stream.
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzEOFDone = false;
    yyResetPosition();
    zzLexicalState = YYINITIAL;
    int initBufferSize = Math.min(ZZ_BUFFERSIZE, zzMaxBufferLen());
    if (zzBuffer.length > initBufferSize) {
      zzBuffer = new char[initBufferSize];
    }
  }

  /**
   * Resets the input position.
   */
  private final void yyResetPosition() {
      zzAtBOL  = true;
      zzAtEOF  = false;
      zzCurrentPos = 0;
      zzMarkedPos = 0;
      zzStartRead = 0;
      zzEndRead = 0;
      zzFinalHighSurrogate = 0;
      yyline = 0;
      yycolumn = 0;
      yychar = 0L;
  }


  /**
   * Returns whether the scanner has reached the end of the reader it reads from.
   *
   * @return whether the scanner has reached EOF.
   */
  public final boolean yyatEOF() {
    return zzAtEOF;
  }


  /**
   * Returns the current lexical state.
   *
   * @return the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state.
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   *
   * @return the matched text.
   */
  public final String yytext() {
    return new String(zzBuffer, zzStartRead, zzMarkedPos-zzStartRead);
  }


  /**
   * Returns the character at the given position from the matched text.
   *
   * <p>It is equivalent to {@code yytext().charAt(pos)}, but faster.
   *
   * @param position the position of the character to fetch. A value from 0 to {@code yylength()-1}.
   *
   * @return the character at {@code position}.
   */
  public final char yycharat(int position) {
    return zzBuffer[zzStartRead + position];
  }


  /**
   * How many characters were matched.
   *
   * @return the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occurred while scanning.
   *
   * <p>In a well-formed scanner (no or only correct usage of {@code yypushback(int)} and a
   * match-all fallback rule) this method will only be called with things that
   * "Can't Possibly Happen".
   *
   * <p>If this method is called, something is seriously wrong (e.g. a JFlex bug producing a faulty
   * scanner etc.).
   *
   * <p>Usual syntax/scanner level error handling should be done in error fallback rules.
   *
   * @param errorCode the code of the error message to display.
   */
  private static void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    } catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  }


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * <p>They will be read again by then next call of the scanning method.
   *
   * @param number the number of characters to be read again. This number must not be greater than
   *     {@link #yylength()}.
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }




  /**
   * Resumes scanning until the next regular expression is matched, the end of input is encountered
   * or an I/O-Error occurs.
   *
   * @return the next token.
   * @exception java.io.IOException if any I/O-Error occurs.
   */
  public int yylex() throws java.io.IOException
  {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char[] zzBufferL = zzBuffer;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      boolean zzR = false;
      int zzCh;
      int zzCharCount;
      for (zzCurrentPosL = zzStartRead  ;
           zzCurrentPosL < zzMarkedPosL ;
           zzCurrentPosL += zzCharCount ) {
        zzCh = Character.codePointAt(zzBufferL, zzCurrentPosL, zzMarkedPosL);
        zzCharCount = Character.charCount(zzCh);
        switch (zzCh) {
        case '\u000B':  // fall through
        case '\u000C':  // fall through
        case '\u0085':  // fall through
        case '\u2028':  // fall through
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
        // peek one character ahead if it is
        // (if we have counted one line too much)
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
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMap(zzInput) ];
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
        return YYEOF;
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1:
            { throw new RuntimeException("Illegal character <" + yytext() + ">");
            }
          // fall through
          case 12: break;
          case 2:
            { /* ignore */
            }
          // fall through
          case 13: break;
          case 3:
            { System.out.print(yytext());
            }
          // fall through
          case 14: break;
          case 4:
            { especialSymbols.put(yytext().toUpperCase(), 0); symbolTable.put("especialSymbols", especialSymbols);
            }
          // fall through
          case 15: break;
          case 5:
            { cardinalities.put(yytext().toUpperCase(), 0); symbolTable.put("cardinalities", cardinalities);
            }
          // fall through
          case 16: break;
          case 6:
            { classes.put(yytext().toUpperCase(), 0); symbolTable.put("classes", classes);
            }
          // fall through
          case 17: break;
          case 7:
            { properties.put(yytext().toUpperCase(), 0); symbolTable.put("properties", properties);
            }
          // fall through
          case 18: break;
          case 8:
            { individuals.put(yytext().toUpperCase(), 0); symbolTable.put("individuals", individuals);
            }
          // fall through
          case 19: break;
          case 9:
            { keywords.put(yytext().toUpperCase(), 0); symbolTable.put("keywords", keywords);
            }
          // fall through
          case 20: break;
          case 10:
            { datatypes.put(yytext().toUpperCase(), 0); symbolTable.put("datatypes", datatypes);
            }
          // fall through
          case 21: break;
          case 11:
            { namespaces.put(yytext().toUpperCase(), 0); symbolTable.put("namespaces", namespaces);
            }
          // fall through
          case 22: break;
          default:
            zzScanError(ZZ_NO_MATCH);
        }
      }
    }
  }

  /**
   * Runs the scanner on input files.
   *
   * This is a standalone scanner, it will print any unmatched
   * text to System.out unchanged.
   *
   * @param argv   the command line, contains the filenames to run
   *               the scanner on.
   */
  public static void main(String[] argv) {
    if (argv.length == 0) {
      System.out.println("Usage : java Lexer [ --encoding <name> ] <inputfile(s)>");
    }
    else {
      int firstFilePos = 0;
      String encodingName = "UTF-8";
      if (argv[0].equals("--encoding")) {
        firstFilePos = 2;
        encodingName = argv[1];
        try {
          // Side-effect: is encodingName valid?
          java.nio.charset.Charset.forName(encodingName);
        } catch (Exception e) {
          System.out.println("Invalid encoding '" + encodingName + "'");
          return;
        }
      }
      for (int i = firstFilePos; i < argv.length; i++) {
        Lexer scanner = null;
        java.io.FileInputStream stream = null;
        java.io.Reader reader = null;
        try {
          stream = new java.io.FileInputStream(argv[i]);
          reader = new java.io.InputStreamReader(stream, encodingName);
          scanner = new Lexer(reader);
          while ( !scanner.zzAtEOF ) scanner.yylex();
        }
        catch (java.io.FileNotFoundException e) {
          System.out.println("File not found : \""+argv[i]+"\"");
        }
        catch (java.io.IOException e) {
          System.out.println("IO error scanning file \""+argv[i]+"\"");
          System.out.println(e);
        }
        catch (Exception e) {
          System.out.println("Unexpected exception:");
          e.printStackTrace();
        }
        finally {
          if (reader != null) {
            try {
              reader.close();
            }
            catch (java.io.IOException e) {
              System.out.println("IO error closing file \""+argv[i]+"\"");
              System.out.println(e);
            }
          }
          if (stream != null) {
            try {
              stream.close();
            }
            catch (java.io.IOException e) {
              System.out.println("IO error closing file \""+argv[i]+"\"");
              System.out.println(e);
            }
          }
        }
      }
    }
  }


}
