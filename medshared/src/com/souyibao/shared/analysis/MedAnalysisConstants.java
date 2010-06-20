package com.souyibao.shared.analysis;



public interface MedAnalysisConstants {



	  int EOF = 0;

	  int WORD = 1;

	  int ACRONYM = 2;

	  int SIGRAM = 3;

	  int IRREGULAR_WORD = 4;

	  int C_PLUS_PLUS = 5;

	  int C_SHARP = 6;

	  int PLUS = 7;

	  int MINUS = 8;

	  int QUOTE = 9;

	  int COLON = 10;

	  int SLASH = 11;

	  int DOT = 12;

	  int ATSIGN = 13;

	  int APOSTROPHE = 14;

	  int WHITE = 15;

	  int WORD_PUNCT = 16;

	  int LETTER = 17;

	  int CJK = 18;

	  int DIGIT = 19;



	  int DEFAULT = 0;



	  String[] tokenImage = {

	    "<EOF>",

	    "<WORD>",

	    "<ACRONYM>",

	    "<SIGRAM>",

	    "<IRREGULAR_WORD>",

	    "<C_PLUS_PLUS>",

	    "<C_SHARP>",

	    "\"+\"",

	    "\"-\"",

	    "\"\\\"\"",

	    "\":\"",

	    "\"/\"",

	    "\".\"",

	    "\"@\"",

	    "\"\\\'\"",

	    "<WHITE>",

	    "<WORD_PUNCT>",

	    "<LETTER>",

	    "<CJK>",

	    "<DIGIT>",

	  };



}

