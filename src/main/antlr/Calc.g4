grammar Calc;

@header {package dev.conless.calc.grammar;}

program: expression EOF;

expression
  : expression op = (Mul | Div | Mod) expression				# BinaryExpr
	| expression op = (Add | Sub) expression		  				# BinaryExpr
	| constant										                				# AtomExpr
	|  '(' expression ')'							            				# SubExpr
  ;

constant: Number;

Mul: '*';
Div: '/';
Mod: '%';
Add: '+';
Sub: '-';
Number: [1-9][0-9]* | '0';
