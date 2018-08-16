// Generated from ../JdScriptQuerySql.g4 by ANTLR 4.5.3

   package com.uber.uberscriptquery.antlr4.generated;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class JdScriptQuerySqlParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, URL_STRING=16, 
		JSON=17, TEXT=18, CSV=19, PARQUET=20, SELECT=21, FROM=22, ADD=23, AS=24, 
		ALL=25, DISTINCT=26, WHERE=27, GROUP=28, BY=29, GROUPING=30, SETS=31, 
		CUBE=32, ROLLUP=33, ORDER=34, HAVING=35, LIMIT=36, AT=37, OR=38, AND=39, 
		IN=40, NOT=41, NO=42, EXISTS=43, BETWEEN=44, LIKE=45, RLIKE=46, IS=47, 
		NULL=48, TRUE=49, FALSE=50, NULLS=51, ASC=52, DESC=53, FOR=54, INTERVAL=55, 
		CASE=56, WHEN=57, THEN=58, ELSE=59, END=60, JOIN=61, CROSS=62, OUTER=63, 
		INNER=64, LEFT=65, SEMI=66, RIGHT=67, FULL=68, NATURAL=69, ON=70, LATERAL=71, 
		WINDOW=72, OVER=73, PARTITION=74, RANGE=75, ROWS=76, UNBOUNDED=77, PRECEDING=78, 
		FOLLOWING=79, CURRENT=80, ROW=81, WITH=82, VALUES=83, CREATE=84, TABLE=85, 
		VIEW=86, REPLACE=87, INSERT=88, DELETE=89, INTO=90, DESCRIBE=91, EXPLAIN=92, 
		FORMAT=93, LOGICAL=94, CODEGEN=95, CAST=96, SHOW=97, TABLES=98, COLUMNS=99, 
		COLUMN=100, USE=101, PARTITIONS=102, FUNCTIONS=103, DROP=104, UNION=105, 
		EXCEPT=106, INTERSECT=107, TO=108, TABLESAMPLE=109, STRATIFY=110, ALTER=111, 
		RENAME=112, ARRAY=113, MAP=114, STRUCT=115, COMMENT=116, SET=117, RESET=118, 
		DATA=119, START=120, TRANSACTION=121, COMMIT=122, ROLLBACK=123, MACRO=124, 
		IF=125, EQ=126, NSEQ=127, NEQ=128, NEQJ=129, LT=130, LTE=131, GT=132, 
		GTE=133, PLUS=134, MINUS=135, ASTERISK=136, SLASH=137, PERCENT=138, DIV=139, 
		TILDE=140, AMPERSAND=141, PIPE=142, HAT=143, PERCENTLIT=144, BUCKET=145, 
		OUT=146, OF=147, SORT=148, CLUSTER=149, DISTRIBUTE=150, OVERWRITE=151, 
		TRANSFORM=152, REDUCE=153, USING=154, SERDE=155, SERDEPROPERTIES=156, 
		RECORDREADER=157, RECORDWRITER=158, DELIMITED=159, FIELDS=160, TERMINATED=161, 
		COLLECTION=162, ITEMS=163, KEYS=164, ESCAPED=165, LINES=166, SEPARATED=167, 
		FUNCTION=168, EXTENDED=169, REFRESH=170, CLEAR=171, CACHE=172, UNCACHE=173, 
		LAZY=174, FORMATTED=175, TEMPORARY=176, OPTIONS=177, UNSET=178, TBLPROPERTIES=179, 
		DBPROPERTIES=180, BUCKETS=181, SKEWED=182, STORED=183, DIRECTORIES=184, 
		LOCATION=185, EXCHANGE=186, ARCHIVE=187, UNARCHIVE=188, FILEFORMAT=189, 
		TOUCH=190, COMPACT=191, CONCATENATE=192, CHANGE=193, CASCADE=194, RESTRICT=195, 
		CLUSTERED=196, SORTED=197, PURGE=198, INPUTFORMAT=199, OUTPUTFORMAT=200, 
		DATABASE=201, DATABASES=202, DFS=203, TRUNCATE=204, ANALYZE=205, COMPUTE=206, 
		LIST=207, STATISTICS=208, PARTITIONED=209, EXTERNAL=210, DEFINED=211, 
		REVOKE=212, GRANT=213, LOCK=214, UNLOCK=215, MSCK=216, REPAIR=217, EXPORT=218, 
		IMPORT=219, LOAD=220, ROLE=221, ROLES=222, COMPACTIONS=223, PRINCIPALS=224, 
		TRANSACTIONS=225, INDEX=226, INDEXES=227, LOCKS=228, OPTION=229, ANTI=230, 
		LOCAL=231, INPATH=232, STRING=233, BIGINT_LITERAL=234, SMALLINT_LITERAL=235, 
		TINYINT_LITERAL=236, BYTELENGTH_LITERAL=237, INTEGER_VALUE=238, DECIMAL_VALUE=239, 
		SCIENTIFIC_DECIMAL_VALUE=240, DOUBLE_LITERAL=241, IDENTIFIER=242, BACKQUOTED_IDENTIFIER=243, 
		SIMPLE_COMMENT=244, BRACKETED_COMMENT=245, WS=246, UNRECOGNIZED=247, DELIMITER=248;
	public static final int
		RULE_root = 0, RULE_jsonQueryStatementAssignment = 1, RULE_jsonQueryStatementAssignment_query = 2, 
		RULE_statementAssignment = 3, RULE_statementAssignment_tableAlias = 4, 
		RULE_statementAssignment_queryType = 5, RULE_statementAssignment_queryEngine = 6, 
		RULE_statementAssignment_query = 7, RULE_configSetting = 8, RULE_statementAssignment_udf = 9, 
		RULE_statementAssignment_param = 10, RULE_fileAssignment = 11, RULE_fileAssignment_tableAlias = 12, 
		RULE_fileAssignment_fileType = 13, RULE_fileAssignment_fileLocation = 14, 
		RULE_actionStatement = 15, RULE_actionStatement_param = 16, RULE_jsonObject = 17, 
		RULE_jsonArray = 18, RULE_jsonPair = 19, RULE_jsonValue = 20, RULE_singleStatement = 21, 
		RULE_singleExpression = 22, RULE_singleTableIdentifier = 23, RULE_singleDataType = 24, 
		RULE_statement = 25, RULE_unsupportedHiveNativeCommands = 26, RULE_createTableHeader = 27, 
		RULE_bucketSpec = 28, RULE_skewSpec = 29, RULE_locationSpec = 30, RULE_query = 31, 
		RULE_insertInto = 32, RULE_partitionSpecLocation = 33, RULE_partitionSpec = 34, 
		RULE_partitionVal = 35, RULE_describeFuncName = 36, RULE_describeColName = 37, 
		RULE_ctes = 38, RULE_namedQuery = 39, RULE_tableProvider = 40, RULE_tablePropertyList = 41, 
		RULE_tableProperty = 42, RULE_tablePropertyKey = 43, RULE_tablePropertyValue = 44, 
		RULE_constantList = 45, RULE_nestedConstantList = 46, RULE_createFileFormat = 47, 
		RULE_fileFormat = 48, RULE_storageHandler = 49, RULE_resource = 50, RULE_queryNoWith = 51, 
		RULE_queryOrganization = 52, RULE_multiInsertQueryBody = 53, RULE_queryTerm = 54, 
		RULE_queryPrimary = 55, RULE_sortItem = 56, RULE_querySpecification = 57, 
		RULE_fromClause = 58, RULE_aggregation = 59, RULE_groupingSet = 60, RULE_lateralView = 61, 
		RULE_setQuantifier = 62, RULE_relation = 63, RULE_joinType = 64, RULE_joinCriteria = 65, 
		RULE_sample = 66, RULE_identifierList = 67, RULE_identifierSeq = 68, RULE_orderedIdentifierList = 69, 
		RULE_orderedIdentifier = 70, RULE_identifierCommentList = 71, RULE_identifierComment = 72, 
		RULE_relationPrimary = 73, RULE_inlineTable = 74, RULE_rowFormat = 75, 
		RULE_tableIdentifier = 76, RULE_namedExpression = 77, RULE_namedExpressionSeq = 78, 
		RULE_expression = 79, RULE_booleanExpression = 80, RULE_predicated = 81, 
		RULE_predicate = 82, RULE_valueExpression = 83, RULE_primaryExpression = 84, 
		RULE_constant = 85, RULE_comparisonOperator = 86, RULE_arithmeticOperator = 87, 
		RULE_predicateOperator = 88, RULE_booleanValue = 89, RULE_interval = 90, 
		RULE_intervalField = 91, RULE_intervalValue = 92, RULE_dataType = 93, 
		RULE_colTypeList = 94, RULE_colType = 95, RULE_whenClause = 96, RULE_windows = 97, 
		RULE_namedWindow = 98, RULE_windowSpec = 99, RULE_windowFrame = 100, RULE_frameBound = 101, 
		RULE_qualifiedName = 102, RULE_identifier = 103, RULE_strictIdentifier = 104, 
		RULE_quotedIdentifier = 105, RULE_number = 106, RULE_nonReserved = 107;
	public static final String[] ruleNames = {
		"root", "jsonQueryStatementAssignment", "jsonQueryStatementAssignment_query", 
		"statementAssignment", "statementAssignment_tableAlias", "statementAssignment_queryType", 
		"statementAssignment_queryEngine", "statementAssignment_query", "configSetting", 
		"statementAssignment_udf", "statementAssignment_param", "fileAssignment", 
		"fileAssignment_tableAlias", "fileAssignment_fileType", "fileAssignment_fileLocation", 
		"actionStatement", "actionStatement_param", "jsonObject", "jsonArray", 
		"jsonPair", "jsonValue", "singleStatement", "singleExpression", "singleTableIdentifier", 
		"singleDataType", "statement", "unsupportedHiveNativeCommands", "createTableHeader", 
		"bucketSpec", "skewSpec", "locationSpec", "query", "insertInto", "partitionSpecLocation", 
		"partitionSpec", "partitionVal", "describeFuncName", "describeColName", 
		"ctes", "namedQuery", "tableProvider", "tablePropertyList", "tableProperty", 
		"tablePropertyKey", "tablePropertyValue", "constantList", "nestedConstantList", 
		"createFileFormat", "fileFormat", "storageHandler", "resource", "queryNoWith", 
		"queryOrganization", "multiInsertQueryBody", "queryTerm", "queryPrimary", 
		"sortItem", "querySpecification", "fromClause", "aggregation", "groupingSet", 
		"lateralView", "setQuantifier", "relation", "joinType", "joinCriteria", 
		"sample", "identifierList", "identifierSeq", "orderedIdentifierList", 
		"orderedIdentifier", "identifierCommentList", "identifierComment", "relationPrimary", 
		"inlineTable", "rowFormat", "tableIdentifier", "namedExpression", "namedExpressionSeq", 
		"expression", "booleanExpression", "predicated", "predicate", "valueExpression", 
		"primaryExpression", "constant", "comparisonOperator", "arithmeticOperator", 
		"predicateOperator", "booleanValue", "interval", "intervalField", "intervalValue", 
		"dataType", "colTypeList", "colType", "whenClause", "windows", "namedWindow", 
		"windowSpec", "windowFrame", "frameBound", "qualifiedName", "identifier", 
		"strictIdentifier", "quotedIdentifier", "number", "nonReserved"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "';'", "'SQL'", "'DATAGEN'", "'EXLUDE'", "'FILTER'", "'FILE'", "'('", 
		"')'", "','", "'{'", "'}'", "'['", "']'", "':'", "'.'", null, "'JSON'", 
		"'TEXT'", "'CSV'", "'PARQUET'", "'SELECT'", "'FROM'", "'ADD'", "'AS'", 
		"'ALL'", "'DISTINCT'", "'WHERE'", "'GROUP'", "'BY'", "'GROUPING'", "'SETS'", 
		"'CUBE'", "'ROLLUP'", "'ORDER'", "'HAVING'", "'LIMIT'", "'AT'", "'OR'", 
		"'AND'", "'IN'", null, "'NO'", "'EXISTS'", "'BETWEEN'", "'LIKE'", null, 
		"'IS'", "'NULL'", "'TRUE'", "'FALSE'", "'NULLS'", "'ASC'", "'DESC'", "'FOR'", 
		"'INTERVAL'", "'CASE'", "'WHEN'", "'THEN'", "'ELSE'", "'END'", "'JOIN'", 
		"'CROSS'", "'OUTER'", "'INNER'", "'LEFT'", "'SEMI'", "'RIGHT'", "'FULL'", 
		"'NATURAL'", "'ON'", "'LATERAL'", "'WINDOW'", "'OVER'", "'PARTITION'", 
		"'RANGE'", "'ROWS'", "'UNBOUNDED'", "'PRECEDING'", "'FOLLOWING'", "'CURRENT'", 
		"'ROW'", "'WITH'", "'VALUES'", "'CREATE'", "'TABLE'", "'VIEW'", "'REPLACE'", 
		"'INSERT'", "'DELETE'", "'INTO'", "'DESCRIBE'", "'EXPLAIN'", "'FORMAT'", 
		"'LOGICAL'", "'CODEGEN'", "'CAST'", "'SHOW'", "'TABLES'", "'COLUMNS'", 
		"'COLUMN'", "'USE'", "'PARTITIONS'", "'FUNCTIONS'", "'DROP'", "'UNION'", 
		"'EXCEPT'", "'INTERSECT'", "'TO'", "'TABLESAMPLE'", "'STRATIFY'", "'ALTER'", 
		"'RENAME'", "'ARRAY'", "'MAP'", "'STRUCT'", "'COMMENT'", "'SET'", "'RESET'", 
		"'DATA'", "'START'", "'TRANSACTION'", "'COMMIT'", "'ROLLBACK'", "'MACRO'", 
		"'IF'", null, "'<=>'", "'<>'", "'!='", "'<'", null, "'>'", null, "'+'", 
		"'-'", "'*'", "'/'", "'%'", "'DIV'", "'~'", "'&'", "'|'", "'^'", "'PERCENT'", 
		"'BUCKET'", "'OUT'", "'OF'", "'SORT'", "'CLUSTER'", "'DISTRIBUTE'", "'OVERWRITE'", 
		"'TRANSFORM'", "'REDUCE'", "'USING'", "'SERDE'", "'SERDEPROPERTIES'", 
		"'RECORDREADER'", "'RECORDWRITER'", "'DELIMITED'", "'FIELDS'", "'TERMINATED'", 
		"'COLLECTION'", "'ITEMS'", "'KEYS'", "'ESCAPED'", "'LINES'", "'SEPARATED'", 
		"'FUNCTION'", "'EXTENDED'", "'REFRESH'", "'CLEAR'", "'CACHE'", "'UNCACHE'", 
		"'LAZY'", "'FORMATTED'", null, "'OPTIONS'", "'UNSET'", "'TBLPROPERTIES'", 
		"'DBPROPERTIES'", "'BUCKETS'", "'SKEWED'", "'STORED'", "'DIRECTORIES'", 
		"'LOCATION'", "'EXCHANGE'", "'ARCHIVE'", "'UNARCHIVE'", "'FILEFORMAT'", 
		"'TOUCH'", "'COMPACT'", "'CONCATENATE'", "'CHANGE'", "'CASCADE'", "'RESTRICT'", 
		"'CLUSTERED'", "'SORTED'", "'PURGE'", "'INPUTFORMAT'", "'OUTPUTFORMAT'", 
		null, null, "'DFS'", "'TRUNCATE'", "'ANALYZE'", "'COMPUTE'", "'LIST'", 
		"'STATISTICS'", "'PARTITIONED'", "'EXTERNAL'", "'DEFINED'", "'REVOKE'", 
		"'GRANT'", "'LOCK'", "'UNLOCK'", "'MSCK'", "'REPAIR'", "'EXPORT'", "'IMPORT'", 
		"'LOAD'", "'ROLE'", "'ROLES'", "'COMPACTIONS'", "'PRINCIPALS'", "'TRANSACTIONS'", 
		"'INDEX'", "'INDEXES'", "'LOCKS'", "'OPTION'", "'ANTI'", "'LOCAL'", "'INPATH'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, "URL_STRING", "JSON", "TEXT", "CSV", "PARQUET", 
		"SELECT", "FROM", "ADD", "AS", "ALL", "DISTINCT", "WHERE", "GROUP", "BY", 
		"GROUPING", "SETS", "CUBE", "ROLLUP", "ORDER", "HAVING", "LIMIT", "AT", 
		"OR", "AND", "IN", "NOT", "NO", "EXISTS", "BETWEEN", "LIKE", "RLIKE", 
		"IS", "NULL", "TRUE", "FALSE", "NULLS", "ASC", "DESC", "FOR", "INTERVAL", 
		"CASE", "WHEN", "THEN", "ELSE", "END", "JOIN", "CROSS", "OUTER", "INNER", 
		"LEFT", "SEMI", "RIGHT", "FULL", "NATURAL", "ON", "LATERAL", "WINDOW", 
		"OVER", "PARTITION", "RANGE", "ROWS", "UNBOUNDED", "PRECEDING", "FOLLOWING", 
		"CURRENT", "ROW", "WITH", "VALUES", "CREATE", "TABLE", "VIEW", "REPLACE", 
		"INSERT", "DELETE", "INTO", "DESCRIBE", "EXPLAIN", "FORMAT", "LOGICAL", 
		"CODEGEN", "CAST", "SHOW", "TABLES", "COLUMNS", "COLUMN", "USE", "PARTITIONS", 
		"FUNCTIONS", "DROP", "UNION", "EXCEPT", "INTERSECT", "TO", "TABLESAMPLE", 
		"STRATIFY", "ALTER", "RENAME", "ARRAY", "MAP", "STRUCT", "COMMENT", "SET", 
		"RESET", "DATA", "START", "TRANSACTION", "COMMIT", "ROLLBACK", "MACRO", 
		"IF", "EQ", "NSEQ", "NEQ", "NEQJ", "LT", "LTE", "GT", "GTE", "PLUS", "MINUS", 
		"ASTERISK", "SLASH", "PERCENT", "DIV", "TILDE", "AMPERSAND", "PIPE", "HAT", 
		"PERCENTLIT", "BUCKET", "OUT", "OF", "SORT", "CLUSTER", "DISTRIBUTE", 
		"OVERWRITE", "TRANSFORM", "REDUCE", "USING", "SERDE", "SERDEPROPERTIES", 
		"RECORDREADER", "RECORDWRITER", "DELIMITED", "FIELDS", "TERMINATED", "COLLECTION", 
		"ITEMS", "KEYS", "ESCAPED", "LINES", "SEPARATED", "FUNCTION", "EXTENDED", 
		"REFRESH", "CLEAR", "CACHE", "UNCACHE", "LAZY", "FORMATTED", "TEMPORARY", 
		"OPTIONS", "UNSET", "TBLPROPERTIES", "DBPROPERTIES", "BUCKETS", "SKEWED", 
		"STORED", "DIRECTORIES", "LOCATION", "EXCHANGE", "ARCHIVE", "UNARCHIVE", 
		"FILEFORMAT", "TOUCH", "COMPACT", "CONCATENATE", "CHANGE", "CASCADE", 
		"RESTRICT", "CLUSTERED", "SORTED", "PURGE", "INPUTFORMAT", "OUTPUTFORMAT", 
		"DATABASE", "DATABASES", "DFS", "TRUNCATE", "ANALYZE", "COMPUTE", "LIST", 
		"STATISTICS", "PARTITIONED", "EXTERNAL", "DEFINED", "REVOKE", "GRANT", 
		"LOCK", "UNLOCK", "MSCK", "REPAIR", "EXPORT", "IMPORT", "LOAD", "ROLE", 
		"ROLES", "COMPACTIONS", "PRINCIPALS", "TRANSACTIONS", "INDEX", "INDEXES", 
		"LOCKS", "OPTION", "ANTI", "LOCAL", "INPATH", "STRING", "BIGINT_LITERAL", 
		"SMALLINT_LITERAL", "TINYINT_LITERAL", "BYTELENGTH_LITERAL", "INTEGER_VALUE", 
		"DECIMAL_VALUE", "SCIENTIFIC_DECIMAL_VALUE", "DOUBLE_LITERAL", "IDENTIFIER", 
		"BACKQUOTED_IDENTIFIER", "SIMPLE_COMMENT", "BRACKETED_COMMENT", "WS", 
		"UNRECOGNIZED", "DELIMITER"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "JdScriptQuerySql.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public JdScriptQuerySqlParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class RootContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(JdScriptQuerySqlParser.EOF, 0); }
		public List<ActionStatementContext> actionStatement() {
			return getRuleContexts(ActionStatementContext.class);
		}
		public ActionStatementContext actionStatement(int i) {
			return getRuleContext(ActionStatementContext.class,i);
		}
		public List<FileAssignmentContext> fileAssignment() {
			return getRuleContexts(FileAssignmentContext.class);
		}
		public FileAssignmentContext fileAssignment(int i) {
			return getRuleContext(FileAssignmentContext.class,i);
		}
		public List<JsonQueryStatementAssignmentContext> jsonQueryStatementAssignment() {
			return getRuleContexts(JsonQueryStatementAssignmentContext.class);
		}
		public JsonQueryStatementAssignmentContext jsonQueryStatementAssignment(int i) {
			return getRuleContext(JsonQueryStatementAssignmentContext.class,i);
		}
		public List<StatementAssignmentContext> statementAssignment() {
			return getRuleContexts(StatementAssignmentContext.class);
		}
		public StatementAssignmentContext statementAssignment(int i) {
			return getRuleContext(StatementAssignmentContext.class,i);
		}
		public RootContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_root; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JdScriptQuerySqlListener ) ((JdScriptQuerySqlListener)listener).enterRoot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JdScriptQuerySqlListener ) ((JdScriptQuerySqlListener)listener).exitRoot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JdScriptQuerySqlVisitor ) return ((JdScriptQuerySqlVisitor<? extends T>)visitor).visitRoot(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RootContext root() throws RecognitionException {
		RootContext _localctx = new RootContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_root);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(227);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(225);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
					case 1:
						{
						{
						setState(216);
						fileAssignment();
						setState(217);
						match(T__0);
						}
						}
						break;
					case 2:
						{
						{
						setState(219);
						jsonQueryStatementAssignment();
						setState(220);
						match(T__0);
						}
						}
						break;
					case 3:
						{
						{
						setState(222);
						statementAssignment();
						setState(223);
						match(T__0);
						}
						}
						break;
					}
					} 
				}
				setState(229);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			setState(235);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SELECT) | (1L << FROM) | (1L << ADD) | (1L << AS) | (1L << ALL) | (1L << DISTINCT) | (1L << WHERE) | (1L << GROUP) | (1L << BY) | (1L << GROUPING) | (1L << SETS) | (1L << CUBE) | (1L << ROLLUP) | (1L << ORDER) | (1L << HAVING) | (1L << LIMIT) | (1L << AT) | (1L << OR) | (1L << AND) | (1L << IN) | (1L << NOT) | (1L << NO) | (1L << EXISTS) | (1L << BETWEEN) | (1L << LIKE) | (1L << RLIKE) | (1L << IS) | (1L << NULL) | (1L << TRUE) | (1L << FALSE) | (1L << NULLS) | (1L << ASC) | (1L << DESC) | (1L << FOR) | (1L << INTERVAL) | (1L << CASE) | (1L << WHEN) | (1L << THEN) | (1L << ELSE) | (1L << END) | (1L << JOIN) | (1L << CROSS) | (1L << OUTER))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (INNER - 64)) | (1L << (LEFT - 64)) | (1L << (SEMI - 64)) | (1L << (RIGHT - 64)) | (1L << (FULL - 64)) | (1L << (NATURAL - 64)) | (1L << (ON - 64)) | (1L << (LATERAL - 64)) | (1L << (WINDOW - 64)) | (1L << (OVER - 64)) | (1L << (PARTITION - 64)) | (1L << (RANGE - 64)) | (1L << (ROWS - 64)) | (1L << (UNBOUNDED - 64)) | (1L << (PRECEDING - 64)) | (1L << (FOLLOWING - 64)) | (1L << (CURRENT - 64)) | (1L << (ROW - 64)) | (1L << (WITH - 64)) | (1L << (VALUES - 64)) | (1L << (CREATE - 64)) | (1L << (TABLE - 64)) | (1L << (VIEW - 64)) | (1L << (REPLACE - 64)) | (1L << (INSERT - 64)) | (1L << (DELETE - 64)) | (1L << (INTO - 64)) | (1L << (DESCRIBE - 64)) | (1L << (EXPLAIN - 64)) | (1L << (FORMAT - 64)) | (1L << (LOGICAL - 64)) | (1L << (CODEGEN - 64)) | (1L << (CAST - 64)) | (1L << (SHOW - 64)) | (1L << (TABLES - 64)) | (1L << (COLUMNS - 64)) | (1L << (COLUMN - 64)) | (1L << (USE - 64)) | (1L << (PARTITIONS - 64)) | (1L << (FUNCTIONS - 64)) | (1L << (DROP - 64)) | (1L << (UNION - 64)) | (1L << (EXCEPT - 64)) | (1L << (INTERSECT - 64)) | (1L << (TO - 64)) | (1L << (TABLESAMPLE - 64)) | (1L << (STRATIFY - 64)) | (1L << (ALTER - 64)) | (1L << (RENAME - 64)) | (1L << (ARRAY - 64)) | (1L << (MAP - 64)) | (1L << (STRUCT - 64)) | (1L << (COMMENT - 64)) | (1L << (SET - 64)) | (1L << (RESET - 64)) | (1L << (DATA - 64)) | (1L << (START - 64)) | (1L << (TRANSACTION - 64)) | (1L << (COMMIT - 64)) | (1L << (ROLLBACK - 64)) | (1L << (MACRO - 64)) | (1L << (IF - 64)))) != 0) || ((((_la - 139)) & ~0x3f) == 0 && ((1L << (_la - 139)) & ((1L << (DIV - 139)) | (1L << (PERCENTLIT - 139)) | (1L << (BUCKET - 139)) | (1L << (OUT - 139)) | (1L << (OF - 139)) | (1L << (SORT - 139)) | (1L << (CLUSTER - 139)) | (1L << (DISTRIBUTE - 139)) | (1L << (OVERWRITE - 139)) | (1L << (TRANSFORM - 139)) | (1L << (REDUCE - 139)) | (1L << (USING - 139)) | (1L << (SERDE - 139)) | (1L << (SERDEPROPERTIES - 139)) | (1L << (RECORDREADER - 139)) | (1L << (RECORDWRITER - 139)) | (1L << (DELIMITED - 139)) | (1L << (FIELDS - 139)) | (1L << (TERMINATED - 139)) | (1L << (COLLECTION - 139)) | (1L << (ITEMS - 139)) | (1L << (KEYS - 139)) | (1L << (ESCAPED - 139)) | (1L << (LINES - 139)) | (1L << (SEPARATED - 139)) | (1L << (FUNCTION - 139)) | (1L << (EXTENDED - 139)) | (1L << (REFRESH - 139)) | (1L << (CLEAR - 139)) | (1L << (CACHE - 139)) | (1L << (UNCACHE - 139)) | (1L << (LAZY - 139)) | (1L << (FORMATTED - 139)) | (1L << (TEMPORARY - 139)) | (1L << (OPTIONS - 139)) | (1L << (UNSET - 139)) | (1L << (TBLPROPERTIES - 139)) | (1L << (DBPROPERTIES - 139)) | (1L << (BUCKETS - 139)) | (1L << (SKEWED - 139)) | (1L << (STORED - 139)) | (1L << (DIRECTORIES - 139)) | (1L << (LOCATION - 139)) | (1L << (EXCHANGE - 139)) | (1L << (ARCHIVE - 139)) | (1L << (UNARCHIVE - 139)) | (1L << (FILEFORMAT - 139)) | (1L << (TOUCH - 139)) | (1L << (COMPACT - 139)) | (1L << (CONCATENATE - 139)) | (1L << (CHANGE - 139)) | (1L << (CASCADE - 139)) | (1L << (RESTRICT - 139)) | (1L << (CLUSTERED - 139)) | (1L << (SORTED - 139)) | (1L << (PURGE - 139)) | (1L << (INPUTFORMAT - 139)) | (1L << (OUTPUTFORMAT - 139)) | (1L << (DATABASE - 139)) | (1L << (DATABASES - 139)))) != 0) || ((((_la - 203)) & ~0x3f) == 0 && ((1L << (_la - 203)) & ((1L << (DFS - 203)) | (1L << (TRUNCATE - 203)) | (1L << (ANALYZE - 203)) | (1L << (COMPUTE - 203)) | (1L << (LIST - 203)) | (1L << (STATISTICS - 203)) | (1L << (PARTITIONED - 203)) | (1L << (EXTERNAL - 203)) | (1L << (DEFINED - 203)) | (1L << (REVOKE - 203)) | (1L << (GRANT - 203)) | (1L << (LOCK - 203)) | (1L << (UNLOCK - 203)) | (1L << (MSCK - 203)) | (1L << (REPAIR - 203)) | (1L << (EXPORT - 203)) | (1L << (IMPORT - 203)) | (1L << (LOAD - 203)) | (1L << (ROLE - 203)) | (1L << (ROLES - 203)) | (1L << (COMPACTIONS - 203)) | (1L << (PRINCIPALS - 203)) | (1L << (TRANSACTIONS - 203)) | (1L << (INDEX - 203)) | (1L << (INDEXES - 203)) | (1L << (LOCKS - 203)) | (1L << (OPTION - 203)) | (1L << (ANTI - 203)) | (1L << (LOCAL - 203)) | (1L << (INPATH - 203)) | (1L << (IDENTIFIER - 203)) | (1L << (BACKQUOTED_IDENTIFIER - 203)))) != 0)) {
				{
				{
				setState(230);
				actionStatement();
				setState(231);
				match(T__0);
				}
				}
				setState(237);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(238);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class JsonQueryStatementAssignmentContext extends ParserRuleContext {
		public StatementAssignment_tableAliasContext statementAssignment_tableAlias() {
			return getRuleContext(StatementAssignment_tableAliasContext.class,0);
		}
		public TerminalNode EQ() { return getToken(JdScriptQuerySqlParser.EQ, 0); }
		public TerminalNode JSON() { return getToken(JdScriptQuerySqlParser.JSON, 0); }
		public StatementAssignment_queryEngineContext statementAssignment_queryEngine() {
			return getRuleContext(StatementAssignment_queryEngineContext.class,0);
		}
		public JsonQueryStatementAssignment_queryContext jsonQueryStatementAssignment_query() {
			return getRuleContext(JsonQueryStatementAssignment_queryContext.class,0);
		}
		public JsonQueryStatementAssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jsonQueryStatementAssignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JdScriptQuerySqlListener ) ((JdScriptQuerySqlListener)listener).enterJsonQueryStatementAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JdScriptQuerySqlListener ) ((JdScriptQuerySqlListener)listener).exitJsonQueryStatementAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JdScriptQuerySqlVisitor ) return ((JdScriptQuerySqlVisitor<? extends T>)visitor).visitJsonQueryStatementAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JsonQueryStatementAssignmentContext jsonQueryStatementAssignment() throws RecognitionException {
		JsonQueryStatementAssignmentContext _localctx = new JsonQueryStatementAssignmentContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_jsonQueryStatementAssignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(240);
			statementAssignment_tableAlias();
			setState(241);
			match(EQ);
			setState(242);
			match(JSON);
			setState(243);
			statementAssignment_queryEngine();
			setState(244);
			jsonQueryStatementAssignment_query();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class JsonQueryStatementAssignment_queryContext extends ParserRuleContext {
		public JsonObjectContext jsonObject() {
			return getRuleContext(JsonObjectContext.class,0);
		}
		public List<ConfigSettingContext> configSetting() {
			return getRuleContexts(ConfigSettingContext.class);
		}
		public ConfigSettingContext configSetting(int i) {
			return getRuleContext(ConfigSettingContext.class,i);
		}
		public JsonQueryStatementAssignment_queryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jsonQueryStatementAssignment_query; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JdScriptQuerySqlListener ) ((JdScriptQuerySqlListener)listener).enterJsonQueryStatementAssignment_query(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JdScriptQuerySqlListener ) ((JdScriptQuerySqlListener)listener).exitJsonQueryStatementAssignment_query(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JdScriptQuerySqlVisitor ) return ((JdScriptQuerySqlVisitor<? extends T>)visitor).visitJsonQueryStatementAssignment_query(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JsonQueryStatementAssignment_queryContext jsonQueryStatementAssignment_query() throws RecognitionException {
		JsonQueryStatementAssignment_queryContext _localctx = new JsonQueryStatementAssignment_queryContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_jsonQueryStatementAssignment_query);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(249);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SET) {
				{
				{
				setState(246);
				configSetting();
				}
				}
				setState(251);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(252);
			jsonObject();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementAssignmentContext extends ParserRuleContext {
		public StatementAssignment_tableAliasContext statementAssignment_tableAlias() {
			return getRuleContext(StatementAssignment_tableAliasContext.class,0);
		}
		public TerminalNode EQ() { return getToken(JdScriptQuerySqlParser.EQ, 0); }
		public StatementAssignment_queryContext statementAssignment_query() {
			return getRuleContext(StatementAssignment_queryContext.class,0);
		}
		public StatementAssignment_queryTypeContext statementAssignment_queryType() {
			return getRuleContext(StatementAssignment_queryTypeContext.class,0);
		}
		public StatementAssignment_queryEngineContext statementAssignment_queryEngine() {
			return getRuleContext(StatementAssignment_queryEngineContext.class,0);
		}
		public StatementAssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementAssignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JdScriptQuerySqlListener ) ((JdScriptQuerySqlListener)listener).enterStatementAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JdScriptQuerySqlListener ) ((JdScriptQuerySqlListener)listener).exitStatementAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JdScriptQuerySqlVisitor ) return ((JdScriptQuerySqlVisitor<? extends T>)visitor).visitStatementAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementAssignmentContext statementAssignment() throws RecognitionException {
		StatementAssignmentContext _localctx = new StatementAssignmentContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_statementAssignment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(254);
			statementAssignment_tableAlias();
			setState(255);
			match(EQ);
			setState(259);
			_la = _input.LA(1);
			if (_la==T__1 || _la==T__2) {
				{
				setState(256);
				statementAssignment_queryType();
				setState(257);
				statementAssignment_queryEngine();
				}
			}

			setState(261);
			statementAssignment_query();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementAssignment_tableAliasContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(JdScriptQuerySqlParser.IDENTIFIER, 0); }
		public StatementAssignment_tableAliasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementAssignment_tableAlias; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JdScriptQuerySqlListener ) ((JdScriptQuerySqlListener)listener).enterStatementAssignment_tableAlias(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JdScriptQuerySqlListener ) ((JdScriptQuerySqlListener)listener).exitStatementAssignment_tableAlias(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JdScriptQuerySqlVisitor ) return ((JdScriptQuerySqlVisitor<? extends T>)visitor).visitStatementAssignment_tableAlias(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementAssignment_tableAliasContext statementAssignment_tableAlias() throws RecognitionException {
		StatementAssignment_tableAliasContext _localctx = new StatementAssignment_tableAliasContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_statementAssignment_tableAlias);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(263);
			match(IDENTIFIER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementAssignment_queryTypeContext extends ParserRuleContext {
		public StatementAssignment_queryTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementAssignment_queryType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JdScriptQuerySqlListener ) ((JdScriptQuerySqlListener)listener).enterStatementAssignment_queryType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JdScriptQuerySqlListener ) ((JdScriptQuerySqlListener)listener).exitStatementAssignment_queryType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JdScriptQuerySqlVisitor ) return ((JdScriptQuerySqlVisitor<? extends T>)visitor).visitStatementAssignment_queryType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementAssignment_queryTypeContext statementAssignment_queryType() throws RecognitionException {
		StatementAssignment_queryTypeContext _localctx = new StatementAssignment_queryTypeContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_statementAssignment_queryType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(265);
			_la = _input.LA(1);
			if ( !(_la==T__1 || _la==T__2) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementAssignment_queryEngineContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public StatementAssignment_queryEngineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementAssignment_queryEngine; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JdScriptQuerySqlListener ) ((JdScriptQuerySqlListener)listener).enterStatementAssignment_queryEngine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JdScriptQuerySqlListener ) ((JdScriptQuerySqlListener)listener).exitStatementAssignment_queryEngine(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JdScriptQuerySqlVisitor ) return ((JdScriptQuerySqlVisitor<? extends T>)visitor).visitStatementAssignment_queryEngine(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementAssignment_queryEngineContext statementAssignment_queryEngine() throws RecognitionException {
		StatementAssignment_queryEngineContext _localctx = new StatementAssignment_queryEngineContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_statementAssignment_queryEngine);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(267);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementAssignment_queryContext extends ParserRuleContext {
		public StatementAssignment_udfContext statementAssignment_udf() {
			return getRuleContext(StatementAssignment_udfContext.class,0);
		}
		public TerminalNode FROM() { return getToken(JdScriptQuerySqlParser.FROM, 0); }
		public StatementAssignment_tableAliasContext statementAssignment_tableAlias() {
			return getRuleContext(StatementAssignment_tableAliasContext.class,0);
		}
		public List<StatementAssignment_paramContext> statementAssignment_param() {
			return getRuleContexts(StatementAssignment_paramContext.class);
		}
		public StatementAssignment_paramContext statementAssignment_param(int i) {
			return getRuleContext(StatementAssignment_paramContext.class,i);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public List<ConfigSettingContext> configSetting() {
			return getRuleContexts(ConfigSettingContext.class);
		}
		public ConfigSettingContext configSetting(int i) {
			return getRuleContext(ConfigSettingContext.class,i);
		}
		public StatementAssignment_queryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementAssignment_query; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JdScriptQuerySqlListener ) ((JdScriptQuerySqlListener)listener).enterStatementAssignment_query(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JdScriptQuerySqlListener ) ((JdScriptQuerySqlListener)listener).exitStatementAssignment_query(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JdScriptQuerySqlVisitor ) return ((JdScriptQuerySqlVisitor<? extends T>)visitor).visitStatementAssignment_query(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementAssignment_queryContext statementAssignment_query() throws RecognitionException {
		StatementAssignment_queryContext _localctx = new StatementAssignment_queryContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_statementAssignment_query);
		int _la;
		try {
			int _alt;
			setState(286);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(269);
				statementAssignment_udf();
				setState(273);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==IDENTIFIER) {
					{
					{
					setState(270);
					statementAssignment_param();
					}
					}
					setState(275);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(276);
				match(FROM);
				setState(277);
				statementAssignment_tableAlias();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(282);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
				while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(279);
						configSetting();
						}
						} 
					}
					setState(284);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
				}
				setState(285);
				statement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConfigSettingContext extends ParserRuleContext {
		public TerminalNode SET() { return getToken(JdScriptQuerySqlParser.SET, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode EQ() { return getToken(JdScriptQuerySqlParser.EQ, 0); }
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public ConfigSettingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_configSetting; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JdScriptQuerySqlListener ) ((JdScriptQuerySqlListener)listener).enterConfigSetting(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JdScriptQuerySqlListener ) ((JdScriptQuerySqlListener)listener).exitConfigSetting(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JdScriptQuerySqlVisitor ) return ((JdScriptQuerySqlVisitor<? extends T>)visitor).visitConfigSetting(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConfigSettingContext configSetting() throws RecognitionException {
		ConfigSettingContext _localctx = new ConfigSettingContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_configSetting);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(288);
			match(SET);
			setState(289);
			qualifiedName();
			setState(290);
			match(EQ);
			setState(291);
			constant();
			setState(292);
			match(T__0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementAssignment_udfContext extends ParserRuleContext {
		public StatementAssignment_udfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementAssignment_udf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JdScriptQuerySqlListener ) ((JdScriptQuerySqlListener)listener).enterStatementAssignment_udf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JdScriptQuerySqlListener ) ((JdScriptQuerySqlListener)listener).exitStatementAssignment_udf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JdScriptQuerySqlVisitor ) return ((JdScriptQuerySqlVisitor<? extends T>)visitor).visitStatementAssignment_udf(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementAssignment_udfContext statementAssignment_udf() throws RecognitionException {
		StatementAssignment_udfContext _localctx = new StatementAssignment_udfContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_statementAssignment_udf);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(294);
			_la = _input.LA(1);
			if ( !(_la==T__3 || _la==T__4 || _la==MAP) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementAssignment_paramContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(JdScriptQuerySqlParser.IDENTIFIER, 0); }
		public StatementAssignment_paramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementAssignment_param; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JdScriptQuerySqlListener ) ((JdScriptQuerySqlListener)listener).enterStatementAssignment_param(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JdScriptQuerySqlListener ) ((JdScriptQuerySqlListener)listener).exitStatementAssignment_param(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JdScriptQuerySqlVisitor ) return ((JdScriptQuerySqlVisitor<? extends T>)visitor).visitStatementAssignment_param(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementAssignment_paramContext statementAssignment_param() throws RecognitionException {
		StatementAssignment_paramContext _localctx = new StatementAssignment_paramContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_statementAssignment_param);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(296);
			match(IDENTIFIER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FileAssignmentContext extends ParserRuleContext {
		public FileAssignment_tableAliasContext fileAssignment_tableAlias() {
			return getRuleContext(FileAssignment_tableAliasContext.class,0);
		}
		public TerminalNode EQ() { return getToken(JdScriptQuerySqlParser.EQ, 0); }
		public FileAssignment_fileTypeContext fileAssignment_fileType() {
			return getRuleContext(FileAssignment_fileTypeContext.class,0);
		}
		public FileAssignment_fileLocationContext fileAssignment_fileLocation() {
			return getRuleContext(FileAssignment_fileLocationContext.class,0);
		}
		public FileAssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fileAssignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JdScriptQuerySqlListener ) ((JdScriptQuerySqlListener)listener).enterFileAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JdScriptQuerySqlListener ) ((JdScriptQuerySqlListener)listener).exitFileAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JdScriptQuerySqlVisitor ) return ((JdScriptQuerySqlVisitor<? extends T>)visitor).visitFileAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FileAssignmentContext fileAssignment() throws RecognitionException {
		FileAssignmentContext _localctx = new FileAssignmentContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_fileAssignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(298);
			fileAssignment_tableAlias();
			setState(299);
			match(EQ);
			setState(300);
			match(T__5);
			setState(301);
			fileAssignment_fileType();
			setState(302);
			fileAssignment_fileLocation();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FileAssignment_tableAliasContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(JdScriptQuerySqlParser.IDENTIFIER, 0); }
		public FileAssignment_tableAliasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fileAssignment_tableAlias; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JdScriptQuerySqlListener ) ((JdScriptQuerySqlListener)listener).enterFileAssignment_tableAlias(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JdScriptQuerySqlListener ) ((JdScriptQuerySqlListener)listener).exitFileAssignment_tableAlias(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JdScriptQuerySqlVisitor ) return ((JdScriptQuerySqlVisitor<? extends T>)visitor).visitFileAssignment_tableAlias(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FileAssignment_tableAliasContext fileAssignment_tableAlias() throws RecognitionException {
		FileAssignment_tableAliasContext _localctx = new FileAssignment_tableAliasContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_fileAssignment_tableAlias);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(304);
			match(IDENTIFIER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FileAssignment_fileTypeContext extends ParserRuleContext {
		public TerminalNode JSON() { return getToken(JdScriptQuerySqlParser.JSON, 0); }
		public TerminalNode TEXT() { return getToken(JdScriptQuerySqlParser.TEXT, 0); }
		public TerminalNode CSV() { return getToken(JdScriptQuerySqlParser.CSV, 0); }
		public TerminalNode PARQUET() { return getToken(JdScriptQuerySqlParser.PARQUET, 0); }
		public FileAssignment_fileTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fileAssignment_fileType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JdScriptQuerySqlListener ) ((JdScriptQuerySqlListener)listener).enterFileAssignment_fileType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JdScriptQuerySqlListener ) ((JdScriptQuerySqlListener)listener).exitFileAssignment_fileType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JdScriptQuerySqlVisitor ) return ((JdScriptQuerySqlVisitor<? extends T>)visitor).visitFileAssignment_fileType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FileAssignment_fileTypeContext fileAssignment_fileType() throws RecognitionException {
		FileAssignment_fileTypeContext _localctx = new FileAssignment_fileTypeContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_fileAssignment_fileType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(306);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << JSON) | (1L << TEXT) | (1L << CSV) | (1L << PARQUET))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FileAssignment_fileLocationContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(JdScriptQuerySqlParser.STRING, 0); }
		public TerminalNode URL_STRING() { return getToken(JdScriptQuerySqlParser.URL_STRING, 0); }
		public FileAssignment_fileLocationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fileAssignment_fileLocation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JdScriptQuerySqlListener ) ((JdScriptQuerySqlListener)listener).enterFileAssignment_fileLocation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JdScriptQuerySqlListener ) ((JdScriptQuerySqlListener)listener).exitFileAssignment_fileLocation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JdScriptQuerySqlVisitor ) return ((JdScriptQuerySqlVisitor<? extends T>)visitor).visitFileAssignment_fileLocation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FileAssignment_fileLocationContext fileAssignment_fileLocation() throws RecognitionException {
		FileAssignment_fileLocationContext _localctx = new FileAssignment_fileLocationContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_fileAssignment_fileLocation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(308);
			_la = _input.LA(1);
			if ( !(_la==URL_STRING || _la==STRING) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ActionStatementContext extends ParserRuleContext {
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public List<ActionStatement_paramContext> actionStatement_param() {
			return getRuleContexts(ActionStatement_paramContext.class);
		}
		public ActionStatement_paramContext actionStatement_param(int i) {
			return getRuleContext(ActionStatement_paramContext.class,i);
		}
		public ActionStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_actionStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JdScriptQuerySqlListener ) ((JdScriptQuerySqlListener)listener).enterActionStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JdScriptQuerySqlListener ) ((JdScriptQuerySqlListener)listener).exitActionStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JdScriptQuerySqlVisitor ) return ((JdScriptQuerySqlVisitor<? extends T>)visitor).visitActionStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ActionStatementContext actionStatement() throws RecognitionException {
		ActionStatementContext _localctx = new ActionStatementContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_actionStatement);
		int _la;
		try {
			setState(326);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(310);
				qualifiedName();
				setState(311);
				match(T__6);
				setState(312);
				match(T__7);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(314);
				qualifiedName();
				setState(315);
				match(T__6);
				setState(316);
				actionStatement_param();
				setState(321);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__8) {
					{
					{
					setState(317);
					match(T__8);
					setState(318);
					actionStatement_param();
					}
					}
					setState(323);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(324);
				match(T__7);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ActionStatement_paramContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(JdScriptQuerySqlParser.STRING, 0); }
		public TerminalNode IDENTIFIER() { return getToken(JdScriptQuerySqlParser.IDENTIFIER, 0); }
		public ActionStatement_paramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_actionStatement_param; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JdScriptQuerySqlListener ) ((JdScriptQuerySqlListener)listener).enterActionStatement_param(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JdScriptQuerySqlListener ) ((JdScriptQuerySqlListener)listener).exitActionStatement_param(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JdScriptQuerySqlVisitor ) return ((JdScriptQuerySqlVisitor<? extends T>)visitor).visitActionStatement_param(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ActionStatement_paramContext actionStatement_param() throws RecognitionException {
		ActionStatement_paramContext _localctx = new ActionStatement_paramContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_actionStatement_param);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(328);
			_la = _input.LA(1);
			if ( !(_la==STRING || _la==IDENTIFIER) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class JsonObjectContext extends ParserRuleContext {
		public List<JsonPairContext> jsonPair() {
			return getRuleContexts(JsonPairContext.class);
		}
		public JsonPairContext jsonPair(int i) {
			return getRuleContext(JsonPairContext.class,i);
		}
		public JsonObjectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jsonObject; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JdScriptQuerySqlListener ) ((JdScriptQuerySqlListener)listener).enterJsonObject(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JdScriptQuerySqlListener ) ((JdScriptQuerySqlListener)listener).exitJsonObject(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JdScriptQuerySqlVisitor ) return ((JdScriptQuerySqlVisitor<? extends T>)visitor).visitJsonObject(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JsonObjectContext jsonObject() throws RecognitionException {
		JsonObjectContext _localctx = new JsonObjectContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_jsonObject);
		int _la;
		try {
			setState(343);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(330);
				match(T__9);
				setState(331);
				jsonPair();
				setState(336);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__8) {
					{
					{
					setState(332);
					match(T__8);
					setState(333);
					jsonPair();
					}
					}
					setState(338);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(339);
				match(T__10);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(341);
				match(T__9);
				setState(342);
				match(T__10);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class JsonArrayContext extends ParserRuleContext {
		public List<JsonValueContext> jsonValue() {
			return getRuleContexts(JsonValueContext.class);
		}
		public JsonValueContext jsonValue(int i) {
			return getRuleContext(JsonValueContext.class,i);
		}
		public JsonArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jsonArray; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JdScriptQuerySqlListener ) ((JdScriptQuerySqlListener)listener).enterJsonArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JdScriptQuerySqlListener ) ((JdScriptQuerySqlListener)listener).exitJsonArray(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JdScriptQuerySqlVisitor ) return ((JdScriptQuerySqlVisitor<? extends T>)visitor).visitJsonArray(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JsonArrayContext jsonArray() throws RecognitionException {
		JsonArrayContext _localctx = new JsonArrayContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_jsonArray);
		int _la;
		try {
			setState(358);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(345);
				match(T__11);
				setState(346);
				jsonValue();
				setState(351);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__8) {
					{
					{
					setState(347);
					match(T__8);
					setState(348);
					jsonValue();
					}
					}
					setState(353);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(354);
				match(T__12);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(356);
				match(T__11);
				setState(357);
				match(T__12);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class JsonPairContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(JdScriptQuerySqlParser.STRING, 0); }
		public JsonValueContext jsonValue() {
			return getRuleContext(JsonValueContext.class,0);
		}
		public JsonPairContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jsonPair; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JdScriptQuerySqlListener ) ((JdScriptQuerySqlListener)listener).enterJsonPair(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JdScriptQuerySqlListener ) ((JdScriptQuerySqlListener)listener).exitJsonPair(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JdScriptQuerySqlVisitor ) return ((JdScriptQuerySqlVisitor<? extends T>)visitor).visitJsonPair(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JsonPairContext jsonPair() throws RecognitionException {
		JsonPairContext _localctx = new JsonPairContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_jsonPair);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(360);
			match(STRING);
			setState(361);
			match(T__13);
			setState(362);
			jsonValue();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class JsonValueContext extends ParserRuleContext {
		public JsonObjectContext jsonObject() {
			return getRuleContext(JsonObjectContext.class,0);
		}
		public JsonArrayContext jsonArray() {
			return getRuleContext(JsonArrayContext.class,0);
		}
		public TerminalNode STRING() { return getToken(JdScriptQuerySqlParser.STRING, 0); }
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public BooleanValueContext booleanValue() {
			return getRuleContext(BooleanValueContext.class,0);
		}
		public TerminalNode NULL() { return getToken(JdScriptQuerySqlParser.NULL, 0); }
		public JsonValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jsonValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JdScriptQuerySqlListener ) ((JdScriptQuerySqlListener)listener).enterJsonValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JdScriptQuerySqlListener ) ((JdScriptQuerySqlListener)listener).exitJsonValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JdScriptQuerySqlVisitor ) return ((JdScriptQuerySqlVisitor<? extends T>)visitor).visitJsonValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JsonValueContext jsonValue() throws RecognitionException {
		JsonValueContext _localctx = new JsonValueContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_jsonValue);
		try {
			setState(370);
			switch (_input.LA(1)) {
			case T__9:
				enterOuterAlt(_localctx, 1);
				{
				setState(364);
				jsonObject();
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 2);
				{
				setState(365);
				jsonArray();
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 3);
				{
				setState(366);
				match(STRING);
				}
				break;
			case BIGINT_LITERAL:
			case SMALLINT_LITERAL:
			case TINYINT_LITERAL:
			case INTEGER_VALUE:
			case DECIMAL_VALUE:
			case SCIENTIFIC_DECIMAL_VALUE:
			case DOUBLE_LITERAL:
				enterOuterAlt(_localctx, 4);
				{
				setState(367);
				number();
				}
				break;
			case TRUE:
			case FALSE:
				enterOuterAlt(_localctx, 5);
				{
				setState(368);
				booleanValue();
				}
				break;
			case NULL:
				enterOuterAlt(_localctx, 6);
				{
				setState(369);
				match(NULL);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SingleStatementContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode EOF() { return getToken(JdScriptQuerySqlParser.EOF, 0); }
		public SingleStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JdScriptQuerySqlListener ) ((JdScriptQuerySqlListener)listener).enterSingleStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JdScriptQuerySqlListener ) ((JdScriptQuerySqlListener)listener).exitSingleStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JdScriptQuerySqlVisitor ) return ((JdScriptQuerySqlVisitor<? extends T>)visitor).visitSingleStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SingleStatementContext singleStatement() throws RecognitionException {
		SingleStatementContext _localctx = new SingleStatementContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_singleStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(372);
			statement();
			setState(373);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SingleExpressionContext extends ParserRuleContext {
		public NamedExpressionContext namedExpression() {
			return getRuleContext(NamedExpressionContext.class,0);
		}
		public TerminalNode EOF() { return getToken(JdScriptQuerySqlParser.EOF, 0); }
		public SingleExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JdScriptQuerySqlListener ) ((JdScriptQuerySqlListener)listener).enterSingleExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JdScriptQuerySqlListener ) ((JdScriptQuerySqlListener)listener).exitSingleExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JdScriptQuerySqlVisitor ) return ((JdScriptQuerySqlVisitor<? extends T>)visitor).visitSingleExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SingleExpressionContext singleExpression() throws RecognitionException {
		SingleExpressionContext _localctx = new SingleExpressionContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_singleExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(375);
			namedExpression();
			setState(376);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SingleTableIdentifierContext extends ParserRuleContext {
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TerminalNode EOF() { return getToken(JdScriptQuerySqlParser.EOF, 0); }
		public SingleTableIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleTableIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JdScriptQuerySqlListener ) ((JdScriptQuerySqlListener)listener).enterSingleTableIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JdScriptQuerySqlListener ) ((JdScriptQuerySqlListener)listener).exitSingleTableIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JdScriptQuerySqlVisitor ) return ((JdScriptQuerySqlVisitor<? extends T>)visitor).visitSingleTableIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SingleTableIdentifierContext singleTableIdentifier() throws RecognitionException {
		SingleTableIdentifierContext _localctx = new SingleTableIdentifierContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_singleTableIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(378);
			tableIdentifier();
			setState(379);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SingleDataTypeContext extends ParserRuleContext {
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public TerminalNode EOF() { return getToken(JdScriptQuerySqlParser.EOF, 0); }
		public SingleDataTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleDataType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JdScriptQuerySqlListener ) ((JdScriptQuerySqlListener)listener).enterSingleDataType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JdScriptQuerySqlListener ) ((JdScriptQuerySqlListener)listener).exitSingleDataType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JdScriptQuerySqlVisitor ) return ((JdScriptQuerySqlVisitor<? extends T>)visitor).visitSingleDataType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SingleDataTypeContext singleDataType() throws RecognitionException {
		SingleDataTypeContext _localctx = new SingleDataTypeContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_singleDataType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(381);
			dataType();
			setState(382);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	 
		public StatementContext() { }
		public void copyFrom(StatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ExplainContext extends StatementContext {
		public TerminalNode EXPLAIN() { return getToken(JdScriptQuerySqlParser.EXPLAIN, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode LOGICAL() { return getToken(JdScriptQuerySqlParser.LOGICAL, 0); }
		public TerminalNode FORMATTED() { return getToken(JdScriptQuerySqlParser.FORMATTED, 0); }
		public TerminalNode EXTENDED() { return getToken(JdScriptQuerySqlParser.EXTENDED, 0); }
		public TerminalNode CODEGEN() { return getToken(JdScriptQuerySqlParser.CODEGEN, 0); }
		public ExplainContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JdScriptQuerySqlListener ) ((JdScriptQuerySqlListener)listener).enterExplain(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JdScriptQuerySqlListener ) ((JdScriptQuerySqlListener)listener).exitExplain(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JdScriptQuerySqlVisitor ) return ((JdScriptQuerySqlVisitor<? extends T>)visitor).visitExplain(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SetDatabasePropertiesContext extends StatementContext {
		public TerminalNode ALTER() { return getToken(JdScriptQuerySqlParser.ALTER, 0); }
		public TerminalNode DATABASE() { return getToken(JdScriptQuerySqlParser.DATABASE, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode SET() { return getToken(JdScriptQuerySqlParser.SET, 0); }
		public TerminalNode DBPROPERTIES() { return getToken(JdScriptQuerySqlParser.DBPROPERTIES, 0); }
		public TablePropertyListContext tablePropertyList() {
			return getRuleContext(TablePropertyListContext.class,0);
		}
		public SetDatabasePropertiesContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JdScriptQuerySqlListener ) ((JdScriptQuerySqlListener)listener).enterSetDatabaseProperties(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JdScriptQuerySqlListener ) ((JdScriptQuerySqlListener)listener).exitSetDatabaseProperties(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JdScriptQuerySqlVisitor ) return ((JdScriptQuerySqlVisitor<? extends T>)visitor).visitSetDatabaseProperties(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DropDatabaseContext extends StatementContext {
		public TerminalNode DROP() { return getToken(JdScriptQuerySqlParser.DROP, 0); }
		public TerminalNode DATABASE() { return getToken(JdScriptQuerySqlParser.DATABASE, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode IF() { return getToken(JdScriptQuerySqlParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(JdScriptQuerySqlParser.EXISTS, 0); }
		public TerminalNode RESTRICT() { return getToken(JdScriptQuerySqlParser.RESTRICT, 0); }
		public TerminalNode CASCADE() { return getToken(JdScriptQuerySqlParser.CASCADE, 0); }
		public DropDatabaseContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JdScriptQuerySqlListener ) ((JdScriptQuerySqlListener)listener).enterDropDatabase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JdScriptQuerySqlListener ) ((JdScriptQuerySqlListener)listener).exitDropDatabase(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JdScriptQuerySqlVisitor ) return ((JdScriptQuerySqlVisitor<? extends T>)visitor).visitDropDatabase(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CreateTableContext extends StatementContext {
		public ColTypeListContext columns;
		public ColTypeListContext partitionColumns;
		public CreateTableHeaderContext createTableHeader() {
			return getRuleContext(CreateTableHeaderContext.class,0);
		}
		public TerminalNode COMMENT() { return getToken(JdScriptQuerySqlParser.COMMENT, 0); }
		public TerminalNode STRING() { return getToken(JdScriptQuerySqlParser.STRING, 0); }
		public TerminalNode PARTITIONED() { return getToken(JdScriptQuerySqlParser.PARTITIONED, 0); }
		public TerminalNode BY() { return getToken(JdScriptQuerySqlParser.BY, 0); }
		public BucketSpecContext bucketSpec() {
			return getRuleContext(BucketSpecContext.class,0);
		}
		public SkewSpecContext skewSpec() {
			return getRuleContext(SkewSpecContext.class,0);
		}
		public RowFormatContext rowFormat() {
			return getRuleContext(RowFormatContext.class,0);
		}
		public CreateFileFormatContext createFileFormat() {
			return getRuleContext(CreateFileFormatContext.class,0);
		}
		public LocationSpecContext locationSpec() {
			return getRuleContext(LocationSpecContext.class,0);
		}
		public TerminalNode TBLPROPERTIES() { return getToken(JdScriptQuerySqlParser.TBLPROPERTIES, 0); }
		public TablePropertyListContext tablePropertyList() {
			return getRuleContext(TablePropertyListContext.class,0);
		}
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public List<ColTypeListContext> colTypeList() {
			return getRuleContexts(ColTypeListContext.class);
		}
		public ColTypeListContext colTypeList(int i) {
			return getRuleContext(ColTypeListContext.class,i);
		}
		public TerminalNode AS() { return getToken(JdScriptQuerySqlParser.AS, 0); }
		public CreateTableContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JdScriptQuerySqlListener ) ((JdScriptQuerySqlListener)listener).enterCreateTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JdScriptQuerySqlListener ) ((JdScriptQuerySqlListener)listener).exitCreateTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JdScriptQuerySqlVisitor ) return ((JdScriptQuerySqlVisitor<? extends T>)visitor).visitCreateTable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ResetConfigurationContext extends StatementContext {
		public TerminalNode RESET() { return getToken(JdScriptQuerySqlParser.RESET, 0); }
		public ResetConfigurationContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JdScriptQuerySqlListener ) ((JdScriptQuerySqlListener)listener).enterResetConfiguration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JdScriptQuerySqlListener ) ((JdScriptQuerySqlListener)listener).exitResetConfiguration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JdScriptQuerySqlVisitor ) return ((JdScriptQuerySqlVisitor<? extends T>)visitor).visitResetConfiguration(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DescribeDatabaseContext extends StatementContext {
		public TerminalNode DATABASE() { return getToken(JdScriptQuerySqlParser.DATABASE, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode DESC() { return getToken(JdScriptQuerySqlParser.DESC, 0); }
		public TerminalNode DESCRIBE() { return getToken(JdScriptQuerySqlParser.DESCRIBE, 0); }
		public TerminalNode EXTENDED() { return getToken(JdScriptQuerySqlParser.EXTENDED, 0); }
		public DescribeDatabaseContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JdScriptQuerySqlListener ) ((JdScriptQuerySqlListener)listener).enterDescribeDatabase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JdScriptQuerySqlListener ) ((JdScriptQuerySqlListener)listener).exitDescribeDatabase(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JdScriptQuerySqlVisitor ) return ((JdScriptQuerySqlVisitor<? extends T>)visitor).visitDescribeDatabase(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AlterViewQueryContext extends StatementContext {
		public TerminalNode ALTER() { return getToken(JdScriptQuerySqlParser.ALTER, 0); }
		public TerminalNode VIEW() { return getToken(JdScriptQuerySqlParser.VIEW, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public TerminalNode AS() { return getToken(JdScriptQuerySqlParser.AS, 0); }
		public AlterViewQueryContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JdScriptQuerySqlListener ) ((JdScriptQuerySqlListener)listener).enterAlterViewQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JdScriptQuerySqlListener ) ((JdScriptQuerySqlListener)listener).exitAlterViewQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JdScriptQuerySqlVisitor ) return ((JdScriptQuerySqlVisitor<? extends T>)visitor).visitAlterViewQuery(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DescribeTableContext extends StatementContext {
		public Token option;
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TerminalNode DESC() { return getToken(JdScriptQuerySqlParser.DESC, 0); }
		public TerminalNode DESCRIBE() { return getToken(JdScriptQuerySqlParser.DESCRIBE, 0); }
		public PartitionSpecContext partitionSpec() {
			return getRuleContext(PartitionSpecContext.class,0);
		}
		public DescribeColNameContext describeColName() {
			return getRuleContext(DescribeColNameContext.class,0);
		}
		public TerminalNode EXTENDED() { return getToken(JdScriptQuerySqlParser.EXTENDED, 0); }
		public TerminalNode FORMATTED() { return getToken(JdScriptQuerySqlParser.FORMATTED, 0); }
		public DescribeTableContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JdScriptQuerySqlListener ) ((JdScriptQuerySqlListener)listener).enterDescribeTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JdScriptQuerySqlListener ) ((JdScriptQuerySqlListener)listener).exitDescribeTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JdScriptQuerySqlVisitor ) return ((JdScriptQuerySqlVisitor<? extends T>)visitor).visitDescribeTable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UseContext extends StatementContext {
		public IdentifierContext db;
		public TerminalNode USE() { return getToken(JdScriptQuerySqlParser.USE, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public UseContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JdScriptQuerySqlListener ) ((JdScriptQuerySqlListener)listener).enterUse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JdScriptQuerySqlListener ) ((JdScriptQuerySqlListener)listener).exitUse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JdScriptQuerySqlVisitor ) return ((JdScriptQuerySqlVisitor<? extends T>)visitor).visitUse(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CreateTempViewUsingContext extends StatementContext {
		public TerminalNode CREATE() { return getToken(JdScriptQuerySqlParser.CREATE, 0); }
		public TerminalNode TEMPORARY() { return getToken(JdScriptQuerySqlParser.TEMPORARY, 0); }
		public TerminalNode VIEW() { return getToken(JdScriptQuerySqlParser.VIEW, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TableProviderContext tableProvider() {
			return getRuleContext(TableProviderContext.class,0);
		}
		public TerminalNode OR() { return getToken(JdScriptQuerySqlParser.OR, 0); }
		public TerminalNode REPLACE() { return getToken(JdScriptQuerySqlParser.REPLACE, 0); }
		public ColTypeListContext colTypeList() {
			return getRuleContext(ColTypeListContext.class,0);
		}
		public TerminalNode OPTIONS() { return getToken(JdScriptQuerySqlParser.OPTIONS, 0); }
		public TablePropertyListContext tablePropertyList() {
			return getRuleContext(TablePropertyListContext.class,0);
		}
		public CreateTempViewUsingContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JdScriptQuerySqlListener ) ((JdScriptQuerySqlListener)listener).enterCreateTempViewUsing(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JdScriptQuerySqlListener ) ((JdScriptQuerySqlListener)listener).exitCreateTempViewUsing(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JdScriptQuerySqlVisitor ) return ((JdScriptQuerySqlVisitor<? extends T>)visitor).visitCreateTempViewUsing(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CreateTableLikeContext extends StatementContext {
		public TableIdentifierContext target;
		public TableIdentifierContext source;
		public TerminalNode CREATE() { return getToken(JdScriptQuerySqlParser.CREATE, 0); }
		public TerminalNode TABLE() { return getToken(JdScriptQuerySqlParser.TABLE, 0); }
		public TerminalNode LIKE() { return getToken(JdScriptQuerySqlParser.LIKE, 0); }
		public List<TableIdentifierContext> tableIdentifier() {
			return getRuleContexts(TableIdentifierContext.class);
		}
		public TableIdentifierContext tableIdentifier(int i) {
			return getRuleContext(TableIdentifierContext.class,i);
		}
		public TerminalNode IF() { return getToken(JdScriptQuerySqlParser.IF, 0); }
		public TerminalNode NOT() { return getToken(JdScriptQuerySqlParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(JdScriptQuerySqlParser.EXISTS, 0); }
		public CreateTableLikeContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JdScriptQuerySqlListener ) ((JdScriptQuerySqlListener)listener).enterCreateTableLike(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JdScriptQuerySqlListener ) ((JdScriptQuerySqlListener)listener).exitCreateTableLike(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JdScriptQuerySqlVisitor ) return ((JdScriptQuerySqlVisitor<? extends T>)visitor).visitCreateTableLike(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RenameTableContext extends StatementContext {
		public TableIdentifierContext from;
		public TableIdentifierContext to;
		public TerminalNode ALTER() { return getToken(JdScriptQuerySqlParser.ALTER, 0); }
		public TerminalNode RENAME() { return getToken(JdScriptQuerySqlParser.RENAME, 0); }
		public TerminalNode TO() { return getToken(JdScriptQuerySqlParser.TO, 0); }
		public TerminalNode TABLE() { return getToken(JdScriptQuerySqlParser.TABLE, 0); }
		public TerminalNode VIEW() { return getToken(JdScriptQuerySqlParser.VIEW, 0); }
		public List<TableIdentifierContext> tableIdentifier() {
			return getRuleContexts(TableIdentifierContext.class);
		}
		public TableIdentifierContext tableIdentifier(int i) {
			return getRuleContext(TableIdentifierContext.class,i);
		}
		public RenameTableContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JdScriptQuerySqlListener ) ((JdScriptQuerySqlListener)listener).enterRenameTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JdScriptQuerySqlListener ) ((JdScriptQuerySqlListener)listener).exitRenameTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JdScriptQuerySqlVisitor ) return ((JdScriptQuerySqlVisitor<? extends T>)visitor).visitRenameTable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UncacheTableContext extends StatementContext {
		public TerminalNode UNCACHE() { return getToken(JdScriptQuerySqlParser.UNCACHE, 0); }
		public TerminalNode TABLE() { return getToken(JdScriptQuerySqlParser.TABLE, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public UncacheTableContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JdScriptQuerySqlListener ) ((JdScriptQuerySqlListener)listener).enterUncacheTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JdScriptQuerySqlListener ) ((JdScriptQuerySqlListener)listener).exitUncacheTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JdScriptQuerySqlVisitor ) return ((JdScriptQuerySqlVisitor<? extends T>)visitor).visitUncacheTable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DropFunctionContext extends StatementContext {
		public TerminalNode DROP() { return getToken(JdScriptQuerySqlParser.DROP, 0); }
		public TerminalNode FUNCTION() { return getToken(JdScriptQuerySqlParser.FUNCTION, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode TEMPORARY() { return getToken(JdScriptQuerySqlParser.TEMPORARY, 0); }
		public TerminalNode IF() { return getToken(JdScriptQuerySqlParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(JdScriptQuerySqlParser.EXISTS, 0); }
		public DropFunctionContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JdScriptQuerySqlListener ) ((JdScriptQuerySqlListener)listener).enterDropFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JdScriptQuerySqlListener ) ((JdScriptQuerySqlListener)listener).exitDropFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JdScriptQuerySqlVisitor ) return ((JdScriptQuerySqlVisitor<? extends T>)visitor).visitDropFunction(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FailNativeCommandContext extends StatementContext {
		public TerminalNode SET() { return getToken(JdScriptQuerySqlParser.SET, 0); }
		public TerminalNode ROLE() { return getToken(JdScriptQuerySqlParser.ROLE, 0); }
		public UnsupportedHiveNativeCommandsContext unsupportedHiveNativeCommands() {
			return getRuleContext(UnsupportedHiveNativeCommandsContext.class,0);
		}
		public FailNativeCommandContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JdScriptQuerySqlListener ) ((JdScriptQuerySqlListener)listener).enterFailNativeCommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JdScriptQuerySqlListener ) ((JdScriptQuerySqlListener)listener).exitFailNativeCommand(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JdScriptQuerySqlVisitor ) return ((JdScriptQuerySqlVisitor<? extends T>)visitor).visitFailNativeCommand(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LoadDataContext extends StatementContext {
		public Token path;
		public TerminalNode LOAD() { return getToken(JdScriptQuerySqlParser.LOAD, 0); }
		public TerminalNode DATA() { return getToken(JdScriptQuerySqlParser.DATA, 0); }
		public TerminalNode INPATH() { return getToken(JdScriptQuerySqlParser.INPATH, 0); }
		public TerminalNode INTO() { return getToken(JdScriptQuerySqlParser.INTO, 0); }
		public TerminalNode TABLE() { return getToken(JdScriptQuerySqlParser.TABLE, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TerminalNode STRING() { return getToken(JdScriptQuerySqlParser.STRING, 0); }
		public TerminalNode LOCAL() { return getToken(JdScriptQuerySqlParser.LOCAL, 0); }
		public TerminalNode OVERWRITE() { return getToken(JdScriptQuerySqlParser.OVERWRITE, 0); }
		public PartitionSpecContext partitionSpec() {
			return getRuleContext(PartitionSpecContext.class,0);
		}
		public LoadDataContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JdScriptQuerySqlListener ) ((JdScriptQuerySqlListener)listener).enterLoadData(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JdScriptQuerySqlListener ) ((JdScriptQuerySqlListener)listener).exitLoadData(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JdScriptQuerySqlVisitor ) return ((JdScriptQuerySqlVisitor<? extends T>)visitor).visitLoadData(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ShowPartitionsContext extends StatementContext {
		public TerminalNode SHOW() { return getToken(JdScriptQuerySqlParser.SHOW, 0); }
		public TerminalNode PARTITIONS() { return getToken(JdScriptQuerySqlParser.PARTITIONS, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public PartitionSpecContext partitionSpec() {
			return getRuleContext(PartitionSpecContext.class,0);
		}
		public ShowPartitionsContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JdScriptQuerySqlListener ) ((JdScriptQuerySqlListener)listener).enterShowPartitions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JdScriptQuerySqlListener ) ((JdScriptQuerySqlListener)listener).exitShowPartitions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JdScriptQuerySqlVisitor ) return ((JdScriptQuerySqlVisitor<? extends T>)visitor).visitShowPartitions(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DescribeFunctionContext extends StatementContext {
		public TerminalNode FUNCTION() { return getToken(JdScriptQuerySqlParser.FUNCTION, 0); }
		public DescribeFuncNameContext describeFuncName() {
			return getRuleContext(DescribeFuncNameContext.class,0);
		}
		public TerminalNode DESC() { return getToken(JdScriptQuerySqlParser.DESC, 0); }
		public TerminalNode DESCRIBE() { return getToken(JdScriptQuerySqlParser.DESCRIBE, 0); }
		public TerminalNode EXTENDED() { return getToken(JdScriptQuerySqlParser.EXTENDED, 0); }
		public DescribeFunctionContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JdScriptQuerySqlListener ) ((JdScriptQuerySqlListener)listener).enterDescribeFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JdScriptQuerySqlListener ) ((JdScriptQuerySqlListener)listener).exitDescribeFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JdScriptQuerySqlVisitor ) return ((JdScriptQuerySqlVisitor<? extends T>)visitor).visitDescribeFunction(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ClearCacheContext extends StatementContext {
		public TerminalNode CLEAR() { return getToken(JdScriptQuerySqlParser.CLEAR, 0); }
		public TerminalNode CACHE() { return getToken(JdScriptQuerySqlParser.CACHE, 0); }
		public ClearCacheContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JdScriptQuerySqlListener ) ((JdScriptQuerySqlListener)listener).enterClearCache(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JdScriptQuerySqlListener ) ((JdScriptQuerySqlListener)listener).exitClearCache(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JdScriptQuerySqlVisitor ) return ((JdScriptQuerySqlVisitor<? extends T>)visitor).visitClearCache(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ShowTablesContext extends StatementContext {
		public IdentifierContext db;
		public Token pattern;
		public TerminalNode SHOW() { return getToken(JdScriptQuerySqlParser.SHOW, 0); }
		public TerminalNode TABLES() { return getToken(JdScriptQuerySqlParser.TABLES, 0); }
		public TerminalNode FROM() { return getToken(JdScriptQuerySqlParser.FROM, 0); }
		public TerminalNode IN() { return getToken(JdScriptQuerySqlParser.IN, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode STRING() { return getToken(JdScriptQuerySqlParser.STRING, 0); }
		public TerminalNode LIKE() { return getToken(JdScriptQuerySqlParser.LIKE, 0); }
		public ShowTablesContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JdScriptQuerySqlListener ) ((JdScriptQuerySqlListener)listener).enterShowTables(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JdScriptQuerySqlListener ) ((JdScriptQuerySqlListener)listener).exitShowTables(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JdScriptQuerySqlVisitor ) return ((JdScriptQuerySqlVisitor<? extends T>)visitor).visitShowTables(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StatementDefaultContext extends StatementContext {
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public StatementDefaultContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JdScriptQuerySqlListener ) ((JdScriptQuerySqlListener)listener).enterStatementDefault(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JdScriptQuerySqlListener ) ((JdScriptQuerySqlListener)listener).exitStatementDefault(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JdScriptQuerySqlVisitor ) return ((JdScriptQuerySqlVisitor<? extends T>)visitor).visitStatementDefault(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RenameTablePartitionContext extends StatementContext {
		public PartitionSpecContext from;
		public PartitionSpecContext to;
		public TerminalNode ALTER() { return getToken(JdScriptQuerySqlParser.ALTER, 0); }
		public TerminalNode TABLE() { return getToken(JdScriptQuerySqlParser.TABLE, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TerminalNode RENAME() { return getToken(JdScriptQuerySqlParser.RENAME, 0); }
		public TerminalNode TO() { return getToken(JdScriptQuerySqlParser.TO, 0); }
		public List<PartitionSpecContext> partitionSpec() {
			return getRuleContexts(PartitionSpecContext.class);
		}
		public PartitionSpecContext partitionSpec(int i) {
			return getRuleContext(PartitionSpecContext.class,i);
		}
		public RenameTablePartitionContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JdScriptQuerySqlListener ) ((JdScriptQuerySqlListener)listener).enterRenameTablePartition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JdScriptQuerySqlListener ) ((JdScriptQuerySqlListener)listener).exitRenameTablePartition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JdScriptQuerySqlVisitor ) return ((JdScriptQuerySqlVisitor<? extends T>)visitor).visitRenameTablePartition(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RefreshResourceContext extends StatementContext {
		public TerminalNode REFRESH() { return getToken(JdScriptQuerySqlParser.REFRESH, 0); }
		public RefreshResourceContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JdScriptQuerySqlListener ) ((JdScriptQuerySqlListener)listener).enterRefreshResource(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JdScriptQuerySqlListener ) ((JdScriptQuerySqlListener)listener).exitRefreshResource(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JdScriptQuerySqlVisitor ) return ((JdScriptQuerySqlVisitor<? extends T>)visitor).visitRefreshResource(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TruncateTableContext extends StatementContext {
		public TerminalNode TRUNCATE() { return getToken(JdScriptQuerySqlParser.TRUNCATE, 0); }
		public TerminalNode TABLE() { return getToken(JdScriptQuerySqlParser.TABLE, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public PartitionSpecContext partitionSpec() {
			return getRuleContext(PartitionSpecContext.class,0);
		}
		public TruncateTableContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JdScriptQuerySqlListener ) ((JdScriptQuerySqlListener)listener).enterTruncateTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JdScriptQuerySqlListener ) ((JdScriptQuerySqlListener)listener).exitTruncateTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JdScriptQuerySqlVisitor ) return ((JdScriptQuerySqlVisitor<? extends T>)visitor).visitTruncateTable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SetTableSerDeContext extends StatementContext {
		public TerminalNode ALTER() { return getToken(JdScriptQuerySqlParser.ALTER, 0); }
		public TerminalNode TABLE() { return getToken(JdScriptQuerySqlParser.TABLE, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TerminalNode SET() { return getToken(JdScriptQuerySqlParser.SET, 0); }
		public TerminalNode SERDE() { return getToken(JdScriptQuerySqlParser.SERDE, 0); }
		public TerminalNode STRING() { return getToken(JdScriptQuerySqlParser.STRING, 0); }
		public PartitionSpecContext partitionSpec() {
			return getRuleContext(PartitionSpecContext.class,0);
		}
		public TerminalNode WITH() { return getToken(JdScriptQuerySqlParser.WITH, 0); }
		public TerminalNode SERDEPROPERTIES() { return getToken(JdScriptQuerySqlParser.SERDEPROPERTIES, 0); }
		public TablePropertyListContext tablePropertyList() {
			return getRuleContext(TablePropertyListContext.class,0);
		}
		public SetTableSerDeContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JdScriptQuerySqlListener ) ((JdScriptQuerySqlListener)listener).enterSetTableSerDe(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JdScriptQuerySqlListener ) ((JdScriptQuerySqlListener)listener).exitSetTableSerDe(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JdScriptQuerySqlVisitor ) return ((JdScriptQuerySqlVisitor<? extends T>)visitor).visitSetTableSerDe(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CreateViewContext extends StatementContext {
		public TerminalNode CREATE() { return getToken(JdScriptQuerySqlParser.CREATE, 0); }
		public TerminalNode VIEW() { return getToken(JdScriptQuerySqlParser.VIEW, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TerminalNode AS() { return getToken(JdScriptQuerySqlParser.AS, 0); }
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public TerminalNode OR() { return getToken(JdScriptQuerySqlParser.OR, 0); }
		public TerminalNode REPLACE() { return getToken(JdScriptQuerySqlParser.REPLACE, 0); }
		public TerminalNode TEMPORARY() { return getToken(JdScriptQuerySqlParser.TEMPORARY, 0); }
		public TerminalNode IF() { return getToken(JdScriptQuerySqlParser.IF, 0); }
		public TerminalNode NOT() { return getToken(JdScriptQuerySqlParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(JdScriptQuerySqlParser.EXISTS, 0); }
		public IdentifierCommentListContext identifierCommentList() {
			return getRuleContext(IdentifierCommentListContext.class,0);
		}
		public TerminalNode COMMENT() { return getToken(JdScriptQuerySqlParser.COMMENT, 0); }
		public TerminalNode STRING() { return getToken(JdScriptQuerySqlParser.STRING, 0); }
		public TerminalNode PARTITIONED() { return getToken(JdScriptQuerySqlParser.PARTITIONED, 0); }
		public TerminalNode ON() { return getToken(JdScriptQuerySqlParser.ON, 0); }
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public TerminalNode TBLPROPERTIES() { return getToken(JdScriptQuerySqlParser.TBLPROPERTIES, 0); }
		public TablePropertyListContext tablePropertyList() {
			return getRuleContext(TablePropertyListContext.class,0);
		}
		public CreateViewContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JdScriptQuerySqlListener ) ((JdScriptQuerySqlListener)listener).enterCreateView(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JdScriptQuerySqlListener ) ((JdScriptQuerySqlListener)listener).exitCreateView(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JdScriptQuerySqlVisitor ) return ((JdScriptQuerySqlVisitor<? extends T>)visitor).visitCreateView(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DropTablePartitionsContext extends StatementContext {
		public TerminalNode ALTER() { return getToken(JdScriptQuerySqlParser.ALTER, 0); }
		public TerminalNode TABLE() { return getToken(JdScriptQuerySqlParser.TABLE, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TerminalNode DROP() { return getToken(JdScriptQuerySqlParser.DROP, 0); }
		public List<PartitionSpecContext> partitionSpec() {
			return getRuleContexts(PartitionSpecContext.class);
		}
		public PartitionSpecContext partitionSpec(int i) {
			return getRuleContext(PartitionSpecContext.class,i);
		}
		public TerminalNode IF() { return getToken(JdScriptQuerySqlParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(JdScriptQuerySqlParser.EXISTS, 0); }
		public TerminalNode PURGE() { return getToken(JdScriptQuerySqlParser.PURGE, 0); }
		public TerminalNode VIEW() { return getToken(JdScriptQuerySqlParser.VIEW, 0); }
		public DropTablePartitionsContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JdScriptQuerySqlListener ) ((JdScriptQuerySqlListener)listener).enterDropTablePartitions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JdScriptQuerySqlListener ) ((JdScriptQuerySqlListener)listener).exitDropTablePartitions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JdScriptQuerySqlVisitor ) return ((JdScriptQuerySqlVisitor<? extends T>)visitor).visitDropTablePartitions(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ShowCreateTableContext extends StatementContext {
		public TerminalNode SHOW() { return getToken(JdScriptQuerySqlParser.SHOW, 0); }
		public TerminalNode CREATE() { return getToken(JdScriptQuerySqlParser.CREATE, 0); }
		public TerminalNode TABLE() { return getToken(JdScriptQuerySqlParser.TABLE, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public ShowCreateTableContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JdScriptQuerySqlListener ) ((JdScriptQuerySqlListener)listener).enterShowCreateTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JdScriptQuerySqlListener ) ((JdScriptQuerySqlListener)listener).exitShowCreateTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JdScriptQuerySqlVisitor ) return ((JdScriptQuerySqlVisitor<? extends T>)visitor).visitShowCreateTable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SetConfigurationContext extends StatementContext {
		public TerminalNode SET() { return getToken(JdScriptQuerySqlParser.SET, 0); }
		public SetConfigurationContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JdScriptQuerySqlListener ) ((JdScriptQuerySqlListener)listener).enterSetConfiguration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JdScriptQuerySqlListener ) ((JdScriptQuerySqlListener)listener).exitSetConfiguration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JdScriptQuerySqlVisitor ) return ((JdScriptQuerySqlVisitor<? extends T>)visitor).visitSetConfiguration(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DropTableContext extends StatementContext {
		public TerminalNode DROP() { return getToken(JdScriptQuerySqlParser.DROP, 0); }
		public TerminalNode TABLE() { return getToken(JdScriptQuerySqlParser.TABLE, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TerminalNode IF() { return getToken(JdScriptQuerySqlParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(JdScriptQuerySqlParser.EXISTS, 0); }
		public TerminalNode PURGE() { return getToken(JdScriptQuerySqlParser.PURGE, 0); }
		public TerminalNode VIEW() { return getToken(JdScriptQuerySqlParser.VIEW, 0); }
		public DropTableContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JdScriptQuerySqlListener ) ((JdScriptQuerySqlListener)listener).enterDropTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JdScriptQuerySqlListener ) ((JdScriptQuerySqlListener)listener).exitDropTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JdScriptQuerySqlVisitor ) return ((JdScriptQuerySqlVisitor<? extends T>)visitor).visitDropTable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ShowColumnsContext extends StatementContext {
		public IdentifierContext db;
		public TerminalNode SHOW() { return getToken(JdScriptQuerySqlParser.SHOW, 0); }
		public TerminalNode COLUMNS() { return getToken(JdScriptQuerySqlParser.COLUMNS, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public List<TerminalNode> FROM() { return getTokens(JdScriptQuerySqlParser.FROM); }
		public TerminalNode FROM(int i) {
			return getToken(JdScriptQuerySqlParser.FROM, i);
		}
		public List<TerminalNode> IN() { return getTokens(JdScriptQuerySqlParser.IN); }
		public TerminalNode IN(int i) {
			return getToken(JdScriptQuerySqlParser.IN, i);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ShowColumnsContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JdScriptQuerySqlListener ) ((JdScriptQuerySqlListener)listener).enterShowColumns(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JdScriptQuerySqlListener ) ((JdScriptQuerySqlListener)listener).exitShowColumns(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JdScriptQuerySqlVisitor ) return ((JdScriptQuerySqlVisitor<? extends T>)visitor).visitShowColumns(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CreateTableUsingContext extends StatementContext {
		public IdentifierListContext partitionColumnNames;
		public CreateTableHeaderContext createTableHeader() {
			return getRuleContext(CreateTableHeaderContext.class,0);
		}
		public TableProviderContext tableProvider() {
			return getRuleContext(TableProviderContext.class,0);
		}
		public ColTypeListContext colTypeList() {
			return getRuleContext(ColTypeListContext.class,0);
		}
		public TerminalNode OPTIONS() { return getToken(JdScriptQuerySqlParser.OPTIONS, 0); }
		public TablePropertyListContext tablePropertyList() {
			return getRuleContext(TablePropertyListContext.class,0);
		}
		public TerminalNode PARTITIONED() { return getToken(JdScriptQuerySqlParser.PARTITIONED, 0); }
		public TerminalNode BY() { return getToken(JdScriptQuerySqlParser.BY, 0); }
		public BucketSpecContext bucketSpec() {
			return getRuleContext(BucketSpecContext.class,0);
		}
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public TerminalNode AS() { return getToken(JdScriptQuerySqlParser.AS, 0); }
		public CreateTableUsingContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JdScriptQuerySqlListener ) ((JdScriptQuerySqlListener)listener).enterCreateTableUsing(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JdScriptQuerySqlListener ) ((JdScriptQuerySqlListener)listener).exitCreateTableUsing(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JdScriptQuerySqlVisitor ) return ((JdScriptQuerySqlVisitor<? extends T>)visitor).visitCreateTableUsing(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ShowDatabasesContext extends StatementContext {
		public Token pattern;
		public TerminalNode SHOW() { return getToken(JdScriptQuerySqlParser.SHOW, 0); }
		public TerminalNode DATABASES() { return getToken(JdScriptQuerySqlParser.DATABASES, 0); }
		public TerminalNode LIKE() { return getToken(JdScriptQuerySqlParser.LIKE, 0); }
		public TerminalNode STRING() { return getToken(JdScriptQuerySqlParser.STRING, 0); }
		public ShowDatabasesContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JdScriptQuerySqlListener ) ((JdScriptQuerySqlListener)listener).enterShowDatabases(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JdScriptQuerySqlListener ) ((JdScriptQuerySqlListener)listener).exitShowDatabases(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JdScriptQuerySqlVisitor ) return ((JdScriptQuerySqlVisitor<? extends T>)visitor).visitShowDatabases(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AddTablePartitionContext extends StatementContext {
		public TerminalNode ALTER() { return getToken(JdScriptQuerySqlParser.ALTER, 0); }
		public TerminalNode TABLE() { return getToken(JdScriptQuerySqlParser.TABLE, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TerminalNode ADD() { return getToken(JdScriptQuerySqlParser.ADD, 0); }
		public TerminalNode IF() { return getToken(JdScriptQuerySqlParser.IF, 0); }
		public TerminalNode NOT() { return getToken(JdScriptQuerySqlParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(JdScriptQuerySqlParser.EXISTS, 0); }
		public List<PartitionSpecLocationContext> partitionSpecLocation() {
			return getRuleContexts(PartitionSpecLocationContext.class);
		}
		public PartitionSpecLocationContext partitionSpecLocation(int i) {
			return getRuleContext(PartitionSpecLocationContext.class,i);
		}
		public TerminalNode VIEW() { return getToken(JdScriptQuerySqlParser.VIEW, 0); }
		public List<PartitionSpecContext> partitionSpec() {
			return getRuleContexts(PartitionSpecContext.class);
		}
		public PartitionSpecContext partitionSpec(int i) {
			return getRuleContext(PartitionSpecContext.class,i);
		}
		public AddTablePartitionContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JdScriptQuerySqlListener ) ((JdScriptQuerySqlListener)listener).enterAddTablePartition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JdScriptQuerySqlListener ) ((JdScriptQuerySqlListener)listener).exitAddTablePartition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JdScriptQuerySqlVisitor ) return ((JdScriptQuerySqlVisitor<? extends T>)visitor).visitAddTablePartition(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RefreshTableContext extends StatementContext {
		public TerminalNode REFRESH() { return getToken(JdScriptQuerySqlParser.REFRESH, 0); }
		public TerminalNode TABLE() { return getToken(JdScriptQuerySqlParser.TABLE, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public RefreshTableContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JdScriptQuerySqlListener ) ((JdScriptQuerySqlListener)listener).enterRefreshTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JdScriptQuerySqlListener ) ((JdScriptQuerySqlListener)listener).exitRefreshTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JdScriptQuerySqlVisitor ) return ((JdScriptQuerySqlVisitor<? extends T>)visitor).visitRefreshTable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ManageResourceContext extends StatementContext {
		public Token op;
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode ADD() { return getToken(JdScriptQuerySqlParser.ADD, 0); }
		public TerminalNode LIST() { return getToken(JdScriptQuerySqlParser.LIST, 0); }
		public ManageResourceContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JdScriptQuerySqlListener ) ((JdScriptQuerySqlListener)listener).enterManageResource(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JdScriptQuerySqlListener ) ((JdScriptQuerySqlListener)listener).exitManageResource(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JdScriptQuerySqlVisitor ) return ((JdScriptQuerySqlVisitor<? extends T>)visitor).visitManageResource(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CreateDatabaseContext extends StatementContext {
		public Token comment;
		public TerminalNode CREATE() { return getToken(JdScriptQuerySqlParser.CREATE, 0); }
		public TerminalNode DATABASE() { return getToken(JdScriptQuerySqlParser.DATABASE, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode IF() { return getToken(JdScriptQuerySqlParser.IF, 0); }
		public TerminalNode NOT() { return getToken(JdScriptQuerySqlParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(JdScriptQuerySqlParser.EXISTS, 0); }
		public TerminalNode COMMENT() { return getToken(JdScriptQuerySqlParser.COMMENT, 0); }
		public LocationSpecContext locationSpec() {
			return getRuleContext(LocationSpecContext.class,0);
		}
		public TerminalNode WITH() { return getToken(JdScriptQuerySqlParser.WITH, 0); }
		public TerminalNode DBPROPERTIES() { return getToken(JdScriptQuerySqlParser.DBPROPERTIES, 0); }
		public TablePropertyListContext tablePropertyList() {
			return getRuleContext(TablePropertyListContext.class,0);
		}
		public TerminalNode STRING() { return getToken(JdScriptQuerySqlParser.STRING, 0); }
		public CreateDatabaseContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JdScriptQuerySqlListener ) ((JdScriptQuerySqlListener)listener).enterCreateDatabase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JdScriptQuerySqlListener ) ((JdScriptQuerySqlListener)listener).exitCreateDatabase(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JdScriptQuerySqlVisitor ) return ((JdScriptQuerySqlVisitor<? extends T>)visitor).visitCreateDatabase(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ShowTblPropertiesContext extends StatementContext {
		public TableIdentifierContext table;
		public TablePropertyKeyContext key;
		public TerminalNode SHOW() { return getToken(JdScriptQuerySqlParser.SHOW, 0); }
		public TerminalNode TBLPROPERTIES() { return getToken(JdScriptQuerySqlParser.TBLPROPERTIES, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TablePropertyKeyContext tablePropertyKey() {
			return getRuleContext(TablePropertyKeyContext.class,0);
		}
		public ShowTblPropertiesContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JdScriptQuerySqlListener ) ((JdScriptQuerySqlListener)listener).enterShowTblProperties(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JdScriptQuerySqlListener ) ((JdScriptQuerySqlListener)listener).exitShowTblProperties(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JdScriptQuerySqlVisitor ) return ((JdScriptQuerySqlVisitor<? extends T>)visitor).visitShowTblProperties(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AnalyzeContext extends StatementContext {
		public TerminalNode ANALYZE() { return getToken(JdScriptQuerySqlParser.ANALYZE, 0); }
		public TerminalNode TABLE() { return getToken(JdScriptQuerySqlParser.TABLE, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TerminalNode COMPUTE() { return getToken(JdScriptQuerySqlParser.COMPUTE, 0); }
		public TerminalNode STATISTICS() { return getToken(JdScriptQuerySqlParser.STATISTICS, 0); }
		public PartitionSpecContext partitionSpec() {
			return getRuleContext(PartitionSpecContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode FOR() { return getToken(JdScriptQuerySqlParser.FOR, 0); }
		public TerminalNode COLUMNS() { return getToken(JdScriptQuerySqlParser.COLUMNS, 0); }
		public IdentifierSeqContext identifierSeq() {
			return getRuleContext(IdentifierSeqContext.class,0);
		}
		public AnalyzeContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JdScriptQuerySqlListener ) ((JdScriptQuerySqlListener)listener).enterAnalyze(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JdScriptQuerySqlListener ) ((JdScriptQuerySqlListener)listener).exitAnalyze(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JdScriptQuerySqlVisitor ) return ((JdScriptQuerySqlVisitor<? extends T>)visitor).visitAnalyze(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UnsetTablePropertiesContext extends StatementContext {
		public TerminalNode ALTER() { return getToken(JdScriptQuerySqlParser.ALTER, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TerminalNode UNSET() { return getToken(JdScriptQuerySqlParser.UNSET, 0); }
		public TerminalNode TBLPROPERTIES() { return getToken(JdScriptQuerySqlParser.TBLPROPERTIES, 0); }
		public TablePropertyListContext tablePropertyList() {
			return getRuleContext(TablePropertyListContext.class,0);
		}
		public TerminalNode TABLE() { return getToken(JdScriptQuerySqlParser.TABLE, 0); }
		public TerminalNode VIEW() { return getToken(JdScriptQuerySqlParser.VIEW, 0); }
		public TerminalNode IF() { return getToken(JdScriptQuerySqlParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(JdScriptQuerySqlParser.EXISTS, 0); }
		public UnsetTablePropertiesContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JdScriptQuerySqlListener ) ((JdScriptQuerySqlListener)listener).enterUnsetTableProperties(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JdScriptQuerySqlListener ) ((JdScriptQuerySqlListener)listener).exitUnsetTableProperties(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JdScriptQuerySqlVisitor ) return ((JdScriptQuerySqlVisitor<? extends T>)visitor).visitUnsetTableProperties(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SetTableLocationContext extends StatementContext {
		public TerminalNode ALTER() { return getToken(JdScriptQuerySqlParser.ALTER, 0); }
		public TerminalNode TABLE() { return getToken(JdScriptQuerySqlParser.TABLE, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TerminalNode SET() { return getToken(JdScriptQuerySqlParser.SET, 0); }
		public LocationSpecContext locationSpec() {
			return getRuleContext(LocationSpecContext.class,0);
		}
		public PartitionSpecContext partitionSpec() {
			return getRuleContext(PartitionSpecContext.class,0);
		}
		public SetTableLocationContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JdScriptQuerySqlListener ) ((JdScriptQuerySqlListener)listener).enterSetTableLocation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JdScriptQuerySqlListener ) ((JdScriptQuerySqlListener)listener).exitSetTableLocation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JdScriptQuerySqlVisitor ) return ((JdScriptQuerySqlVisitor<? extends T>)visitor).visitSetTableLocation(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CreateFunctionContext extends StatementContext {
		public Token className;
		public TerminalNode CREATE() { return getToken(JdScriptQuerySqlParser.CREATE, 0); }
		public TerminalNode FUNCTION() { return getToken(JdScriptQuerySqlParser.FUNCTION, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode AS() { return getToken(JdScriptQuerySqlParser.AS, 0); }
		public TerminalNode STRING() { return getToken(JdScriptQuerySqlParser.STRING, 0); }
		public TerminalNode TEMPORARY() { return getToken(JdScriptQuerySqlParser.TEMPORARY, 0); }
		public TerminalNode USING() { return getToken(JdScriptQuerySqlParser.USING, 0); }
		public List<ResourceContext> resource() {
			return getRuleContexts(ResourceContext.class);
		}
		public ResourceContext resource(int i) {
			return getRuleContext(ResourceContext.class,i);
		}
		public CreateFunctionContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JdScriptQuerySqlListener ) ((JdScriptQuerySqlListener)listener).enterCreateFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JdScriptQuerySqlListener ) ((JdScriptQuerySqlListener)listener).exitCreateFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JdScriptQuerySqlVisitor ) return ((JdScriptQuerySqlVisitor<? extends T>)visitor).visitCreateFunction(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ShowFunctionsContext extends StatementContext {
		public Token pattern;
		public TerminalNode SHOW() { return getToken(JdScriptQuerySqlParser.SHOW, 0); }
		public TerminalNode FUNCTIONS() { return getToken(JdScriptQuerySqlParser.FUNCTIONS, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode LIKE() { return getToken(JdScriptQuerySqlParser.LIKE, 0); }
		public TerminalNode STRING() { return getToken(JdScriptQuerySqlParser.STRING, 0); }
		public ShowFunctionsContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JdScriptQuerySqlListener ) ((JdScriptQuerySqlListener)listener).enterShowFunctions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JdScriptQuerySqlListener ) ((JdScriptQuerySqlListener)listener).exitShowFunctions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JdScriptQuerySqlVisitor ) return ((JdScriptQuerySqlVisitor<? extends T>)visitor).visitShowFunctions(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CacheTableContext extends StatementContext {
		public TerminalNode CACHE() { return getToken(JdScriptQuerySqlParser.CACHE, 0); }
		public TerminalNode TABLE() { return getToken(JdScriptQuerySqlParser.TABLE, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TerminalNode LAZY() { return getToken(JdScriptQuerySqlParser.LAZY, 0); }
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public TerminalNode AS() { return getToken(JdScriptQuerySqlParser.AS, 0); }
		public CacheTableContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JdScriptQuerySqlListener ) ((JdScriptQuerySqlListener)listener).enterCacheTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JdScriptQuerySqlListener ) ((JdScriptQuerySqlListener)listener).exitCacheTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JdScriptQuerySqlVisitor ) return ((JdScriptQuerySqlVisitor<? extends T>)visitor).visitCacheTable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SetTablePropertiesContext extends StatementContext {
		public TerminalNode ALTER() { return getToken(JdScriptQuerySqlParser.ALTER, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TerminalNode SET() { return getToken(JdScriptQuerySqlParser.SET, 0); }
		public TerminalNode TBLPROPERTIES() { return getToken(JdScriptQuerySqlParser.TBLPROPERTIES, 0); }
		public TablePropertyListContext tablePropertyList() {
			return getRuleContext(TablePropertyListContext.class,0);
		}
		public TerminalNode TABLE() { return getToken(JdScriptQuerySqlParser.TABLE, 0); }
		public TerminalNode VIEW() { return getToken(JdScriptQuerySqlParser.VIEW, 0); }
		public SetTablePropertiesContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JdScriptQuerySqlListener ) ((JdScriptQuerySqlListener)listener).enterSetTableProperties(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JdScriptQuerySqlListener ) ((JdScriptQuerySqlListener)listener).exitSetTableProperties(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JdScriptQuerySqlVisitor ) return ((JdScriptQuerySqlVisitor<? extends T>)visitor).visitSetTableProperties(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_statement);
		int _la;
		try {
			int _alt;
			setState(937);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,106,_ctx) ) {
			case 1:
				_localctx = new StatementDefaultContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(384);
				query();
				}
				break;
			case 2:
				_localctx = new UseContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(385);
				match(USE);
				setState(386);
				((UseContext)_localctx).db = identifier();
				}
				break;
			case 3:
				_localctx = new CreateDatabaseContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(387);
				match(CREATE);
				setState(388);
				match(DATABASE);
				setState(392);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
				case 1:
					{
					setState(389);
					match(IF);
					setState(390);
					match(NOT);
					setState(391);
					match(EXISTS);
					}
					break;
				}
				setState(394);
				identifier();
				setState(397);
				_la = _input.LA(1);
				if (_la==COMMENT) {
					{
					setState(395);
					match(COMMENT);
					setState(396);
					((CreateDatabaseContext)_localctx).comment = match(STRING);
					}
				}

				setState(400);
				_la = _input.LA(1);
				if (_la==LOCATION) {
					{
					setState(399);
					locationSpec();
					}
				}

				setState(405);
				_la = _input.LA(1);
				if (_la==WITH) {
					{
					setState(402);
					match(WITH);
					setState(403);
					match(DBPROPERTIES);
					setState(404);
					tablePropertyList();
					}
				}

				}
				break;
			case 4:
				_localctx = new SetDatabasePropertiesContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(407);
				match(ALTER);
				setState(408);
				match(DATABASE);
				setState(409);
				identifier();
				setState(410);
				match(SET);
				setState(411);
				match(DBPROPERTIES);
				setState(412);
				tablePropertyList();
				}
				break;
			case 5:
				_localctx = new DropDatabaseContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(414);
				match(DROP);
				setState(415);
				match(DATABASE);
				setState(418);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
				case 1:
					{
					setState(416);
					match(IF);
					setState(417);
					match(EXISTS);
					}
					break;
				}
				setState(420);
				identifier();
				setState(422);
				_la = _input.LA(1);
				if (_la==CASCADE || _la==RESTRICT) {
					{
					setState(421);
					_la = _input.LA(1);
					if ( !(_la==CASCADE || _la==RESTRICT) ) {
					_errHandler.recoverInline(this);
					} else {
						consume();
					}
					}
				}

				}
				break;
			case 6:
				_localctx = new CreateTableUsingContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(424);
				createTableHeader();
				setState(429);
				_la = _input.LA(1);
				if (_la==T__6) {
					{
					setState(425);
					match(T__6);
					setState(426);
					colTypeList();
					setState(427);
					match(T__7);
					}
				}

				setState(431);
				tableProvider();
				setState(434);
				_la = _input.LA(1);
				if (_la==OPTIONS) {
					{
					setState(432);
					match(OPTIONS);
					setState(433);
					tablePropertyList();
					}
				}

				setState(439);
				_la = _input.LA(1);
				if (_la==PARTITIONED) {
					{
					setState(436);
					match(PARTITIONED);
					setState(437);
					match(BY);
					setState(438);
					((CreateTableUsingContext)_localctx).partitionColumnNames = identifierList();
					}
				}

				setState(442);
				_la = _input.LA(1);
				if (_la==CLUSTERED) {
					{
					setState(441);
					bucketSpec();
					}
				}

				}
				break;
			case 7:
				_localctx = new CreateTableUsingContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(444);
				createTableHeader();
				setState(445);
				tableProvider();
				setState(448);
				_la = _input.LA(1);
				if (_la==OPTIONS) {
					{
					setState(446);
					match(OPTIONS);
					setState(447);
					tablePropertyList();
					}
				}

				setState(453);
				_la = _input.LA(1);
				if (_la==PARTITIONED) {
					{
					setState(450);
					match(PARTITIONED);
					setState(451);
					match(BY);
					setState(452);
					((CreateTableUsingContext)_localctx).partitionColumnNames = identifierList();
					}
				}

				setState(456);
				_la = _input.LA(1);
				if (_la==CLUSTERED) {
					{
					setState(455);
					bucketSpec();
					}
				}

				setState(459);
				_la = _input.LA(1);
				if (_la==AS) {
					{
					setState(458);
					match(AS);
					}
				}

				setState(461);
				query();
				}
				break;
			case 8:
				_localctx = new CreateTableContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(463);
				createTableHeader();
				setState(468);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
				case 1:
					{
					setState(464);
					match(T__6);
					setState(465);
					((CreateTableContext)_localctx).columns = colTypeList();
					setState(466);
					match(T__7);
					}
					break;
				}
				setState(472);
				_la = _input.LA(1);
				if (_la==COMMENT) {
					{
					setState(470);
					match(COMMENT);
					setState(471);
					match(STRING);
					}
				}

				setState(480);
				_la = _input.LA(1);
				if (_la==PARTITIONED) {
					{
					setState(474);
					match(PARTITIONED);
					setState(475);
					match(BY);
					setState(476);
					match(T__6);
					setState(477);
					((CreateTableContext)_localctx).partitionColumns = colTypeList();
					setState(478);
					match(T__7);
					}
				}

				setState(483);
				_la = _input.LA(1);
				if (_la==CLUSTERED) {
					{
					setState(482);
					bucketSpec();
					}
				}

				setState(486);
				_la = _input.LA(1);
				if (_la==SKEWED) {
					{
					setState(485);
					skewSpec();
					}
				}

				setState(489);
				_la = _input.LA(1);
				if (_la==ROW) {
					{
					setState(488);
					rowFormat();
					}
				}

				setState(492);
				_la = _input.LA(1);
				if (_la==STORED) {
					{
					setState(491);
					createFileFormat();
					}
				}

				setState(495);
				_la = _input.LA(1);
				if (_la==LOCATION) {
					{
					setState(494);
					locationSpec();
					}
				}

				setState(499);
				_la = _input.LA(1);
				if (_la==TBLPROPERTIES) {
					{
					setState(497);
					match(TBLPROPERTIES);
					setState(498);
					tablePropertyList();
					}
				}

				setState(505);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << SELECT) | (1L << FROM) | (1L << AS))) != 0) || ((((_la - 82)) & ~0x3f) == 0 && ((1L << (_la - 82)) & ((1L << (WITH - 82)) | (1L << (VALUES - 82)) | (1L << (TABLE - 82)) | (1L << (INSERT - 82)) | (1L << (MAP - 82)))) != 0) || _la==REDUCE) {
					{
					setState(502);
					_la = _input.LA(1);
					if (_la==AS) {
						{
						setState(501);
						match(AS);
						}
					}

					setState(504);
					query();
					}
				}

				}
				break;
			case 9:
				_localctx = new CreateTableLikeContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(507);
				match(CREATE);
				setState(508);
				match(TABLE);
				setState(512);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
				case 1:
					{
					setState(509);
					match(IF);
					setState(510);
					match(NOT);
					setState(511);
					match(EXISTS);
					}
					break;
				}
				setState(514);
				((CreateTableLikeContext)_localctx).target = tableIdentifier();
				setState(515);
				match(LIKE);
				setState(516);
				((CreateTableLikeContext)_localctx).source = tableIdentifier();
				}
				break;
			case 10:
				_localctx = new AnalyzeContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(518);
				match(ANALYZE);
				setState(519);
				match(TABLE);
				setState(520);
				tableIdentifier();
				setState(522);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(521);
					partitionSpec();
					}
				}

				setState(524);
				match(COMPUTE);
				setState(525);
				match(STATISTICS);
				setState(532);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
				case 1:
					{
					setState(526);
					identifier();
					}
					break;
				case 2:
					{
					setState(527);
					match(FOR);
					setState(528);
					match(COLUMNS);
					setState(530);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SELECT) | (1L << FROM) | (1L << ADD) | (1L << AS) | (1L << ALL) | (1L << DISTINCT) | (1L << WHERE) | (1L << GROUP) | (1L << BY) | (1L << GROUPING) | (1L << SETS) | (1L << CUBE) | (1L << ROLLUP) | (1L << ORDER) | (1L << HAVING) | (1L << LIMIT) | (1L << AT) | (1L << OR) | (1L << AND) | (1L << IN) | (1L << NOT) | (1L << NO) | (1L << EXISTS) | (1L << BETWEEN) | (1L << LIKE) | (1L << RLIKE) | (1L << IS) | (1L << NULL) | (1L << TRUE) | (1L << FALSE) | (1L << NULLS) | (1L << ASC) | (1L << DESC) | (1L << FOR) | (1L << INTERVAL) | (1L << CASE) | (1L << WHEN) | (1L << THEN) | (1L << ELSE) | (1L << END) | (1L << JOIN) | (1L << CROSS) | (1L << OUTER))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (INNER - 64)) | (1L << (LEFT - 64)) | (1L << (SEMI - 64)) | (1L << (RIGHT - 64)) | (1L << (FULL - 64)) | (1L << (NATURAL - 64)) | (1L << (ON - 64)) | (1L << (LATERAL - 64)) | (1L << (WINDOW - 64)) | (1L << (OVER - 64)) | (1L << (PARTITION - 64)) | (1L << (RANGE - 64)) | (1L << (ROWS - 64)) | (1L << (UNBOUNDED - 64)) | (1L << (PRECEDING - 64)) | (1L << (FOLLOWING - 64)) | (1L << (CURRENT - 64)) | (1L << (ROW - 64)) | (1L << (WITH - 64)) | (1L << (VALUES - 64)) | (1L << (CREATE - 64)) | (1L << (TABLE - 64)) | (1L << (VIEW - 64)) | (1L << (REPLACE - 64)) | (1L << (INSERT - 64)) | (1L << (DELETE - 64)) | (1L << (INTO - 64)) | (1L << (DESCRIBE - 64)) | (1L << (EXPLAIN - 64)) | (1L << (FORMAT - 64)) | (1L << (LOGICAL - 64)) | (1L << (CODEGEN - 64)) | (1L << (CAST - 64)) | (1L << (SHOW - 64)) | (1L << (TABLES - 64)) | (1L << (COLUMNS - 64)) | (1L << (COLUMN - 64)) | (1L << (USE - 64)) | (1L << (PARTITIONS - 64)) | (1L << (FUNCTIONS - 64)) | (1L << (DROP - 64)) | (1L << (UNION - 64)) | (1L << (EXCEPT - 64)) | (1L << (INTERSECT - 64)) | (1L << (TO - 64)) | (1L << (TABLESAMPLE - 64)) | (1L << (STRATIFY - 64)) | (1L << (ALTER - 64)) | (1L << (RENAME - 64)) | (1L << (ARRAY - 64)) | (1L << (MAP - 64)) | (1L << (STRUCT - 64)) | (1L << (COMMENT - 64)) | (1L << (SET - 64)) | (1L << (RESET - 64)) | (1L << (DATA - 64)) | (1L << (START - 64)) | (1L << (TRANSACTION - 64)) | (1L << (COMMIT - 64)) | (1L << (ROLLBACK - 64)) | (1L << (MACRO - 64)) | (1L << (IF - 64)))) != 0) || ((((_la - 139)) & ~0x3f) == 0 && ((1L << (_la - 139)) & ((1L << (DIV - 139)) | (1L << (PERCENTLIT - 139)) | (1L << (BUCKET - 139)) | (1L << (OUT - 139)) | (1L << (OF - 139)) | (1L << (SORT - 139)) | (1L << (CLUSTER - 139)) | (1L << (DISTRIBUTE - 139)) | (1L << (OVERWRITE - 139)) | (1L << (TRANSFORM - 139)) | (1L << (REDUCE - 139)) | (1L << (USING - 139)) | (1L << (SERDE - 139)) | (1L << (SERDEPROPERTIES - 139)) | (1L << (RECORDREADER - 139)) | (1L << (RECORDWRITER - 139)) | (1L << (DELIMITED - 139)) | (1L << (FIELDS - 139)) | (1L << (TERMINATED - 139)) | (1L << (COLLECTION - 139)) | (1L << (ITEMS - 139)) | (1L << (KEYS - 139)) | (1L << (ESCAPED - 139)) | (1L << (LINES - 139)) | (1L << (SEPARATED - 139)) | (1L << (FUNCTION - 139)) | (1L << (EXTENDED - 139)) | (1L << (REFRESH - 139)) | (1L << (CLEAR - 139)) | (1L << (CACHE - 139)) | (1L << (UNCACHE - 139)) | (1L << (LAZY - 139)) | (1L << (FORMATTED - 139)) | (1L << (TEMPORARY - 139)) | (1L << (OPTIONS - 139)) | (1L << (UNSET - 139)) | (1L << (TBLPROPERTIES - 139)) | (1L << (DBPROPERTIES - 139)) | (1L << (BUCKETS - 139)) | (1L << (SKEWED - 139)) | (1L << (STORED - 139)) | (1L << (DIRECTORIES - 139)) | (1L << (LOCATION - 139)) | (1L << (EXCHANGE - 139)) | (1L << (ARCHIVE - 139)) | (1L << (UNARCHIVE - 139)) | (1L << (FILEFORMAT - 139)) | (1L << (TOUCH - 139)) | (1L << (COMPACT - 139)) | (1L << (CONCATENATE - 139)) | (1L << (CHANGE - 139)) | (1L << (CASCADE - 139)) | (1L << (RESTRICT - 139)) | (1L << (CLUSTERED - 139)) | (1L << (SORTED - 139)) | (1L << (PURGE - 139)) | (1L << (INPUTFORMAT - 139)) | (1L << (OUTPUTFORMAT - 139)) | (1L << (DATABASE - 139)) | (1L << (DATABASES - 139)))) != 0) || ((((_la - 203)) & ~0x3f) == 0 && ((1L << (_la - 203)) & ((1L << (DFS - 203)) | (1L << (TRUNCATE - 203)) | (1L << (ANALYZE - 203)) | (1L << (COMPUTE - 203)) | (1L << (LIST - 203)) | (1L << (STATISTICS - 203)) | (1L << (PARTITIONED - 203)) | (1L << (EXTERNAL - 203)) | (1L << (DEFINED - 203)) | (1L << (REVOKE - 203)) | (1L << (GRANT - 203)) | (1L << (LOCK - 203)) | (1L << (UNLOCK - 203)) | (1L << (MSCK - 203)) | (1L << (REPAIR - 203)) | (1L << (EXPORT - 203)) | (1L << (IMPORT - 203)) | (1L << (LOAD - 203)) | (1L << (ROLE - 203)) | (1L << (ROLES - 203)) | (1L << (COMPACTIONS - 203)) | (1L << (PRINCIPALS - 203)) | (1L << (TRANSACTIONS - 203)) | (1L << (INDEX - 203)) | (1L << (INDEXES - 203)) | (1L << (LOCKS - 203)) | (1L << (OPTION - 203)) | (1L << (ANTI - 203)) | (1L << (LOCAL - 203)) | (1L << (INPATH - 203)) | (1L << (IDENTIFIER - 203)) | (1L << (BACKQUOTED_IDENTIFIER - 203)))) != 0)) {
						{
						setState(529);
						identifierSeq();
						}
					}

					}
					break;
				}
				}
				break;
			case 11:
				_localctx = new RenameTableContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(534);
				match(ALTER);
				setState(535);
				_la = _input.LA(1);
				if ( !(_la==TABLE || _la==VIEW) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(536);
				((RenameTableContext)_localctx).from = tableIdentifier();
				setState(537);
				match(RENAME);
				setState(538);
				match(TO);
				setState(539);
				((RenameTableContext)_localctx).to = tableIdentifier();
				}
				break;
			case 12:
				_localctx = new SetTablePropertiesContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(541);
				match(ALTER);
				setState(542);
				_la = _input.LA(1);
				if ( !(_la==TABLE || _la==VIEW) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(543);
				tableIdentifier();
				setState(544);
				match(SET);
				setState(545);
				match(TBLPROPERTIES);
				setState(546);
				tablePropertyList();
				}
				break;
			case 13:
				_localctx = new UnsetTablePropertiesContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(548);
				match(ALTER);
				setState(549);
				_la = _input.LA(1);
				if ( !(_la==TABLE || _la==VIEW) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(550);
				tableIdentifier();
				setState(551);
				match(UNSET);
				setState(552);
				match(TBLPROPERTIES);
				setState(555);
				_la = _input.LA(1);
				if (_la==IF) {
					{
					setState(553);
					match(IF);
					setState(554);
					match(EXISTS);
					}
				}

				setState(557);
				tablePropertyList();
				}
				break;
			case 14:
				_localctx = new SetTableSerDeContext(_localctx);
				enterOuterAlt(_localctx, 14);
				{
				setState(559);
				match(ALTER);
				setState(560);
				match(TABLE);
				setState(561);
				tableIdentifier();
				setState(563);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(562);
					partitionSpec();
					}
				}

				setState(565);
				match(SET);
				setState(566);
				match(SERDE);
				setState(567);
				match(STRING);
				setState(571);
				_la = _input.LA(1);
				if (_la==WITH) {
					{
					setState(568);
					match(WITH);
					setState(569);
					match(SERDEPROPERTIES);
					setState(570);
					tablePropertyList();
					}
				}

				}
				break;
			case 15:
				_localctx = new SetTableSerDeContext(_localctx);
				enterOuterAlt(_localctx, 15);
				{
				setState(573);
				match(ALTER);
				setState(574);
				match(TABLE);
				setState(575);
				tableIdentifier();
				setState(577);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(576);
					partitionSpec();
					}
				}

				setState(579);
				match(SET);
				setState(580);
				match(SERDEPROPERTIES);
				setState(581);
				tablePropertyList();
				}
				break;
			case 16:
				_localctx = new AddTablePartitionContext(_localctx);
				enterOuterAlt(_localctx, 16);
				{
				setState(583);
				match(ALTER);
				setState(584);
				match(TABLE);
				setState(585);
				tableIdentifier();
				setState(586);
				match(ADD);
				setState(590);
				_la = _input.LA(1);
				if (_la==IF) {
					{
					setState(587);
					match(IF);
					setState(588);
					match(NOT);
					setState(589);
					match(EXISTS);
					}
				}

				setState(593); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(592);
					partitionSpecLocation();
					}
					}
					setState(595); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==PARTITION );
				}
				break;
			case 17:
				_localctx = new AddTablePartitionContext(_localctx);
				enterOuterAlt(_localctx, 17);
				{
				setState(597);
				match(ALTER);
				setState(598);
				match(VIEW);
				setState(599);
				tableIdentifier();
				setState(600);
				match(ADD);
				setState(604);
				_la = _input.LA(1);
				if (_la==IF) {
					{
					setState(601);
					match(IF);
					setState(602);
					match(NOT);
					setState(603);
					match(EXISTS);
					}
				}

				setState(607); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(606);
					partitionSpec();
					}
					}
					setState(609); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==PARTITION );
				}
				break;
			case 18:
				_localctx = new RenameTablePartitionContext(_localctx);
				enterOuterAlt(_localctx, 18);
				{
				setState(611);
				match(ALTER);
				setState(612);
				match(TABLE);
				setState(613);
				tableIdentifier();
				setState(614);
				((RenameTablePartitionContext)_localctx).from = partitionSpec();
				setState(615);
				match(RENAME);
				setState(616);
				match(TO);
				setState(617);
				((RenameTablePartitionContext)_localctx).to = partitionSpec();
				}
				break;
			case 19:
				_localctx = new DropTablePartitionsContext(_localctx);
				enterOuterAlt(_localctx, 19);
				{
				setState(619);
				match(ALTER);
				setState(620);
				match(TABLE);
				setState(621);
				tableIdentifier();
				setState(622);
				match(DROP);
				setState(625);
				_la = _input.LA(1);
				if (_la==IF) {
					{
					setState(623);
					match(IF);
					setState(624);
					match(EXISTS);
					}
				}

				setState(627);
				partitionSpec();
				setState(632);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__8) {
					{
					{
					setState(628);
					match(T__8);
					setState(629);
					partitionSpec();
					}
					}
					setState(634);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(636);
				_la = _input.LA(1);
				if (_la==PURGE) {
					{
					setState(635);
					match(PURGE);
					}
				}

				}
				break;
			case 20:
				_localctx = new DropTablePartitionsContext(_localctx);
				enterOuterAlt(_localctx, 20);
				{
				setState(638);
				match(ALTER);
				setState(639);
				match(VIEW);
				setState(640);
				tableIdentifier();
				setState(641);
				match(DROP);
				setState(644);
				_la = _input.LA(1);
				if (_la==IF) {
					{
					setState(642);
					match(IF);
					setState(643);
					match(EXISTS);
					}
				}

				setState(646);
				partitionSpec();
				setState(651);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__8) {
					{
					{
					setState(647);
					match(T__8);
					setState(648);
					partitionSpec();
					}
					}
					setState(653);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 21:
				_localctx = new SetTableLocationContext(_localctx);
				enterOuterAlt(_localctx, 21);
				{
				setState(654);
				match(ALTER);
				setState(655);
				match(TABLE);
				setState(656);
				tableIdentifier();
				setState(658);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(657);
					partitionSpec();
					}
				}

				setState(660);
				match(SET);
				setState(661);
				locationSpec();
				}
				break;
			case 22:
				_localctx = new DropTableContext(_localctx);
				enterOuterAlt(_localctx, 22);
				{
				setState(663);
				match(DROP);
				setState(664);
				match(TABLE);
				setState(667);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,58,_ctx) ) {
				case 1:
					{
					setState(665);
					match(IF);
					setState(666);
					match(EXISTS);
					}
					break;
				}
				setState(669);
				tableIdentifier();
				setState(671);
				_la = _input.LA(1);
				if (_la==PURGE) {
					{
					setState(670);
					match(PURGE);
					}
				}

				}
				break;
			case 23:
				_localctx = new DropTableContext(_localctx);
				enterOuterAlt(_localctx, 23);
				{
				setState(673);
				match(DROP);
				setState(674);
				match(VIEW);
				setState(677);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,60,_ctx) ) {
				case 1:
					{
					setState(675);
					match(IF);
					setState(676);
					match(EXISTS);
					}
					break;
				}
				setState(679);
				tableIdentifier();
				}
				break;
			case 24:
				_localctx = new CreateViewContext(_localctx);
				enterOuterAlt(_localctx, 24);
				{
				setState(680);
				match(CREATE);
				setState(683);
				_la = _input.LA(1);
				if (_la==OR) {
					{
					setState(681);
					match(OR);
					setState(682);
					match(REPLACE);
					}
				}

				setState(686);
				_la = _input.LA(1);
				if (_la==TEMPORARY) {
					{
					setState(685);
					match(TEMPORARY);
					}
				}

				setState(688);
				match(VIEW);
				setState(692);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,63,_ctx) ) {
				case 1:
					{
					setState(689);
					match(IF);
					setState(690);
					match(NOT);
					setState(691);
					match(EXISTS);
					}
					break;
				}
				setState(694);
				tableIdentifier();
				setState(696);
				_la = _input.LA(1);
				if (_la==T__6) {
					{
					setState(695);
					identifierCommentList();
					}
				}

				setState(700);
				_la = _input.LA(1);
				if (_la==COMMENT) {
					{
					setState(698);
					match(COMMENT);
					setState(699);
					match(STRING);
					}
				}

				setState(705);
				_la = _input.LA(1);
				if (_la==PARTITIONED) {
					{
					setState(702);
					match(PARTITIONED);
					setState(703);
					match(ON);
					setState(704);
					identifierList();
					}
				}

				setState(709);
				_la = _input.LA(1);
				if (_la==TBLPROPERTIES) {
					{
					setState(707);
					match(TBLPROPERTIES);
					setState(708);
					tablePropertyList();
					}
				}

				setState(711);
				match(AS);
				setState(712);
				query();
				}
				break;
			case 25:
				_localctx = new CreateTempViewUsingContext(_localctx);
				enterOuterAlt(_localctx, 25);
				{
				setState(714);
				match(CREATE);
				setState(717);
				_la = _input.LA(1);
				if (_la==OR) {
					{
					setState(715);
					match(OR);
					setState(716);
					match(REPLACE);
					}
				}

				setState(719);
				match(TEMPORARY);
				setState(720);
				match(VIEW);
				setState(721);
				tableIdentifier();
				setState(726);
				_la = _input.LA(1);
				if (_la==T__6) {
					{
					setState(722);
					match(T__6);
					setState(723);
					colTypeList();
					setState(724);
					match(T__7);
					}
				}

				setState(728);
				tableProvider();
				setState(731);
				_la = _input.LA(1);
				if (_la==OPTIONS) {
					{
					setState(729);
					match(OPTIONS);
					setState(730);
					tablePropertyList();
					}
				}

				}
				break;
			case 26:
				_localctx = new AlterViewQueryContext(_localctx);
				enterOuterAlt(_localctx, 26);
				{
				setState(733);
				match(ALTER);
				setState(734);
				match(VIEW);
				setState(735);
				tableIdentifier();
				setState(737);
				_la = _input.LA(1);
				if (_la==AS) {
					{
					setState(736);
					match(AS);
					}
				}

				setState(739);
				query();
				}
				break;
			case 27:
				_localctx = new CreateFunctionContext(_localctx);
				enterOuterAlt(_localctx, 27);
				{
				setState(741);
				match(CREATE);
				setState(743);
				_la = _input.LA(1);
				if (_la==TEMPORARY) {
					{
					setState(742);
					match(TEMPORARY);
					}
				}

				setState(745);
				match(FUNCTION);
				setState(746);
				qualifiedName();
				setState(747);
				match(AS);
				setState(748);
				((CreateFunctionContext)_localctx).className = match(STRING);
				setState(758);
				_la = _input.LA(1);
				if (_la==USING) {
					{
					setState(749);
					match(USING);
					setState(750);
					resource();
					setState(755);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__8) {
						{
						{
						setState(751);
						match(T__8);
						setState(752);
						resource();
						}
						}
						setState(757);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				}
				break;
			case 28:
				_localctx = new DropFunctionContext(_localctx);
				enterOuterAlt(_localctx, 28);
				{
				setState(760);
				match(DROP);
				setState(762);
				_la = _input.LA(1);
				if (_la==TEMPORARY) {
					{
					setState(761);
					match(TEMPORARY);
					}
				}

				setState(764);
				match(FUNCTION);
				setState(767);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,76,_ctx) ) {
				case 1:
					{
					setState(765);
					match(IF);
					setState(766);
					match(EXISTS);
					}
					break;
				}
				setState(769);
				qualifiedName();
				}
				break;
			case 29:
				_localctx = new ExplainContext(_localctx);
				enterOuterAlt(_localctx, 29);
				{
				setState(770);
				match(EXPLAIN);
				setState(772);
				_la = _input.LA(1);
				if (_la==LOGICAL || _la==CODEGEN || _la==EXTENDED || _la==FORMATTED) {
					{
					setState(771);
					_la = _input.LA(1);
					if ( !(_la==LOGICAL || _la==CODEGEN || _la==EXTENDED || _la==FORMATTED) ) {
					_errHandler.recoverInline(this);
					} else {
						consume();
					}
					}
				}

				setState(774);
				statement();
				}
				break;
			case 30:
				_localctx = new ShowTablesContext(_localctx);
				enterOuterAlt(_localctx, 30);
				{
				setState(775);
				match(SHOW);
				setState(776);
				match(TABLES);
				setState(779);
				_la = _input.LA(1);
				if (_la==FROM || _la==IN) {
					{
					setState(777);
					_la = _input.LA(1);
					if ( !(_la==FROM || _la==IN) ) {
					_errHandler.recoverInline(this);
					} else {
						consume();
					}
					setState(778);
					((ShowTablesContext)_localctx).db = identifier();
					}
				}

				setState(785);
				_la = _input.LA(1);
				if (_la==LIKE || _la==STRING) {
					{
					setState(782);
					_la = _input.LA(1);
					if (_la==LIKE) {
						{
						setState(781);
						match(LIKE);
						}
					}

					setState(784);
					((ShowTablesContext)_localctx).pattern = match(STRING);
					}
				}

				}
				break;
			case 31:
				_localctx = new ShowDatabasesContext(_localctx);
				enterOuterAlt(_localctx, 31);
				{
				setState(787);
				match(SHOW);
				setState(788);
				match(DATABASES);
				setState(791);
				_la = _input.LA(1);
				if (_la==LIKE) {
					{
					setState(789);
					match(LIKE);
					setState(790);
					((ShowDatabasesContext)_localctx).pattern = match(STRING);
					}
				}

				}
				break;
			case 32:
				_localctx = new ShowTblPropertiesContext(_localctx);
				enterOuterAlt(_localctx, 32);
				{
				setState(793);
				match(SHOW);
				setState(794);
				match(TBLPROPERTIES);
				setState(795);
				((ShowTblPropertiesContext)_localctx).table = tableIdentifier();
				setState(800);
				_la = _input.LA(1);
				if (_la==T__6) {
					{
					setState(796);
					match(T__6);
					setState(797);
					((ShowTblPropertiesContext)_localctx).key = tablePropertyKey();
					setState(798);
					match(T__7);
					}
				}

				}
				break;
			case 33:
				_localctx = new ShowColumnsContext(_localctx);
				enterOuterAlt(_localctx, 33);
				{
				setState(802);
				match(SHOW);
				setState(803);
				match(COLUMNS);
				setState(804);
				_la = _input.LA(1);
				if ( !(_la==FROM || _la==IN) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(805);
				tableIdentifier();
				setState(808);
				_la = _input.LA(1);
				if (_la==FROM || _la==IN) {
					{
					setState(806);
					_la = _input.LA(1);
					if ( !(_la==FROM || _la==IN) ) {
					_errHandler.recoverInline(this);
					} else {
						consume();
					}
					setState(807);
					((ShowColumnsContext)_localctx).db = identifier();
					}
				}

				}
				break;
			case 34:
				_localctx = new ShowPartitionsContext(_localctx);
				enterOuterAlt(_localctx, 34);
				{
				setState(810);
				match(SHOW);
				setState(811);
				match(PARTITIONS);
				setState(812);
				tableIdentifier();
				setState(814);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(813);
					partitionSpec();
					}
				}

				}
				break;
			case 35:
				_localctx = new ShowFunctionsContext(_localctx);
				enterOuterAlt(_localctx, 35);
				{
				setState(816);
				match(SHOW);
				setState(818);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,85,_ctx) ) {
				case 1:
					{
					setState(817);
					identifier();
					}
					break;
				}
				setState(820);
				match(FUNCTIONS);
				setState(828);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SELECT) | (1L << FROM) | (1L << ADD) | (1L << AS) | (1L << ALL) | (1L << DISTINCT) | (1L << WHERE) | (1L << GROUP) | (1L << BY) | (1L << GROUPING) | (1L << SETS) | (1L << CUBE) | (1L << ROLLUP) | (1L << ORDER) | (1L << HAVING) | (1L << LIMIT) | (1L << AT) | (1L << OR) | (1L << AND) | (1L << IN) | (1L << NOT) | (1L << NO) | (1L << EXISTS) | (1L << BETWEEN) | (1L << LIKE) | (1L << RLIKE) | (1L << IS) | (1L << NULL) | (1L << TRUE) | (1L << FALSE) | (1L << NULLS) | (1L << ASC) | (1L << DESC) | (1L << FOR) | (1L << INTERVAL) | (1L << CASE) | (1L << WHEN) | (1L << THEN) | (1L << ELSE) | (1L << END) | (1L << JOIN) | (1L << CROSS) | (1L << OUTER))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (INNER - 64)) | (1L << (LEFT - 64)) | (1L << (SEMI - 64)) | (1L << (RIGHT - 64)) | (1L << (FULL - 64)) | (1L << (NATURAL - 64)) | (1L << (ON - 64)) | (1L << (LATERAL - 64)) | (1L << (WINDOW - 64)) | (1L << (OVER - 64)) | (1L << (PARTITION - 64)) | (1L << (RANGE - 64)) | (1L << (ROWS - 64)) | (1L << (UNBOUNDED - 64)) | (1L << (PRECEDING - 64)) | (1L << (FOLLOWING - 64)) | (1L << (CURRENT - 64)) | (1L << (ROW - 64)) | (1L << (WITH - 64)) | (1L << (VALUES - 64)) | (1L << (CREATE - 64)) | (1L << (TABLE - 64)) | (1L << (VIEW - 64)) | (1L << (REPLACE - 64)) | (1L << (INSERT - 64)) | (1L << (DELETE - 64)) | (1L << (INTO - 64)) | (1L << (DESCRIBE - 64)) | (1L << (EXPLAIN - 64)) | (1L << (FORMAT - 64)) | (1L << (LOGICAL - 64)) | (1L << (CODEGEN - 64)) | (1L << (CAST - 64)) | (1L << (SHOW - 64)) | (1L << (TABLES - 64)) | (1L << (COLUMNS - 64)) | (1L << (COLUMN - 64)) | (1L << (USE - 64)) | (1L << (PARTITIONS - 64)) | (1L << (FUNCTIONS - 64)) | (1L << (DROP - 64)) | (1L << (UNION - 64)) | (1L << (EXCEPT - 64)) | (1L << (INTERSECT - 64)) | (1L << (TO - 64)) | (1L << (TABLESAMPLE - 64)) | (1L << (STRATIFY - 64)) | (1L << (ALTER - 64)) | (1L << (RENAME - 64)) | (1L << (ARRAY - 64)) | (1L << (MAP - 64)) | (1L << (STRUCT - 64)) | (1L << (COMMENT - 64)) | (1L << (SET - 64)) | (1L << (RESET - 64)) | (1L << (DATA - 64)) | (1L << (START - 64)) | (1L << (TRANSACTION - 64)) | (1L << (COMMIT - 64)) | (1L << (ROLLBACK - 64)) | (1L << (MACRO - 64)) | (1L << (IF - 64)))) != 0) || ((((_la - 139)) & ~0x3f) == 0 && ((1L << (_la - 139)) & ((1L << (DIV - 139)) | (1L << (PERCENTLIT - 139)) | (1L << (BUCKET - 139)) | (1L << (OUT - 139)) | (1L << (OF - 139)) | (1L << (SORT - 139)) | (1L << (CLUSTER - 139)) | (1L << (DISTRIBUTE - 139)) | (1L << (OVERWRITE - 139)) | (1L << (TRANSFORM - 139)) | (1L << (REDUCE - 139)) | (1L << (USING - 139)) | (1L << (SERDE - 139)) | (1L << (SERDEPROPERTIES - 139)) | (1L << (RECORDREADER - 139)) | (1L << (RECORDWRITER - 139)) | (1L << (DELIMITED - 139)) | (1L << (FIELDS - 139)) | (1L << (TERMINATED - 139)) | (1L << (COLLECTION - 139)) | (1L << (ITEMS - 139)) | (1L << (KEYS - 139)) | (1L << (ESCAPED - 139)) | (1L << (LINES - 139)) | (1L << (SEPARATED - 139)) | (1L << (FUNCTION - 139)) | (1L << (EXTENDED - 139)) | (1L << (REFRESH - 139)) | (1L << (CLEAR - 139)) | (1L << (CACHE - 139)) | (1L << (UNCACHE - 139)) | (1L << (LAZY - 139)) | (1L << (FORMATTED - 139)) | (1L << (TEMPORARY - 139)) | (1L << (OPTIONS - 139)) | (1L << (UNSET - 139)) | (1L << (TBLPROPERTIES - 139)) | (1L << (DBPROPERTIES - 139)) | (1L << (BUCKETS - 139)) | (1L << (SKEWED - 139)) | (1L << (STORED - 139)) | (1L << (DIRECTORIES - 139)) | (1L << (LOCATION - 139)) | (1L << (EXCHANGE - 139)) | (1L << (ARCHIVE - 139)) | (1L << (UNARCHIVE - 139)) | (1L << (FILEFORMAT - 139)) | (1L << (TOUCH - 139)) | (1L << (COMPACT - 139)) | (1L << (CONCATENATE - 139)) | (1L << (CHANGE - 139)) | (1L << (CASCADE - 139)) | (1L << (RESTRICT - 139)) | (1L << (CLUSTERED - 139)) | (1L << (SORTED - 139)) | (1L << (PURGE - 139)) | (1L << (INPUTFORMAT - 139)) | (1L << (OUTPUTFORMAT - 139)) | (1L << (DATABASE - 139)) | (1L << (DATABASES - 139)))) != 0) || ((((_la - 203)) & ~0x3f) == 0 && ((1L << (_la - 203)) & ((1L << (DFS - 203)) | (1L << (TRUNCATE - 203)) | (1L << (ANALYZE - 203)) | (1L << (COMPUTE - 203)) | (1L << (LIST - 203)) | (1L << (STATISTICS - 203)) | (1L << (PARTITIONED - 203)) | (1L << (EXTERNAL - 203)) | (1L << (DEFINED - 203)) | (1L << (REVOKE - 203)) | (1L << (GRANT - 203)) | (1L << (LOCK - 203)) | (1L << (UNLOCK - 203)) | (1L << (MSCK - 203)) | (1L << (REPAIR - 203)) | (1L << (EXPORT - 203)) | (1L << (IMPORT - 203)) | (1L << (LOAD - 203)) | (1L << (ROLE - 203)) | (1L << (ROLES - 203)) | (1L << (COMPACTIONS - 203)) | (1L << (PRINCIPALS - 203)) | (1L << (TRANSACTIONS - 203)) | (1L << (INDEX - 203)) | (1L << (INDEXES - 203)) | (1L << (LOCKS - 203)) | (1L << (OPTION - 203)) | (1L << (ANTI - 203)) | (1L << (LOCAL - 203)) | (1L << (INPATH - 203)) | (1L << (STRING - 203)) | (1L << (IDENTIFIER - 203)) | (1L << (BACKQUOTED_IDENTIFIER - 203)))) != 0)) {
					{
					setState(822);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,86,_ctx) ) {
					case 1:
						{
						setState(821);
						match(LIKE);
						}
						break;
					}
					setState(826);
					switch (_input.LA(1)) {
					case SELECT:
					case FROM:
					case ADD:
					case AS:
					case ALL:
					case DISTINCT:
					case WHERE:
					case GROUP:
					case BY:
					case GROUPING:
					case SETS:
					case CUBE:
					case ROLLUP:
					case ORDER:
					case HAVING:
					case LIMIT:
					case AT:
					case OR:
					case AND:
					case IN:
					case NOT:
					case NO:
					case EXISTS:
					case BETWEEN:
					case LIKE:
					case RLIKE:
					case IS:
					case NULL:
					case TRUE:
					case FALSE:
					case NULLS:
					case ASC:
					case DESC:
					case FOR:
					case INTERVAL:
					case CASE:
					case WHEN:
					case THEN:
					case ELSE:
					case END:
					case JOIN:
					case CROSS:
					case OUTER:
					case INNER:
					case LEFT:
					case SEMI:
					case RIGHT:
					case FULL:
					case NATURAL:
					case ON:
					case LATERAL:
					case WINDOW:
					case OVER:
					case PARTITION:
					case RANGE:
					case ROWS:
					case UNBOUNDED:
					case PRECEDING:
					case FOLLOWING:
					case CURRENT:
					case ROW:
					case WITH:
					case VALUES:
					case CREATE:
					case TABLE:
					case VIEW:
					case REPLACE:
					case INSERT:
					case DELETE:
					case INTO:
					case DESCRIBE:
					case EXPLAIN:
					case FORMAT:
					case LOGICAL:
					case CODEGEN:
					case CAST:
					case SHOW:
					case TABLES:
					case COLUMNS:
					case COLUMN:
					case USE:
					case PARTITIONS:
					case FUNCTIONS:
					case DROP:
					case UNION:
					case EXCEPT:
					case INTERSECT:
					case TO:
					case TABLESAMPLE:
					case STRATIFY:
					case ALTER:
					case RENAME:
					case ARRAY:
					case MAP:
					case STRUCT:
					case COMMENT:
					case SET:
					case RESET:
					case DATA:
					case START:
					case TRANSACTION:
					case COMMIT:
					case ROLLBACK:
					case MACRO:
					case IF:
					case DIV:
					case PERCENTLIT:
					case BUCKET:
					case OUT:
					case OF:
					case SORT:
					case CLUSTER:
					case DISTRIBUTE:
					case OVERWRITE:
					case TRANSFORM:
					case REDUCE:
					case USING:
					case SERDE:
					case SERDEPROPERTIES:
					case RECORDREADER:
					case RECORDWRITER:
					case DELIMITED:
					case FIELDS:
					case TERMINATED:
					case COLLECTION:
					case ITEMS:
					case KEYS:
					case ESCAPED:
					case LINES:
					case SEPARATED:
					case FUNCTION:
					case EXTENDED:
					case REFRESH:
					case CLEAR:
					case CACHE:
					case UNCACHE:
					case LAZY:
					case FORMATTED:
					case TEMPORARY:
					case OPTIONS:
					case UNSET:
					case TBLPROPERTIES:
					case DBPROPERTIES:
					case BUCKETS:
					case SKEWED:
					case STORED:
					case DIRECTORIES:
					case LOCATION:
					case EXCHANGE:
					case ARCHIVE:
					case UNARCHIVE:
					case FILEFORMAT:
					case TOUCH:
					case COMPACT:
					case CONCATENATE:
					case CHANGE:
					case CASCADE:
					case RESTRICT:
					case CLUSTERED:
					case SORTED:
					case PURGE:
					case INPUTFORMAT:
					case OUTPUTFORMAT:
					case DATABASE:
					case DATABASES:
					case DFS:
					case TRUNCATE:
					case ANALYZE:
					case COMPUTE:
					case LIST:
					case STATISTICS:
					case PARTITIONED:
					case EXTERNAL:
					case DEFINED:
					case REVOKE:
					case GRANT:
					case LOCK:
					case UNLOCK:
					case MSCK:
					case REPAIR:
					case EXPORT:
					case IMPORT:
					case LOAD:
					case ROLE:
					case ROLES:
					case COMPACTIONS:
					case PRINCIPALS:
					case TRANSACTIONS:
					case INDEX:
					case INDEXES:
					case LOCKS:
					case OPTION:
					case ANTI:
					case LOCAL:
					case INPATH:
					case IDENTIFIER:
					case BACKQUOTED_IDENTIFIER:
						{
						setState(824);
						qualifiedName();
						}
						break;
					case STRING:
						{
						setState(825);
						((ShowFunctionsContext)_localctx).pattern = match(STRING);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
				}

				}
				break;
			case 36:
				_localctx = new ShowCreateTableContext(_localctx);
				enterOuterAlt(_localctx, 36);
				{
				setState(830);
				match(SHOW);
				setState(831);
				match(CREATE);
				setState(832);
				match(TABLE);
				setState(833);
				tableIdentifier();
				}
				break;
			case 37:
				_localctx = new DescribeFunctionContext(_localctx);
				enterOuterAlt(_localctx, 37);
				{
				setState(834);
				_la = _input.LA(1);
				if ( !(_la==DESC || _la==DESCRIBE) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(835);
				match(FUNCTION);
				setState(837);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,89,_ctx) ) {
				case 1:
					{
					setState(836);
					match(EXTENDED);
					}
					break;
				}
				setState(839);
				describeFuncName();
				}
				break;
			case 38:
				_localctx = new DescribeDatabaseContext(_localctx);
				enterOuterAlt(_localctx, 38);
				{
				setState(840);
				_la = _input.LA(1);
				if ( !(_la==DESC || _la==DESCRIBE) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(841);
				match(DATABASE);
				setState(843);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,90,_ctx) ) {
				case 1:
					{
					setState(842);
					match(EXTENDED);
					}
					break;
				}
				setState(845);
				identifier();
				}
				break;
			case 39:
				_localctx = new DescribeTableContext(_localctx);
				enterOuterAlt(_localctx, 39);
				{
				setState(846);
				_la = _input.LA(1);
				if ( !(_la==DESC || _la==DESCRIBE) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(848);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,91,_ctx) ) {
				case 1:
					{
					setState(847);
					((DescribeTableContext)_localctx).option = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==EXTENDED || _la==FORMATTED) ) {
						((DescribeTableContext)_localctx).option = (Token)_errHandler.recoverInline(this);
					} else {
						consume();
					}
					}
					break;
				}
				setState(850);
				tableIdentifier();
				setState(852);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,92,_ctx) ) {
				case 1:
					{
					setState(851);
					partitionSpec();
					}
					break;
				}
				setState(855);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SELECT) | (1L << FROM) | (1L << ADD) | (1L << AS) | (1L << ALL) | (1L << DISTINCT) | (1L << WHERE) | (1L << GROUP) | (1L << BY) | (1L << GROUPING) | (1L << SETS) | (1L << CUBE) | (1L << ROLLUP) | (1L << ORDER) | (1L << HAVING) | (1L << LIMIT) | (1L << AT) | (1L << OR) | (1L << AND) | (1L << IN) | (1L << NOT) | (1L << NO) | (1L << EXISTS) | (1L << BETWEEN) | (1L << LIKE) | (1L << RLIKE) | (1L << IS) | (1L << NULL) | (1L << TRUE) | (1L << FALSE) | (1L << NULLS) | (1L << ASC) | (1L << DESC) | (1L << FOR) | (1L << INTERVAL) | (1L << CASE) | (1L << WHEN) | (1L << THEN) | (1L << ELSE) | (1L << END) | (1L << JOIN) | (1L << CROSS) | (1L << OUTER))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (INNER - 64)) | (1L << (LEFT - 64)) | (1L << (SEMI - 64)) | (1L << (RIGHT - 64)) | (1L << (FULL - 64)) | (1L << (NATURAL - 64)) | (1L << (ON - 64)) | (1L << (LATERAL - 64)) | (1L << (WINDOW - 64)) | (1L << (OVER - 64)) | (1L << (PARTITION - 64)) | (1L << (RANGE - 64)) | (1L << (ROWS - 64)) | (1L << (UNBOUNDED - 64)) | (1L << (PRECEDING - 64)) | (1L << (FOLLOWING - 64)) | (1L << (CURRENT - 64)) | (1L << (ROW - 64)) | (1L << (WITH - 64)) | (1L << (VALUES - 64)) | (1L << (CREATE - 64)) | (1L << (TABLE - 64)) | (1L << (VIEW - 64)) | (1L << (REPLACE - 64)) | (1L << (INSERT - 64)) | (1L << (DELETE - 64)) | (1L << (INTO - 64)) | (1L << (DESCRIBE - 64)) | (1L << (EXPLAIN - 64)) | (1L << (FORMAT - 64)) | (1L << (LOGICAL - 64)) | (1L << (CODEGEN - 64)) | (1L << (CAST - 64)) | (1L << (SHOW - 64)) | (1L << (TABLES - 64)) | (1L << (COLUMNS - 64)) | (1L << (COLUMN - 64)) | (1L << (USE - 64)) | (1L << (PARTITIONS - 64)) | (1L << (FUNCTIONS - 64)) | (1L << (DROP - 64)) | (1L << (UNION - 64)) | (1L << (EXCEPT - 64)) | (1L << (INTERSECT - 64)) | (1L << (TO - 64)) | (1L << (TABLESAMPLE - 64)) | (1L << (STRATIFY - 64)) | (1L << (ALTER - 64)) | (1L << (RENAME - 64)) | (1L << (ARRAY - 64)) | (1L << (MAP - 64)) | (1L << (STRUCT - 64)) | (1L << (COMMENT - 64)) | (1L << (SET - 64)) | (1L << (RESET - 64)) | (1L << (DATA - 64)) | (1L << (START - 64)) | (1L << (TRANSACTION - 64)) | (1L << (COMMIT - 64)) | (1L << (ROLLBACK - 64)) | (1L << (MACRO - 64)) | (1L << (IF - 64)))) != 0) || ((((_la - 139)) & ~0x3f) == 0 && ((1L << (_la - 139)) & ((1L << (DIV - 139)) | (1L << (PERCENTLIT - 139)) | (1L << (BUCKET - 139)) | (1L << (OUT - 139)) | (1L << (OF - 139)) | (1L << (SORT - 139)) | (1L << (CLUSTER - 139)) | (1L << (DISTRIBUTE - 139)) | (1L << (OVERWRITE - 139)) | (1L << (TRANSFORM - 139)) | (1L << (REDUCE - 139)) | (1L << (USING - 139)) | (1L << (SERDE - 139)) | (1L << (SERDEPROPERTIES - 139)) | (1L << (RECORDREADER - 139)) | (1L << (RECORDWRITER - 139)) | (1L << (DELIMITED - 139)) | (1L << (FIELDS - 139)) | (1L << (TERMINATED - 139)) | (1L << (COLLECTION - 139)) | (1L << (ITEMS - 139)) | (1L << (KEYS - 139)) | (1L << (ESCAPED - 139)) | (1L << (LINES - 139)) | (1L << (SEPARATED - 139)) | (1L << (FUNCTION - 139)) | (1L << (EXTENDED - 139)) | (1L << (REFRESH - 139)) | (1L << (CLEAR - 139)) | (1L << (CACHE - 139)) | (1L << (UNCACHE - 139)) | (1L << (LAZY - 139)) | (1L << (FORMATTED - 139)) | (1L << (TEMPORARY - 139)) | (1L << (OPTIONS - 139)) | (1L << (UNSET - 139)) | (1L << (TBLPROPERTIES - 139)) | (1L << (DBPROPERTIES - 139)) | (1L << (BUCKETS - 139)) | (1L << (SKEWED - 139)) | (1L << (STORED - 139)) | (1L << (DIRECTORIES - 139)) | (1L << (LOCATION - 139)) | (1L << (EXCHANGE - 139)) | (1L << (ARCHIVE - 139)) | (1L << (UNARCHIVE - 139)) | (1L << (FILEFORMAT - 139)) | (1L << (TOUCH - 139)) | (1L << (COMPACT - 139)) | (1L << (CONCATENATE - 139)) | (1L << (CHANGE - 139)) | (1L << (CASCADE - 139)) | (1L << (RESTRICT - 139)) | (1L << (CLUSTERED - 139)) | (1L << (SORTED - 139)) | (1L << (PURGE - 139)) | (1L << (INPUTFORMAT - 139)) | (1L << (OUTPUTFORMAT - 139)) | (1L << (DATABASE - 139)) | (1L << (DATABASES - 139)))) != 0) || ((((_la - 203)) & ~0x3f) == 0 && ((1L << (_la - 203)) & ((1L << (DFS - 203)) | (1L << (TRUNCATE - 203)) | (1L << (ANALYZE - 203)) | (1L << (COMPUTE - 203)) | (1L << (LIST - 203)) | (1L << (STATISTICS - 203)) | (1L << (PARTITIONED - 203)) | (1L << (EXTERNAL - 203)) | (1L << (DEFINED - 203)) | (1L << (REVOKE - 203)) | (1L << (GRANT - 203)) | (1L << (LOCK - 203)) | (1L << (UNLOCK - 203)) | (1L << (MSCK - 203)) | (1L << (REPAIR - 203)) | (1L << (EXPORT - 203)) | (1L << (IMPORT - 203)) | (1L << (LOAD - 203)) | (1L << (ROLE - 203)) | (1L << (ROLES - 203)) | (1L << (COMPACTIONS - 203)) | (1L << (PRINCIPALS - 203)) | (1L << (TRANSACTIONS - 203)) | (1L << (INDEX - 203)) | (1L << (INDEXES - 203)) | (1L << (LOCKS - 203)) | (1L << (OPTION - 203)) | (1L << (ANTI - 203)) | (1L << (LOCAL - 203)) | (1L << (INPATH - 203)) | (1L << (IDENTIFIER - 203)) | (1L << (BACKQUOTED_IDENTIFIER - 203)))) != 0)) {
					{
					setState(854);
					describeColName();
					}
				}

				}
				break;
			case 40:
				_localctx = new RefreshTableContext(_localctx);
				enterOuterAlt(_localctx, 40);
				{
				setState(857);
				match(REFRESH);
				setState(858);
				match(TABLE);
				setState(859);
				tableIdentifier();
				}
				break;
			case 41:
				_localctx = new RefreshResourceContext(_localctx);
				enterOuterAlt(_localctx, 41);
				{
				setState(860);
				match(REFRESH);
				setState(864);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,94,_ctx);
				while ( _alt!=1 && _alt!=ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1+1 ) {
						{
						{
						setState(861);
						matchWildcard();
						}
						} 
					}
					setState(866);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,94,_ctx);
				}
				}
				break;
			case 42:
				_localctx = new CacheTableContext(_localctx);
				enterOuterAlt(_localctx, 42);
				{
				setState(867);
				match(CACHE);
				setState(869);
				_la = _input.LA(1);
				if (_la==LAZY) {
					{
					setState(868);
					match(LAZY);
					}
				}

				setState(871);
				match(TABLE);
				setState(872);
				tableIdentifier();
				setState(877);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << SELECT) | (1L << FROM) | (1L << AS))) != 0) || ((((_la - 82)) & ~0x3f) == 0 && ((1L << (_la - 82)) & ((1L << (WITH - 82)) | (1L << (VALUES - 82)) | (1L << (TABLE - 82)) | (1L << (INSERT - 82)) | (1L << (MAP - 82)))) != 0) || _la==REDUCE) {
					{
					setState(874);
					_la = _input.LA(1);
					if (_la==AS) {
						{
						setState(873);
						match(AS);
						}
					}

					setState(876);
					query();
					}
				}

				}
				break;
			case 43:
				_localctx = new UncacheTableContext(_localctx);
				enterOuterAlt(_localctx, 43);
				{
				setState(879);
				match(UNCACHE);
				setState(880);
				match(TABLE);
				setState(881);
				tableIdentifier();
				}
				break;
			case 44:
				_localctx = new ClearCacheContext(_localctx);
				enterOuterAlt(_localctx, 44);
				{
				setState(882);
				match(CLEAR);
				setState(883);
				match(CACHE);
				}
				break;
			case 45:
				_localctx = new LoadDataContext(_localctx);
				enterOuterAlt(_localctx, 45);
				{
				setState(884);
				match(LOAD);
				setState(885);
				match(DATA);
				setState(887);
				_la = _input.LA(1);
				if (_la==LOCAL) {
					{
					setState(886);
					match(LOCAL);
					}
				}

				setState(889);
				match(INPATH);
				setState(890);
				((LoadDataContext)_localctx).path = match(STRING);
				setState(892);
				_la = _input.LA(1);
				if (_la==OVERWRITE) {
					{
					setState(891);
					match(OVERWRITE);
					}
				}

				setState(894);
				match(INTO);
				setState(895);
				match(TABLE);
				setState(896);
				tableIdentifier();
				setState(898);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(897);
					partitionSpec();
					}
				}

				}
				break;
			case 46:
				_localctx = new TruncateTableContext(_localctx);
				enterOuterAlt(_localctx, 46);
				{
				setState(900);
				match(TRUNCATE);
				setState(901);
				match(TABLE);
				setState(902);
				tableIdentifier();
				setState(904);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(903);
					partitionSpec();
					}
				}

				}
				break;
			case 47:
				_localctx = new ManageResourceContext(_localctx);
				enterOuterAlt(_localctx, 47);
				{
				setState(906);
				((ManageResourceContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==ADD || _la==LIST) ) {
					((ManageResourceContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(907);
				identifier();
				setState(911);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,102,_ctx);
				while ( _alt!=1 && _alt!=ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1+1 ) {
						{
						{
						setState(908);
						matchWildcard();
						}
						} 
					}
					setState(913);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,102,_ctx);
				}
				}
				break;
			case 48:
				_localctx = new FailNativeCommandContext(_localctx);
				enterOuterAlt(_localctx, 48);
				{
				setState(914);
				match(SET);
				setState(915);
				match(ROLE);
				setState(919);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,103,_ctx);
				while ( _alt!=1 && _alt!=ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1+1 ) {
						{
						{
						setState(916);
						matchWildcard();
						}
						} 
					}
					setState(921);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,103,_ctx);
				}
				}
				break;
			case 49:
				_localctx = new SetConfigurationContext(_localctx);
				enterOuterAlt(_localctx, 49);
				{
				setState(922);
				match(SET);
				setState(926);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,104,_ctx);
				while ( _alt!=1 && _alt!=ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1+1 ) {
						{
						{
						setState(923);
						matchWildcard();
						}
						} 
					}
					setState(928);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,104,_ctx);
				}
				}
				break;
			case 50:
				_localctx = new ResetConfigurationContext(_localctx);
				enterOuterAlt(_localctx, 50);
				{
				setState(929);
				match(RESET);
				}
				break;
			case 51:
				_localctx = new FailNativeCommandContext(_localctx);
				enterOuterAlt(_localctx, 51);
				{
				setState(930);
				unsupportedHiveNativeCommands();
				setState(934);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,105,_ctx);
				while ( _alt!=1 && _alt!=ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1+1 ) {
						{
						{
						setState(931);
						matchWildcard();
						}
						} 
					}
					setState(936);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,105,_ctx);
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnsupportedHiveNativeCommandsContext extends ParserRuleContext {
		public Token kw1;
		public Token kw2;
		public Token kw3;
		public Token kw4;
		public Token kw5;
		public Token kw6;
		public TerminalNode CREATE() { return getToken(JdScriptQuerySqlParser.CREATE, 0); }
		public TerminalNode ROLE() { return getToken(JdScriptQuerySqlParser.ROLE, 0); }
		public TerminalNode DROP() { return getToken(JdScriptQuerySqlParser.DROP, 0); }
		public TerminalNode GRANT() { return getToken(JdScriptQuerySqlParser.GRANT, 0); }
		public TerminalNode REVOKE() { return getToken(JdScriptQuerySqlParser.REVOKE, 0); }
		public TerminalNode SHOW() { return getToken(JdScriptQuerySqlParser.SHOW, 0); }
		public TerminalNode PRINCIPALS() { return getToken(JdScriptQuerySqlParser.PRINCIPALS, 0); }
		public TerminalNode ROLES() { return getToken(JdScriptQuerySqlParser.ROLES, 0); }
		public TerminalNode CURRENT() { return getToken(JdScriptQuerySqlParser.CURRENT, 0); }
		public TerminalNode EXPORT() { return getToken(JdScriptQuerySqlParser.EXPORT, 0); }
		public TerminalNode TABLE() { return getToken(JdScriptQuerySqlParser.TABLE, 0); }
		public TerminalNode IMPORT() { return getToken(JdScriptQuerySqlParser.IMPORT, 0); }
		public TerminalNode COMPACTIONS() { return getToken(JdScriptQuerySqlParser.COMPACTIONS, 0); }
		public TerminalNode TRANSACTIONS() { return getToken(JdScriptQuerySqlParser.TRANSACTIONS, 0); }
		public TerminalNode INDEXES() { return getToken(JdScriptQuerySqlParser.INDEXES, 0); }
		public TerminalNode LOCKS() { return getToken(JdScriptQuerySqlParser.LOCKS, 0); }
		public TerminalNode INDEX() { return getToken(JdScriptQuerySqlParser.INDEX, 0); }
		public TerminalNode ALTER() { return getToken(JdScriptQuerySqlParser.ALTER, 0); }
		public TerminalNode LOCK() { return getToken(JdScriptQuerySqlParser.LOCK, 0); }
		public TerminalNode DATABASE() { return getToken(JdScriptQuerySqlParser.DATABASE, 0); }
		public TerminalNode UNLOCK() { return getToken(JdScriptQuerySqlParser.UNLOCK, 0); }
		public TerminalNode TEMPORARY() { return getToken(JdScriptQuerySqlParser.TEMPORARY, 0); }
		public TerminalNode MACRO() { return getToken(JdScriptQuerySqlParser.MACRO, 0); }
		public TerminalNode MSCK() { return getToken(JdScriptQuerySqlParser.MSCK, 0); }
		public TerminalNode REPAIR() { return getToken(JdScriptQuerySqlParser.REPAIR, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TerminalNode NOT() { return getToken(JdScriptQuerySqlParser.NOT, 0); }
		public TerminalNode CLUSTERED() { return getToken(JdScriptQuerySqlParser.CLUSTERED, 0); }
		public TerminalNode BY() { return getToken(JdScriptQuerySqlParser.BY, 0); }
		public TerminalNode SORTED() { return getToken(JdScriptQuerySqlParser.SORTED, 0); }
		public TerminalNode SKEWED() { return getToken(JdScriptQuerySqlParser.SKEWED, 0); }
		public TerminalNode STORED() { return getToken(JdScriptQuerySqlParser.STORED, 0); }
		public TerminalNode AS() { return getToken(JdScriptQuerySqlParser.AS, 0); }
		public TerminalNode DIRECTORIES() { return getToken(JdScriptQuerySqlParser.DIRECTORIES, 0); }
		public TerminalNode SET() { return getToken(JdScriptQuerySqlParser.SET, 0); }
		public TerminalNode LOCATION() { return getToken(JdScriptQuerySqlParser.LOCATION, 0); }
		public TerminalNode EXCHANGE() { return getToken(JdScriptQuerySqlParser.EXCHANGE, 0); }
		public TerminalNode PARTITION() { return getToken(JdScriptQuerySqlParser.PARTITION, 0); }
		public TerminalNode ARCHIVE() { return getToken(JdScriptQuerySqlParser.ARCHIVE, 0); }
		public TerminalNode UNARCHIVE() { return getToken(JdScriptQuerySqlParser.UNARCHIVE, 0); }
		public TerminalNode TOUCH() { return getToken(JdScriptQuerySqlParser.TOUCH, 0); }
		public TerminalNode COMPACT() { return getToken(JdScriptQuerySqlParser.COMPACT, 0); }
		public PartitionSpecContext partitionSpec() {
			return getRuleContext(PartitionSpecContext.class,0);
		}
		public TerminalNode CONCATENATE() { return getToken(JdScriptQuerySqlParser.CONCATENATE, 0); }
		public TerminalNode FILEFORMAT() { return getToken(JdScriptQuerySqlParser.FILEFORMAT, 0); }
		public TerminalNode ADD() { return getToken(JdScriptQuerySqlParser.ADD, 0); }
		public TerminalNode COLUMNS() { return getToken(JdScriptQuerySqlParser.COLUMNS, 0); }
		public TerminalNode CHANGE() { return getToken(JdScriptQuerySqlParser.CHANGE, 0); }
		public TerminalNode REPLACE() { return getToken(JdScriptQuerySqlParser.REPLACE, 0); }
		public TerminalNode START() { return getToken(JdScriptQuerySqlParser.START, 0); }
		public TerminalNode TRANSACTION() { return getToken(JdScriptQuerySqlParser.TRANSACTION, 0); }
		public TerminalNode COMMIT() { return getToken(JdScriptQuerySqlParser.COMMIT, 0); }
		public TerminalNode ROLLBACK() { return getToken(JdScriptQuerySqlParser.ROLLBACK, 0); }
		public TerminalNode DFS() { return getToken(JdScriptQuerySqlParser.DFS, 0); }
		public TerminalNode DELETE() { return getToken(JdScriptQuerySqlParser.DELETE, 0); }
		public TerminalNode FROM() { return getToken(JdScriptQuerySqlParser.FROM, 0); }
		public UnsupportedHiveNativeCommandsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unsupportedHiveNativeCommands; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JdScriptQuerySqlListener ) ((JdScriptQuerySqlListener)listener).enterUnsupportedHiveNativeCommands(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JdScriptQuerySqlListener ) ((JdScriptQuerySqlListener)listener).exitUnsupportedHiveNativeCommands(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JdScriptQuerySqlVisitor ) return ((JdScriptQuerySqlVisitor<? extends T>)visitor).visitUnsupportedHiveNativeCommands(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnsupportedHiveNativeCommandsContext unsupportedHiveNativeCommands() throws RecognitionException {
		UnsupportedHiveNativeCommandsContext _localctx = new UnsupportedHiveNativeCommandsContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_unsupportedHiveNativeCommands);
		int _la;
		try {
			setState(1131);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,117,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(939);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(CREATE);
				setState(940);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(ROLE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(941);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(DROP);
				setState(942);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(ROLE);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(943);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(GRANT);
				setState(945);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,107,_ctx) ) {
				case 1:
					{
					setState(944);
					((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(ROLE);
					}
					break;
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(947);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(REVOKE);
				setState(949);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,108,_ctx) ) {
				case 1:
					{
					setState(948);
					((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(ROLE);
					}
					break;
				}
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(951);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(SHOW);
				setState(952);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(GRANT);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(953);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(SHOW);
				setState(954);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(ROLE);
				setState(956);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,109,_ctx) ) {
				case 1:
					{
					setState(955);
					((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(GRANT);
					}
					break;
				}
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(958);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(SHOW);
				setState(959);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(PRINCIPALS);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(960);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(SHOW);
				setState(961);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(ROLES);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(962);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(SHOW);
				setState(963);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(CURRENT);
				setState(964);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(ROLES);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(965);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(EXPORT);
				setState(966);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(967);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(IMPORT);
				setState(968);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(969);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(SHOW);
				setState(970);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(COMPACTIONS);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(971);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(SHOW);
				setState(972);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(CREATE);
				setState(973);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(TABLE);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(974);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(SHOW);
				setState(975);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TRANSACTIONS);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(976);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(SHOW);
				setState(977);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(INDEXES);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(978);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(SHOW);
				setState(979);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(LOCKS);
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(980);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(CREATE);
				setState(981);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(INDEX);
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(982);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(DROP);
				setState(983);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(INDEX);
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(984);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(985);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(INDEX);
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(986);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(LOCK);
				setState(987);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				}
				break;
			case 21:
				enterOuterAlt(_localctx, 21);
				{
				setState(988);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(LOCK);
				setState(989);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(DATABASE);
				}
				break;
			case 22:
				enterOuterAlt(_localctx, 22);
				{
				setState(990);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(UNLOCK);
				setState(991);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				}
				break;
			case 23:
				enterOuterAlt(_localctx, 23);
				{
				setState(992);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(UNLOCK);
				setState(993);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(DATABASE);
				}
				break;
			case 24:
				enterOuterAlt(_localctx, 24);
				{
				setState(994);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(CREATE);
				setState(995);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TEMPORARY);
				setState(996);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(MACRO);
				}
				break;
			case 25:
				enterOuterAlt(_localctx, 25);
				{
				setState(997);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(DROP);
				setState(998);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TEMPORARY);
				setState(999);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(MACRO);
				}
				break;
			case 26:
				enterOuterAlt(_localctx, 26);
				{
				setState(1000);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(MSCK);
				setState(1001);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(REPAIR);
				setState(1002);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(TABLE);
				}
				break;
			case 27:
				enterOuterAlt(_localctx, 27);
				{
				setState(1003);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(1004);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(1005);
				tableIdentifier();
				setState(1006);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(NOT);
				setState(1007);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw4 = match(CLUSTERED);
				}
				break;
			case 28:
				enterOuterAlt(_localctx, 28);
				{
				setState(1009);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(1010);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(1011);
				tableIdentifier();
				setState(1012);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(CLUSTERED);
				setState(1013);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw4 = match(BY);
				}
				break;
			case 29:
				enterOuterAlt(_localctx, 29);
				{
				setState(1015);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(1016);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(1017);
				tableIdentifier();
				setState(1018);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(NOT);
				setState(1019);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw4 = match(SORTED);
				}
				break;
			case 30:
				enterOuterAlt(_localctx, 30);
				{
				setState(1021);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(1022);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(1023);
				tableIdentifier();
				setState(1024);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(SKEWED);
				setState(1025);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw4 = match(BY);
				}
				break;
			case 31:
				enterOuterAlt(_localctx, 31);
				{
				setState(1027);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(1028);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(1029);
				tableIdentifier();
				setState(1030);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(NOT);
				setState(1031);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw4 = match(SKEWED);
				}
				break;
			case 32:
				enterOuterAlt(_localctx, 32);
				{
				setState(1033);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(1034);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(1035);
				tableIdentifier();
				setState(1036);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(NOT);
				setState(1037);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw4 = match(STORED);
				setState(1038);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw5 = match(AS);
				setState(1039);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw6 = match(DIRECTORIES);
				}
				break;
			case 33:
				enterOuterAlt(_localctx, 33);
				{
				setState(1041);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(1042);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(1043);
				tableIdentifier();
				setState(1044);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(SET);
				setState(1045);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw4 = match(SKEWED);
				setState(1046);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw5 = match(LOCATION);
				}
				break;
			case 34:
				enterOuterAlt(_localctx, 34);
				{
				setState(1048);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(1049);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(1050);
				tableIdentifier();
				setState(1051);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(EXCHANGE);
				setState(1052);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw4 = match(PARTITION);
				}
				break;
			case 35:
				enterOuterAlt(_localctx, 35);
				{
				setState(1054);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(1055);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(1056);
				tableIdentifier();
				setState(1057);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(ARCHIVE);
				setState(1058);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw4 = match(PARTITION);
				}
				break;
			case 36:
				enterOuterAlt(_localctx, 36);
				{
				setState(1060);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(1061);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(1062);
				tableIdentifier();
				setState(1063);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(UNARCHIVE);
				setState(1064);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw4 = match(PARTITION);
				}
				break;
			case 37:
				enterOuterAlt(_localctx, 37);
				{
				setState(1066);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(1067);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(1068);
				tableIdentifier();
				setState(1069);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(TOUCH);
				}
				break;
			case 38:
				enterOuterAlt(_localctx, 38);
				{
				setState(1071);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(1072);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(1073);
				tableIdentifier();
				setState(1075);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(1074);
					partitionSpec();
					}
				}

				setState(1077);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(COMPACT);
				}
				break;
			case 39:
				enterOuterAlt(_localctx, 39);
				{
				setState(1079);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(1080);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(1081);
				tableIdentifier();
				setState(1083);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(1082);
					partitionSpec();
					}
				}

				setState(1085);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(CONCATENATE);
				}
				break;
			case 40:
				enterOuterAlt(_localctx, 40);
				{
				setState(1087);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(1088);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(1089);
				tableIdentifier();
				setState(1091);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(1090);
					partitionSpec();
					}
				}

				setState(1093);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(SET);
				setState(1094);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw4 = match(FILEFORMAT);
				}
				break;
			case 41:
				enterOuterAlt(_localctx, 41);
				{
				setState(1096);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(1097);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(1098);
				tableIdentifier();
				setState(1100);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(1099);
					partitionSpec();
					}
				}

				setState(1102);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(ADD);
				setState(1103);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw4 = match(COLUMNS);
				}
				break;
			case 42:
				enterOuterAlt(_localctx, 42);
				{
				setState(1105);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(1106);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(1107);
				tableIdentifier();
				setState(1109);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(1108);
					partitionSpec();
					}
				}

				setState(1111);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(CHANGE);
				setState(1113);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,115,_ctx) ) {
				case 1:
					{
					setState(1112);
					((UnsupportedHiveNativeCommandsContext)_localctx).kw4 = match(COLUMNS);
					}
					break;
				}
				}
				break;
			case 43:
				enterOuterAlt(_localctx, 43);
				{
				setState(1115);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(1116);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(1117);
				tableIdentifier();
				setState(1119);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(1118);
					partitionSpec();
					}
				}

				setState(1121);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(REPLACE);
				setState(1122);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw4 = match(COLUMNS);
				}
				break;
			case 44:
				enterOuterAlt(_localctx, 44);
				{
				setState(1124);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(START);
				setState(1125);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TRANSACTION);
				}
				break;
			case 45:
				enterOuterAlt(_localctx, 45);
				{
				setState(1126);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(COMMIT);
				}
				break;
			case 46:
				enterOuterAlt(_localctx, 46);
				{
				setState(1127);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ROLLBACK);
				}
				break;
			case 47:
				enterOuterAlt(_localctx, 47);
				{
				setState(1128);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(DFS);
				}
				break;
			case 48:
				enterOuterAlt(_localctx, 48);
				{
				setState(1129);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(DELETE);
				setState(1130);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(FROM);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CreateTableHeaderContext extends ParserRuleContext {
		public TerminalNode CREATE() { return getToken(JdScriptQuerySqlParser.CREATE, 0); }
		public TerminalNode TABLE() { return getToken(JdScriptQuerySqlParser.TABLE, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TerminalNode TEMPORARY() { return getToken(JdScriptQuerySqlParser.TEMPORARY, 0); }
		public TerminalNode EXTERNAL() { return getToken(JdScriptQuerySqlParser.EXTERNAL, 0); }
		public TerminalNode IF() { return getToken(JdScriptQuerySqlParser.IF, 0); }
		public TerminalNode NOT() { return getToken(JdScriptQuerySqlParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(JdScriptQuerySqlParser.EXISTS, 0); }
		public CreateTableHeaderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createTableHeader; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JdScriptQuerySqlListener ) ((JdScriptQuerySqlListener)listener).enterCreateTableHeader(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JdScriptQuerySqlListener ) ((JdScriptQuerySqlListener)listener).exitCreateTableHeader(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JdScriptQuerySqlVisitor ) return ((JdScriptQuerySqlVisitor<? extends T>)visitor).visitCreateTableHeader(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreateTableHeaderContext createTableHeader() throws RecognitionException {
		CreateTableHeaderContext _localctx = new CreateTableHeaderContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_createTableHeader);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1133);
			match(CREATE);
			setState(1135);
			_la = _input.LA(1);
			if (_la==TEMPORARY) {
				{
				setState(1134);
				match(TEMPORARY);
				}
			}

			setState(1138);
			_la = _input.LA(1);
			if (_la==EXTERNAL) {
				{
				setState(1137);
				match(EXTERNAL);
				}
			}

			setState(1140);
			match(TABLE);
			setState(1144);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,120,_ctx) ) {
			case 1:
				{
				setState(1141);
				match(IF);
				setState(1142);
				match(NOT);
				setState(1143);
				match(EXISTS);
				}
				break;
			}
			setState(1146);
			tableIdentifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BucketSpecContext extends ParserRuleContext {
		public TerminalNode CLUSTERED() { return getToken(JdScriptQuerySqlParser.CLUSTERED, 0); }
		public List<TerminalNode> BY() { return getTokens(JdScriptQuerySqlParser.BY); }
		public TerminalNode BY(int i) {
			return getToken(JdScriptQuerySqlParser.BY, i);
		}
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public TerminalNode INTO() { return getToken(JdScriptQuerySqlParser.INTO, 0); }
		public TerminalNode INTEGER_VALUE() { return getToken(JdScriptQuerySqlParser.INTEGER_VALUE, 0); }
		public TerminalNode BUCKETS() { return getToken(JdScriptQuerySqlParser.BUCKETS, 0); }
		public TerminalNode SORTED() { return getToken(JdScriptQuerySqlParser.SORTED, 0); }
		public OrderedIdentifierListContext orderedIdentifierList() {
			return getRuleContext(OrderedIdentifierListContext.class,0);
		}
		public BucketSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bucketSpec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JdScriptQuerySqlListener ) ((JdScriptQuerySqlListener)listener).enterBucketSpec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JdScriptQuerySqlListener ) ((JdScriptQuerySqlListener)listener).exitBucketSpec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JdScriptQuerySqlVisitor ) return ((JdScriptQuerySqlVisitor<? extends T>)visitor).visitBucketSpec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BucketSpecContext bucketSpec() throws RecognitionException {
		BucketSpecContext _localctx = new BucketSpecContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_bucketSpec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1148);
			match(CLUSTERED);
			setState(1149);
			match(BY);
			setState(1150);
			identifierList();
			setState(1154);
			_la = _input.LA(1);
			if (_la==SORTED) {
				{
				setState(1151);
				match(SORTED);
				setState(1152);
				match(BY);
				setState(1153);
				orderedIdentifierList();
				}
			}

			setState(1156);
			match(INTO);
			setState(1157);
			match(INTEGER_VALUE);
			setState(1158);
			match(BUCKETS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SkewSpecContext extends ParserRuleContext {
		public TerminalNode SKEWED() { return getToken(JdScriptQuerySqlParser.SKEWED, 0); }
		public TerminalNode BY() { return getToken(JdScriptQuerySqlParser.BY, 0); }
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public TerminalNode ON() { return getToken(JdScriptQuerySqlParser.ON, 0); }
		public ConstantListContext constantList() {
			return getRuleContext(ConstantListContext.class,0);
		}
		public NestedConstantListContext nestedConstantList() {
			return getRuleContext(NestedConstantListContext.class,0);
		}
		public TerminalNode STORED() { return getToken(JdScriptQuerySqlParser.STORED, 0); }
		public TerminalNode AS() { return getToken(JdScriptQuerySqlParser.AS, 0); }
		public TerminalNode DIRECTORIES() { return getToken(JdScriptQuerySqlParser.DIRECTORIES, 0); }
		public SkewSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_skewSpec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JdScriptQuerySqlListener ) ((JdScriptQuerySqlListener)listener).enterSkewSpec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JdScriptQuerySqlListener ) ((JdScriptQuerySqlListener)listener).exitSkewSpec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JdScriptQuerySqlVisitor ) return ((JdScriptQuerySqlVisitor<? extends T>)visitor).visitSkewSpec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SkewSpecContext skewSpec() throws RecognitionException {
		SkewSpecContext _localctx = new SkewSpecContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_skewSpec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1160);
			match(SKEWED);
			setState(1161);
			match(BY);
			setState(1162);
			identifierList();
			setState(1163);
			match(ON);
			setState(1166);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,122,_ctx) ) {
			case 1:
				{
				setState(1164);
				constantList();
				}
				break;
			case 2:
				{
				setState(1165);
				nestedConstantList();
				}
				break;
			}
			setState(1171);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,123,_ctx) ) {
			case 1:
				{
				setState(1168);
				match(STORED);
				setState(1169);
				match(AS);
				setState(1170);
				match(DIRECTORIES);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LocationSpecContext extends ParserRuleContext {
		public TerminalNode LOCATION() { return getToken(JdScriptQuerySqlParser.LOCATION, 0); }
		public TerminalNode STRING() { return getToken(JdScriptQuerySqlParser.STRING, 0); }
		public LocationSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_locationSpec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JdScriptQuerySqlListener ) ((JdScriptQuerySqlListener)listener).enterLocationSpec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JdScriptQuerySqlListener ) ((JdScriptQuerySqlListener)listener).exitLocationSpec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JdScriptQuerySqlVisitor ) return ((JdScriptQuerySqlVisitor<? extends T>)visitor).visitLocationSpec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LocationSpecContext locationSpec() throws RecognitionException {
		LocationSpecContext _localctx = new LocationSpecContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_locationSpec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1173);
			match(LOCATION);
			setState(1174);
			match(STRING);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QueryContext extends ParserRuleContext {
		public QueryNoWithContext queryNoWith() {
			return getRuleContext(QueryNoWithContext.class,0);
		}
		public CtesContext ctes() {
			return getRuleContext(CtesContext.class,0);
		}
		public QueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_query; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JdScriptQuerySqlListener ) ((JdScriptQuerySqlListener)listener).enterQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JdScriptQuerySqlListener ) ((JdScriptQuerySqlListener)listener).exitQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JdScriptQuerySqlVisitor ) return ((JdScriptQuerySqlVisitor<? extends T>)visitor).visitQuery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QueryContext query() throws RecognitionException {
		QueryContext _localctx = new QueryContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_query);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1177);
			_la = _input.LA(1);
			if (_la==WITH) {
				{
				setState(1176);
				ctes();
				}
			}

			setState(1179);
			queryNoWith();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InsertIntoContext extends ParserRuleContext {
		public TerminalNode INSERT() { return getToken(JdScriptQuerySqlParser.INSERT, 0); }
		public TerminalNode OVERWRITE() { return getToken(JdScriptQuerySqlParser.OVERWRITE, 0); }
		public TerminalNode TABLE() { return getToken(JdScriptQuerySqlParser.TABLE, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public PartitionSpecContext partitionSpec() {
			return getRuleContext(PartitionSpecContext.class,0);
		}
		public TerminalNode IF() { return getToken(JdScriptQuerySqlParser.IF, 0); }
		public TerminalNode NOT() { return getToken(JdScriptQuerySqlParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(JdScriptQuerySqlParser.EXISTS, 0); }
		public TerminalNode INTO() { return getToken(JdScriptQuerySqlParser.INTO, 0); }
		public InsertIntoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insertInto; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JdScriptQuerySqlListener ) ((JdScriptQuerySqlListener)listener).enterInsertInto(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JdScriptQuerySqlListener ) ((JdScriptQuerySqlListener)listener).exitInsertInto(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JdScriptQuerySqlVisitor ) return ((JdScriptQuerySqlVisitor<? extends T>)visitor).visitInsertInto(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InsertIntoContext insertInto() throws RecognitionException {
		InsertIntoContext _localctx = new InsertIntoContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_insertInto);
		int _la;
		try {
			setState(1202);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,129,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1181);
				match(INSERT);
				setState(1182);
				match(OVERWRITE);
				setState(1183);
				match(TABLE);
				setState(1184);
				tableIdentifier();
				setState(1191);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(1185);
					partitionSpec();
					setState(1189);
					_la = _input.LA(1);
					if (_la==IF) {
						{
						setState(1186);
						match(IF);
						setState(1187);
						match(NOT);
						setState(1188);
						match(EXISTS);
						}
					}

					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1193);
				match(INSERT);
				setState(1194);
				match(INTO);
				setState(1196);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,127,_ctx) ) {
				case 1:
					{
					setState(1195);
					match(TABLE);
					}
					break;
				}
				setState(1198);
				tableIdentifier();
				setState(1200);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(1199);
					partitionSpec();
					}
				}

				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PartitionSpecLocationContext extends ParserRuleContext {
		public PartitionSpecContext partitionSpec() {
			return getRuleContext(PartitionSpecContext.class,0);
		}
		public LocationSpecContext locationSpec() {
			return getRuleContext(LocationSpecContext.class,0);
		}
		public PartitionSpecLocationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_partitionSpecLocation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JdScriptQuerySqlListener ) ((JdScriptQuerySqlListener)listener).enterPartitionSpecLocation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JdScriptQuerySqlListener ) ((JdScriptQuerySqlListener)listener).exitPartitionSpecLocation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JdScriptQuerySqlVisitor ) return ((JdScriptQuerySqlVisitor<? extends T>)visitor).visitPartitionSpecLocation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PartitionSpecLocationContext partitionSpecLocation() throws RecognitionException {
		PartitionSpecLocationContext _localctx = new PartitionSpecLocationContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_partitionSpecLocation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1204);
			partitionSpec();
			setState(1206);
			_la = _input.LA(1);
			if (_la==LOCATION) {
				{
				setState(1205);
				locationSpec();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PartitionSpecContext extends ParserRuleContext {
		public TerminalNode PARTITION() { return getToken(JdScriptQuerySqlParser.PARTITION, 0); }
		public List<PartitionValContext> partitionVal() {
			return getRuleContexts(PartitionValContext.class);
		}
		public PartitionValContext partitionVal(int i) {
			return getRuleContext(PartitionValContext.class,i);
		}
		public PartitionSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_partitionSpec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JdScriptQuerySqlListener ) ((JdScriptQuerySqlListener)listener).enterPartitionSpec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JdScriptQuerySqlListener ) ((JdScriptQuerySqlListener)listener).exitPartitionSpec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JdScriptQuerySqlVisitor ) return ((JdScriptQuerySqlVisitor<? extends T>)visitor).visitPartitionSpec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PartitionSpecContext partitionSpec() throws RecognitionException {
		PartitionSpecContext _localctx = new PartitionSpecContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_partitionSpec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1208);
			match(PARTITION);
			setState(1209);
			match(T__6);
			setState(1210);
			partitionVal();
			setState(1215);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__8) {
				{
				{
				setState(1211);
				match(T__8);
				setState(1212);
				partitionVal();
				}
				}
				setState(1217);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1218);
			match(T__7);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PartitionValContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode EQ() { return getToken(JdScriptQuerySqlParser.EQ, 0); }
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public PartitionValContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_partitionVal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JdScriptQuerySqlListener ) ((JdScriptQuerySqlListener)listener).enterPartitionVal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JdScriptQuerySqlListener ) ((JdScriptQuerySqlListener)listener).exitPartitionVal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JdScriptQuerySqlVisitor ) return ((JdScriptQuerySqlVisitor<? extends T>)visitor).visitPartitionVal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PartitionValContext partitionVal() throws RecognitionException {
		PartitionValContext _localctx = new PartitionValContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_partitionVal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1220);
			identifier();
			setState(1223);
			_la = _input.LA(1);
			if (_la==EQ) {
				{
				setState(1221);
				match(EQ);
				setState(1222);
				constant();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DescribeFuncNameContext extends ParserRuleContext {
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode STRING() { return getToken(JdScriptQuerySqlParser.STRING, 0); }
		public ComparisonOperatorContext comparisonOperator() {
			return getRuleContext(ComparisonOperatorContext.class,0);
		}
		public ArithmeticOperatorContext arithmeticOperator() {
			return getRuleContext(ArithmeticOperatorContext.class,0);
		}
		public PredicateOperatorContext predicateOperator() {
			return getRuleContext(PredicateOperatorContext.class,0);
		}
		public DescribeFuncNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_describeFuncName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JdScriptQuerySqlListener ) ((JdScriptQuerySqlListener)listener).enterDescribeFuncName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JdScriptQuerySqlListener ) ((JdScriptQuerySqlListener)listener).exitDescribeFuncName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JdScriptQuerySqlVisitor ) return ((JdScriptQuerySqlVisitor<? extends T>)visitor).visitDescribeFuncName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DescribeFuncNameContext describeFuncName() throws RecognitionException {
		DescribeFuncNameContext _localctx = new DescribeFuncNameContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_describeFuncName);
		try {
			setState(1230);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,133,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1225);
				qualifiedName();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1226);
				match(STRING);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1227);
				comparisonOperator();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1228);
				arithmeticOperator();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1229);
				predicateOperator();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DescribeColNameContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public List<TerminalNode> STRING() { return getTokens(JdScriptQuerySqlParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(JdScriptQuerySqlParser.STRING, i);
		}
		public DescribeColNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_describeColName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JdScriptQuerySqlListener ) ((JdScriptQuerySqlListener)listener).enterDescribeColName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JdScriptQuerySqlListener ) ((JdScriptQuerySqlListener)listener).exitDescribeColName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JdScriptQuerySqlVisitor ) return ((JdScriptQuerySqlVisitor<? extends T>)visitor).visitDescribeColName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DescribeColNameContext describeColName() throws RecognitionException {
		DescribeColNameContext _localctx = new DescribeColNameContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_describeColName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1232);
			identifier();
			setState(1240);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__14) {
				{
				{
				setState(1233);
				match(T__14);
				setState(1236);
				switch (_input.LA(1)) {
				case SELECT:
				case FROM:
				case ADD:
				case AS:
				case ALL:
				case DISTINCT:
				case WHERE:
				case GROUP:
				case BY:
				case GROUPING:
				case SETS:
				case CUBE:
				case ROLLUP:
				case ORDER:
				case HAVING:
				case LIMIT:
				case AT:
				case OR:
				case AND:
				case IN:
				case NOT:
				case NO:
				case EXISTS:
				case BETWEEN:
				case LIKE:
				case RLIKE:
				case IS:
				case NULL:
				case TRUE:
				case FALSE:
				case NULLS:
				case ASC:
				case DESC:
				case FOR:
				case INTERVAL:
				case CASE:
				case WHEN:
				case THEN:
				case ELSE:
				case END:
				case JOIN:
				case CROSS:
				case OUTER:
				case INNER:
				case LEFT:
				case SEMI:
				case RIGHT:
				case FULL:
				case NATURAL:
				case ON:
				case LATERAL:
				case WINDOW:
				case OVER:
				case PARTITION:
				case RANGE:
				case ROWS:
				case UNBOUNDED:
				case PRECEDING:
				case FOLLOWING:
				case CURRENT:
				case ROW:
				case WITH:
				case VALUES:
				case CREATE:
				case TABLE:
				case VIEW:
				case REPLACE:
				case INSERT:
				case DELETE:
				case INTO:
				case DESCRIBE:
				case EXPLAIN:
				case FORMAT:
				case LOGICAL:
				case CODEGEN:
				case CAST:
				case SHOW:
				case TABLES:
				case COLUMNS:
				case COLUMN:
				case USE:
				case PARTITIONS:
				case FUNCTIONS:
				case DROP:
				case UNION:
				case EXCEPT:
				case INTERSECT:
				case TO:
				case TABLESAMPLE:
				case STRATIFY:
				case ALTER:
				case RENAME:
				case ARRAY:
				case MAP:
				case STRUCT:
				case COMMENT:
				case SET:
				case RESET:
				case DATA:
				case START:
				case TRANSACTION:
				case COMMIT:
				case ROLLBACK:
				case MACRO:
				case IF:
				case DIV:
				case PERCENTLIT:
				case BUCKET:
				case OUT:
				case OF:
				case SORT:
				case CLUSTER:
				case DISTRIBUTE:
				case OVERWRITE:
				case TRANSFORM:
				case REDUCE:
				case USING:
				case SERDE:
				case SERDEPROPERTIES:
				case RECORDREADER:
				case RECORDWRITER:
				case DELIMITED:
				case FIELDS:
				case TERMINATED:
				case COLLECTION:
				case ITEMS:
				case KEYS:
				case ESCAPED:
				case LINES:
				case SEPARATED:
				case FUNCTION:
				case EXTENDED:
				case REFRESH:
				case CLEAR:
				case CACHE:
				case UNCACHE:
				case LAZY:
				case FORMATTED:
				case TEMPORARY:
				case OPTIONS:
				case UNSET:
				case TBLPROPERTIES:
				case DBPROPERTIES:
				case BUCKETS:
				case SKEWED:
				case STORED:
				case DIRECTORIES:
				case LOCATION:
				case EXCHANGE:
				case ARCHIVE:
				case UNARCHIVE:
				case FILEFORMAT:
				case TOUCH:
				case COMPACT:
				case CONCATENATE:
				case CHANGE:
				case CASCADE:
				case RESTRICT:
				case CLUSTERED:
				case SORTED:
				case PURGE:
				case INPUTFORMAT:
				case OUTPUTFORMAT:
				case DATABASE:
				case DATABASES:
				case DFS:
				case TRUNCATE:
				case ANALYZE:
				case COMPUTE:
				case LIST:
				case STATISTICS:
				case PARTITIONED:
				case EXTERNAL:
				case DEFINED:
				case REVOKE:
				case GRANT:
				case LOCK:
				case UNLOCK:
				case MSCK:
				case REPAIR:
				case EXPORT:
				case IMPORT:
				case LOAD:
				case ROLE:
				case ROLES:
				case COMPACTIONS:
				case PRINCIPALS:
				case TRANSACTIONS:
				case INDEX:
				case INDEXES:
				case LOCKS:
				case OPTION:
				case ANTI:
				case LOCAL:
				case INPATH:
				case IDENTIFIER:
				case BACKQUOTED_IDENTIFIER:
					{
					setState(1234);
					identifier();
					}
					break;
				case STRING:
					{
					setState(1235);
					match(STRING);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				setState(1242);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CtesContext extends ParserRuleContext {
		public TerminalNode WITH() { return getToken(JdScriptQuerySqlParser.WITH, 0); }
		public List<NamedQueryContext> namedQuery() {
			return getRuleContexts(NamedQueryContext.class);
		}
		public NamedQueryContext namedQuery(int i) {
			return getRuleContext(NamedQueryContext.class,i);
		}
		public CtesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ctes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JdScriptQuerySqlListener ) ((JdScriptQuerySqlListener)listener).enterCtes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JdScriptQuerySqlListener ) ((JdScriptQuerySqlListener)listener).exitCtes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JdScriptQuerySqlVisitor ) return ((JdScriptQuerySqlVisitor<? extends T>)visitor).visitCtes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CtesContext ctes() throws RecognitionException {
		CtesContext _localctx = new CtesContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_ctes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1243);
			match(WITH);
			setState(1244);
			namedQuery();
			setState(1249);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__8) {
				{
				{
				setState(1245);
				match(T__8);
				setState(1246);
				namedQuery();
				}
				}
				setState(1251);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NamedQueryContext extends ParserRuleContext {
		public IdentifierContext name;
		public QueryNoWithContext queryNoWith() {
			return getRuleContext(QueryNoWithContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode AS() { return getToken(JdScriptQuerySqlParser.AS, 0); }
		public NamedQueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namedQuery; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JdScriptQuerySqlListener ) ((JdScriptQuerySqlListener)listener).enterNamedQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JdScriptQuerySqlListener ) ((JdScriptQuerySqlListener)listener).exitNamedQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JdScriptQuerySqlVisitor ) return ((JdScriptQuerySqlVisitor<? extends T>)visitor).visitNamedQuery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NamedQueryContext namedQuery() throws RecognitionException {
		NamedQueryContext _localctx = new NamedQueryContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_namedQuery);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1252);
			((NamedQueryContext)_localctx).name = identifier();
			setState(1254);
			_la = _input.LA(1);
			if (_la==AS) {
				{
				setState(1253);
				match(AS);
				}
			}

			setState(1256);
			match(T__6);
			setState(1257);
			queryNoWith();
			setState(1258);
			match(T__7);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TableProviderContext extends ParserRuleContext {
		public TerminalNode USING() { return getToken(JdScriptQuerySqlParser.USING, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TableProviderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableProvider; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JdScriptQuerySqlListener ) ((JdScriptQuerySqlListener)listener).enterTableProvider(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JdScriptQuerySqlListener ) ((JdScriptQuerySqlListener)listener).exitTableProvider(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JdScriptQuerySqlVisitor ) return ((JdScriptQuerySqlVisitor<? extends T>)visitor).visitTableProvider(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableProviderContext tableProvider() throws RecognitionException {
		TableProviderContext _localctx = new TableProviderContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_tableProvider);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1260);
			match(USING);
			setState(1261);
			qualifiedName();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TablePropertyListContext extends ParserRuleContext {
		public List<TablePropertyContext> tableProperty() {
			return getRuleContexts(TablePropertyContext.class);
		}
		public TablePropertyContext tableProperty(int i) {
			return getRuleContext(TablePropertyContext.class,i);
		}
		public TablePropertyListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tablePropertyList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JdScriptQuerySqlListener ) ((JdScriptQuerySqlListener)listener).enterTablePropertyList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JdScriptQuerySqlListener ) ((JdScriptQuerySqlListener)listener).exitTablePropertyList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JdScriptQuerySqlVisitor ) return ((JdScriptQuerySqlVisitor<? extends T>)visitor).visitTablePropertyList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TablePropertyListContext tablePropertyList() throws RecognitionException {
		TablePropertyListContext _localctx = new TablePropertyListContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_tablePropertyList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1263);
			match(T__6);
			setState(1264);
			tableProperty();
			setState(1269);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__8) {
				{
				{
				setState(1265);
				match(T__8);
				setState(1266);
				tableProperty();
				}
				}
				setState(1271);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1272);
			match(T__7);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TablePropertyContext extends ParserRuleContext {
		public TablePropertyKeyContext key;
		public TablePropertyValueContext value;
		public TablePropertyKeyContext tablePropertyKey() {
			return getRuleContext(TablePropertyKeyContext.class,0);
		}
		public TablePropertyValueContext tablePropertyValue() {
			return getRuleContext(TablePropertyValueContext.class,0);
		}
		public TerminalNode EQ() { return getToken(JdScriptQuerySqlParser.EQ, 0); }
		public TablePropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableProperty; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JdScriptQuerySqlListener ) ((JdScriptQuerySqlListener)listener).enterTableProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JdScriptQuerySqlListener ) ((JdScriptQuerySqlListener)listener).exitTableProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JdScriptQuerySqlVisitor ) return ((JdScriptQuerySqlVisitor<? extends T>)visitor).visitTableProperty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TablePropertyContext tableProperty() throws RecognitionException {
		TablePropertyContext _localctx = new TablePropertyContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_tableProperty);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1274);
			((TablePropertyContext)_localctx).key = tablePropertyKey();
			setState(1279);
			_la = _input.LA(1);
			if (_la==TRUE || _la==FALSE || _la==EQ || ((((_la - 233)) & ~0x3f) == 0 && ((1L << (_la - 233)) & ((1L << (STRING - 233)) | (1L << (INTEGER_VALUE - 233)) | (1L << (DECIMAL_VALUE - 233)))) != 0)) {
				{
				setState(1276);
				_la = _input.LA(1);
				if (_la==EQ) {
					{
					setState(1275);
					match(EQ);
					}
				}

				setState(1278);
				((TablePropertyContext)_localctx).value = tablePropertyValue();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TablePropertyKeyContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public TerminalNode STRING() { return getToken(JdScriptQuerySqlParser.STRING, 0); }
		public TablePropertyKeyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tablePropertyKey; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JdScriptQuerySqlListener ) ((JdScriptQuerySqlListener)listener).enterTablePropertyKey(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JdScriptQuerySqlListener ) ((JdScriptQuerySqlListener)listener).exitTablePropertyKey(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JdScriptQuerySqlVisitor ) return ((JdScriptQuerySqlVisitor<? extends T>)visitor).visitTablePropertyKey(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TablePropertyKeyContext tablePropertyKey() throws RecognitionException {
		TablePropertyKeyContext _localctx = new TablePropertyKeyContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_tablePropertyKey);
		int _la;
		try {
			setState(1290);
			switch (_input.LA(1)) {
			case SELECT:
			case FROM:
			case ADD:
			case AS:
			case ALL:
			case DISTINCT:
			case WHERE:
			case GROUP:
			case BY:
			case GROUPING:
			case SETS:
			case CUBE:
			case ROLLUP:
			case ORDER:
			case HAVING:
			case LIMIT:
			case AT:
			case OR:
			case AND:
			case IN:
			case NOT:
			case NO:
			case EXISTS:
			case BETWEEN:
			case LIKE:
			case RLIKE:
			case IS:
			case NULL:
			case TRUE:
			case FALSE:
			case NULLS:
			case ASC:
			case DESC:
			case FOR:
			case INTERVAL:
			case CASE:
			case WHEN:
			case THEN:
			case ELSE:
			case END:
			case JOIN:
			case CROSS:
			case OUTER:
			case INNER:
			case LEFT:
			case SEMI:
			case RIGHT:
			case FULL:
			case NATURAL:
			case ON:
			case LATERAL:
			case WINDOW:
			case OVER:
			case PARTITION:
			case RANGE:
			case ROWS:
			case UNBOUNDED:
			case PRECEDING:
			case FOLLOWING:
			case CURRENT:
			case ROW:
			case WITH:
			case VALUES:
			case CREATE:
			case TABLE:
			case VIEW:
			case REPLACE:
			case INSERT:
			case DELETE:
			case INTO:
			case DESCRIBE:
			case EXPLAIN:
			case FORMAT:
			case LOGICAL:
			case CODEGEN:
			case CAST:
			case SHOW:
			case TABLES:
			case COLUMNS:
			case COLUMN:
			case USE:
			case PARTITIONS:
			case FUNCTIONS:
			case DROP:
			case UNION:
			case EXCEPT:
			case INTERSECT:
			case TO:
			case TABLESAMPLE:
			case STRATIFY:
			case ALTER:
			case RENAME:
			case ARRAY:
			case MAP:
			case STRUCT:
			case COMMENT:
			case SET:
			case RESET:
			case DATA:
			case START:
			case TRANSACTION:
			case COMMIT:
			case ROLLBACK:
			case MACRO:
			case IF:
			case DIV:
			case PERCENTLIT:
			case BUCKET:
			case OUT:
			case OF:
			case SORT:
			case CLUSTER:
			case DISTRIBUTE:
			case OVERWRITE:
			case TRANSFORM:
			case REDUCE:
			case USING:
			case SERDE:
			case SERDEPROPERTIES:
			case RECORDREADER:
			case RECORDWRITER:
			case DELIMITED:
			case FIELDS:
			case TERMINATED:
			case COLLECTION:
			case ITEMS:
			case KEYS:
			case ESCAPED:
			case LINES:
			case SEPARATED:
			case FUNCTION:
			case EXTENDED:
			case REFRESH:
			case CLEAR:
			case CACHE:
			case UNCACHE:
			case LAZY:
			case FORMATTED:
			case TEMPORARY:
			case OPTIONS:
			case UNSET:
			case TBLPROPERTIES:
			case DBPROPERTIES:
			case BUCKETS:
			case SKEWED:
			case STORED:
			case DIRECTORIES:
			case LOCATION:
			case EXCHANGE:
			case ARCHIVE:
			case UNARCHIVE:
			case FILEFORMAT:
			case TOUCH:
			case COMPACT:
			case CONCATENATE:
			case CHANGE:
			case CASCADE:
			case RESTRICT:
			case CLUSTERED:
			case SORTED:
			case PURGE:
			case INPUTFORMAT:
			case OUTPUTFORMAT:
			case DATABASE:
			case DATABASES:
			case DFS:
			case TRUNCATE:
			case ANALYZE:
			case COMPUTE:
			case LIST:
			case STATISTICS:
			case PARTITIONED:
			case EXTERNAL:
			case DEFINED:
			case REVOKE:
			case GRANT:
			case LOCK:
			case UNLOCK:
			case MSCK:
			case REPAIR:
			case EXPORT:
			case IMPORT:
			case LOAD:
			case ROLE:
			case ROLES:
			case COMPACTIONS:
			case PRINCIPALS:
			case TRANSACTIONS:
			case INDEX:
			case INDEXES:
			case LOCKS:
			case OPTION:
			case ANTI:
			case LOCAL:
			case INPATH:
			case IDENTIFIER:
			case BACKQUOTED_IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(1281);
				identifier();
				setState(1286);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__14) {
					{
					{
					setState(1282);
					match(T__14);
					setState(1283);
					identifier();
					}
					}
					setState(1288);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(1289);
				match(STRING);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TablePropertyValueContext extends ParserRuleContext {
		public TerminalNode INTEGER_VALUE() { return getToken(JdScriptQuerySqlParser.INTEGER_VALUE, 0); }
		public TerminalNode DECIMAL_VALUE() { return getToken(JdScriptQuerySqlParser.DECIMAL_VALUE, 0); }
		public BooleanValueContext booleanValue() {
			return getRuleContext(BooleanValueContext.class,0);
		}
		public TerminalNode STRING() { return getToken(JdScriptQuerySqlParser.STRING, 0); }
		public TablePropertyValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tablePropertyValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JdScriptQuerySqlListener ) ((JdScriptQuerySqlListener)listener).enterTablePropertyValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JdScriptQuerySqlListener ) ((JdScriptQuerySqlListener)listener).exitTablePropertyValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JdScriptQuerySqlVisitor ) return ((JdScriptQuerySqlVisitor<? extends T>)visitor).visitTablePropertyValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TablePropertyValueContext tablePropertyValue() throws RecognitionException {
		TablePropertyValueContext _localctx = new TablePropertyValueContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_tablePropertyValue);
		try {
			setState(1296);
			switch (_input.LA(1)) {
			case INTEGER_VALUE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1292);
				match(INTEGER_VALUE);
				}
				break;
			case DECIMAL_VALUE:
				enterOuterAlt(_localctx, 2);
				{
				setState(1293);
				match(DECIMAL_VALUE);
				}
				break;
			case TRUE:
			case FALSE:
				enterOuterAlt(_localctx, 3);
				{
				setState(1294);
				booleanValue();
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 4);
				{
				setState(1295);
				match(STRING);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstantListContext extends ParserRuleContext {
		public List<ConstantContext> constant() {
			return getRuleContexts(ConstantContext.class);
		}
		public ConstantContext constant(int i) {
			return getRuleContext(ConstantContext.class,i);
		}
		public ConstantListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JdScriptQuerySqlListener ) ((JdScriptQuerySqlListener)listener).enterConstantList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JdScriptQuerySqlListener ) ((JdScriptQuerySqlListener)listener).exitConstantList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JdScriptQuerySqlVisitor ) return ((JdScriptQuerySqlVisitor<? extends T>)visitor).visitConstantList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantListContext constantList() throws RecognitionException {
		ConstantListContext _localctx = new ConstantListContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_constantList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1298);
			match(T__6);
			setState(1299);
			constant();
			setState(1304);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__8) {
				{
				{
				setState(1300);
				match(T__8);
				setState(1301);
				constant();
				}
				}
				setState(1306);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1307);
			match(T__7);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NestedConstantListContext extends ParserRuleContext {
		public List<ConstantListContext> constantList() {
			return getRuleContexts(ConstantListContext.class);
		}
		public ConstantListContext constantList(int i) {
			return getRuleContext(ConstantListContext.class,i);
		}
		public NestedConstantListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nestedConstantList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JdScriptQuerySqlListener ) ((JdScriptQuerySqlListener)listener).enterNestedConstantList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JdScriptQuerySqlListener ) ((JdScriptQuerySqlListener)listener).exitNestedConstantList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JdScriptQuerySqlVisitor ) return ((JdScriptQuerySqlVisitor<? extends T>)visitor).visitNestedConstantList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NestedConstantListContext nestedConstantList() throws RecognitionException {
		NestedConstantListContext _localctx = new NestedConstantListContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_nestedConstantList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1309);
			match(T__6);
			setState(1310);
			constantList();
			setState(1315);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__8) {
				{
				{
				setState(1311);
				match(T__8);
				setState(1312);
				constantList();
				}
				}
				setState(1317);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1318);
			match(T__7);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CreateFileFormatContext extends ParserRuleContext {
		public TerminalNode STORED() { return getToken(JdScriptQuerySqlParser.STORED, 0); }
		public TerminalNode AS() { return getToken(JdScriptQuerySqlParser.AS, 0); }
		public FileFormatContext fileFormat() {
			return getRuleContext(FileFormatContext.class,0);
		}
		public TerminalNode BY() { return getToken(JdScriptQuerySqlParser.BY, 0); }
		public StorageHandlerContext storageHandler() {
			return getRuleContext(StorageHandlerContext.class,0);
		}
		public CreateFileFormatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createFileFormat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JdScriptQuerySqlListener ) ((JdScriptQuerySqlListener)listener).enterCreateFileFormat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JdScriptQuerySqlListener ) ((JdScriptQuerySqlListener)listener).exitCreateFileFormat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JdScriptQuerySqlVisitor ) return ((JdScriptQuerySqlVisitor<? extends T>)visitor).visitCreateFileFormat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreateFileFormatContext createFileFormat() throws RecognitionException {
		CreateFileFormatContext _localctx = new CreateFileFormatContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_createFileFormat);
		try {
			setState(1326);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,146,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1320);
				match(STORED);
				setState(1321);
				match(AS);
				setState(1322);
				fileFormat();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1323);
				match(STORED);
				setState(1324);
				match(BY);
				setState(1325);
				storageHandler();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FileFormatContext extends ParserRuleContext {
		public FileFormatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fileFormat; }
	 
		public FileFormatContext() { }
		public void copyFrom(FileFormatContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class TableFileFormatContext extends FileFormatContext {
		public Token inFmt;
		public Token outFmt;
		public TerminalNode INPUTFORMAT() { return getToken(JdScriptQuerySqlParser.INPUTFORMAT, 0); }
		public TerminalNode OUTPUTFORMAT() { return getToken(JdScriptQuerySqlParser.OUTPUTFORMAT, 0); }
		public List<TerminalNode> STRING() { return getTokens(JdScriptQuerySqlParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(JdScriptQuerySqlParser.STRING, i);
		}
		public TableFileFormatContext(FileFormatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JdScriptQuerySqlListener ) ((JdScriptQuerySqlListener)listener).enterTableFileFormat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JdScriptQuerySqlListener ) ((JdScriptQuerySqlListener)listener).exitTableFileFormat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JdScriptQuerySqlVisitor ) return ((JdScriptQuerySqlVisitor<? extends T>)visitor).visitTableFileFormat(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class GenericFileFormatContext extends FileFormatContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public GenericFileFormatContext(FileFormatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JdScriptQuerySqlListener ) ((JdScriptQuerySqlListener)listener).enterGenericFileFormat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JdScriptQuerySqlListener ) ((JdScriptQuerySqlListener)listener).exitGenericFileFormat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JdScriptQuerySqlVisitor ) return ((JdScriptQuerySqlVisitor<? extends T>)visitor).visitGenericFileFormat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FileFormatContext fileFormat() throws RecognitionException {
		FileFormatContext _localctx = new FileFormatContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_fileFormat);
		try {
			setState(1333);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,147,_ctx) ) {
			case 1:
				_localctx = new TableFileFormatContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1328);
				match(INPUTFORMAT);
				setState(1329);
				((TableFileFormatContext)_localctx).inFmt = match(STRING);
				setState(1330);
				match(OUTPUTFORMAT);
				setState(1331);
				((TableFileFormatContext)_localctx).outFmt = match(STRING);
				}
				break;
			case 2:
				_localctx = new GenericFileFormatContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1332);
				identifier();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StorageHandlerContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(JdScriptQuerySqlParser.STRING, 0); }
		public TerminalNode WITH() { return getToken(JdScriptQuerySqlParser.WITH, 0); }
		public TerminalNode SERDEPROPERTIES() { return getToken(JdScriptQuerySqlParser.SERDEPROPERTIES, 0); }
		public TablePropertyListContext tablePropertyList() {
			return getRuleContext(TablePropertyListContext.class,0);
		}
		public StorageHandlerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_storageHandler; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JdScriptQuerySqlListener ) ((JdScriptQuerySqlListener)listener).enterStorageHandler(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JdScriptQuerySqlListener ) ((JdScriptQuerySqlListener)listener).exitStorageHandler(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JdScriptQuerySqlVisitor ) return ((JdScriptQuerySqlVisitor<? extends T>)visitor).visitStorageHandler(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StorageHandlerContext storageHandler() throws RecognitionException {
		StorageHandlerContext _localctx = new StorageHandlerContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_storageHandler);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1335);
			match(STRING);
			setState(1339);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,148,_ctx) ) {
			case 1:
				{
				setState(1336);
				match(WITH);
				setState(1337);
				match(SERDEPROPERTIES);
				setState(1338);
				tablePropertyList();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ResourceContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode STRING() { return getToken(JdScriptQuerySqlParser.STRING, 0); }
		public ResourceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_resource; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JdScriptQuerySqlListener ) ((JdScriptQuerySqlListener)listener).enterResource(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JdScriptQuerySqlListener ) ((JdScriptQuerySqlListener)listener).exitResource(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JdScriptQuerySqlVisitor ) return ((JdScriptQuerySqlVisitor<? extends T>)visitor).visitResource(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ResourceContext resource() throws RecognitionException {
		ResourceContext _localctx = new ResourceContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_resource);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1341);
			identifier();
			setState(1342);
			match(STRING);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QueryNoWithContext extends ParserRuleContext {
		public QueryNoWithContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_queryNoWith; }
	 
		public QueryNoWithContext() { }
		public void copyFrom(QueryNoWithContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SingleInsertQueryContext extends QueryNoWithContext {
		public QueryTermContext queryTerm() {
			return getRuleContext(QueryTermContext.class,0);
		}
		public QueryOrganizationContext queryOrganization() {
			return getRuleContext(QueryOrganizationContext.class,0);
		}
		public InsertIntoContext insertInto() {
			return getRuleContext(InsertIntoContext.class,0);
		}
		public SingleInsertQueryContext(QueryNoWithContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JdScriptQuerySqlListener ) ((JdScriptQuerySqlListener)listener).enterSingleInsertQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JdScriptQuerySqlListener ) ((JdScriptQuerySqlListener)listener).exitSingleInsertQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JdScriptQuerySqlVisitor ) return ((JdScriptQuerySqlVisitor<? extends T>)visitor).visitSingleInsertQuery(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MultiInsertQueryContext extends QueryNoWithContext {
		public FromClauseContext fromClause() {
			return getRuleContext(FromClauseContext.class,0);
		}
		public List<MultiInsertQueryBodyContext> multiInsertQueryBody() {
			return getRuleContexts(MultiInsertQueryBodyContext.class);
		}
		public MultiInsertQueryBodyContext multiInsertQueryBody(int i) {
			return getRuleContext(MultiInsertQueryBodyContext.class,i);
		}
		public MultiInsertQueryContext(QueryNoWithContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JdScriptQuerySqlListener ) ((JdScriptQuerySqlListener)listener).enterMultiInsertQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JdScriptQuerySqlListener ) ((JdScriptQuerySqlListener)listener).exitMultiInsertQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JdScriptQuerySqlVisitor ) return ((JdScriptQuerySqlVisitor<? extends T>)visitor).visitMultiInsertQuery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QueryNoWithContext queryNoWith() throws RecognitionException {
		QueryNoWithContext _localctx = new QueryNoWithContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_queryNoWith);
		int _la;
		try {
			setState(1356);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,151,_ctx) ) {
			case 1:
				_localctx = new SingleInsertQueryContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1345);
				_la = _input.LA(1);
				if (_la==INSERT) {
					{
					setState(1344);
					insertInto();
					}
				}

				setState(1347);
				queryTerm(0);
				setState(1348);
				queryOrganization();
				}
				break;
			case 2:
				_localctx = new MultiInsertQueryContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1350);
				fromClause();
				setState(1352); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1351);
					multiInsertQueryBody();
					}
					}
					setState(1354); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==SELECT || _la==FROM || _la==INSERT || _la==MAP || _la==REDUCE );
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QueryOrganizationContext extends ParserRuleContext {
		public SortItemContext sortItem;
		public List<SortItemContext> order = new ArrayList<SortItemContext>();
		public ExpressionContext expression;
		public List<ExpressionContext> clusterBy = new ArrayList<ExpressionContext>();
		public List<ExpressionContext> distributeBy = new ArrayList<ExpressionContext>();
		public List<SortItemContext> sort = new ArrayList<SortItemContext>();
		public ExpressionContext limit;
		public TerminalNode ORDER() { return getToken(JdScriptQuerySqlParser.ORDER, 0); }
		public List<TerminalNode> BY() { return getTokens(JdScriptQuerySqlParser.BY); }
		public TerminalNode BY(int i) {
			return getToken(JdScriptQuerySqlParser.BY, i);
		}
		public TerminalNode CLUSTER() { return getToken(JdScriptQuerySqlParser.CLUSTER, 0); }
		public TerminalNode DISTRIBUTE() { return getToken(JdScriptQuerySqlParser.DISTRIBUTE, 0); }
		public TerminalNode SORT() { return getToken(JdScriptQuerySqlParser.SORT, 0); }
		public WindowsContext windows() {
			return getRuleContext(WindowsContext.class,0);
		}
		public TerminalNode LIMIT() { return getToken(JdScriptQuerySqlParser.LIMIT, 0); }
		public List<SortItemContext> sortItem() {
			return getRuleContexts(SortItemContext.class);
		}
		public SortItemContext sortItem(int i) {
			return getRuleContext(SortItemContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public QueryOrganizationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_queryOrganization; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JdScriptQuerySqlListener ) ((JdScriptQuerySqlListener)listener).enterQueryOrganization(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JdScriptQuerySqlListener ) ((JdScriptQuerySqlListener)listener).exitQueryOrganization(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JdScriptQuerySqlVisitor ) return ((JdScriptQuerySqlVisitor<? extends T>)visitor).visitQueryOrganization(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QueryOrganizationContext queryOrganization() throws RecognitionException {
		QueryOrganizationContext _localctx = new QueryOrganizationContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_queryOrganization);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1368);
			_la = _input.LA(1);
			if (_la==ORDER) {
				{
				setState(1358);
				match(ORDER);
				setState(1359);
				match(BY);
				setState(1360);
				((QueryOrganizationContext)_localctx).sortItem = sortItem();
				((QueryOrganizationContext)_localctx).order.add(((QueryOrganizationContext)_localctx).sortItem);
				setState(1365);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__8) {
					{
					{
					setState(1361);
					match(T__8);
					setState(1362);
					((QueryOrganizationContext)_localctx).sortItem = sortItem();
					((QueryOrganizationContext)_localctx).order.add(((QueryOrganizationContext)_localctx).sortItem);
					}
					}
					setState(1367);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(1380);
			_la = _input.LA(1);
			if (_la==CLUSTER) {
				{
				setState(1370);
				match(CLUSTER);
				setState(1371);
				match(BY);
				setState(1372);
				((QueryOrganizationContext)_localctx).expression = expression();
				((QueryOrganizationContext)_localctx).clusterBy.add(((QueryOrganizationContext)_localctx).expression);
				setState(1377);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__8) {
					{
					{
					setState(1373);
					match(T__8);
					setState(1374);
					((QueryOrganizationContext)_localctx).expression = expression();
					((QueryOrganizationContext)_localctx).clusterBy.add(((QueryOrganizationContext)_localctx).expression);
					}
					}
					setState(1379);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(1392);
			_la = _input.LA(1);
			if (_la==DISTRIBUTE) {
				{
				setState(1382);
				match(DISTRIBUTE);
				setState(1383);
				match(BY);
				setState(1384);
				((QueryOrganizationContext)_localctx).expression = expression();
				((QueryOrganizationContext)_localctx).distributeBy.add(((QueryOrganizationContext)_localctx).expression);
				setState(1389);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__8) {
					{
					{
					setState(1385);
					match(T__8);
					setState(1386);
					((QueryOrganizationContext)_localctx).expression = expression();
					((QueryOrganizationContext)_localctx).distributeBy.add(((QueryOrganizationContext)_localctx).expression);
					}
					}
					setState(1391);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(1404);
			_la = _input.LA(1);
			if (_la==SORT) {
				{
				setState(1394);
				match(SORT);
				setState(1395);
				match(BY);
				setState(1396);
				((QueryOrganizationContext)_localctx).sortItem = sortItem();
				((QueryOrganizationContext)_localctx).sort.add(((QueryOrganizationContext)_localctx).sortItem);
				setState(1401);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__8) {
					{
					{
					setState(1397);
					match(T__8);
					setState(1398);
					((QueryOrganizationContext)_localctx).sortItem = sortItem();
					((QueryOrganizationContext)_localctx).sort.add(((QueryOrganizationContext)_localctx).sortItem);
					}
					}
					setState(1403);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(1407);
			_la = _input.LA(1);
			if (_la==WINDOW) {
				{
				setState(1406);
				windows();
				}
			}

			setState(1411);
			_la = _input.LA(1);
			if (_la==LIMIT) {
				{
				setState(1409);
				match(LIMIT);
				setState(1410);
				((QueryOrganizationContext)_localctx).limit = expression();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MultiInsertQueryBodyContext extends ParserRuleContext {
		public QuerySpecificationContext querySpecification() {
			return getRuleContext(QuerySpecificationContext.class,0);
		}
		public QueryOrganizationContext queryOrganization() {
			return getRuleContext(QueryOrganizationContext.class,0);
		}
		public InsertIntoContext insertInto() {
			return getRuleContext(InsertIntoContext.class,0);
		}
		public MultiInsertQueryBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiInsertQueryBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JdScriptQuerySqlListener ) ((JdScriptQuerySqlListener)listener).enterMultiInsertQueryBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JdScriptQuerySqlListener ) ((JdScriptQuerySqlListener)listener).exitMultiInsertQueryBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JdScriptQuerySqlVisitor ) return ((JdScriptQuerySqlVisitor<? extends T>)visitor).visitMultiInsertQueryBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultiInsertQueryBodyContext multiInsertQueryBody() throws RecognitionException {
		MultiInsertQueryBodyContext _localctx = new MultiInsertQueryBodyContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_multiInsertQueryBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1414);
			_la = _input.LA(1);
			if (_la==INSERT) {
				{
				setState(1413);
				insertInto();
				}
			}

			setState(1416);
			querySpecification();
			setState(1417);
			queryOrganization();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QueryTermContext extends ParserRuleContext {
		public QueryTermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_queryTerm; }
	 
		public QueryTermContext() { }
		public void copyFrom(QueryTermContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class QueryTermDefaultContext extends QueryTermContext {
		public QueryPrimaryContext queryPrimary() {
			return getRuleContext(QueryPrimaryContext.class,0);
		}
		public QueryTermDefaultContext(QueryTermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JdScriptQuerySqlListener ) ((JdScriptQuerySqlListener)listener).enterQueryTermDefault(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JdScriptQuerySqlListener ) ((JdScriptQuerySqlListener)listener).exitQueryTermDefault(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JdScriptQuerySqlVisitor ) return ((JdScriptQuerySqlVisitor<? extends T>)visitor).visitQueryTermDefault(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SetOperationContext extends QueryTermContext {
		public QueryTermContext left;
		public Token operator;
		public QueryTermContext right;
		public List<QueryTermContext> queryTerm() {
			return getRuleContexts(QueryTermContext.class);
		}
		public QueryTermContext queryTerm(int i) {
			return getRuleContext(QueryTermContext.class,i);
		}
		public TerminalNode INTERSECT() { return getToken(JdScriptQuerySqlParser.INTERSECT, 0); }
		public TerminalNode UNION() { return getToken(JdScriptQuerySqlParser.UNION, 0); }
		public TerminalNode EXCEPT() { return getToken(JdScriptQuerySqlParser.EXCEPT, 0); }
		public SetQuantifierContext setQuantifier() {
			return getRuleContext(SetQuantifierContext.class,0);
		}
		public SetOperationContext(QueryTermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JdScriptQuerySqlListener ) ((JdScriptQuerySqlListener)listener).enterSetOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JdScriptQuerySqlListener ) ((JdScriptQuerySqlListener)listener).exitSetOperation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JdScriptQuerySqlVisitor ) return ((JdScriptQuerySqlVisitor<? extends T>)visitor).visitSetOperation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QueryTermContext queryTerm() throws RecognitionException {
		return queryTerm(0);
	}

	private QueryTermContext queryTerm(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		QueryTermContext _localctx = new QueryTermContext(_ctx, _parentState);
		QueryTermContext _prevctx = _localctx;
		int _startState = 108;
		enterRecursionRule(_localctx, 108, RULE_queryTerm, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new QueryTermDefaultContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(1420);
			queryPrimary();
			}
			_ctx.stop = _input.LT(-1);
			setState(1430);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,164,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new SetOperationContext(new QueryTermContext(_parentctx, _parentState));
					((SetOperationContext)_localctx).left = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_queryTerm);
					setState(1422);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1423);
					((SetOperationContext)_localctx).operator = _input.LT(1);
					_la = _input.LA(1);
					if ( !(((((_la - 105)) & ~0x3f) == 0 && ((1L << (_la - 105)) & ((1L << (UNION - 105)) | (1L << (EXCEPT - 105)) | (1L << (INTERSECT - 105)))) != 0)) ) {
						((SetOperationContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
					} else {
						consume();
					}
					setState(1425);
					_la = _input.LA(1);
					if (_la==ALL || _la==DISTINCT) {
						{
						setState(1424);
						setQuantifier();
						}
					}

					setState(1427);
					((SetOperationContext)_localctx).right = queryTerm(2);
					}
					} 
				}
				setState(1432);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,164,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class QueryPrimaryContext extends ParserRuleContext {
		public QueryPrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_queryPrimary; }
	 
		public QueryPrimaryContext() { }
		public void copyFrom(QueryPrimaryContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SubqueryContext extends QueryPrimaryContext {
		public QueryNoWithContext queryNoWith() {
			return getRuleContext(QueryNoWithContext.class,0);
		}
		public SubqueryContext(QueryPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JdScriptQuerySqlListener ) ((JdScriptQuerySqlListener)listener).enterSubquery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JdScriptQuerySqlListener ) ((JdScriptQuerySqlListener)listener).exitSubquery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JdScriptQuerySqlVisitor ) return ((JdScriptQuerySqlVisitor<? extends T>)visitor).visitSubquery(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class QueryPrimaryDefaultContext extends QueryPrimaryContext {
		public QuerySpecificationContext querySpecification() {
			return getRuleContext(QuerySpecificationContext.class,0);
		}
		public QueryPrimaryDefaultContext(QueryPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JdScriptQuerySqlListener ) ((JdScriptQuerySqlListener)listener).enterQueryPrimaryDefault(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JdScriptQuerySqlListener ) ((JdScriptQuerySqlListener)listener).exitQueryPrimaryDefault(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JdScriptQuerySqlVisitor ) return ((JdScriptQuerySqlVisitor<? extends T>)visitor).visitQueryPrimaryDefault(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class InlineTableDefault1Context extends QueryPrimaryContext {
		public InlineTableContext inlineTable() {
			return getRuleContext(InlineTableContext.class,0);
		}
		public InlineTableDefault1Context(QueryPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JdScriptQuerySqlListener ) ((JdScriptQuerySqlListener)listener).enterInlineTableDefault1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JdScriptQuerySqlListener ) ((JdScriptQuerySqlListener)listener).exitInlineTableDefault1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JdScriptQuerySqlVisitor ) return ((JdScriptQuerySqlVisitor<? extends T>)visitor).visitInlineTableDefault1(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TableContext extends QueryPrimaryContext {
		public TerminalNode TABLE() { return getToken(JdScriptQuerySqlParser.TABLE, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TableContext(QueryPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JdScriptQuerySqlListener ) ((JdScriptQuerySqlListener)listener).enterTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JdScriptQuerySqlListener ) ((JdScriptQuerySqlListener)listener).exitTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JdScriptQuerySqlVisitor ) return ((JdScriptQuerySqlVisitor<? extends T>)visitor).visitTable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QueryPrimaryContext queryPrimary() throws RecognitionException {
		QueryPrimaryContext _localctx = new QueryPrimaryContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_queryPrimary);
		try {
			setState(1441);
			switch (_input.LA(1)) {
			case SELECT:
			case FROM:
			case MAP:
			case REDUCE:
				_localctx = new QueryPrimaryDefaultContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1433);
				querySpecification();
				}
				break;
			case TABLE:
				_localctx = new TableContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1434);
				match(TABLE);
				setState(1435);
				tableIdentifier();
				}
				break;
			case VALUES:
				_localctx = new InlineTableDefault1Context(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1436);
				inlineTable();
				}
				break;
			case T__6:
				_localctx = new SubqueryContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1437);
				match(T__6);
				setState(1438);
				queryNoWith();
				setState(1439);
				match(T__7);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SortItemContext extends ParserRuleContext {
		public Token ordering;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode ASC() { return getToken(JdScriptQuerySqlParser.ASC, 0); }
		public TerminalNode DESC() { return getToken(JdScriptQuerySqlParser.DESC, 0); }
		public SortItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sortItem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JdScriptQuerySqlListener ) ((JdScriptQuerySqlListener)listener).enterSortItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JdScriptQuerySqlListener ) ((JdScriptQuerySqlListener)listener).exitSortItem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JdScriptQuerySqlVisitor ) return ((JdScriptQuerySqlVisitor<? extends T>)visitor).visitSortItem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SortItemContext sortItem() throws RecognitionException {
		SortItemContext _localctx = new SortItemContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_sortItem);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1443);
			expression();
			setState(1445);
			_la = _input.LA(1);
			if (_la==ASC || _la==DESC) {
				{
				setState(1444);
				((SortItemContext)_localctx).ordering = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==ASC || _la==DESC) ) {
					((SortItemContext)_localctx).ordering = (Token)_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QuerySpecificationContext extends ParserRuleContext {
		public Token kind;
		public RowFormatContext inRowFormat;
		public Token recordWriter;
		public Token script;
		public RowFormatContext outRowFormat;
		public Token recordReader;
		public BooleanExpressionContext where;
		public BooleanExpressionContext having;
		public TerminalNode USING() { return getToken(JdScriptQuerySqlParser.USING, 0); }
		public List<TerminalNode> STRING() { return getTokens(JdScriptQuerySqlParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(JdScriptQuerySqlParser.STRING, i);
		}
		public TerminalNode RECORDWRITER() { return getToken(JdScriptQuerySqlParser.RECORDWRITER, 0); }
		public TerminalNode AS() { return getToken(JdScriptQuerySqlParser.AS, 0); }
		public TerminalNode RECORDREADER() { return getToken(JdScriptQuerySqlParser.RECORDREADER, 0); }
		public FromClauseContext fromClause() {
			return getRuleContext(FromClauseContext.class,0);
		}
		public TerminalNode WHERE() { return getToken(JdScriptQuerySqlParser.WHERE, 0); }
		public TerminalNode SELECT() { return getToken(JdScriptQuerySqlParser.SELECT, 0); }
		public NamedExpressionSeqContext namedExpressionSeq() {
			return getRuleContext(NamedExpressionSeqContext.class,0);
		}
		public List<RowFormatContext> rowFormat() {
			return getRuleContexts(RowFormatContext.class);
		}
		public RowFormatContext rowFormat(int i) {
			return getRuleContext(RowFormatContext.class,i);
		}
		public List<BooleanExpressionContext> booleanExpression() {
			return getRuleContexts(BooleanExpressionContext.class);
		}
		public BooleanExpressionContext booleanExpression(int i) {
			return getRuleContext(BooleanExpressionContext.class,i);
		}
		public TerminalNode TRANSFORM() { return getToken(JdScriptQuerySqlParser.TRANSFORM, 0); }
		public TerminalNode MAP() { return getToken(JdScriptQuerySqlParser.MAP, 0); }
		public TerminalNode REDUCE() { return getToken(JdScriptQuerySqlParser.REDUCE, 0); }
		public IdentifierSeqContext identifierSeq() {
			return getRuleContext(IdentifierSeqContext.class,0);
		}
		public ColTypeListContext colTypeList() {
			return getRuleContext(ColTypeListContext.class,0);
		}
		public List<LateralViewContext> lateralView() {
			return getRuleContexts(LateralViewContext.class);
		}
		public LateralViewContext lateralView(int i) {
			return getRuleContext(LateralViewContext.class,i);
		}
		public AggregationContext aggregation() {
			return getRuleContext(AggregationContext.class,0);
		}
		public TerminalNode HAVING() { return getToken(JdScriptQuerySqlParser.HAVING, 0); }
		public WindowsContext windows() {
			return getRuleContext(WindowsContext.class,0);
		}
		public SetQuantifierContext setQuantifier() {
			return getRuleContext(SetQuantifierContext.class,0);
		}
		public QuerySpecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_querySpecification; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JdScriptQuerySqlListener ) ((JdScriptQuerySqlListener)listener).enterQuerySpecification(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JdScriptQuerySqlListener ) ((JdScriptQuerySqlListener)listener).exitQuerySpecification(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JdScriptQuerySqlVisitor ) return ((JdScriptQuerySqlVisitor<? extends T>)visitor).visitQuerySpecification(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QuerySpecificationContext querySpecification() throws RecognitionException {
		QuerySpecificationContext _localctx = new QuerySpecificationContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_querySpecification);
		int _la;
		try {
			int _alt;
			setState(1534);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,187,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				{
				setState(1457);
				switch (_input.LA(1)) {
				case SELECT:
					{
					setState(1447);
					match(SELECT);
					setState(1448);
					((QuerySpecificationContext)_localctx).kind = match(TRANSFORM);
					setState(1449);
					match(T__6);
					setState(1450);
					namedExpressionSeq();
					setState(1451);
					match(T__7);
					}
					break;
				case MAP:
					{
					setState(1453);
					((QuerySpecificationContext)_localctx).kind = match(MAP);
					setState(1454);
					namedExpressionSeq();
					}
					break;
				case REDUCE:
					{
					setState(1455);
					((QuerySpecificationContext)_localctx).kind = match(REDUCE);
					setState(1456);
					namedExpressionSeq();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(1460);
				_la = _input.LA(1);
				if (_la==ROW) {
					{
					setState(1459);
					((QuerySpecificationContext)_localctx).inRowFormat = rowFormat();
					}
				}

				setState(1464);
				_la = _input.LA(1);
				if (_la==RECORDWRITER) {
					{
					setState(1462);
					match(RECORDWRITER);
					setState(1463);
					((QuerySpecificationContext)_localctx).recordWriter = match(STRING);
					}
				}

				setState(1466);
				match(USING);
				setState(1467);
				((QuerySpecificationContext)_localctx).script = match(STRING);
				setState(1480);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,172,_ctx) ) {
				case 1:
					{
					setState(1468);
					match(AS);
					setState(1478);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,171,_ctx) ) {
					case 1:
						{
						setState(1469);
						identifierSeq();
						}
						break;
					case 2:
						{
						setState(1470);
						colTypeList();
						}
						break;
					case 3:
						{
						{
						setState(1471);
						match(T__6);
						setState(1474);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,170,_ctx) ) {
						case 1:
							{
							setState(1472);
							identifierSeq();
							}
							break;
						case 2:
							{
							setState(1473);
							colTypeList();
							}
							break;
						}
						setState(1476);
						match(T__7);
						}
						}
						break;
					}
					}
					break;
				}
				setState(1483);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,173,_ctx) ) {
				case 1:
					{
					setState(1482);
					((QuerySpecificationContext)_localctx).outRowFormat = rowFormat();
					}
					break;
				}
				setState(1487);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,174,_ctx) ) {
				case 1:
					{
					setState(1485);
					match(RECORDREADER);
					setState(1486);
					((QuerySpecificationContext)_localctx).recordReader = match(STRING);
					}
					break;
				}
				setState(1490);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,175,_ctx) ) {
				case 1:
					{
					setState(1489);
					fromClause();
					}
					break;
				}
				setState(1494);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,176,_ctx) ) {
				case 1:
					{
					setState(1492);
					match(WHERE);
					setState(1493);
					((QuerySpecificationContext)_localctx).where = booleanExpression(0);
					}
					break;
				}
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(1512);
				switch (_input.LA(1)) {
				case SELECT:
					{
					setState(1496);
					((QuerySpecificationContext)_localctx).kind = match(SELECT);
					setState(1498);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,177,_ctx) ) {
					case 1:
						{
						setState(1497);
						setQuantifier();
						}
						break;
					}
					setState(1500);
					namedExpressionSeq();
					setState(1502);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,178,_ctx) ) {
					case 1:
						{
						setState(1501);
						fromClause();
						}
						break;
					}
					}
					break;
				case FROM:
					{
					setState(1504);
					fromClause();
					setState(1510);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,180,_ctx) ) {
					case 1:
						{
						setState(1505);
						((QuerySpecificationContext)_localctx).kind = match(SELECT);
						setState(1507);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,179,_ctx) ) {
						case 1:
							{
							setState(1506);
							setQuantifier();
							}
							break;
						}
						setState(1509);
						namedExpressionSeq();
						}
						break;
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1517);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,182,_ctx);
				while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1514);
						lateralView();
						}
						} 
					}
					setState(1519);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,182,_ctx);
				}
				setState(1522);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,183,_ctx) ) {
				case 1:
					{
					setState(1520);
					match(WHERE);
					setState(1521);
					((QuerySpecificationContext)_localctx).where = booleanExpression(0);
					}
					break;
				}
				setState(1525);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,184,_ctx) ) {
				case 1:
					{
					setState(1524);
					aggregation();
					}
					break;
				}
				setState(1529);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,185,_ctx) ) {
				case 1:
					{
					setState(1527);
					match(HAVING);
					setState(1528);
					((QuerySpecificationContext)_localctx).having = booleanExpression(0);
					}
					break;
				}
				setState(1532);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,186,_ctx) ) {
				case 1:
					{
					setState(1531);
					windows();
					}
					break;
				}
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FromClauseContext extends ParserRuleContext {
		public TerminalNode FROM() { return getToken(JdScriptQuerySqlParser.FROM, 0); }
		public List<RelationContext> relation() {
			return getRuleContexts(RelationContext.class);
		}
		public RelationContext relation(int i) {
			return getRuleContext(RelationContext.class,i);
		}
		public List<LateralViewContext> lateralView() {
			return getRuleContexts(LateralViewContext.class);
		}
		public LateralViewContext lateralView(int i) {
			return getRuleContext(LateralViewContext.class,i);
		}
		public FromClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fromClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JdScriptQuerySqlListener ) ((JdScriptQuerySqlListener)listener).enterFromClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JdScriptQuerySqlListener ) ((JdScriptQuerySqlListener)listener).exitFromClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JdScriptQuerySqlVisitor ) return ((JdScriptQuerySqlVisitor<? extends T>)visitor).visitFromClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FromClauseContext fromClause() throws RecognitionException {
		FromClauseContext _localctx = new FromClauseContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_fromClause);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1536);
			match(FROM);
			setState(1537);
			relation(0);
			setState(1542);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,188,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1538);
					match(T__8);
					setState(1539);
					relation(0);
					}
					} 
				}
				setState(1544);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,188,_ctx);
			}
			setState(1548);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,189,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1545);
					lateralView();
					}
					} 
				}
				setState(1550);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,189,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AggregationContext extends ParserRuleContext {
		public ExpressionContext expression;
		public List<ExpressionContext> groupingExpressions = new ArrayList<ExpressionContext>();
		public Token kind;
		public TerminalNode GROUP() { return getToken(JdScriptQuerySqlParser.GROUP, 0); }
		public TerminalNode BY() { return getToken(JdScriptQuerySqlParser.BY, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode WITH() { return getToken(JdScriptQuerySqlParser.WITH, 0); }
		public TerminalNode SETS() { return getToken(JdScriptQuerySqlParser.SETS, 0); }
		public List<GroupingSetContext> groupingSet() {
			return getRuleContexts(GroupingSetContext.class);
		}
		public GroupingSetContext groupingSet(int i) {
			return getRuleContext(GroupingSetContext.class,i);
		}
		public TerminalNode ROLLUP() { return getToken(JdScriptQuerySqlParser.ROLLUP, 0); }
		public TerminalNode CUBE() { return getToken(JdScriptQuerySqlParser.CUBE, 0); }
		public TerminalNode GROUPING() { return getToken(JdScriptQuerySqlParser.GROUPING, 0); }
		public AggregationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aggregation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JdScriptQuerySqlListener ) ((JdScriptQuerySqlListener)listener).enterAggregation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JdScriptQuerySqlListener ) ((JdScriptQuerySqlListener)listener).exitAggregation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JdScriptQuerySqlVisitor ) return ((JdScriptQuerySqlVisitor<? extends T>)visitor).visitAggregation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AggregationContext aggregation() throws RecognitionException {
		AggregationContext _localctx = new AggregationContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_aggregation);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1551);
			match(GROUP);
			setState(1552);
			match(BY);
			setState(1553);
			((AggregationContext)_localctx).expression = expression();
			((AggregationContext)_localctx).groupingExpressions.add(((AggregationContext)_localctx).expression);
			setState(1558);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,190,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1554);
					match(T__8);
					setState(1555);
					((AggregationContext)_localctx).expression = expression();
					((AggregationContext)_localctx).groupingExpressions.add(((AggregationContext)_localctx).expression);
					}
					} 
				}
				setState(1560);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,190,_ctx);
			}
			setState(1578);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,192,_ctx) ) {
			case 1:
				{
				setState(1561);
				match(WITH);
				setState(1562);
				((AggregationContext)_localctx).kind = match(ROLLUP);
				}
				break;
			case 2:
				{
				setState(1563);
				match(WITH);
				setState(1564);
				((AggregationContext)_localctx).kind = match(CUBE);
				}
				break;
			case 3:
				{
				setState(1565);
				((AggregationContext)_localctx).kind = match(GROUPING);
				setState(1566);
				match(SETS);
				setState(1567);
				match(T__6);
				setState(1568);
				groupingSet();
				setState(1573);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__8) {
					{
					{
					setState(1569);
					match(T__8);
					setState(1570);
					groupingSet();
					}
					}
					setState(1575);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1576);
				match(T__7);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GroupingSetContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public GroupingSetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_groupingSet; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JdScriptQuerySqlListener ) ((JdScriptQuerySqlListener)listener).enterGroupingSet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JdScriptQuerySqlListener ) ((JdScriptQuerySqlListener)listener).exitGroupingSet(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JdScriptQuerySqlVisitor ) return ((JdScriptQuerySqlVisitor<? extends T>)visitor).visitGroupingSet(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GroupingSetContext groupingSet() throws RecognitionException {
		GroupingSetContext _localctx = new GroupingSetContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_groupingSet);
		int _la;
		try {
			setState(1593);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,195,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1580);
				match(T__6);
				setState(1589);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << SELECT) | (1L << FROM) | (1L << ADD) | (1L << AS) | (1L << ALL) | (1L << DISTINCT) | (1L << WHERE) | (1L << GROUP) | (1L << BY) | (1L << GROUPING) | (1L << SETS) | (1L << CUBE) | (1L << ROLLUP) | (1L << ORDER) | (1L << HAVING) | (1L << LIMIT) | (1L << AT) | (1L << OR) | (1L << AND) | (1L << IN) | (1L << NOT) | (1L << NO) | (1L << EXISTS) | (1L << BETWEEN) | (1L << LIKE) | (1L << RLIKE) | (1L << IS) | (1L << NULL) | (1L << TRUE) | (1L << FALSE) | (1L << NULLS) | (1L << ASC) | (1L << DESC) | (1L << FOR) | (1L << INTERVAL) | (1L << CASE) | (1L << WHEN) | (1L << THEN) | (1L << ELSE) | (1L << END) | (1L << JOIN) | (1L << CROSS) | (1L << OUTER))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (INNER - 64)) | (1L << (LEFT - 64)) | (1L << (SEMI - 64)) | (1L << (RIGHT - 64)) | (1L << (FULL - 64)) | (1L << (NATURAL - 64)) | (1L << (ON - 64)) | (1L << (LATERAL - 64)) | (1L << (WINDOW - 64)) | (1L << (OVER - 64)) | (1L << (PARTITION - 64)) | (1L << (RANGE - 64)) | (1L << (ROWS - 64)) | (1L << (UNBOUNDED - 64)) | (1L << (PRECEDING - 64)) | (1L << (FOLLOWING - 64)) | (1L << (CURRENT - 64)) | (1L << (ROW - 64)) | (1L << (WITH - 64)) | (1L << (VALUES - 64)) | (1L << (CREATE - 64)) | (1L << (TABLE - 64)) | (1L << (VIEW - 64)) | (1L << (REPLACE - 64)) | (1L << (INSERT - 64)) | (1L << (DELETE - 64)) | (1L << (INTO - 64)) | (1L << (DESCRIBE - 64)) | (1L << (EXPLAIN - 64)) | (1L << (FORMAT - 64)) | (1L << (LOGICAL - 64)) | (1L << (CODEGEN - 64)) | (1L << (CAST - 64)) | (1L << (SHOW - 64)) | (1L << (TABLES - 64)) | (1L << (COLUMNS - 64)) | (1L << (COLUMN - 64)) | (1L << (USE - 64)) | (1L << (PARTITIONS - 64)) | (1L << (FUNCTIONS - 64)) | (1L << (DROP - 64)) | (1L << (UNION - 64)) | (1L << (EXCEPT - 64)) | (1L << (INTERSECT - 64)) | (1L << (TO - 64)) | (1L << (TABLESAMPLE - 64)) | (1L << (STRATIFY - 64)) | (1L << (ALTER - 64)) | (1L << (RENAME - 64)) | (1L << (ARRAY - 64)) | (1L << (MAP - 64)) | (1L << (STRUCT - 64)) | (1L << (COMMENT - 64)) | (1L << (SET - 64)) | (1L << (RESET - 64)) | (1L << (DATA - 64)) | (1L << (START - 64)) | (1L << (TRANSACTION - 64)) | (1L << (COMMIT - 64)) | (1L << (ROLLBACK - 64)) | (1L << (MACRO - 64)) | (1L << (IF - 64)))) != 0) || ((((_la - 134)) & ~0x3f) == 0 && ((1L << (_la - 134)) & ((1L << (PLUS - 134)) | (1L << (MINUS - 134)) | (1L << (ASTERISK - 134)) | (1L << (DIV - 134)) | (1L << (TILDE - 134)) | (1L << (PERCENTLIT - 134)) | (1L << (BUCKET - 134)) | (1L << (OUT - 134)) | (1L << (OF - 134)) | (1L << (SORT - 134)) | (1L << (CLUSTER - 134)) | (1L << (DISTRIBUTE - 134)) | (1L << (OVERWRITE - 134)) | (1L << (TRANSFORM - 134)) | (1L << (REDUCE - 134)) | (1L << (USING - 134)) | (1L << (SERDE - 134)) | (1L << (SERDEPROPERTIES - 134)) | (1L << (RECORDREADER - 134)) | (1L << (RECORDWRITER - 134)) | (1L << (DELIMITED - 134)) | (1L << (FIELDS - 134)) | (1L << (TERMINATED - 134)) | (1L << (COLLECTION - 134)) | (1L << (ITEMS - 134)) | (1L << (KEYS - 134)) | (1L << (ESCAPED - 134)) | (1L << (LINES - 134)) | (1L << (SEPARATED - 134)) | (1L << (FUNCTION - 134)) | (1L << (EXTENDED - 134)) | (1L << (REFRESH - 134)) | (1L << (CLEAR - 134)) | (1L << (CACHE - 134)) | (1L << (UNCACHE - 134)) | (1L << (LAZY - 134)) | (1L << (FORMATTED - 134)) | (1L << (TEMPORARY - 134)) | (1L << (OPTIONS - 134)) | (1L << (UNSET - 134)) | (1L << (TBLPROPERTIES - 134)) | (1L << (DBPROPERTIES - 134)) | (1L << (BUCKETS - 134)) | (1L << (SKEWED - 134)) | (1L << (STORED - 134)) | (1L << (DIRECTORIES - 134)) | (1L << (LOCATION - 134)) | (1L << (EXCHANGE - 134)) | (1L << (ARCHIVE - 134)) | (1L << (UNARCHIVE - 134)) | (1L << (FILEFORMAT - 134)) | (1L << (TOUCH - 134)) | (1L << (COMPACT - 134)) | (1L << (CONCATENATE - 134)) | (1L << (CHANGE - 134)) | (1L << (CASCADE - 134)) | (1L << (RESTRICT - 134)) | (1L << (CLUSTERED - 134)) | (1L << (SORTED - 134)))) != 0) || ((((_la - 198)) & ~0x3f) == 0 && ((1L << (_la - 198)) & ((1L << (PURGE - 198)) | (1L << (INPUTFORMAT - 198)) | (1L << (OUTPUTFORMAT - 198)) | (1L << (DATABASE - 198)) | (1L << (DATABASES - 198)) | (1L << (DFS - 198)) | (1L << (TRUNCATE - 198)) | (1L << (ANALYZE - 198)) | (1L << (COMPUTE - 198)) | (1L << (LIST - 198)) | (1L << (STATISTICS - 198)) | (1L << (PARTITIONED - 198)) | (1L << (EXTERNAL - 198)) | (1L << (DEFINED - 198)) | (1L << (REVOKE - 198)) | (1L << (GRANT - 198)) | (1L << (LOCK - 198)) | (1L << (UNLOCK - 198)) | (1L << (MSCK - 198)) | (1L << (REPAIR - 198)) | (1L << (EXPORT - 198)) | (1L << (IMPORT - 198)) | (1L << (LOAD - 198)) | (1L << (ROLE - 198)) | (1L << (ROLES - 198)) | (1L << (COMPACTIONS - 198)) | (1L << (PRINCIPALS - 198)) | (1L << (TRANSACTIONS - 198)) | (1L << (INDEX - 198)) | (1L << (INDEXES - 198)) | (1L << (LOCKS - 198)) | (1L << (OPTION - 198)) | (1L << (ANTI - 198)) | (1L << (LOCAL - 198)) | (1L << (INPATH - 198)) | (1L << (STRING - 198)) | (1L << (BIGINT_LITERAL - 198)) | (1L << (SMALLINT_LITERAL - 198)) | (1L << (TINYINT_LITERAL - 198)) | (1L << (INTEGER_VALUE - 198)) | (1L << (DECIMAL_VALUE - 198)) | (1L << (SCIENTIFIC_DECIMAL_VALUE - 198)) | (1L << (DOUBLE_LITERAL - 198)) | (1L << (IDENTIFIER - 198)) | (1L << (BACKQUOTED_IDENTIFIER - 198)))) != 0)) {
					{
					setState(1581);
					expression();
					setState(1586);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__8) {
						{
						{
						setState(1582);
						match(T__8);
						setState(1583);
						expression();
						}
						}
						setState(1588);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(1591);
				match(T__7);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1592);
				expression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LateralViewContext extends ParserRuleContext {
		public IdentifierContext tblName;
		public IdentifierContext identifier;
		public List<IdentifierContext> colName = new ArrayList<IdentifierContext>();
		public TerminalNode LATERAL() { return getToken(JdScriptQuerySqlParser.LATERAL, 0); }
		public TerminalNode VIEW() { return getToken(JdScriptQuerySqlParser.VIEW, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public TerminalNode OUTER() { return getToken(JdScriptQuerySqlParser.OUTER, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode AS() { return getToken(JdScriptQuerySqlParser.AS, 0); }
		public LateralViewContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lateralView; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JdScriptQuerySqlListener ) ((JdScriptQuerySqlListener)listener).enterLateralView(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JdScriptQuerySqlListener ) ((JdScriptQuerySqlListener)listener).exitLateralView(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JdScriptQuerySqlVisitor ) return ((JdScriptQuerySqlVisitor<? extends T>)visitor).visitLateralView(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LateralViewContext lateralView() throws RecognitionException {
		LateralViewContext _localctx = new LateralViewContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_lateralView);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1595);
			match(LATERAL);
			setState(1596);
			match(VIEW);
			setState(1598);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,196,_ctx) ) {
			case 1:
				{
				setState(1597);
				match(OUTER);
				}
				break;
			}
			setState(1600);
			qualifiedName();
			setState(1601);
			match(T__6);
			setState(1610);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << SELECT) | (1L << FROM) | (1L << ADD) | (1L << AS) | (1L << ALL) | (1L << DISTINCT) | (1L << WHERE) | (1L << GROUP) | (1L << BY) | (1L << GROUPING) | (1L << SETS) | (1L << CUBE) | (1L << ROLLUP) | (1L << ORDER) | (1L << HAVING) | (1L << LIMIT) | (1L << AT) | (1L << OR) | (1L << AND) | (1L << IN) | (1L << NOT) | (1L << NO) | (1L << EXISTS) | (1L << BETWEEN) | (1L << LIKE) | (1L << RLIKE) | (1L << IS) | (1L << NULL) | (1L << TRUE) | (1L << FALSE) | (1L << NULLS) | (1L << ASC) | (1L << DESC) | (1L << FOR) | (1L << INTERVAL) | (1L << CASE) | (1L << WHEN) | (1L << THEN) | (1L << ELSE) | (1L << END) | (1L << JOIN) | (1L << CROSS) | (1L << OUTER))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (INNER - 64)) | (1L << (LEFT - 64)) | (1L << (SEMI - 64)) | (1L << (RIGHT - 64)) | (1L << (FULL - 64)) | (1L << (NATURAL - 64)) | (1L << (ON - 64)) | (1L << (LATERAL - 64)) | (1L << (WINDOW - 64)) | (1L << (OVER - 64)) | (1L << (PARTITION - 64)) | (1L << (RANGE - 64)) | (1L << (ROWS - 64)) | (1L << (UNBOUNDED - 64)) | (1L << (PRECEDING - 64)) | (1L << (FOLLOWING - 64)) | (1L << (CURRENT - 64)) | (1L << (ROW - 64)) | (1L << (WITH - 64)) | (1L << (VALUES - 64)) | (1L << (CREATE - 64)) | (1L << (TABLE - 64)) | (1L << (VIEW - 64)) | (1L << (REPLACE - 64)) | (1L << (INSERT - 64)) | (1L << (DELETE - 64)) | (1L << (INTO - 64)) | (1L << (DESCRIBE - 64)) | (1L << (EXPLAIN - 64)) | (1L << (FORMAT - 64)) | (1L << (LOGICAL - 64)) | (1L << (CODEGEN - 64)) | (1L << (CAST - 64)) | (1L << (SHOW - 64)) | (1L << (TABLES - 64)) | (1L << (COLUMNS - 64)) | (1L << (COLUMN - 64)) | (1L << (USE - 64)) | (1L << (PARTITIONS - 64)) | (1L << (FUNCTIONS - 64)) | (1L << (DROP - 64)) | (1L << (UNION - 64)) | (1L << (EXCEPT - 64)) | (1L << (INTERSECT - 64)) | (1L << (TO - 64)) | (1L << (TABLESAMPLE - 64)) | (1L << (STRATIFY - 64)) | (1L << (ALTER - 64)) | (1L << (RENAME - 64)) | (1L << (ARRAY - 64)) | (1L << (MAP - 64)) | (1L << (STRUCT - 64)) | (1L << (COMMENT - 64)) | (1L << (SET - 64)) | (1L << (RESET - 64)) | (1L << (DATA - 64)) | (1L << (START - 64)) | (1L << (TRANSACTION - 64)) | (1L << (COMMIT - 64)) | (1L << (ROLLBACK - 64)) | (1L << (MACRO - 64)) | (1L << (IF - 64)))) != 0) || ((((_la - 134)) & ~0x3f) == 0 && ((1L << (_la - 134)) & ((1L << (PLUS - 134)) | (1L << (MINUS - 134)) | (1L << (ASTERISK - 134)) | (1L << (DIV - 134)) | (1L << (TILDE - 134)) | (1L << (PERCENTLIT - 134)) | (1L << (BUCKET - 134)) | (1L << (OUT - 134)) | (1L << (OF - 134)) | (1L << (SORT - 134)) | (1L << (CLUSTER - 134)) | (1L << (DISTRIBUTE - 134)) | (1L << (OVERWRITE - 134)) | (1L << (TRANSFORM - 134)) | (1L << (REDUCE - 134)) | (1L << (USING - 134)) | (1L << (SERDE - 134)) | (1L << (SERDEPROPERTIES - 134)) | (1L << (RECORDREADER - 134)) | (1L << (RECORDWRITER - 134)) | (1L << (DELIMITED - 134)) | (1L << (FIELDS - 134)) | (1L << (TERMINATED - 134)) | (1L << (COLLECTION - 134)) | (1L << (ITEMS - 134)) | (1L << (KEYS - 134)) | (1L << (ESCAPED - 134)) | (1L << (LINES - 134)) | (1L << (SEPARATED - 134)) | (1L << (FUNCTION - 134)) | (1L << (EXTENDED - 134)) | (1L << (REFRESH - 134)) | (1L << (CLEAR - 134)) | (1L << (CACHE - 134)) | (1L << (UNCACHE - 134)) | (1L << (LAZY - 134)) | (1L << (FORMATTED - 134)) | (1L << (TEMPORARY - 134)) | (1L << (OPTIONS - 134)) | (1L << (UNSET - 134)) | (1L << (TBLPROPERTIES - 134)) | (1L << (DBPROPERTIES - 134)) | (1L << (BUCKETS - 134)) | (1L << (SKEWED - 134)) | (1L << (STORED - 134)) | (1L << (DIRECTORIES - 134)) | (1L << (LOCATION - 134)) | (1L << (EXCHANGE - 134)) | (1L << (ARCHIVE - 134)) | (1L << (UNARCHIVE - 134)) | (1L << (FILEFORMAT - 134)) | (1L << (TOUCH - 134)) | (1L << (COMPACT - 134)) | (1L << (CONCATENATE - 134)) | (1L << (CHANGE - 134)) | (1L << (CASCADE - 134)) | (1L << (RESTRICT - 134)) | (1L << (CLUSTERED - 134)) | (1L << (SORTED - 134)))) != 0) || ((((_la - 198)) & ~0x3f) == 0 && ((1L << (_la - 198)) & ((1L << (PURGE - 198)) | (1L << (INPUTFORMAT - 198)) | (1L << (OUTPUTFORMAT - 198)) | (1L << (DATABASE - 198)) | (1L << (DATABASES - 198)) | (1L << (DFS - 198)) | (1L << (TRUNCATE - 198)) | (1L << (ANALYZE - 198)) | (1L << (COMPUTE - 198)) | (1L << (LIST - 198)) | (1L << (STATISTICS - 198)) | (1L << (PARTITIONED - 198)) | (1L << (EXTERNAL - 198)) | (1L << (DEFINED - 198)) | (1L << (REVOKE - 198)) | (1L << (GRANT - 198)) | (1L << (LOCK - 198)) | (1L << (UNLOCK - 198)) | (1L << (MSCK - 198)) | (1L << (REPAIR - 198)) | (1L << (EXPORT - 198)) | (1L << (IMPORT - 198)) | (1L << (LOAD - 198)) | (1L << (ROLE - 198)) | (1L << (ROLES - 198)) | (1L << (COMPACTIONS - 198)) | (1L << (PRINCIPALS - 198)) | (1L << (TRANSACTIONS - 198)) | (1L << (INDEX - 198)) | (1L << (INDEXES - 198)) | (1L << (LOCKS - 198)) | (1L << (OPTION - 198)) | (1L << (ANTI - 198)) | (1L << (LOCAL - 198)) | (1L << (INPATH - 198)) | (1L << (STRING - 198)) | (1L << (BIGINT_LITERAL - 198)) | (1L << (SMALLINT_LITERAL - 198)) | (1L << (TINYINT_LITERAL - 198)) | (1L << (INTEGER_VALUE - 198)) | (1L << (DECIMAL_VALUE - 198)) | (1L << (SCIENTIFIC_DECIMAL_VALUE - 198)) | (1L << (DOUBLE_LITERAL - 198)) | (1L << (IDENTIFIER - 198)) | (1L << (BACKQUOTED_IDENTIFIER - 198)))) != 0)) {
				{
				setState(1602);
				expression();
				setState(1607);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__8) {
					{
					{
					setState(1603);
					match(T__8);
					setState(1604);
					expression();
					}
					}
					setState(1609);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(1612);
			match(T__7);
			setState(1613);
			((LateralViewContext)_localctx).tblName = identifier();
			setState(1625);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,201,_ctx) ) {
			case 1:
				{
				setState(1615);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,199,_ctx) ) {
				case 1:
					{
					setState(1614);
					match(AS);
					}
					break;
				}
				setState(1617);
				((LateralViewContext)_localctx).identifier = identifier();
				((LateralViewContext)_localctx).colName.add(((LateralViewContext)_localctx).identifier);
				setState(1622);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,200,_ctx);
				while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1618);
						match(T__8);
						setState(1619);
						((LateralViewContext)_localctx).identifier = identifier();
						((LateralViewContext)_localctx).colName.add(((LateralViewContext)_localctx).identifier);
						}
						} 
					}
					setState(1624);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,200,_ctx);
				}
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SetQuantifierContext extends ParserRuleContext {
		public TerminalNode DISTINCT() { return getToken(JdScriptQuerySqlParser.DISTINCT, 0); }
		public TerminalNode ALL() { return getToken(JdScriptQuerySqlParser.ALL, 0); }
		public SetQuantifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setQuantifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JdScriptQuerySqlListener ) ((JdScriptQuerySqlListener)listener).enterSetQuantifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JdScriptQuerySqlListener ) ((JdScriptQuerySqlListener)listener).exitSetQuantifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JdScriptQuerySqlVisitor ) return ((JdScriptQuerySqlVisitor<? extends T>)visitor).visitSetQuantifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SetQuantifierContext setQuantifier() throws RecognitionException {
		SetQuantifierContext _localctx = new SetQuantifierContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_setQuantifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1627);
			_la = _input.LA(1);
			if ( !(_la==ALL || _la==DISTINCT) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RelationContext extends ParserRuleContext {
		public RelationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relation; }
	 
		public RelationContext() { }
		public void copyFrom(RelationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class RelationDefaultContext extends RelationContext {
		public RelationPrimaryContext relationPrimary() {
			return getRuleContext(RelationPrimaryContext.class,0);
		}
		public RelationDefaultContext(RelationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JdScriptQuerySqlListener ) ((JdScriptQuerySqlListener)listener).enterRelationDefault(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JdScriptQuerySqlListener ) ((JdScriptQuerySqlListener)listener).exitRelationDefault(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JdScriptQuerySqlVisitor ) return ((JdScriptQuerySqlVisitor<? extends T>)visitor).visitRelationDefault(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class JoinRelationContext extends RelationContext {
		public RelationContext left;
		public RelationContext right;
		public List<RelationContext> relation() {
			return getRuleContexts(RelationContext.class);
		}
		public RelationContext relation(int i) {
			return getRuleContext(RelationContext.class,i);
		}
		public TerminalNode JOIN() { return getToken(JdScriptQuerySqlParser.JOIN, 0); }
		public TerminalNode NATURAL() { return getToken(JdScriptQuerySqlParser.NATURAL, 0); }
		public JoinTypeContext joinType() {
			return getRuleContext(JoinTypeContext.class,0);
		}
		public TerminalNode CROSS() { return getToken(JdScriptQuerySqlParser.CROSS, 0); }
		public JoinCriteriaContext joinCriteria() {
			return getRuleContext(JoinCriteriaContext.class,0);
		}
		public JoinRelationContext(RelationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JdScriptQuerySqlListener ) ((JdScriptQuerySqlListener)listener).enterJoinRelation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JdScriptQuerySqlListener ) ((JdScriptQuerySqlListener)listener).exitJoinRelation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JdScriptQuerySqlVisitor ) return ((JdScriptQuerySqlVisitor<? extends T>)visitor).visitJoinRelation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelationContext relation() throws RecognitionException {
		return relation(0);
	}

	private RelationContext relation(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		RelationContext _localctx = new RelationContext(_ctx, _parentState);
		RelationContext _prevctx = _localctx;
		int _startState = 126;
		enterRecursionRule(_localctx, 126, RULE_relation, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new RelationDefaultContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(1630);
			relationPrimary();
			}
			_ctx.stop = _input.LT(-1);
			setState(1651);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,205,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new JoinRelationContext(new RelationContext(_parentctx, _parentState));
					((JoinRelationContext)_localctx).left = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_relation);
					setState(1632);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(1647);
					switch (_input.LA(1)) {
					case JOIN:
					case CROSS:
					case INNER:
					case LEFT:
					case RIGHT:
					case FULL:
					case ANTI:
						{
						setState(1635);
						switch (_input.LA(1)) {
						case CROSS:
							{
							setState(1633);
							match(CROSS);
							}
							break;
						case JOIN:
						case INNER:
						case LEFT:
						case RIGHT:
						case FULL:
						case ANTI:
							{
							setState(1634);
							joinType();
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(1637);
						match(JOIN);
						setState(1638);
						((JoinRelationContext)_localctx).right = relation(0);
						setState(1640);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,203,_ctx) ) {
						case 1:
							{
							setState(1639);
							joinCriteria();
							}
							break;
						}
						}
						break;
					case NATURAL:
						{
						setState(1642);
						match(NATURAL);
						setState(1643);
						joinType();
						setState(1644);
						match(JOIN);
						setState(1645);
						((JoinRelationContext)_localctx).right = relation(0);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					} 
				}
				setState(1653);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,205,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class JoinTypeContext extends ParserRuleContext {
		public TerminalNode INNER() { return getToken(JdScriptQuerySqlParser.INNER, 0); }
		public TerminalNode LEFT() { return getToken(JdScriptQuerySqlParser.LEFT, 0); }
		public TerminalNode OUTER() { return getToken(JdScriptQuerySqlParser.OUTER, 0); }
		public TerminalNode SEMI() { return getToken(JdScriptQuerySqlParser.SEMI, 0); }
		public TerminalNode RIGHT() { return getToken(JdScriptQuerySqlParser.RIGHT, 0); }
		public TerminalNode FULL() { return getToken(JdScriptQuerySqlParser.FULL, 0); }
		public TerminalNode ANTI() { return getToken(JdScriptQuerySqlParser.ANTI, 0); }
		public JoinTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_joinType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JdScriptQuerySqlListener ) ((JdScriptQuerySqlListener)listener).enterJoinType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JdScriptQuerySqlListener ) ((JdScriptQuerySqlListener)listener).exitJoinType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JdScriptQuerySqlVisitor ) return ((JdScriptQuerySqlVisitor<? extends T>)visitor).visitJoinType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JoinTypeContext joinType() throws RecognitionException {
		JoinTypeContext _localctx = new JoinTypeContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_joinType);
		int _la;
		try {
			setState(1675);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,211,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1655);
				_la = _input.LA(1);
				if (_la==INNER) {
					{
					setState(1654);
					match(INNER);
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1657);
				match(LEFT);
				setState(1659);
				_la = _input.LA(1);
				if (_la==OUTER) {
					{
					setState(1658);
					match(OUTER);
					}
				}

				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1661);
				match(LEFT);
				setState(1662);
				match(SEMI);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1663);
				match(RIGHT);
				setState(1665);
				_la = _input.LA(1);
				if (_la==OUTER) {
					{
					setState(1664);
					match(OUTER);
					}
				}

				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1667);
				match(FULL);
				setState(1669);
				_la = _input.LA(1);
				if (_la==OUTER) {
					{
					setState(1668);
					match(OUTER);
					}
				}

				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1672);
				_la = _input.LA(1);
				if (_la==LEFT) {
					{
					setState(1671);
					match(LEFT);
					}
				}

				setState(1674);
				match(ANTI);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class JoinCriteriaContext extends ParserRuleContext {
		public TerminalNode ON() { return getToken(JdScriptQuerySqlParser.ON, 0); }
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public TerminalNode USING() { return getToken(JdScriptQuerySqlParser.USING, 0); }
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public JoinCriteriaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_joinCriteria; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JdScriptQuerySqlListener ) ((JdScriptQuerySqlListener)listener).enterJoinCriteria(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JdScriptQuerySqlListener ) ((JdScriptQuerySqlListener)listener).exitJoinCriteria(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JdScriptQuerySqlVisitor ) return ((JdScriptQuerySqlVisitor<? extends T>)visitor).visitJoinCriteria(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JoinCriteriaContext joinCriteria() throws RecognitionException {
		JoinCriteriaContext _localctx = new JoinCriteriaContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_joinCriteria);
		int _la;
		try {
			setState(1691);
			switch (_input.LA(1)) {
			case ON:
				enterOuterAlt(_localctx, 1);
				{
				setState(1677);
				match(ON);
				setState(1678);
				booleanExpression(0);
				}
				break;
			case USING:
				enterOuterAlt(_localctx, 2);
				{
				setState(1679);
				match(USING);
				setState(1680);
				match(T__6);
				setState(1681);
				identifier();
				setState(1686);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__8) {
					{
					{
					setState(1682);
					match(T__8);
					setState(1683);
					identifier();
					}
					}
					setState(1688);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1689);
				match(T__7);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SampleContext extends ParserRuleContext {
		public Token percentage;
		public Token sampleType;
		public Token numerator;
		public Token denominator;
		public TerminalNode TABLESAMPLE() { return getToken(JdScriptQuerySqlParser.TABLESAMPLE, 0); }
		public TerminalNode BYTELENGTH_LITERAL() { return getToken(JdScriptQuerySqlParser.BYTELENGTH_LITERAL, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode OUT() { return getToken(JdScriptQuerySqlParser.OUT, 0); }
		public TerminalNode OF() { return getToken(JdScriptQuerySqlParser.OF, 0); }
		public TerminalNode PERCENTLIT() { return getToken(JdScriptQuerySqlParser.PERCENTLIT, 0); }
		public TerminalNode ROWS() { return getToken(JdScriptQuerySqlParser.ROWS, 0); }
		public TerminalNode BUCKET() { return getToken(JdScriptQuerySqlParser.BUCKET, 0); }
		public List<TerminalNode> INTEGER_VALUE() { return getTokens(JdScriptQuerySqlParser.INTEGER_VALUE); }
		public TerminalNode INTEGER_VALUE(int i) {
			return getToken(JdScriptQuerySqlParser.INTEGER_VALUE, i);
		}
		public TerminalNode DECIMAL_VALUE() { return getToken(JdScriptQuerySqlParser.DECIMAL_VALUE, 0); }
		public TerminalNode ON() { return getToken(JdScriptQuerySqlParser.ON, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public SampleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sample; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JdScriptQuerySqlListener ) ((JdScriptQuerySqlListener)listener).enterSample(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JdScriptQuerySqlListener ) ((JdScriptQuerySqlListener)listener).exitSample(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JdScriptQuerySqlVisitor ) return ((JdScriptQuerySqlVisitor<? extends T>)visitor).visitSample(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SampleContext sample() throws RecognitionException {
		SampleContext _localctx = new SampleContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_sample);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1693);
			match(TABLESAMPLE);
			setState(1694);
			match(T__6);
			setState(1716);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,216,_ctx) ) {
			case 1:
				{
				{
				setState(1695);
				((SampleContext)_localctx).percentage = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==INTEGER_VALUE || _la==DECIMAL_VALUE) ) {
					((SampleContext)_localctx).percentage = (Token)_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(1696);
				((SampleContext)_localctx).sampleType = match(PERCENTLIT);
				}
				}
				break;
			case 2:
				{
				{
				setState(1697);
				expression();
				setState(1698);
				((SampleContext)_localctx).sampleType = match(ROWS);
				}
				}
				break;
			case 3:
				{
				setState(1700);
				((SampleContext)_localctx).sampleType = match(BYTELENGTH_LITERAL);
				}
				break;
			case 4:
				{
				{
				setState(1701);
				((SampleContext)_localctx).sampleType = match(BUCKET);
				setState(1702);
				((SampleContext)_localctx).numerator = match(INTEGER_VALUE);
				setState(1703);
				match(OUT);
				setState(1704);
				match(OF);
				setState(1705);
				((SampleContext)_localctx).denominator = match(INTEGER_VALUE);
				setState(1714);
				_la = _input.LA(1);
				if (_la==ON) {
					{
					setState(1706);
					match(ON);
					setState(1712);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,214,_ctx) ) {
					case 1:
						{
						setState(1707);
						identifier();
						}
						break;
					case 2:
						{
						setState(1708);
						qualifiedName();
						setState(1709);
						match(T__6);
						setState(1710);
						match(T__7);
						}
						break;
					}
					}
				}

				}
				}
				break;
			}
			setState(1718);
			match(T__7);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdentifierListContext extends ParserRuleContext {
		public IdentifierSeqContext identifierSeq() {
			return getRuleContext(IdentifierSeqContext.class,0);
		}
		public IdentifierListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifierList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JdScriptQuerySqlListener ) ((JdScriptQuerySqlListener)listener).enterIdentifierList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JdScriptQuerySqlListener ) ((JdScriptQuerySqlListener)listener).exitIdentifierList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JdScriptQuerySqlVisitor ) return ((JdScriptQuerySqlVisitor<? extends T>)visitor).visitIdentifierList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierListContext identifierList() throws RecognitionException {
		IdentifierListContext _localctx = new IdentifierListContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_identifierList);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1720);
			match(T__6);
			setState(1721);
			identifierSeq();
			setState(1722);
			match(T__7);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdentifierSeqContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public IdentifierSeqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifierSeq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JdScriptQuerySqlListener ) ((JdScriptQuerySqlListener)listener).enterIdentifierSeq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JdScriptQuerySqlListener ) ((JdScriptQuerySqlListener)listener).exitIdentifierSeq(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JdScriptQuerySqlVisitor ) return ((JdScriptQuerySqlVisitor<? extends T>)visitor).visitIdentifierSeq(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierSeqContext identifierSeq() throws RecognitionException {
		IdentifierSeqContext _localctx = new IdentifierSeqContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_identifierSeq);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1724);
			identifier();
			setState(1729);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,217,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1725);
					match(T__8);
					setState(1726);
					identifier();
					}
					} 
				}
				setState(1731);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,217,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OrderedIdentifierListContext extends ParserRuleContext {
		public List<OrderedIdentifierContext> orderedIdentifier() {
			return getRuleContexts(OrderedIdentifierContext.class);
		}
		public OrderedIdentifierContext orderedIdentifier(int i) {
			return getRuleContext(OrderedIdentifierContext.class,i);
		}
		public OrderedIdentifierListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orderedIdentifierList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JdScriptQuerySqlListener ) ((JdScriptQuerySqlListener)listener).enterOrderedIdentifierList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JdScriptQuerySqlListener ) ((JdScriptQuerySqlListener)listener).exitOrderedIdentifierList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JdScriptQuerySqlVisitor ) return ((JdScriptQuerySqlVisitor<? extends T>)visitor).visitOrderedIdentifierList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OrderedIdentifierListContext orderedIdentifierList() throws RecognitionException {
		OrderedIdentifierListContext _localctx = new OrderedIdentifierListContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_orderedIdentifierList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1732);
			match(T__6);
			setState(1733);
			orderedIdentifier();
			setState(1738);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__8) {
				{
				{
				setState(1734);
				match(T__8);
				setState(1735);
				orderedIdentifier();
				}
				}
				setState(1740);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1741);
			match(T__7);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OrderedIdentifierContext extends ParserRuleContext {
		public Token ordering;
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode ASC() { return getToken(JdScriptQuerySqlParser.ASC, 0); }
		public TerminalNode DESC() { return getToken(JdScriptQuerySqlParser.DESC, 0); }
		public OrderedIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orderedIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JdScriptQuerySqlListener ) ((JdScriptQuerySqlListener)listener).enterOrderedIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JdScriptQuerySqlListener ) ((JdScriptQuerySqlListener)listener).exitOrderedIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JdScriptQuerySqlVisitor ) return ((JdScriptQuerySqlVisitor<? extends T>)visitor).visitOrderedIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OrderedIdentifierContext orderedIdentifier() throws RecognitionException {
		OrderedIdentifierContext _localctx = new OrderedIdentifierContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_orderedIdentifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1743);
			identifier();
			setState(1745);
			_la = _input.LA(1);
			if (_la==ASC || _la==DESC) {
				{
				setState(1744);
				((OrderedIdentifierContext)_localctx).ordering = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==ASC || _la==DESC) ) {
					((OrderedIdentifierContext)_localctx).ordering = (Token)_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdentifierCommentListContext extends ParserRuleContext {
		public List<IdentifierCommentContext> identifierComment() {
			return getRuleContexts(IdentifierCommentContext.class);
		}
		public IdentifierCommentContext identifierComment(int i) {
			return getRuleContext(IdentifierCommentContext.class,i);
		}
		public IdentifierCommentListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifierCommentList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JdScriptQuerySqlListener ) ((JdScriptQuerySqlListener)listener).enterIdentifierCommentList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JdScriptQuerySqlListener ) ((JdScriptQuerySqlListener)listener).exitIdentifierCommentList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JdScriptQuerySqlVisitor ) return ((JdScriptQuerySqlVisitor<? extends T>)visitor).visitIdentifierCommentList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierCommentListContext identifierCommentList() throws RecognitionException {
		IdentifierCommentListContext _localctx = new IdentifierCommentListContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_identifierCommentList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1747);
			match(T__6);
			setState(1748);
			identifierComment();
			setState(1753);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__8) {
				{
				{
				setState(1749);
				match(T__8);
				setState(1750);
				identifierComment();
				}
				}
				setState(1755);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1756);
			match(T__7);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdentifierCommentContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode COMMENT() { return getToken(JdScriptQuerySqlParser.COMMENT, 0); }
		public TerminalNode STRING() { return getToken(JdScriptQuerySqlParser.STRING, 0); }
		public IdentifierCommentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifierComment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JdScriptQuerySqlListener ) ((JdScriptQuerySqlListener)listener).enterIdentifierComment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JdScriptQuerySqlListener ) ((JdScriptQuerySqlListener)listener).exitIdentifierComment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JdScriptQuerySqlVisitor ) return ((JdScriptQuerySqlVisitor<? extends T>)visitor).visitIdentifierComment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierCommentContext identifierComment() throws RecognitionException {
		IdentifierCommentContext _localctx = new IdentifierCommentContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_identifierComment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1758);
			identifier();
			setState(1761);
			_la = _input.LA(1);
			if (_la==COMMENT) {
				{
				setState(1759);
				match(COMMENT);
				setState(1760);
				match(STRING);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RelationPrimaryContext extends ParserRuleContext {
		public RelationPrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relationPrimary; }
	 
		public RelationPrimaryContext() { }
		public void copyFrom(RelationPrimaryContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class InlineTableDefault2Context extends RelationPrimaryContext {
		public InlineTableContext inlineTable() {
			return getRuleContext(InlineTableContext.class,0);
		}
		public InlineTableDefault2Context(RelationPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JdScriptQuerySqlListener ) ((JdScriptQuerySqlListener)listener).enterInlineTableDefault2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JdScriptQuerySqlListener ) ((JdScriptQuerySqlListener)listener).exitInlineTableDefault2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JdScriptQuerySqlVisitor ) return ((JdScriptQuerySqlVisitor<? extends T>)visitor).visitInlineTableDefault2(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AliasedRelationContext extends RelationPrimaryContext {
		public RelationContext relation() {
			return getRuleContext(RelationContext.class,0);
		}
		public SampleContext sample() {
			return getRuleContext(SampleContext.class,0);
		}
		public StrictIdentifierContext strictIdentifier() {
			return getRuleContext(StrictIdentifierContext.class,0);
		}
		public TerminalNode AS() { return getToken(JdScriptQuerySqlParser.AS, 0); }
		public AliasedRelationContext(RelationPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JdScriptQuerySqlListener ) ((JdScriptQuerySqlListener)listener).enterAliasedRelation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JdScriptQuerySqlListener ) ((JdScriptQuerySqlListener)listener).exitAliasedRelation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JdScriptQuerySqlVisitor ) return ((JdScriptQuerySqlVisitor<? extends T>)visitor).visitAliasedRelation(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AliasedQueryContext extends RelationPrimaryContext {
		public QueryNoWithContext queryNoWith() {
			return getRuleContext(QueryNoWithContext.class,0);
		}
		public SampleContext sample() {
			return getRuleContext(SampleContext.class,0);
		}
		public StrictIdentifierContext strictIdentifier() {
			return getRuleContext(StrictIdentifierContext.class,0);
		}
		public TerminalNode AS() { return getToken(JdScriptQuerySqlParser.AS, 0); }
		public AliasedQueryContext(RelationPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JdScriptQuerySqlListener ) ((JdScriptQuerySqlListener)listener).enterAliasedQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JdScriptQuerySqlListener ) ((JdScriptQuerySqlListener)listener).exitAliasedQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JdScriptQuerySqlVisitor ) return ((JdScriptQuerySqlVisitor<? extends T>)visitor).visitAliasedQuery(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TableNameContext extends RelationPrimaryContext {
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public SampleContext sample() {
			return getRuleContext(SampleContext.class,0);
		}
		public StrictIdentifierContext strictIdentifier() {
			return getRuleContext(StrictIdentifierContext.class,0);
		}
		public TerminalNode AS() { return getToken(JdScriptQuerySqlParser.AS, 0); }
		public TableNameContext(RelationPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JdScriptQuerySqlListener ) ((JdScriptQuerySqlListener)listener).enterTableName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JdScriptQuerySqlListener ) ((JdScriptQuerySqlListener)listener).exitTableName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JdScriptQuerySqlVisitor ) return ((JdScriptQuerySqlVisitor<? extends T>)visitor).visitTableName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelationPrimaryContext relationPrimary() throws RecognitionException {
		RelationPrimaryContext _localctx = new RelationPrimaryContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_relationPrimary);
		try {
			setState(1798);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,231,_ctx) ) {
			case 1:
				_localctx = new TableNameContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1763);
				tableIdentifier();
				setState(1765);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,222,_ctx) ) {
				case 1:
					{
					setState(1764);
					sample();
					}
					break;
				}
				setState(1771);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,224,_ctx) ) {
				case 1:
					{
					setState(1768);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,223,_ctx) ) {
					case 1:
						{
						setState(1767);
						match(AS);
						}
						break;
					}
					setState(1770);
					strictIdentifier();
					}
					break;
				}
				}
				break;
			case 2:
				_localctx = new AliasedQueryContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1773);
				match(T__6);
				setState(1774);
				queryNoWith();
				setState(1775);
				match(T__7);
				setState(1777);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,225,_ctx) ) {
				case 1:
					{
					setState(1776);
					sample();
					}
					break;
				}
				setState(1783);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,227,_ctx) ) {
				case 1:
					{
					setState(1780);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,226,_ctx) ) {
					case 1:
						{
						setState(1779);
						match(AS);
						}
						break;
					}
					setState(1782);
					strictIdentifier();
					}
					break;
				}
				}
				break;
			case 3:
				_localctx = new AliasedRelationContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1785);
				match(T__6);
				setState(1786);
				relation(0);
				setState(1787);
				match(T__7);
				setState(1789);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,228,_ctx) ) {
				case 1:
					{
					setState(1788);
					sample();
					}
					break;
				}
				setState(1795);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,230,_ctx) ) {
				case 1:
					{
					setState(1792);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,229,_ctx) ) {
					case 1:
						{
						setState(1791);
						match(AS);
						}
						break;
					}
					setState(1794);
					strictIdentifier();
					}
					break;
				}
				}
				break;
			case 4:
				_localctx = new InlineTableDefault2Context(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1797);
				inlineTable();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InlineTableContext extends ParserRuleContext {
		public TerminalNode VALUES() { return getToken(JdScriptQuerySqlParser.VALUES, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode AS() { return getToken(JdScriptQuerySqlParser.AS, 0); }
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public InlineTableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inlineTable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JdScriptQuerySqlListener ) ((JdScriptQuerySqlListener)listener).enterInlineTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JdScriptQuerySqlListener ) ((JdScriptQuerySqlListener)listener).exitInlineTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JdScriptQuerySqlVisitor ) return ((JdScriptQuerySqlVisitor<? extends T>)visitor).visitInlineTable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InlineTableContext inlineTable() throws RecognitionException {
		InlineTableContext _localctx = new InlineTableContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_inlineTable);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1800);
			match(VALUES);
			setState(1801);
			expression();
			setState(1806);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,232,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1802);
					match(T__8);
					setState(1803);
					expression();
					}
					} 
				}
				setState(1808);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,232,_ctx);
			}
			setState(1816);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,235,_ctx) ) {
			case 1:
				{
				setState(1810);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,233,_ctx) ) {
				case 1:
					{
					setState(1809);
					match(AS);
					}
					break;
				}
				setState(1812);
				identifier();
				setState(1814);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,234,_ctx) ) {
				case 1:
					{
					setState(1813);
					identifierList();
					}
					break;
				}
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RowFormatContext extends ParserRuleContext {
		public RowFormatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rowFormat; }
	 
		public RowFormatContext() { }
		public void copyFrom(RowFormatContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class RowFormatSerdeContext extends RowFormatContext {
		public Token name;
		public TablePropertyListContext props;
		public TerminalNode ROW() { return getToken(JdScriptQuerySqlParser.ROW, 0); }
		public TerminalNode FORMAT() { return getToken(JdScriptQuerySqlParser.FORMAT, 0); }
		public TerminalNode SERDE() { return getToken(JdScriptQuerySqlParser.SERDE, 0); }
		public TerminalNode STRING() { return getToken(JdScriptQuerySqlParser.STRING, 0); }
		public TerminalNode WITH() { return getToken(JdScriptQuerySqlParser.WITH, 0); }
		public TerminalNode SERDEPROPERTIES() { return getToken(JdScriptQuerySqlParser.SERDEPROPERTIES, 0); }
		public TablePropertyListContext tablePropertyList() {
			return getRuleContext(TablePropertyListContext.class,0);
		}
		public RowFormatSerdeContext(RowFormatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JdScriptQuerySqlListener ) ((JdScriptQuerySqlListener)listener).enterRowFormatSerde(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JdScriptQuerySqlListener ) ((JdScriptQuerySqlListener)listener).exitRowFormatSerde(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JdScriptQuerySqlVisitor ) return ((JdScriptQuerySqlVisitor<? extends T>)visitor).visitRowFormatSerde(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RowFormatDelimitedContext extends RowFormatContext {
		public Token fieldsTerminatedBy;
		public Token escapedBy;
		public Token collectionItemsTerminatedBy;
		public Token keysTerminatedBy;
		public Token linesSeparatedBy;
		public Token nullDefinedAs;
		public TerminalNode ROW() { return getToken(JdScriptQuerySqlParser.ROW, 0); }
		public TerminalNode FORMAT() { return getToken(JdScriptQuerySqlParser.FORMAT, 0); }
		public TerminalNode DELIMITED() { return getToken(JdScriptQuerySqlParser.DELIMITED, 0); }
		public TerminalNode FIELDS() { return getToken(JdScriptQuerySqlParser.FIELDS, 0); }
		public List<TerminalNode> TERMINATED() { return getTokens(JdScriptQuerySqlParser.TERMINATED); }
		public TerminalNode TERMINATED(int i) {
			return getToken(JdScriptQuerySqlParser.TERMINATED, i);
		}
		public List<TerminalNode> BY() { return getTokens(JdScriptQuerySqlParser.BY); }
		public TerminalNode BY(int i) {
			return getToken(JdScriptQuerySqlParser.BY, i);
		}
		public TerminalNode COLLECTION() { return getToken(JdScriptQuerySqlParser.COLLECTION, 0); }
		public TerminalNode ITEMS() { return getToken(JdScriptQuerySqlParser.ITEMS, 0); }
		public TerminalNode MAP() { return getToken(JdScriptQuerySqlParser.MAP, 0); }
		public TerminalNode KEYS() { return getToken(JdScriptQuerySqlParser.KEYS, 0); }
		public TerminalNode LINES() { return getToken(JdScriptQuerySqlParser.LINES, 0); }
		public TerminalNode NULL() { return getToken(JdScriptQuerySqlParser.NULL, 0); }
		public TerminalNode DEFINED() { return getToken(JdScriptQuerySqlParser.DEFINED, 0); }
		public TerminalNode AS() { return getToken(JdScriptQuerySqlParser.AS, 0); }
		public List<TerminalNode> STRING() { return getTokens(JdScriptQuerySqlParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(JdScriptQuerySqlParser.STRING, i);
		}
		public TerminalNode ESCAPED() { return getToken(JdScriptQuerySqlParser.ESCAPED, 0); }
		public RowFormatDelimitedContext(RowFormatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JdScriptQuerySqlListener ) ((JdScriptQuerySqlListener)listener).enterRowFormatDelimited(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JdScriptQuerySqlListener ) ((JdScriptQuerySqlListener)listener).exitRowFormatDelimited(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JdScriptQuerySqlVisitor ) return ((JdScriptQuerySqlVisitor<? extends T>)visitor).visitRowFormatDelimited(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RowFormatContext rowFormat() throws RecognitionException {
		RowFormatContext _localctx = new RowFormatContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_rowFormat);
		try {
			setState(1867);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,243,_ctx) ) {
			case 1:
				_localctx = new RowFormatSerdeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1818);
				match(ROW);
				setState(1819);
				match(FORMAT);
				setState(1820);
				match(SERDE);
				setState(1821);
				((RowFormatSerdeContext)_localctx).name = match(STRING);
				setState(1825);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,236,_ctx) ) {
				case 1:
					{
					setState(1822);
					match(WITH);
					setState(1823);
					match(SERDEPROPERTIES);
					setState(1824);
					((RowFormatSerdeContext)_localctx).props = tablePropertyList();
					}
					break;
				}
				}
				break;
			case 2:
				_localctx = new RowFormatDelimitedContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1827);
				match(ROW);
				setState(1828);
				match(FORMAT);
				setState(1829);
				match(DELIMITED);
				setState(1839);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,238,_ctx) ) {
				case 1:
					{
					setState(1830);
					match(FIELDS);
					setState(1831);
					match(TERMINATED);
					setState(1832);
					match(BY);
					setState(1833);
					((RowFormatDelimitedContext)_localctx).fieldsTerminatedBy = match(STRING);
					setState(1837);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,237,_ctx) ) {
					case 1:
						{
						setState(1834);
						match(ESCAPED);
						setState(1835);
						match(BY);
						setState(1836);
						((RowFormatDelimitedContext)_localctx).escapedBy = match(STRING);
						}
						break;
					}
					}
					break;
				}
				setState(1846);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,239,_ctx) ) {
				case 1:
					{
					setState(1841);
					match(COLLECTION);
					setState(1842);
					match(ITEMS);
					setState(1843);
					match(TERMINATED);
					setState(1844);
					match(BY);
					setState(1845);
					((RowFormatDelimitedContext)_localctx).collectionItemsTerminatedBy = match(STRING);
					}
					break;
				}
				setState(1853);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,240,_ctx) ) {
				case 1:
					{
					setState(1848);
					match(MAP);
					setState(1849);
					match(KEYS);
					setState(1850);
					match(TERMINATED);
					setState(1851);
					match(BY);
					setState(1852);
					((RowFormatDelimitedContext)_localctx).keysTerminatedBy = match(STRING);
					}
					break;
				}
				setState(1859);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,241,_ctx) ) {
				case 1:
					{
					setState(1855);
					match(LINES);
					setState(1856);
					match(TERMINATED);
					setState(1857);
					match(BY);
					setState(1858);
					((RowFormatDelimitedContext)_localctx).linesSeparatedBy = match(STRING);
					}
					break;
				}
				setState(1865);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,242,_ctx) ) {
				case 1:
					{
					setState(1861);
					match(NULL);
					setState(1862);
					match(DEFINED);
					setState(1863);
					match(AS);
					setState(1864);
					((RowFormatDelimitedContext)_localctx).nullDefinedAs = match(STRING);
					}
					break;
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TableIdentifierContext extends ParserRuleContext {
		public IdentifierContext db;
		public IdentifierContext table;
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public TableIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JdScriptQuerySqlListener ) ((JdScriptQuerySqlListener)listener).enterTableIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JdScriptQuerySqlListener ) ((JdScriptQuerySqlListener)listener).exitTableIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JdScriptQuerySqlVisitor ) return ((JdScriptQuerySqlVisitor<? extends T>)visitor).visitTableIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableIdentifierContext tableIdentifier() throws RecognitionException {
		TableIdentifierContext _localctx = new TableIdentifierContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_tableIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1872);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,244,_ctx) ) {
			case 1:
				{
				setState(1869);
				((TableIdentifierContext)_localctx).db = identifier();
				setState(1870);
				match(T__14);
				}
				break;
			}
			setState(1874);
			((TableIdentifierContext)_localctx).table = identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NamedExpressionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public TerminalNode AS() { return getToken(JdScriptQuerySqlParser.AS, 0); }
		public NamedExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namedExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JdScriptQuerySqlListener ) ((JdScriptQuerySqlListener)listener).enterNamedExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JdScriptQuerySqlListener ) ((JdScriptQuerySqlListener)listener).exitNamedExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JdScriptQuerySqlVisitor ) return ((JdScriptQuerySqlVisitor<? extends T>)visitor).visitNamedExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NamedExpressionContext namedExpression() throws RecognitionException {
		NamedExpressionContext _localctx = new NamedExpressionContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_namedExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1876);
			expression();
			setState(1884);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,247,_ctx) ) {
			case 1:
				{
				setState(1878);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,245,_ctx) ) {
				case 1:
					{
					setState(1877);
					match(AS);
					}
					break;
				}
				setState(1882);
				switch (_input.LA(1)) {
				case SELECT:
				case FROM:
				case ADD:
				case AS:
				case ALL:
				case DISTINCT:
				case WHERE:
				case GROUP:
				case BY:
				case GROUPING:
				case SETS:
				case CUBE:
				case ROLLUP:
				case ORDER:
				case HAVING:
				case LIMIT:
				case AT:
				case OR:
				case AND:
				case IN:
				case NOT:
				case NO:
				case EXISTS:
				case BETWEEN:
				case LIKE:
				case RLIKE:
				case IS:
				case NULL:
				case TRUE:
				case FALSE:
				case NULLS:
				case ASC:
				case DESC:
				case FOR:
				case INTERVAL:
				case CASE:
				case WHEN:
				case THEN:
				case ELSE:
				case END:
				case JOIN:
				case CROSS:
				case OUTER:
				case INNER:
				case LEFT:
				case SEMI:
				case RIGHT:
				case FULL:
				case NATURAL:
				case ON:
				case LATERAL:
				case WINDOW:
				case OVER:
				case PARTITION:
				case RANGE:
				case ROWS:
				case UNBOUNDED:
				case PRECEDING:
				case FOLLOWING:
				case CURRENT:
				case ROW:
				case WITH:
				case VALUES:
				case CREATE:
				case TABLE:
				case VIEW:
				case REPLACE:
				case INSERT:
				case DELETE:
				case INTO:
				case DESCRIBE:
				case EXPLAIN:
				case FORMAT:
				case LOGICAL:
				case CODEGEN:
				case CAST:
				case SHOW:
				case TABLES:
				case COLUMNS:
				case COLUMN:
				case USE:
				case PARTITIONS:
				case FUNCTIONS:
				case DROP:
				case UNION:
				case EXCEPT:
				case INTERSECT:
				case TO:
				case TABLESAMPLE:
				case STRATIFY:
				case ALTER:
				case RENAME:
				case ARRAY:
				case MAP:
				case STRUCT:
				case COMMENT:
				case SET:
				case RESET:
				case DATA:
				case START:
				case TRANSACTION:
				case COMMIT:
				case ROLLBACK:
				case MACRO:
				case IF:
				case DIV:
				case PERCENTLIT:
				case BUCKET:
				case OUT:
				case OF:
				case SORT:
				case CLUSTER:
				case DISTRIBUTE:
				case OVERWRITE:
				case TRANSFORM:
				case REDUCE:
				case USING:
				case SERDE:
				case SERDEPROPERTIES:
				case RECORDREADER:
				case RECORDWRITER:
				case DELIMITED:
				case FIELDS:
				case TERMINATED:
				case COLLECTION:
				case ITEMS:
				case KEYS:
				case ESCAPED:
				case LINES:
				case SEPARATED:
				case FUNCTION:
				case EXTENDED:
				case REFRESH:
				case CLEAR:
				case CACHE:
				case UNCACHE:
				case LAZY:
				case FORMATTED:
				case TEMPORARY:
				case OPTIONS:
				case UNSET:
				case TBLPROPERTIES:
				case DBPROPERTIES:
				case BUCKETS:
				case SKEWED:
				case STORED:
				case DIRECTORIES:
				case LOCATION:
				case EXCHANGE:
				case ARCHIVE:
				case UNARCHIVE:
				case FILEFORMAT:
				case TOUCH:
				case COMPACT:
				case CONCATENATE:
				case CHANGE:
				case CASCADE:
				case RESTRICT:
				case CLUSTERED:
				case SORTED:
				case PURGE:
				case INPUTFORMAT:
				case OUTPUTFORMAT:
				case DATABASE:
				case DATABASES:
				case DFS:
				case TRUNCATE:
				case ANALYZE:
				case COMPUTE:
				case LIST:
				case STATISTICS:
				case PARTITIONED:
				case EXTERNAL:
				case DEFINED:
				case REVOKE:
				case GRANT:
				case LOCK:
				case UNLOCK:
				case MSCK:
				case REPAIR:
				case EXPORT:
				case IMPORT:
				case LOAD:
				case ROLE:
				case ROLES:
				case COMPACTIONS:
				case PRINCIPALS:
				case TRANSACTIONS:
				case INDEX:
				case INDEXES:
				case LOCKS:
				case OPTION:
				case ANTI:
				case LOCAL:
				case INPATH:
				case IDENTIFIER:
				case BACKQUOTED_IDENTIFIER:
					{
					setState(1880);
					identifier();
					}
					break;
				case T__6:
					{
					setState(1881);
					identifierList();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NamedExpressionSeqContext extends ParserRuleContext {
		public List<NamedExpressionContext> namedExpression() {
			return getRuleContexts(NamedExpressionContext.class);
		}
		public NamedExpressionContext namedExpression(int i) {
			return getRuleContext(NamedExpressionContext.class,i);
		}
		public NamedExpressionSeqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namedExpressionSeq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JdScriptQuerySqlListener ) ((JdScriptQuerySqlListener)listener).enterNamedExpressionSeq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JdScriptQuerySqlListener ) ((JdScriptQuerySqlListener)listener).exitNamedExpressionSeq(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JdScriptQuerySqlVisitor ) return ((JdScriptQuerySqlVisitor<? extends T>)visitor).visitNamedExpressionSeq(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NamedExpressionSeqContext namedExpressionSeq() throws RecognitionException {
		NamedExpressionSeqContext _localctx = new NamedExpressionSeqContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_namedExpressionSeq);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1886);
			namedExpression();
			setState(1891);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,248,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1887);
					match(T__8);
					setState(1888);
					namedExpression();
					}
					} 
				}
				setState(1893);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,248,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JdScriptQuerySqlListener ) ((JdScriptQuerySqlListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JdScriptQuerySqlListener ) ((JdScriptQuerySqlListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JdScriptQuerySqlVisitor ) return ((JdScriptQuerySqlVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1894);
			booleanExpression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BooleanExpressionContext extends ParserRuleContext {
		public BooleanExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanExpression; }
	 
		public BooleanExpressionContext() { }
		public void copyFrom(BooleanExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class LogicalNotContext extends BooleanExpressionContext {
		public TerminalNode NOT() { return getToken(JdScriptQuerySqlParser.NOT, 0); }
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public LogicalNotContext(BooleanExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JdScriptQuerySqlListener ) ((JdScriptQuerySqlListener)listener).enterLogicalNot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JdScriptQuerySqlListener ) ((JdScriptQuerySqlListener)listener).exitLogicalNot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JdScriptQuerySqlVisitor ) return ((JdScriptQuerySqlVisitor<? extends T>)visitor).visitLogicalNot(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BooleanDefaultContext extends BooleanExpressionContext {
		public PredicatedContext predicated() {
			return getRuleContext(PredicatedContext.class,0);
		}
		public BooleanDefaultContext(BooleanExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JdScriptQuerySqlListener ) ((JdScriptQuerySqlListener)listener).enterBooleanDefault(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JdScriptQuerySqlListener ) ((JdScriptQuerySqlListener)listener).exitBooleanDefault(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JdScriptQuerySqlVisitor ) return ((JdScriptQuerySqlVisitor<? extends T>)visitor).visitBooleanDefault(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExistsContext extends BooleanExpressionContext {
		public TerminalNode EXISTS() { return getToken(JdScriptQuerySqlParser.EXISTS, 0); }
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public ExistsContext(BooleanExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JdScriptQuerySqlListener ) ((JdScriptQuerySqlListener)listener).enterExists(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JdScriptQuerySqlListener ) ((JdScriptQuerySqlListener)listener).exitExists(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JdScriptQuerySqlVisitor ) return ((JdScriptQuerySqlVisitor<? extends T>)visitor).visitExists(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LogicalBinaryContext extends BooleanExpressionContext {
		public BooleanExpressionContext left;
		public Token operator;
		public BooleanExpressionContext right;
		public List<BooleanExpressionContext> booleanExpression() {
			return getRuleContexts(BooleanExpressionContext.class);
		}
		public BooleanExpressionContext booleanExpression(int i) {
			return getRuleContext(BooleanExpressionContext.class,i);
		}
		public TerminalNode AND() { return getToken(JdScriptQuerySqlParser.AND, 0); }
		public TerminalNode OR() { return getToken(JdScriptQuerySqlParser.OR, 0); }
		public LogicalBinaryContext(BooleanExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JdScriptQuerySqlListener ) ((JdScriptQuerySqlListener)listener).enterLogicalBinary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JdScriptQuerySqlListener ) ((JdScriptQuerySqlListener)listener).exitLogicalBinary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JdScriptQuerySqlVisitor ) return ((JdScriptQuerySqlVisitor<? extends T>)visitor).visitLogicalBinary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BooleanExpressionContext booleanExpression() throws RecognitionException {
		return booleanExpression(0);
	}

	private BooleanExpressionContext booleanExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		BooleanExpressionContext _localctx = new BooleanExpressionContext(_ctx, _parentState);
		BooleanExpressionContext _prevctx = _localctx;
		int _startState = 160;
		enterRecursionRule(_localctx, 160, RULE_booleanExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1905);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,249,_ctx) ) {
			case 1:
				{
				_localctx = new LogicalNotContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(1897);
				match(NOT);
				setState(1898);
				booleanExpression(5);
				}
				break;
			case 2:
				{
				_localctx = new BooleanDefaultContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1899);
				predicated();
				}
				break;
			case 3:
				{
				_localctx = new ExistsContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1900);
				match(EXISTS);
				setState(1901);
				match(T__6);
				setState(1902);
				query();
				setState(1903);
				match(T__7);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1915);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,251,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1913);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,250,_ctx) ) {
					case 1:
						{
						_localctx = new LogicalBinaryContext(new BooleanExpressionContext(_parentctx, _parentState));
						((LogicalBinaryContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_booleanExpression);
						setState(1907);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(1908);
						((LogicalBinaryContext)_localctx).operator = match(AND);
						setState(1909);
						((LogicalBinaryContext)_localctx).right = booleanExpression(4);
						}
						break;
					case 2:
						{
						_localctx = new LogicalBinaryContext(new BooleanExpressionContext(_parentctx, _parentState));
						((LogicalBinaryContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_booleanExpression);
						setState(1910);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(1911);
						((LogicalBinaryContext)_localctx).operator = match(OR);
						setState(1912);
						((LogicalBinaryContext)_localctx).right = booleanExpression(3);
						}
						break;
					}
					} 
				}
				setState(1917);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,251,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class PredicatedContext extends ParserRuleContext {
		public ValueExpressionContext valueExpression() {
			return getRuleContext(ValueExpressionContext.class,0);
		}
		public PredicateContext predicate() {
			return getRuleContext(PredicateContext.class,0);
		}
		public PredicatedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_predicated; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JdScriptQuerySqlListener ) ((JdScriptQuerySqlListener)listener).enterPredicated(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JdScriptQuerySqlListener ) ((JdScriptQuerySqlListener)listener).exitPredicated(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JdScriptQuerySqlVisitor ) return ((JdScriptQuerySqlVisitor<? extends T>)visitor).visitPredicated(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PredicatedContext predicated() throws RecognitionException {
		PredicatedContext _localctx = new PredicatedContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_predicated);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1918);
			valueExpression(0);
			setState(1920);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,252,_ctx) ) {
			case 1:
				{
				setState(1919);
				predicate();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PredicateContext extends ParserRuleContext {
		public Token kind;
		public ValueExpressionContext lower;
		public ValueExpressionContext upper;
		public ValueExpressionContext pattern;
		public TerminalNode AND() { return getToken(JdScriptQuerySqlParser.AND, 0); }
		public TerminalNode BETWEEN() { return getToken(JdScriptQuerySqlParser.BETWEEN, 0); }
		public List<ValueExpressionContext> valueExpression() {
			return getRuleContexts(ValueExpressionContext.class);
		}
		public ValueExpressionContext valueExpression(int i) {
			return getRuleContext(ValueExpressionContext.class,i);
		}
		public TerminalNode NOT() { return getToken(JdScriptQuerySqlParser.NOT, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode IN() { return getToken(JdScriptQuerySqlParser.IN, 0); }
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public TerminalNode RLIKE() { return getToken(JdScriptQuerySqlParser.RLIKE, 0); }
		public TerminalNode LIKE() { return getToken(JdScriptQuerySqlParser.LIKE, 0); }
		public TerminalNode IS() { return getToken(JdScriptQuerySqlParser.IS, 0); }
		public TerminalNode NULL() { return getToken(JdScriptQuerySqlParser.NULL, 0); }
		public PredicateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_predicate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JdScriptQuerySqlListener ) ((JdScriptQuerySqlListener)listener).enterPredicate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JdScriptQuerySqlListener ) ((JdScriptQuerySqlListener)listener).exitPredicate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JdScriptQuerySqlVisitor ) return ((JdScriptQuerySqlVisitor<? extends T>)visitor).visitPredicate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PredicateContext predicate() throws RecognitionException {
		PredicateContext _localctx = new PredicateContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_predicate);
		int _la;
		try {
			setState(1963);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,259,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1923);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(1922);
					match(NOT);
					}
				}

				setState(1925);
				((PredicateContext)_localctx).kind = match(BETWEEN);
				setState(1926);
				((PredicateContext)_localctx).lower = valueExpression(0);
				setState(1927);
				match(AND);
				setState(1928);
				((PredicateContext)_localctx).upper = valueExpression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1931);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(1930);
					match(NOT);
					}
				}

				setState(1933);
				((PredicateContext)_localctx).kind = match(IN);
				setState(1934);
				match(T__6);
				setState(1935);
				expression();
				setState(1940);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__8) {
					{
					{
					setState(1936);
					match(T__8);
					setState(1937);
					expression();
					}
					}
					setState(1942);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1943);
				match(T__7);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1946);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(1945);
					match(NOT);
					}
				}

				setState(1948);
				((PredicateContext)_localctx).kind = match(IN);
				setState(1949);
				match(T__6);
				setState(1950);
				query();
				setState(1951);
				match(T__7);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1954);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(1953);
					match(NOT);
					}
				}

				setState(1956);
				((PredicateContext)_localctx).kind = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==LIKE || _la==RLIKE) ) {
					((PredicateContext)_localctx).kind = (Token)_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(1957);
				((PredicateContext)_localctx).pattern = valueExpression(0);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1958);
				match(IS);
				setState(1960);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(1959);
					match(NOT);
					}
				}

				setState(1962);
				((PredicateContext)_localctx).kind = match(NULL);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ValueExpressionContext extends ParserRuleContext {
		public ValueExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valueExpression; }
	 
		public ValueExpressionContext() { }
		public void copyFrom(ValueExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ValueExpressionDefaultContext extends ValueExpressionContext {
		public PrimaryExpressionContext primaryExpression() {
			return getRuleContext(PrimaryExpressionContext.class,0);
		}
		public ValueExpressionDefaultContext(ValueExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JdScriptQuerySqlListener ) ((JdScriptQuerySqlListener)listener).enterValueExpressionDefault(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JdScriptQuerySqlListener ) ((JdScriptQuerySqlListener)listener).exitValueExpressionDefault(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JdScriptQuerySqlVisitor ) return ((JdScriptQuerySqlVisitor<? extends T>)visitor).visitValueExpressionDefault(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ComparisonContext extends ValueExpressionContext {
		public ValueExpressionContext left;
		public ValueExpressionContext right;
		public ComparisonOperatorContext comparisonOperator() {
			return getRuleContext(ComparisonOperatorContext.class,0);
		}
		public List<ValueExpressionContext> valueExpression() {
			return getRuleContexts(ValueExpressionContext.class);
		}
		public ValueExpressionContext valueExpression(int i) {
			return getRuleContext(ValueExpressionContext.class,i);
		}
		public ComparisonContext(ValueExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JdScriptQuerySqlListener ) ((JdScriptQuerySqlListener)listener).enterComparison(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JdScriptQuerySqlListener ) ((JdScriptQuerySqlListener)listener).exitComparison(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JdScriptQuerySqlVisitor ) return ((JdScriptQuerySqlVisitor<? extends T>)visitor).visitComparison(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArithmeticBinaryContext extends ValueExpressionContext {
		public ValueExpressionContext left;
		public Token operator;
		public ValueExpressionContext right;
		public List<ValueExpressionContext> valueExpression() {
			return getRuleContexts(ValueExpressionContext.class);
		}
		public ValueExpressionContext valueExpression(int i) {
			return getRuleContext(ValueExpressionContext.class,i);
		}
		public TerminalNode ASTERISK() { return getToken(JdScriptQuerySqlParser.ASTERISK, 0); }
		public TerminalNode SLASH() { return getToken(JdScriptQuerySqlParser.SLASH, 0); }
		public TerminalNode PERCENT() { return getToken(JdScriptQuerySqlParser.PERCENT, 0); }
		public TerminalNode DIV() { return getToken(JdScriptQuerySqlParser.DIV, 0); }
		public TerminalNode PLUS() { return getToken(JdScriptQuerySqlParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(JdScriptQuerySqlParser.MINUS, 0); }
		public TerminalNode AMPERSAND() { return getToken(JdScriptQuerySqlParser.AMPERSAND, 0); }
		public TerminalNode HAT() { return getToken(JdScriptQuerySqlParser.HAT, 0); }
		public TerminalNode PIPE() { return getToken(JdScriptQuerySqlParser.PIPE, 0); }
		public ArithmeticBinaryContext(ValueExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JdScriptQuerySqlListener ) ((JdScriptQuerySqlListener)listener).enterArithmeticBinary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JdScriptQuerySqlListener ) ((JdScriptQuerySqlListener)listener).exitArithmeticBinary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JdScriptQuerySqlVisitor ) return ((JdScriptQuerySqlVisitor<? extends T>)visitor).visitArithmeticBinary(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArithmeticUnaryContext extends ValueExpressionContext {
		public Token operator;
		public ValueExpressionContext valueExpression() {
			return getRuleContext(ValueExpressionContext.class,0);
		}
		public TerminalNode MINUS() { return getToken(JdScriptQuerySqlParser.MINUS, 0); }
		public TerminalNode PLUS() { return getToken(JdScriptQuerySqlParser.PLUS, 0); }
		public TerminalNode TILDE() { return getToken(JdScriptQuerySqlParser.TILDE, 0); }
		public ArithmeticUnaryContext(ValueExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JdScriptQuerySqlListener ) ((JdScriptQuerySqlListener)listener).enterArithmeticUnary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JdScriptQuerySqlListener ) ((JdScriptQuerySqlListener)listener).exitArithmeticUnary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JdScriptQuerySqlVisitor ) return ((JdScriptQuerySqlVisitor<? extends T>)visitor).visitArithmeticUnary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueExpressionContext valueExpression() throws RecognitionException {
		return valueExpression(0);
	}

	private ValueExpressionContext valueExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ValueExpressionContext _localctx = new ValueExpressionContext(_ctx, _parentState);
		ValueExpressionContext _prevctx = _localctx;
		int _startState = 166;
		enterRecursionRule(_localctx, 166, RULE_valueExpression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1969);
			switch (_input.LA(1)) {
			case T__6:
			case SELECT:
			case FROM:
			case ADD:
			case AS:
			case ALL:
			case DISTINCT:
			case WHERE:
			case GROUP:
			case BY:
			case GROUPING:
			case SETS:
			case CUBE:
			case ROLLUP:
			case ORDER:
			case HAVING:
			case LIMIT:
			case AT:
			case OR:
			case AND:
			case IN:
			case NOT:
			case NO:
			case EXISTS:
			case BETWEEN:
			case LIKE:
			case RLIKE:
			case IS:
			case NULL:
			case TRUE:
			case FALSE:
			case NULLS:
			case ASC:
			case DESC:
			case FOR:
			case INTERVAL:
			case CASE:
			case WHEN:
			case THEN:
			case ELSE:
			case END:
			case JOIN:
			case CROSS:
			case OUTER:
			case INNER:
			case LEFT:
			case SEMI:
			case RIGHT:
			case FULL:
			case NATURAL:
			case ON:
			case LATERAL:
			case WINDOW:
			case OVER:
			case PARTITION:
			case RANGE:
			case ROWS:
			case UNBOUNDED:
			case PRECEDING:
			case FOLLOWING:
			case CURRENT:
			case ROW:
			case WITH:
			case VALUES:
			case CREATE:
			case TABLE:
			case VIEW:
			case REPLACE:
			case INSERT:
			case DELETE:
			case INTO:
			case DESCRIBE:
			case EXPLAIN:
			case FORMAT:
			case LOGICAL:
			case CODEGEN:
			case CAST:
			case SHOW:
			case TABLES:
			case COLUMNS:
			case COLUMN:
			case USE:
			case PARTITIONS:
			case FUNCTIONS:
			case DROP:
			case UNION:
			case EXCEPT:
			case INTERSECT:
			case TO:
			case TABLESAMPLE:
			case STRATIFY:
			case ALTER:
			case RENAME:
			case ARRAY:
			case MAP:
			case STRUCT:
			case COMMENT:
			case SET:
			case RESET:
			case DATA:
			case START:
			case TRANSACTION:
			case COMMIT:
			case ROLLBACK:
			case MACRO:
			case IF:
			case ASTERISK:
			case DIV:
			case PERCENTLIT:
			case BUCKET:
			case OUT:
			case OF:
			case SORT:
			case CLUSTER:
			case DISTRIBUTE:
			case OVERWRITE:
			case TRANSFORM:
			case REDUCE:
			case USING:
			case SERDE:
			case SERDEPROPERTIES:
			case RECORDREADER:
			case RECORDWRITER:
			case DELIMITED:
			case FIELDS:
			case TERMINATED:
			case COLLECTION:
			case ITEMS:
			case KEYS:
			case ESCAPED:
			case LINES:
			case SEPARATED:
			case FUNCTION:
			case EXTENDED:
			case REFRESH:
			case CLEAR:
			case CACHE:
			case UNCACHE:
			case LAZY:
			case FORMATTED:
			case TEMPORARY:
			case OPTIONS:
			case UNSET:
			case TBLPROPERTIES:
			case DBPROPERTIES:
			case BUCKETS:
			case SKEWED:
			case STORED:
			case DIRECTORIES:
			case LOCATION:
			case EXCHANGE:
			case ARCHIVE:
			case UNARCHIVE:
			case FILEFORMAT:
			case TOUCH:
			case COMPACT:
			case CONCATENATE:
			case CHANGE:
			case CASCADE:
			case RESTRICT:
			case CLUSTERED:
			case SORTED:
			case PURGE:
			case INPUTFORMAT:
			case OUTPUTFORMAT:
			case DATABASE:
			case DATABASES:
			case DFS:
			case TRUNCATE:
			case ANALYZE:
			case COMPUTE:
			case LIST:
			case STATISTICS:
			case PARTITIONED:
			case EXTERNAL:
			case DEFINED:
			case REVOKE:
			case GRANT:
			case LOCK:
			case UNLOCK:
			case MSCK:
			case REPAIR:
			case EXPORT:
			case IMPORT:
			case LOAD:
			case ROLE:
			case ROLES:
			case COMPACTIONS:
			case PRINCIPALS:
			case TRANSACTIONS:
			case INDEX:
			case INDEXES:
			case LOCKS:
			case OPTION:
			case ANTI:
			case LOCAL:
			case INPATH:
			case STRING:
			case BIGINT_LITERAL:
			case SMALLINT_LITERAL:
			case TINYINT_LITERAL:
			case INTEGER_VALUE:
			case DECIMAL_VALUE:
			case SCIENTIFIC_DECIMAL_VALUE:
			case DOUBLE_LITERAL:
			case IDENTIFIER:
			case BACKQUOTED_IDENTIFIER:
				{
				_localctx = new ValueExpressionDefaultContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(1966);
				primaryExpression(0);
				}
				break;
			case PLUS:
			case MINUS:
			case TILDE:
				{
				_localctx = new ArithmeticUnaryContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1967);
				((ArithmeticUnaryContext)_localctx).operator = _input.LT(1);
				_la = _input.LA(1);
				if ( !(((((_la - 134)) & ~0x3f) == 0 && ((1L << (_la - 134)) & ((1L << (PLUS - 134)) | (1L << (MINUS - 134)) | (1L << (TILDE - 134)))) != 0)) ) {
					((ArithmeticUnaryContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(1968);
				valueExpression(7);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(1992);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,262,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1990);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,261,_ctx) ) {
					case 1:
						{
						_localctx = new ArithmeticBinaryContext(new ValueExpressionContext(_parentctx, _parentState));
						((ArithmeticBinaryContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_valueExpression);
						setState(1971);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(1972);
						((ArithmeticBinaryContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((((_la - 136)) & ~0x3f) == 0 && ((1L << (_la - 136)) & ((1L << (ASTERISK - 136)) | (1L << (SLASH - 136)) | (1L << (PERCENT - 136)) | (1L << (DIV - 136)))) != 0)) ) {
							((ArithmeticBinaryContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(1973);
						((ArithmeticBinaryContext)_localctx).right = valueExpression(7);
						}
						break;
					case 2:
						{
						_localctx = new ArithmeticBinaryContext(new ValueExpressionContext(_parentctx, _parentState));
						((ArithmeticBinaryContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_valueExpression);
						setState(1974);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(1975);
						((ArithmeticBinaryContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
							((ArithmeticBinaryContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(1976);
						((ArithmeticBinaryContext)_localctx).right = valueExpression(6);
						}
						break;
					case 3:
						{
						_localctx = new ArithmeticBinaryContext(new ValueExpressionContext(_parentctx, _parentState));
						((ArithmeticBinaryContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_valueExpression);
						setState(1977);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(1978);
						((ArithmeticBinaryContext)_localctx).operator = match(AMPERSAND);
						setState(1979);
						((ArithmeticBinaryContext)_localctx).right = valueExpression(5);
						}
						break;
					case 4:
						{
						_localctx = new ArithmeticBinaryContext(new ValueExpressionContext(_parentctx, _parentState));
						((ArithmeticBinaryContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_valueExpression);
						setState(1980);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(1981);
						((ArithmeticBinaryContext)_localctx).operator = match(HAT);
						setState(1982);
						((ArithmeticBinaryContext)_localctx).right = valueExpression(4);
						}
						break;
					case 5:
						{
						_localctx = new ArithmeticBinaryContext(new ValueExpressionContext(_parentctx, _parentState));
						((ArithmeticBinaryContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_valueExpression);
						setState(1983);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(1984);
						((ArithmeticBinaryContext)_localctx).operator = match(PIPE);
						setState(1985);
						((ArithmeticBinaryContext)_localctx).right = valueExpression(3);
						}
						break;
					case 6:
						{
						_localctx = new ComparisonContext(new ValueExpressionContext(_parentctx, _parentState));
						((ComparisonContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_valueExpression);
						setState(1986);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(1987);
						comparisonOperator();
						setState(1988);
						((ComparisonContext)_localctx).right = valueExpression(2);
						}
						break;
					}
					} 
				}
				setState(1994);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,262,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class PrimaryExpressionContext extends ParserRuleContext {
		public PrimaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryExpression; }
	 
		public PrimaryExpressionContext() { }
		public void copyFrom(PrimaryExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DereferenceContext extends PrimaryExpressionContext {
		public PrimaryExpressionContext base;
		public IdentifierContext fieldName;
		public PrimaryExpressionContext primaryExpression() {
			return getRuleContext(PrimaryExpressionContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public DereferenceContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JdScriptQuerySqlListener ) ((JdScriptQuerySqlListener)listener).enterDereference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JdScriptQuerySqlListener ) ((JdScriptQuerySqlListener)listener).exitDereference(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JdScriptQuerySqlVisitor ) return ((JdScriptQuerySqlVisitor<? extends T>)visitor).visitDereference(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SimpleCaseContext extends PrimaryExpressionContext {
		public ExpressionContext elseExpression;
		public TerminalNode CASE() { return getToken(JdScriptQuerySqlParser.CASE, 0); }
		public ValueExpressionContext valueExpression() {
			return getRuleContext(ValueExpressionContext.class,0);
		}
		public TerminalNode END() { return getToken(JdScriptQuerySqlParser.END, 0); }
		public List<WhenClauseContext> whenClause() {
			return getRuleContexts(WhenClauseContext.class);
		}
		public WhenClauseContext whenClause(int i) {
			return getRuleContext(WhenClauseContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(JdScriptQuerySqlParser.ELSE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public SimpleCaseContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JdScriptQuerySqlListener ) ((JdScriptQuerySqlListener)listener).enterSimpleCase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JdScriptQuerySqlListener ) ((JdScriptQuerySqlListener)listener).exitSimpleCase(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JdScriptQuerySqlVisitor ) return ((JdScriptQuerySqlVisitor<? extends T>)visitor).visitSimpleCase(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CastContext extends PrimaryExpressionContext {
		public TerminalNode CAST() { return getToken(JdScriptQuerySqlParser.CAST, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode AS() { return getToken(JdScriptQuerySqlParser.AS, 0); }
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public CastContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JdScriptQuerySqlListener ) ((JdScriptQuerySqlListener)listener).enterCast(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JdScriptQuerySqlListener ) ((JdScriptQuerySqlListener)listener).exitCast(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JdScriptQuerySqlVisitor ) return ((JdScriptQuerySqlVisitor<? extends T>)visitor).visitCast(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ConstantDefaultContext extends PrimaryExpressionContext {
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public ConstantDefaultContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JdScriptQuerySqlListener ) ((JdScriptQuerySqlListener)listener).enterConstantDefault(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JdScriptQuerySqlListener ) ((JdScriptQuerySqlListener)listener).exitConstantDefault(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JdScriptQuerySqlVisitor ) return ((JdScriptQuerySqlVisitor<? extends T>)visitor).visitConstantDefault(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ColumnReferenceContext extends PrimaryExpressionContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ColumnReferenceContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JdScriptQuerySqlListener ) ((JdScriptQuerySqlListener)listener).enterColumnReference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JdScriptQuerySqlListener ) ((JdScriptQuerySqlListener)listener).exitColumnReference(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JdScriptQuerySqlVisitor ) return ((JdScriptQuerySqlVisitor<? extends T>)visitor).visitColumnReference(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RowConstructorContext extends PrimaryExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public RowConstructorContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JdScriptQuerySqlListener ) ((JdScriptQuerySqlListener)listener).enterRowConstructor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JdScriptQuerySqlListener ) ((JdScriptQuerySqlListener)listener).exitRowConstructor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JdScriptQuerySqlVisitor ) return ((JdScriptQuerySqlVisitor<? extends T>)visitor).visitRowConstructor(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParenthesizedExpressionContext extends PrimaryExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ParenthesizedExpressionContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JdScriptQuerySqlListener ) ((JdScriptQuerySqlListener)listener).enterParenthesizedExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JdScriptQuerySqlListener ) ((JdScriptQuerySqlListener)listener).exitParenthesizedExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JdScriptQuerySqlVisitor ) return ((JdScriptQuerySqlVisitor<? extends T>)visitor).visitParenthesizedExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StarContext extends PrimaryExpressionContext {
		public TerminalNode ASTERISK() { return getToken(JdScriptQuerySqlParser.ASTERISK, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public StarContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JdScriptQuerySqlListener ) ((JdScriptQuerySqlListener)listener).enterStar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JdScriptQuerySqlListener ) ((JdScriptQuerySqlListener)listener).exitStar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JdScriptQuerySqlVisitor ) return ((JdScriptQuerySqlVisitor<? extends T>)visitor).visitStar(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SubscriptContext extends PrimaryExpressionContext {
		public PrimaryExpressionContext value;
		public ValueExpressionContext index;
		public PrimaryExpressionContext primaryExpression() {
			return getRuleContext(PrimaryExpressionContext.class,0);
		}
		public ValueExpressionContext valueExpression() {
			return getRuleContext(ValueExpressionContext.class,0);
		}
		public SubscriptContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JdScriptQuerySqlListener ) ((JdScriptQuerySqlListener)listener).enterSubscript(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JdScriptQuerySqlListener ) ((JdScriptQuerySqlListener)listener).exitSubscript(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JdScriptQuerySqlVisitor ) return ((JdScriptQuerySqlVisitor<? extends T>)visitor).visitSubscript(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FunctionCallContext extends PrimaryExpressionContext {
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode OVER() { return getToken(JdScriptQuerySqlParser.OVER, 0); }
		public WindowSpecContext windowSpec() {
			return getRuleContext(WindowSpecContext.class,0);
		}
		public SetQuantifierContext setQuantifier() {
			return getRuleContext(SetQuantifierContext.class,0);
		}
		public FunctionCallContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JdScriptQuerySqlListener ) ((JdScriptQuerySqlListener)listener).enterFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JdScriptQuerySqlListener ) ((JdScriptQuerySqlListener)listener).exitFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JdScriptQuerySqlVisitor ) return ((JdScriptQuerySqlVisitor<? extends T>)visitor).visitFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SearchedCaseContext extends PrimaryExpressionContext {
		public ExpressionContext elseExpression;
		public TerminalNode CASE() { return getToken(JdScriptQuerySqlParser.CASE, 0); }
		public TerminalNode END() { return getToken(JdScriptQuerySqlParser.END, 0); }
		public List<WhenClauseContext> whenClause() {
			return getRuleContexts(WhenClauseContext.class);
		}
		public WhenClauseContext whenClause(int i) {
			return getRuleContext(WhenClauseContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(JdScriptQuerySqlParser.ELSE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public SearchedCaseContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JdScriptQuerySqlListener ) ((JdScriptQuerySqlListener)listener).enterSearchedCase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JdScriptQuerySqlListener ) ((JdScriptQuerySqlListener)listener).exitSearchedCase(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JdScriptQuerySqlVisitor ) return ((JdScriptQuerySqlVisitor<? extends T>)visitor).visitSearchedCase(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SubqueryExpressionContext extends PrimaryExpressionContext {
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public SubqueryExpressionContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JdScriptQuerySqlListener ) ((JdScriptQuerySqlListener)listener).enterSubqueryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JdScriptQuerySqlListener ) ((JdScriptQuerySqlListener)listener).exitSubqueryExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JdScriptQuerySqlVisitor ) return ((JdScriptQuerySqlVisitor<? extends T>)visitor).visitSubqueryExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryExpressionContext primaryExpression() throws RecognitionException {
		return primaryExpression(0);
	}

	private PrimaryExpressionContext primaryExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		PrimaryExpressionContext _localctx = new PrimaryExpressionContext(_ctx, _parentState);
		PrimaryExpressionContext _prevctx = _localctx;
		int _startState = 168;
		enterRecursionRule(_localctx, 168, RULE_primaryExpression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2073);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,272,_ctx) ) {
			case 1:
				{
				_localctx = new ConstantDefaultContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(1996);
				constant();
				}
				break;
			case 2:
				{
				_localctx = new StarContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1997);
				match(ASTERISK);
				}
				break;
			case 3:
				{
				_localctx = new StarContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1998);
				qualifiedName();
				setState(1999);
				match(T__14);
				setState(2000);
				match(ASTERISK);
				}
				break;
			case 4:
				{
				_localctx = new RowConstructorContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2002);
				match(T__6);
				setState(2003);
				expression();
				setState(2006); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(2004);
					match(T__8);
					setState(2005);
					expression();
					}
					}
					setState(2008); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__8 );
				setState(2010);
				match(T__7);
				}
				break;
			case 5:
				{
				_localctx = new FunctionCallContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2012);
				qualifiedName();
				setState(2013);
				match(T__6);
				setState(2025);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << SELECT) | (1L << FROM) | (1L << ADD) | (1L << AS) | (1L << ALL) | (1L << DISTINCT) | (1L << WHERE) | (1L << GROUP) | (1L << BY) | (1L << GROUPING) | (1L << SETS) | (1L << CUBE) | (1L << ROLLUP) | (1L << ORDER) | (1L << HAVING) | (1L << LIMIT) | (1L << AT) | (1L << OR) | (1L << AND) | (1L << IN) | (1L << NOT) | (1L << NO) | (1L << EXISTS) | (1L << BETWEEN) | (1L << LIKE) | (1L << RLIKE) | (1L << IS) | (1L << NULL) | (1L << TRUE) | (1L << FALSE) | (1L << NULLS) | (1L << ASC) | (1L << DESC) | (1L << FOR) | (1L << INTERVAL) | (1L << CASE) | (1L << WHEN) | (1L << THEN) | (1L << ELSE) | (1L << END) | (1L << JOIN) | (1L << CROSS) | (1L << OUTER))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (INNER - 64)) | (1L << (LEFT - 64)) | (1L << (SEMI - 64)) | (1L << (RIGHT - 64)) | (1L << (FULL - 64)) | (1L << (NATURAL - 64)) | (1L << (ON - 64)) | (1L << (LATERAL - 64)) | (1L << (WINDOW - 64)) | (1L << (OVER - 64)) | (1L << (PARTITION - 64)) | (1L << (RANGE - 64)) | (1L << (ROWS - 64)) | (1L << (UNBOUNDED - 64)) | (1L << (PRECEDING - 64)) | (1L << (FOLLOWING - 64)) | (1L << (CURRENT - 64)) | (1L << (ROW - 64)) | (1L << (WITH - 64)) | (1L << (VALUES - 64)) | (1L << (CREATE - 64)) | (1L << (TABLE - 64)) | (1L << (VIEW - 64)) | (1L << (REPLACE - 64)) | (1L << (INSERT - 64)) | (1L << (DELETE - 64)) | (1L << (INTO - 64)) | (1L << (DESCRIBE - 64)) | (1L << (EXPLAIN - 64)) | (1L << (FORMAT - 64)) | (1L << (LOGICAL - 64)) | (1L << (CODEGEN - 64)) | (1L << (CAST - 64)) | (1L << (SHOW - 64)) | (1L << (TABLES - 64)) | (1L << (COLUMNS - 64)) | (1L << (COLUMN - 64)) | (1L << (USE - 64)) | (1L << (PARTITIONS - 64)) | (1L << (FUNCTIONS - 64)) | (1L << (DROP - 64)) | (1L << (UNION - 64)) | (1L << (EXCEPT - 64)) | (1L << (INTERSECT - 64)) | (1L << (TO - 64)) | (1L << (TABLESAMPLE - 64)) | (1L << (STRATIFY - 64)) | (1L << (ALTER - 64)) | (1L << (RENAME - 64)) | (1L << (ARRAY - 64)) | (1L << (MAP - 64)) | (1L << (STRUCT - 64)) | (1L << (COMMENT - 64)) | (1L << (SET - 64)) | (1L << (RESET - 64)) | (1L << (DATA - 64)) | (1L << (START - 64)) | (1L << (TRANSACTION - 64)) | (1L << (COMMIT - 64)) | (1L << (ROLLBACK - 64)) | (1L << (MACRO - 64)) | (1L << (IF - 64)))) != 0) || ((((_la - 134)) & ~0x3f) == 0 && ((1L << (_la - 134)) & ((1L << (PLUS - 134)) | (1L << (MINUS - 134)) | (1L << (ASTERISK - 134)) | (1L << (DIV - 134)) | (1L << (TILDE - 134)) | (1L << (PERCENTLIT - 134)) | (1L << (BUCKET - 134)) | (1L << (OUT - 134)) | (1L << (OF - 134)) | (1L << (SORT - 134)) | (1L << (CLUSTER - 134)) | (1L << (DISTRIBUTE - 134)) | (1L << (OVERWRITE - 134)) | (1L << (TRANSFORM - 134)) | (1L << (REDUCE - 134)) | (1L << (USING - 134)) | (1L << (SERDE - 134)) | (1L << (SERDEPROPERTIES - 134)) | (1L << (RECORDREADER - 134)) | (1L << (RECORDWRITER - 134)) | (1L << (DELIMITED - 134)) | (1L << (FIELDS - 134)) | (1L << (TERMINATED - 134)) | (1L << (COLLECTION - 134)) | (1L << (ITEMS - 134)) | (1L << (KEYS - 134)) | (1L << (ESCAPED - 134)) | (1L << (LINES - 134)) | (1L << (SEPARATED - 134)) | (1L << (FUNCTION - 134)) | (1L << (EXTENDED - 134)) | (1L << (REFRESH - 134)) | (1L << (CLEAR - 134)) | (1L << (CACHE - 134)) | (1L << (UNCACHE - 134)) | (1L << (LAZY - 134)) | (1L << (FORMATTED - 134)) | (1L << (TEMPORARY - 134)) | (1L << (OPTIONS - 134)) | (1L << (UNSET - 134)) | (1L << (TBLPROPERTIES - 134)) | (1L << (DBPROPERTIES - 134)) | (1L << (BUCKETS - 134)) | (1L << (SKEWED - 134)) | (1L << (STORED - 134)) | (1L << (DIRECTORIES - 134)) | (1L << (LOCATION - 134)) | (1L << (EXCHANGE - 134)) | (1L << (ARCHIVE - 134)) | (1L << (UNARCHIVE - 134)) | (1L << (FILEFORMAT - 134)) | (1L << (TOUCH - 134)) | (1L << (COMPACT - 134)) | (1L << (CONCATENATE - 134)) | (1L << (CHANGE - 134)) | (1L << (CASCADE - 134)) | (1L << (RESTRICT - 134)) | (1L << (CLUSTERED - 134)) | (1L << (SORTED - 134)))) != 0) || ((((_la - 198)) & ~0x3f) == 0 && ((1L << (_la - 198)) & ((1L << (PURGE - 198)) | (1L << (INPUTFORMAT - 198)) | (1L << (OUTPUTFORMAT - 198)) | (1L << (DATABASE - 198)) | (1L << (DATABASES - 198)) | (1L << (DFS - 198)) | (1L << (TRUNCATE - 198)) | (1L << (ANALYZE - 198)) | (1L << (COMPUTE - 198)) | (1L << (LIST - 198)) | (1L << (STATISTICS - 198)) | (1L << (PARTITIONED - 198)) | (1L << (EXTERNAL - 198)) | (1L << (DEFINED - 198)) | (1L << (REVOKE - 198)) | (1L << (GRANT - 198)) | (1L << (LOCK - 198)) | (1L << (UNLOCK - 198)) | (1L << (MSCK - 198)) | (1L << (REPAIR - 198)) | (1L << (EXPORT - 198)) | (1L << (IMPORT - 198)) | (1L << (LOAD - 198)) | (1L << (ROLE - 198)) | (1L << (ROLES - 198)) | (1L << (COMPACTIONS - 198)) | (1L << (PRINCIPALS - 198)) | (1L << (TRANSACTIONS - 198)) | (1L << (INDEX - 198)) | (1L << (INDEXES - 198)) | (1L << (LOCKS - 198)) | (1L << (OPTION - 198)) | (1L << (ANTI - 198)) | (1L << (LOCAL - 198)) | (1L << (INPATH - 198)) | (1L << (STRING - 198)) | (1L << (BIGINT_LITERAL - 198)) | (1L << (SMALLINT_LITERAL - 198)) | (1L << (TINYINT_LITERAL - 198)) | (1L << (INTEGER_VALUE - 198)) | (1L << (DECIMAL_VALUE - 198)) | (1L << (SCIENTIFIC_DECIMAL_VALUE - 198)) | (1L << (DOUBLE_LITERAL - 198)) | (1L << (IDENTIFIER - 198)) | (1L << (BACKQUOTED_IDENTIFIER - 198)))) != 0)) {
					{
					setState(2015);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,264,_ctx) ) {
					case 1:
						{
						setState(2014);
						setQuantifier();
						}
						break;
					}
					setState(2017);
					expression();
					setState(2022);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__8) {
						{
						{
						setState(2018);
						match(T__8);
						setState(2019);
						expression();
						}
						}
						setState(2024);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(2027);
				match(T__7);
				setState(2030);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,267,_ctx) ) {
				case 1:
					{
					setState(2028);
					match(OVER);
					setState(2029);
					windowSpec();
					}
					break;
				}
				}
				break;
			case 6:
				{
				_localctx = new SubqueryExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2032);
				match(T__6);
				setState(2033);
				query();
				setState(2034);
				match(T__7);
				}
				break;
			case 7:
				{
				_localctx = new SimpleCaseContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2036);
				match(CASE);
				setState(2037);
				valueExpression(0);
				setState(2039); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(2038);
					whenClause();
					}
					}
					setState(2041); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==WHEN );
				setState(2045);
				_la = _input.LA(1);
				if (_la==ELSE) {
					{
					setState(2043);
					match(ELSE);
					setState(2044);
					((SimpleCaseContext)_localctx).elseExpression = expression();
					}
				}

				setState(2047);
				match(END);
				}
				break;
			case 8:
				{
				_localctx = new SearchedCaseContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2049);
				match(CASE);
				setState(2051); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(2050);
					whenClause();
					}
					}
					setState(2053); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==WHEN );
				setState(2057);
				_la = _input.LA(1);
				if (_la==ELSE) {
					{
					setState(2055);
					match(ELSE);
					setState(2056);
					((SearchedCaseContext)_localctx).elseExpression = expression();
					}
				}

				setState(2059);
				match(END);
				}
				break;
			case 9:
				{
				_localctx = new CastContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2061);
				match(CAST);
				setState(2062);
				match(T__6);
				setState(2063);
				expression();
				setState(2064);
				match(AS);
				setState(2065);
				dataType();
				setState(2066);
				match(T__7);
				}
				break;
			case 10:
				{
				_localctx = new ColumnReferenceContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2068);
				identifier();
				}
				break;
			case 11:
				{
				_localctx = new ParenthesizedExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2069);
				match(T__6);
				setState(2070);
				expression();
				setState(2071);
				match(T__7);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(2085);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,274,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(2083);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,273,_ctx) ) {
					case 1:
						{
						_localctx = new SubscriptContext(new PrimaryExpressionContext(_parentctx, _parentState));
						((SubscriptContext)_localctx).value = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_primaryExpression);
						setState(2075);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(2076);
						match(T__11);
						setState(2077);
						((SubscriptContext)_localctx).index = valueExpression(0);
						setState(2078);
						match(T__12);
						}
						break;
					case 2:
						{
						_localctx = new DereferenceContext(new PrimaryExpressionContext(_parentctx, _parentState));
						((DereferenceContext)_localctx).base = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_primaryExpression);
						setState(2080);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(2081);
						match(T__14);
						setState(2082);
						((DereferenceContext)_localctx).fieldName = identifier();
						}
						break;
					}
					} 
				}
				setState(2087);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,274,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ConstantContext extends ParserRuleContext {
		public ConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant; }
	 
		public ConstantContext() { }
		public void copyFrom(ConstantContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NullLiteralContext extends ConstantContext {
		public TerminalNode NULL() { return getToken(JdScriptQuerySqlParser.NULL, 0); }
		public NullLiteralContext(ConstantContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JdScriptQuerySqlListener ) ((JdScriptQuerySqlListener)listener).enterNullLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JdScriptQuerySqlListener ) ((JdScriptQuerySqlListener)listener).exitNullLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JdScriptQuerySqlVisitor ) return ((JdScriptQuerySqlVisitor<? extends T>)visitor).visitNullLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StringLiteralContext extends ConstantContext {
		public List<TerminalNode> STRING() { return getTokens(JdScriptQuerySqlParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(JdScriptQuerySqlParser.STRING, i);
		}
		public StringLiteralContext(ConstantContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JdScriptQuerySqlListener ) ((JdScriptQuerySqlListener)listener).enterStringLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JdScriptQuerySqlListener ) ((JdScriptQuerySqlListener)listener).exitStringLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JdScriptQuerySqlVisitor ) return ((JdScriptQuerySqlVisitor<? extends T>)visitor).visitStringLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TypeConstructorContext extends ConstantContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode STRING() { return getToken(JdScriptQuerySqlParser.STRING, 0); }
		public TypeConstructorContext(ConstantContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JdScriptQuerySqlListener ) ((JdScriptQuerySqlListener)listener).enterTypeConstructor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JdScriptQuerySqlListener ) ((JdScriptQuerySqlListener)listener).exitTypeConstructor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JdScriptQuerySqlVisitor ) return ((JdScriptQuerySqlVisitor<? extends T>)visitor).visitTypeConstructor(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntervalLiteralContext extends ConstantContext {
		public IntervalContext interval() {
			return getRuleContext(IntervalContext.class,0);
		}
		public IntervalLiteralContext(ConstantContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JdScriptQuerySqlListener ) ((JdScriptQuerySqlListener)listener).enterIntervalLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JdScriptQuerySqlListener ) ((JdScriptQuerySqlListener)listener).exitIntervalLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JdScriptQuerySqlVisitor ) return ((JdScriptQuerySqlVisitor<? extends T>)visitor).visitIntervalLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NumericLiteralContext extends ConstantContext {
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public NumericLiteralContext(ConstantContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JdScriptQuerySqlListener ) ((JdScriptQuerySqlListener)listener).enterNumericLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JdScriptQuerySqlListener ) ((JdScriptQuerySqlListener)listener).exitNumericLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JdScriptQuerySqlVisitor ) return ((JdScriptQuerySqlVisitor<? extends T>)visitor).visitNumericLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BooleanLiteralContext extends ConstantContext {
		public BooleanValueContext booleanValue() {
			return getRuleContext(BooleanValueContext.class,0);
		}
		public BooleanLiteralContext(ConstantContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JdScriptQuerySqlListener ) ((JdScriptQuerySqlListener)listener).enterBooleanLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JdScriptQuerySqlListener ) ((JdScriptQuerySqlListener)listener).exitBooleanLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JdScriptQuerySqlVisitor ) return ((JdScriptQuerySqlVisitor<? extends T>)visitor).visitBooleanLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantContext constant() throws RecognitionException {
		ConstantContext _localctx = new ConstantContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_constant);
		try {
			int _alt;
			setState(2100);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,276,_ctx) ) {
			case 1:
				_localctx = new NullLiteralContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2088);
				match(NULL);
				}
				break;
			case 2:
				_localctx = new IntervalLiteralContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2089);
				interval();
				}
				break;
			case 3:
				_localctx = new TypeConstructorContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(2090);
				identifier();
				setState(2091);
				match(STRING);
				}
				break;
			case 4:
				_localctx = new NumericLiteralContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(2093);
				number();
				}
				break;
			case 5:
				_localctx = new BooleanLiteralContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(2094);
				booleanValue();
				}
				break;
			case 6:
				_localctx = new StringLiteralContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(2096); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(2095);
						match(STRING);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(2098); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,275,_ctx);
				} while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER );
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ComparisonOperatorContext extends ParserRuleContext {
		public TerminalNode EQ() { return getToken(JdScriptQuerySqlParser.EQ, 0); }
		public TerminalNode NEQ() { return getToken(JdScriptQuerySqlParser.NEQ, 0); }
		public TerminalNode NEQJ() { return getToken(JdScriptQuerySqlParser.NEQJ, 0); }
		public TerminalNode LT() { return getToken(JdScriptQuerySqlParser.LT, 0); }
		public TerminalNode LTE() { return getToken(JdScriptQuerySqlParser.LTE, 0); }
		public TerminalNode GT() { return getToken(JdScriptQuerySqlParser.GT, 0); }
		public TerminalNode GTE() { return getToken(JdScriptQuerySqlParser.GTE, 0); }
		public TerminalNode NSEQ() { return getToken(JdScriptQuerySqlParser.NSEQ, 0); }
		public ComparisonOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparisonOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JdScriptQuerySqlListener ) ((JdScriptQuerySqlListener)listener).enterComparisonOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JdScriptQuerySqlListener ) ((JdScriptQuerySqlListener)listener).exitComparisonOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JdScriptQuerySqlVisitor ) return ((JdScriptQuerySqlVisitor<? extends T>)visitor).visitComparisonOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComparisonOperatorContext comparisonOperator() throws RecognitionException {
		ComparisonOperatorContext _localctx = new ComparisonOperatorContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_comparisonOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2102);
			_la = _input.LA(1);
			if ( !(((((_la - 126)) & ~0x3f) == 0 && ((1L << (_la - 126)) & ((1L << (EQ - 126)) | (1L << (NSEQ - 126)) | (1L << (NEQ - 126)) | (1L << (NEQJ - 126)) | (1L << (LT - 126)) | (1L << (LTE - 126)) | (1L << (GT - 126)) | (1L << (GTE - 126)))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArithmeticOperatorContext extends ParserRuleContext {
		public TerminalNode PLUS() { return getToken(JdScriptQuerySqlParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(JdScriptQuerySqlParser.MINUS, 0); }
		public TerminalNode ASTERISK() { return getToken(JdScriptQuerySqlParser.ASTERISK, 0); }
		public TerminalNode SLASH() { return getToken(JdScriptQuerySqlParser.SLASH, 0); }
		public TerminalNode PERCENT() { return getToken(JdScriptQuerySqlParser.PERCENT, 0); }
		public TerminalNode DIV() { return getToken(JdScriptQuerySqlParser.DIV, 0); }
		public TerminalNode TILDE() { return getToken(JdScriptQuerySqlParser.TILDE, 0); }
		public TerminalNode AMPERSAND() { return getToken(JdScriptQuerySqlParser.AMPERSAND, 0); }
		public TerminalNode PIPE() { return getToken(JdScriptQuerySqlParser.PIPE, 0); }
		public TerminalNode HAT() { return getToken(JdScriptQuerySqlParser.HAT, 0); }
		public ArithmeticOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arithmeticOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JdScriptQuerySqlListener ) ((JdScriptQuerySqlListener)listener).enterArithmeticOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JdScriptQuerySqlListener ) ((JdScriptQuerySqlListener)listener).exitArithmeticOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JdScriptQuerySqlVisitor ) return ((JdScriptQuerySqlVisitor<? extends T>)visitor).visitArithmeticOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArithmeticOperatorContext arithmeticOperator() throws RecognitionException {
		ArithmeticOperatorContext _localctx = new ArithmeticOperatorContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_arithmeticOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2104);
			_la = _input.LA(1);
			if ( !(((((_la - 134)) & ~0x3f) == 0 && ((1L << (_la - 134)) & ((1L << (PLUS - 134)) | (1L << (MINUS - 134)) | (1L << (ASTERISK - 134)) | (1L << (SLASH - 134)) | (1L << (PERCENT - 134)) | (1L << (DIV - 134)) | (1L << (TILDE - 134)) | (1L << (AMPERSAND - 134)) | (1L << (PIPE - 134)) | (1L << (HAT - 134)))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PredicateOperatorContext extends ParserRuleContext {
		public TerminalNode OR() { return getToken(JdScriptQuerySqlParser.OR, 0); }
		public TerminalNode AND() { return getToken(JdScriptQuerySqlParser.AND, 0); }
		public TerminalNode IN() { return getToken(JdScriptQuerySqlParser.IN, 0); }
		public TerminalNode NOT() { return getToken(JdScriptQuerySqlParser.NOT, 0); }
		public PredicateOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_predicateOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JdScriptQuerySqlListener ) ((JdScriptQuerySqlListener)listener).enterPredicateOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JdScriptQuerySqlListener ) ((JdScriptQuerySqlListener)listener).exitPredicateOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JdScriptQuerySqlVisitor ) return ((JdScriptQuerySqlVisitor<? extends T>)visitor).visitPredicateOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PredicateOperatorContext predicateOperator() throws RecognitionException {
		PredicateOperatorContext _localctx = new PredicateOperatorContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_predicateOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2106);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OR) | (1L << AND) | (1L << IN) | (1L << NOT))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BooleanValueContext extends ParserRuleContext {
		public TerminalNode TRUE() { return getToken(JdScriptQuerySqlParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(JdScriptQuerySqlParser.FALSE, 0); }
		public BooleanValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JdScriptQuerySqlListener ) ((JdScriptQuerySqlListener)listener).enterBooleanValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JdScriptQuerySqlListener ) ((JdScriptQuerySqlListener)listener).exitBooleanValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JdScriptQuerySqlVisitor ) return ((JdScriptQuerySqlVisitor<? extends T>)visitor).visitBooleanValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BooleanValueContext booleanValue() throws RecognitionException {
		BooleanValueContext _localctx = new BooleanValueContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_booleanValue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2108);
			_la = _input.LA(1);
			if ( !(_la==TRUE || _la==FALSE) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IntervalContext extends ParserRuleContext {
		public TerminalNode INTERVAL() { return getToken(JdScriptQuerySqlParser.INTERVAL, 0); }
		public List<IntervalFieldContext> intervalField() {
			return getRuleContexts(IntervalFieldContext.class);
		}
		public IntervalFieldContext intervalField(int i) {
			return getRuleContext(IntervalFieldContext.class,i);
		}
		public IntervalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interval; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JdScriptQuerySqlListener ) ((JdScriptQuerySqlListener)listener).enterInterval(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JdScriptQuerySqlListener ) ((JdScriptQuerySqlListener)listener).exitInterval(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JdScriptQuerySqlVisitor ) return ((JdScriptQuerySqlVisitor<? extends T>)visitor).visitInterval(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntervalContext interval() throws RecognitionException {
		IntervalContext _localctx = new IntervalContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_interval);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2110);
			match(INTERVAL);
			setState(2114);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,277,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2111);
					intervalField();
					}
					} 
				}
				setState(2116);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,277,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IntervalFieldContext extends ParserRuleContext {
		public IntervalValueContext value;
		public IdentifierContext unit;
		public IdentifierContext to;
		public IntervalValueContext intervalValue() {
			return getRuleContext(IntervalValueContext.class,0);
		}
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public TerminalNode TO() { return getToken(JdScriptQuerySqlParser.TO, 0); }
		public IntervalFieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intervalField; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JdScriptQuerySqlListener ) ((JdScriptQuerySqlListener)listener).enterIntervalField(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JdScriptQuerySqlListener ) ((JdScriptQuerySqlListener)listener).exitIntervalField(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JdScriptQuerySqlVisitor ) return ((JdScriptQuerySqlVisitor<? extends T>)visitor).visitIntervalField(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntervalFieldContext intervalField() throws RecognitionException {
		IntervalFieldContext _localctx = new IntervalFieldContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_intervalField);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2117);
			((IntervalFieldContext)_localctx).value = intervalValue();
			setState(2118);
			((IntervalFieldContext)_localctx).unit = identifier();
			setState(2121);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,278,_ctx) ) {
			case 1:
				{
				setState(2119);
				match(TO);
				setState(2120);
				((IntervalFieldContext)_localctx).to = identifier();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IntervalValueContext extends ParserRuleContext {
		public TerminalNode INTEGER_VALUE() { return getToken(JdScriptQuerySqlParser.INTEGER_VALUE, 0); }
		public TerminalNode DECIMAL_VALUE() { return getToken(JdScriptQuerySqlParser.DECIMAL_VALUE, 0); }
		public TerminalNode PLUS() { return getToken(JdScriptQuerySqlParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(JdScriptQuerySqlParser.MINUS, 0); }
		public TerminalNode STRING() { return getToken(JdScriptQuerySqlParser.STRING, 0); }
		public IntervalValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intervalValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JdScriptQuerySqlListener ) ((JdScriptQuerySqlListener)listener).enterIntervalValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JdScriptQuerySqlListener ) ((JdScriptQuerySqlListener)listener).exitIntervalValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JdScriptQuerySqlVisitor ) return ((JdScriptQuerySqlVisitor<? extends T>)visitor).visitIntervalValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntervalValueContext intervalValue() throws RecognitionException {
		IntervalValueContext _localctx = new IntervalValueContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_intervalValue);
		int _la;
		try {
			setState(2128);
			switch (_input.LA(1)) {
			case PLUS:
			case MINUS:
			case INTEGER_VALUE:
			case DECIMAL_VALUE:
				enterOuterAlt(_localctx, 1);
				{
				setState(2124);
				_la = _input.LA(1);
				if (_la==PLUS || _la==MINUS) {
					{
					setState(2123);
					_la = _input.LA(1);
					if ( !(_la==PLUS || _la==MINUS) ) {
					_errHandler.recoverInline(this);
					} else {
						consume();
					}
					}
				}

				setState(2126);
				_la = _input.LA(1);
				if ( !(_la==INTEGER_VALUE || _la==DECIMAL_VALUE) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(2127);
				match(STRING);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DataTypeContext extends ParserRuleContext {
		public DataTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataType; }
	 
		public DataTypeContext() { }
		public void copyFrom(DataTypeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ComplexDataTypeContext extends DataTypeContext {
		public Token complex;
		public List<DataTypeContext> dataType() {
			return getRuleContexts(DataTypeContext.class);
		}
		public DataTypeContext dataType(int i) {
			return getRuleContext(DataTypeContext.class,i);
		}
		public TerminalNode ARRAY() { return getToken(JdScriptQuerySqlParser.ARRAY, 0); }
		public TerminalNode MAP() { return getToken(JdScriptQuerySqlParser.MAP, 0); }
		public TerminalNode STRUCT() { return getToken(JdScriptQuerySqlParser.STRUCT, 0); }
		public TerminalNode NEQ() { return getToken(JdScriptQuerySqlParser.NEQ, 0); }
		public ColTypeListContext colTypeList() {
			return getRuleContext(ColTypeListContext.class,0);
		}
		public ComplexDataTypeContext(DataTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JdScriptQuerySqlListener ) ((JdScriptQuerySqlListener)listener).enterComplexDataType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JdScriptQuerySqlListener ) ((JdScriptQuerySqlListener)listener).exitComplexDataType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JdScriptQuerySqlVisitor ) return ((JdScriptQuerySqlVisitor<? extends T>)visitor).visitComplexDataType(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PrimitiveDataTypeContext extends DataTypeContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<TerminalNode> INTEGER_VALUE() { return getTokens(JdScriptQuerySqlParser.INTEGER_VALUE); }
		public TerminalNode INTEGER_VALUE(int i) {
			return getToken(JdScriptQuerySqlParser.INTEGER_VALUE, i);
		}
		public PrimitiveDataTypeContext(DataTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JdScriptQuerySqlListener ) ((JdScriptQuerySqlListener)listener).enterPrimitiveDataType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JdScriptQuerySqlListener ) ((JdScriptQuerySqlListener)listener).exitPrimitiveDataType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JdScriptQuerySqlVisitor ) return ((JdScriptQuerySqlVisitor<? extends T>)visitor).visitPrimitiveDataType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DataTypeContext dataType() throws RecognitionException {
		DataTypeContext _localctx = new DataTypeContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_dataType);
		int _la;
		try {
			setState(2164);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,285,_ctx) ) {
			case 1:
				_localctx = new ComplexDataTypeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2130);
				((ComplexDataTypeContext)_localctx).complex = match(ARRAY);
				setState(2131);
				match(LT);
				setState(2132);
				dataType();
				setState(2133);
				match(GT);
				}
				break;
			case 2:
				_localctx = new ComplexDataTypeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2135);
				((ComplexDataTypeContext)_localctx).complex = match(MAP);
				setState(2136);
				match(LT);
				setState(2137);
				dataType();
				setState(2138);
				match(T__8);
				setState(2139);
				dataType();
				setState(2140);
				match(GT);
				}
				break;
			case 3:
				_localctx = new ComplexDataTypeContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(2142);
				((ComplexDataTypeContext)_localctx).complex = match(STRUCT);
				setState(2149);
				switch (_input.LA(1)) {
				case LT:
					{
					setState(2143);
					match(LT);
					setState(2145);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SELECT) | (1L << FROM) | (1L << ADD) | (1L << AS) | (1L << ALL) | (1L << DISTINCT) | (1L << WHERE) | (1L << GROUP) | (1L << BY) | (1L << GROUPING) | (1L << SETS) | (1L << CUBE) | (1L << ROLLUP) | (1L << ORDER) | (1L << HAVING) | (1L << LIMIT) | (1L << AT) | (1L << OR) | (1L << AND) | (1L << IN) | (1L << NOT) | (1L << NO) | (1L << EXISTS) | (1L << BETWEEN) | (1L << LIKE) | (1L << RLIKE) | (1L << IS) | (1L << NULL) | (1L << TRUE) | (1L << FALSE) | (1L << NULLS) | (1L << ASC) | (1L << DESC) | (1L << FOR) | (1L << INTERVAL) | (1L << CASE) | (1L << WHEN) | (1L << THEN) | (1L << ELSE) | (1L << END) | (1L << JOIN) | (1L << CROSS) | (1L << OUTER))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (INNER - 64)) | (1L << (LEFT - 64)) | (1L << (SEMI - 64)) | (1L << (RIGHT - 64)) | (1L << (FULL - 64)) | (1L << (NATURAL - 64)) | (1L << (ON - 64)) | (1L << (LATERAL - 64)) | (1L << (WINDOW - 64)) | (1L << (OVER - 64)) | (1L << (PARTITION - 64)) | (1L << (RANGE - 64)) | (1L << (ROWS - 64)) | (1L << (UNBOUNDED - 64)) | (1L << (PRECEDING - 64)) | (1L << (FOLLOWING - 64)) | (1L << (CURRENT - 64)) | (1L << (ROW - 64)) | (1L << (WITH - 64)) | (1L << (VALUES - 64)) | (1L << (CREATE - 64)) | (1L << (TABLE - 64)) | (1L << (VIEW - 64)) | (1L << (REPLACE - 64)) | (1L << (INSERT - 64)) | (1L << (DELETE - 64)) | (1L << (INTO - 64)) | (1L << (DESCRIBE - 64)) | (1L << (EXPLAIN - 64)) | (1L << (FORMAT - 64)) | (1L << (LOGICAL - 64)) | (1L << (CODEGEN - 64)) | (1L << (CAST - 64)) | (1L << (SHOW - 64)) | (1L << (TABLES - 64)) | (1L << (COLUMNS - 64)) | (1L << (COLUMN - 64)) | (1L << (USE - 64)) | (1L << (PARTITIONS - 64)) | (1L << (FUNCTIONS - 64)) | (1L << (DROP - 64)) | (1L << (UNION - 64)) | (1L << (EXCEPT - 64)) | (1L << (INTERSECT - 64)) | (1L << (TO - 64)) | (1L << (TABLESAMPLE - 64)) | (1L << (STRATIFY - 64)) | (1L << (ALTER - 64)) | (1L << (RENAME - 64)) | (1L << (ARRAY - 64)) | (1L << (MAP - 64)) | (1L << (STRUCT - 64)) | (1L << (COMMENT - 64)) | (1L << (SET - 64)) | (1L << (RESET - 64)) | (1L << (DATA - 64)) | (1L << (START - 64)) | (1L << (TRANSACTION - 64)) | (1L << (COMMIT - 64)) | (1L << (ROLLBACK - 64)) | (1L << (MACRO - 64)) | (1L << (IF - 64)))) != 0) || ((((_la - 139)) & ~0x3f) == 0 && ((1L << (_la - 139)) & ((1L << (DIV - 139)) | (1L << (PERCENTLIT - 139)) | (1L << (BUCKET - 139)) | (1L << (OUT - 139)) | (1L << (OF - 139)) | (1L << (SORT - 139)) | (1L << (CLUSTER - 139)) | (1L << (DISTRIBUTE - 139)) | (1L << (OVERWRITE - 139)) | (1L << (TRANSFORM - 139)) | (1L << (REDUCE - 139)) | (1L << (USING - 139)) | (1L << (SERDE - 139)) | (1L << (SERDEPROPERTIES - 139)) | (1L << (RECORDREADER - 139)) | (1L << (RECORDWRITER - 139)) | (1L << (DELIMITED - 139)) | (1L << (FIELDS - 139)) | (1L << (TERMINATED - 139)) | (1L << (COLLECTION - 139)) | (1L << (ITEMS - 139)) | (1L << (KEYS - 139)) | (1L << (ESCAPED - 139)) | (1L << (LINES - 139)) | (1L << (SEPARATED - 139)) | (1L << (FUNCTION - 139)) | (1L << (EXTENDED - 139)) | (1L << (REFRESH - 139)) | (1L << (CLEAR - 139)) | (1L << (CACHE - 139)) | (1L << (UNCACHE - 139)) | (1L << (LAZY - 139)) | (1L << (FORMATTED - 139)) | (1L << (TEMPORARY - 139)) | (1L << (OPTIONS - 139)) | (1L << (UNSET - 139)) | (1L << (TBLPROPERTIES - 139)) | (1L << (DBPROPERTIES - 139)) | (1L << (BUCKETS - 139)) | (1L << (SKEWED - 139)) | (1L << (STORED - 139)) | (1L << (DIRECTORIES - 139)) | (1L << (LOCATION - 139)) | (1L << (EXCHANGE - 139)) | (1L << (ARCHIVE - 139)) | (1L << (UNARCHIVE - 139)) | (1L << (FILEFORMAT - 139)) | (1L << (TOUCH - 139)) | (1L << (COMPACT - 139)) | (1L << (CONCATENATE - 139)) | (1L << (CHANGE - 139)) | (1L << (CASCADE - 139)) | (1L << (RESTRICT - 139)) | (1L << (CLUSTERED - 139)) | (1L << (SORTED - 139)) | (1L << (PURGE - 139)) | (1L << (INPUTFORMAT - 139)) | (1L << (OUTPUTFORMAT - 139)) | (1L << (DATABASE - 139)) | (1L << (DATABASES - 139)))) != 0) || ((((_la - 203)) & ~0x3f) == 0 && ((1L << (_la - 203)) & ((1L << (DFS - 203)) | (1L << (TRUNCATE - 203)) | (1L << (ANALYZE - 203)) | (1L << (COMPUTE - 203)) | (1L << (LIST - 203)) | (1L << (STATISTICS - 203)) | (1L << (PARTITIONED - 203)) | (1L << (EXTERNAL - 203)) | (1L << (DEFINED - 203)) | (1L << (REVOKE - 203)) | (1L << (GRANT - 203)) | (1L << (LOCK - 203)) | (1L << (UNLOCK - 203)) | (1L << (MSCK - 203)) | (1L << (REPAIR - 203)) | (1L << (EXPORT - 203)) | (1L << (IMPORT - 203)) | (1L << (LOAD - 203)) | (1L << (ROLE - 203)) | (1L << (ROLES - 203)) | (1L << (COMPACTIONS - 203)) | (1L << (PRINCIPALS - 203)) | (1L << (TRANSACTIONS - 203)) | (1L << (INDEX - 203)) | (1L << (INDEXES - 203)) | (1L << (LOCKS - 203)) | (1L << (OPTION - 203)) | (1L << (ANTI - 203)) | (1L << (LOCAL - 203)) | (1L << (INPATH - 203)) | (1L << (IDENTIFIER - 203)) | (1L << (BACKQUOTED_IDENTIFIER - 203)))) != 0)) {
						{
						setState(2144);
						colTypeList();
						}
					}

					setState(2147);
					match(GT);
					}
					break;
				case NEQ:
					{
					setState(2148);
					match(NEQ);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 4:
				_localctx = new PrimitiveDataTypeContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(2151);
				identifier();
				setState(2162);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,284,_ctx) ) {
				case 1:
					{
					setState(2152);
					match(T__6);
					setState(2153);
					match(INTEGER_VALUE);
					setState(2158);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__8) {
						{
						{
						setState(2154);
						match(T__8);
						setState(2155);
						match(INTEGER_VALUE);
						}
						}
						setState(2160);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(2161);
					match(T__7);
					}
					break;
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ColTypeListContext extends ParserRuleContext {
		public List<ColTypeContext> colType() {
			return getRuleContexts(ColTypeContext.class);
		}
		public ColTypeContext colType(int i) {
			return getRuleContext(ColTypeContext.class,i);
		}
		public ColTypeListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_colTypeList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JdScriptQuerySqlListener ) ((JdScriptQuerySqlListener)listener).enterColTypeList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JdScriptQuerySqlListener ) ((JdScriptQuerySqlListener)listener).exitColTypeList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JdScriptQuerySqlVisitor ) return ((JdScriptQuerySqlVisitor<? extends T>)visitor).visitColTypeList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColTypeListContext colTypeList() throws RecognitionException {
		ColTypeListContext _localctx = new ColTypeListContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_colTypeList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2166);
			colType();
			setState(2171);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,286,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2167);
					match(T__8);
					setState(2168);
					colType();
					}
					} 
				}
				setState(2173);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,286,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ColTypeContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public TerminalNode COMMENT() { return getToken(JdScriptQuerySqlParser.COMMENT, 0); }
		public TerminalNode STRING() { return getToken(JdScriptQuerySqlParser.STRING, 0); }
		public ColTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_colType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JdScriptQuerySqlListener ) ((JdScriptQuerySqlListener)listener).enterColType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JdScriptQuerySqlListener ) ((JdScriptQuerySqlListener)listener).exitColType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JdScriptQuerySqlVisitor ) return ((JdScriptQuerySqlVisitor<? extends T>)visitor).visitColType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColTypeContext colType() throws RecognitionException {
		ColTypeContext _localctx = new ColTypeContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_colType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2174);
			identifier();
			setState(2176);
			_la = _input.LA(1);
			if (_la==T__13) {
				{
				setState(2175);
				match(T__13);
				}
			}

			setState(2178);
			dataType();
			setState(2181);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,288,_ctx) ) {
			case 1:
				{
				setState(2179);
				match(COMMENT);
				setState(2180);
				match(STRING);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WhenClauseContext extends ParserRuleContext {
		public ExpressionContext condition;
		public ExpressionContext result;
		public TerminalNode WHEN() { return getToken(JdScriptQuerySqlParser.WHEN, 0); }
		public TerminalNode THEN() { return getToken(JdScriptQuerySqlParser.THEN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public WhenClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whenClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JdScriptQuerySqlListener ) ((JdScriptQuerySqlListener)listener).enterWhenClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JdScriptQuerySqlListener ) ((JdScriptQuerySqlListener)listener).exitWhenClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JdScriptQuerySqlVisitor ) return ((JdScriptQuerySqlVisitor<? extends T>)visitor).visitWhenClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhenClauseContext whenClause() throws RecognitionException {
		WhenClauseContext _localctx = new WhenClauseContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_whenClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2183);
			match(WHEN);
			setState(2184);
			((WhenClauseContext)_localctx).condition = expression();
			setState(2185);
			match(THEN);
			setState(2186);
			((WhenClauseContext)_localctx).result = expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WindowsContext extends ParserRuleContext {
		public TerminalNode WINDOW() { return getToken(JdScriptQuerySqlParser.WINDOW, 0); }
		public List<NamedWindowContext> namedWindow() {
			return getRuleContexts(NamedWindowContext.class);
		}
		public NamedWindowContext namedWindow(int i) {
			return getRuleContext(NamedWindowContext.class,i);
		}
		public WindowsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_windows; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JdScriptQuerySqlListener ) ((JdScriptQuerySqlListener)listener).enterWindows(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JdScriptQuerySqlListener ) ((JdScriptQuerySqlListener)listener).exitWindows(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JdScriptQuerySqlVisitor ) return ((JdScriptQuerySqlVisitor<? extends T>)visitor).visitWindows(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WindowsContext windows() throws RecognitionException {
		WindowsContext _localctx = new WindowsContext(_ctx, getState());
		enterRule(_localctx, 194, RULE_windows);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2188);
			match(WINDOW);
			setState(2189);
			namedWindow();
			setState(2194);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,289,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2190);
					match(T__8);
					setState(2191);
					namedWindow();
					}
					} 
				}
				setState(2196);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,289,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NamedWindowContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode AS() { return getToken(JdScriptQuerySqlParser.AS, 0); }
		public WindowSpecContext windowSpec() {
			return getRuleContext(WindowSpecContext.class,0);
		}
		public NamedWindowContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namedWindow; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JdScriptQuerySqlListener ) ((JdScriptQuerySqlListener)listener).enterNamedWindow(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JdScriptQuerySqlListener ) ((JdScriptQuerySqlListener)listener).exitNamedWindow(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JdScriptQuerySqlVisitor ) return ((JdScriptQuerySqlVisitor<? extends T>)visitor).visitNamedWindow(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NamedWindowContext namedWindow() throws RecognitionException {
		NamedWindowContext _localctx = new NamedWindowContext(_ctx, getState());
		enterRule(_localctx, 196, RULE_namedWindow);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2197);
			identifier();
			setState(2198);
			match(AS);
			setState(2199);
			windowSpec();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WindowSpecContext extends ParserRuleContext {
		public WindowSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_windowSpec; }
	 
		public WindowSpecContext() { }
		public void copyFrom(WindowSpecContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class WindowRefContext extends WindowSpecContext {
		public IdentifierContext name;
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public WindowRefContext(WindowSpecContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JdScriptQuerySqlListener ) ((JdScriptQuerySqlListener)listener).enterWindowRef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JdScriptQuerySqlListener ) ((JdScriptQuerySqlListener)listener).exitWindowRef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JdScriptQuerySqlVisitor ) return ((JdScriptQuerySqlVisitor<? extends T>)visitor).visitWindowRef(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class WindowDefContext extends WindowSpecContext {
		public ExpressionContext expression;
		public List<ExpressionContext> partition = new ArrayList<ExpressionContext>();
		public TerminalNode CLUSTER() { return getToken(JdScriptQuerySqlParser.CLUSTER, 0); }
		public List<TerminalNode> BY() { return getTokens(JdScriptQuerySqlParser.BY); }
		public TerminalNode BY(int i) {
			return getToken(JdScriptQuerySqlParser.BY, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public WindowFrameContext windowFrame() {
			return getRuleContext(WindowFrameContext.class,0);
		}
		public List<SortItemContext> sortItem() {
			return getRuleContexts(SortItemContext.class);
		}
		public SortItemContext sortItem(int i) {
			return getRuleContext(SortItemContext.class,i);
		}
		public TerminalNode PARTITION() { return getToken(JdScriptQuerySqlParser.PARTITION, 0); }
		public TerminalNode DISTRIBUTE() { return getToken(JdScriptQuerySqlParser.DISTRIBUTE, 0); }
		public TerminalNode ORDER() { return getToken(JdScriptQuerySqlParser.ORDER, 0); }
		public TerminalNode SORT() { return getToken(JdScriptQuerySqlParser.SORT, 0); }
		public WindowDefContext(WindowSpecContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JdScriptQuerySqlListener ) ((JdScriptQuerySqlListener)listener).enterWindowDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JdScriptQuerySqlListener ) ((JdScriptQuerySqlListener)listener).exitWindowDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JdScriptQuerySqlVisitor ) return ((JdScriptQuerySqlVisitor<? extends T>)visitor).visitWindowDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WindowSpecContext windowSpec() throws RecognitionException {
		WindowSpecContext _localctx = new WindowSpecContext(_ctx, getState());
		enterRule(_localctx, 198, RULE_windowSpec);
		int _la;
		try {
			setState(2243);
			switch (_input.LA(1)) {
			case SELECT:
			case FROM:
			case ADD:
			case AS:
			case ALL:
			case DISTINCT:
			case WHERE:
			case GROUP:
			case BY:
			case GROUPING:
			case SETS:
			case CUBE:
			case ROLLUP:
			case ORDER:
			case HAVING:
			case LIMIT:
			case AT:
			case OR:
			case AND:
			case IN:
			case NOT:
			case NO:
			case EXISTS:
			case BETWEEN:
			case LIKE:
			case RLIKE:
			case IS:
			case NULL:
			case TRUE:
			case FALSE:
			case NULLS:
			case ASC:
			case DESC:
			case FOR:
			case INTERVAL:
			case CASE:
			case WHEN:
			case THEN:
			case ELSE:
			case END:
			case JOIN:
			case CROSS:
			case OUTER:
			case INNER:
			case LEFT:
			case SEMI:
			case RIGHT:
			case FULL:
			case NATURAL:
			case ON:
			case LATERAL:
			case WINDOW:
			case OVER:
			case PARTITION:
			case RANGE:
			case ROWS:
			case UNBOUNDED:
			case PRECEDING:
			case FOLLOWING:
			case CURRENT:
			case ROW:
			case WITH:
			case VALUES:
			case CREATE:
			case TABLE:
			case VIEW:
			case REPLACE:
			case INSERT:
			case DELETE:
			case INTO:
			case DESCRIBE:
			case EXPLAIN:
			case FORMAT:
			case LOGICAL:
			case CODEGEN:
			case CAST:
			case SHOW:
			case TABLES:
			case COLUMNS:
			case COLUMN:
			case USE:
			case PARTITIONS:
			case FUNCTIONS:
			case DROP:
			case UNION:
			case EXCEPT:
			case INTERSECT:
			case TO:
			case TABLESAMPLE:
			case STRATIFY:
			case ALTER:
			case RENAME:
			case ARRAY:
			case MAP:
			case STRUCT:
			case COMMENT:
			case SET:
			case RESET:
			case DATA:
			case START:
			case TRANSACTION:
			case COMMIT:
			case ROLLBACK:
			case MACRO:
			case IF:
			case DIV:
			case PERCENTLIT:
			case BUCKET:
			case OUT:
			case OF:
			case SORT:
			case CLUSTER:
			case DISTRIBUTE:
			case OVERWRITE:
			case TRANSFORM:
			case REDUCE:
			case USING:
			case SERDE:
			case SERDEPROPERTIES:
			case RECORDREADER:
			case RECORDWRITER:
			case DELIMITED:
			case FIELDS:
			case TERMINATED:
			case COLLECTION:
			case ITEMS:
			case KEYS:
			case ESCAPED:
			case LINES:
			case SEPARATED:
			case FUNCTION:
			case EXTENDED:
			case REFRESH:
			case CLEAR:
			case CACHE:
			case UNCACHE:
			case LAZY:
			case FORMATTED:
			case TEMPORARY:
			case OPTIONS:
			case UNSET:
			case TBLPROPERTIES:
			case DBPROPERTIES:
			case BUCKETS:
			case SKEWED:
			case STORED:
			case DIRECTORIES:
			case LOCATION:
			case EXCHANGE:
			case ARCHIVE:
			case UNARCHIVE:
			case FILEFORMAT:
			case TOUCH:
			case COMPACT:
			case CONCATENATE:
			case CHANGE:
			case CASCADE:
			case RESTRICT:
			case CLUSTERED:
			case SORTED:
			case PURGE:
			case INPUTFORMAT:
			case OUTPUTFORMAT:
			case DATABASE:
			case DATABASES:
			case DFS:
			case TRUNCATE:
			case ANALYZE:
			case COMPUTE:
			case LIST:
			case STATISTICS:
			case PARTITIONED:
			case EXTERNAL:
			case DEFINED:
			case REVOKE:
			case GRANT:
			case LOCK:
			case UNLOCK:
			case MSCK:
			case REPAIR:
			case EXPORT:
			case IMPORT:
			case LOAD:
			case ROLE:
			case ROLES:
			case COMPACTIONS:
			case PRINCIPALS:
			case TRANSACTIONS:
			case INDEX:
			case INDEXES:
			case LOCKS:
			case OPTION:
			case ANTI:
			case LOCAL:
			case INPATH:
			case IDENTIFIER:
			case BACKQUOTED_IDENTIFIER:
				_localctx = new WindowRefContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2201);
				((WindowRefContext)_localctx).name = identifier();
				}
				break;
			case T__6:
				_localctx = new WindowDefContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2202);
				match(T__6);
				setState(2237);
				switch (_input.LA(1)) {
				case CLUSTER:
					{
					setState(2203);
					match(CLUSTER);
					setState(2204);
					match(BY);
					setState(2205);
					((WindowDefContext)_localctx).expression = expression();
					((WindowDefContext)_localctx).partition.add(((WindowDefContext)_localctx).expression);
					setState(2210);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__8) {
						{
						{
						setState(2206);
						match(T__8);
						setState(2207);
						((WindowDefContext)_localctx).expression = expression();
						((WindowDefContext)_localctx).partition.add(((WindowDefContext)_localctx).expression);
						}
						}
						setState(2212);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				case T__7:
				case ORDER:
				case PARTITION:
				case RANGE:
				case ROWS:
				case SORT:
				case DISTRIBUTE:
					{
					setState(2223);
					_la = _input.LA(1);
					if (_la==PARTITION || _la==DISTRIBUTE) {
						{
						setState(2213);
						_la = _input.LA(1);
						if ( !(_la==PARTITION || _la==DISTRIBUTE) ) {
						_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(2214);
						match(BY);
						setState(2215);
						((WindowDefContext)_localctx).expression = expression();
						((WindowDefContext)_localctx).partition.add(((WindowDefContext)_localctx).expression);
						setState(2220);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==T__8) {
							{
							{
							setState(2216);
							match(T__8);
							setState(2217);
							((WindowDefContext)_localctx).expression = expression();
							((WindowDefContext)_localctx).partition.add(((WindowDefContext)_localctx).expression);
							}
							}
							setState(2222);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						}
					}

					setState(2235);
					_la = _input.LA(1);
					if (_la==ORDER || _la==SORT) {
						{
						setState(2225);
						_la = _input.LA(1);
						if ( !(_la==ORDER || _la==SORT) ) {
						_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(2226);
						match(BY);
						setState(2227);
						sortItem();
						setState(2232);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==T__8) {
							{
							{
							setState(2228);
							match(T__8);
							setState(2229);
							sortItem();
							}
							}
							setState(2234);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						}
					}

					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(2240);
				_la = _input.LA(1);
				if (_la==RANGE || _la==ROWS) {
					{
					setState(2239);
					windowFrame();
					}
				}

				setState(2242);
				match(T__7);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WindowFrameContext extends ParserRuleContext {
		public Token frameType;
		public FrameBoundContext start;
		public FrameBoundContext end;
		public TerminalNode RANGE() { return getToken(JdScriptQuerySqlParser.RANGE, 0); }
		public List<FrameBoundContext> frameBound() {
			return getRuleContexts(FrameBoundContext.class);
		}
		public FrameBoundContext frameBound(int i) {
			return getRuleContext(FrameBoundContext.class,i);
		}
		public TerminalNode ROWS() { return getToken(JdScriptQuerySqlParser.ROWS, 0); }
		public TerminalNode BETWEEN() { return getToken(JdScriptQuerySqlParser.BETWEEN, 0); }
		public TerminalNode AND() { return getToken(JdScriptQuerySqlParser.AND, 0); }
		public WindowFrameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_windowFrame; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JdScriptQuerySqlListener ) ((JdScriptQuerySqlListener)listener).enterWindowFrame(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JdScriptQuerySqlListener ) ((JdScriptQuerySqlListener)listener).exitWindowFrame(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JdScriptQuerySqlVisitor ) return ((JdScriptQuerySqlVisitor<? extends T>)visitor).visitWindowFrame(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WindowFrameContext windowFrame() throws RecognitionException {
		WindowFrameContext _localctx = new WindowFrameContext(_ctx, getState());
		enterRule(_localctx, 200, RULE_windowFrame);
		try {
			setState(2261);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,298,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2245);
				((WindowFrameContext)_localctx).frameType = match(RANGE);
				setState(2246);
				((WindowFrameContext)_localctx).start = frameBound();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2247);
				((WindowFrameContext)_localctx).frameType = match(ROWS);
				setState(2248);
				((WindowFrameContext)_localctx).start = frameBound();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2249);
				((WindowFrameContext)_localctx).frameType = match(RANGE);
				setState(2250);
				match(BETWEEN);
				setState(2251);
				((WindowFrameContext)_localctx).start = frameBound();
				setState(2252);
				match(AND);
				setState(2253);
				((WindowFrameContext)_localctx).end = frameBound();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2255);
				((WindowFrameContext)_localctx).frameType = match(ROWS);
				setState(2256);
				match(BETWEEN);
				setState(2257);
				((WindowFrameContext)_localctx).start = frameBound();
				setState(2258);
				match(AND);
				setState(2259);
				((WindowFrameContext)_localctx).end = frameBound();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FrameBoundContext extends ParserRuleContext {
		public Token boundType;
		public TerminalNode UNBOUNDED() { return getToken(JdScriptQuerySqlParser.UNBOUNDED, 0); }
		public TerminalNode PRECEDING() { return getToken(JdScriptQuerySqlParser.PRECEDING, 0); }
		public TerminalNode FOLLOWING() { return getToken(JdScriptQuerySqlParser.FOLLOWING, 0); }
		public TerminalNode ROW() { return getToken(JdScriptQuerySqlParser.ROW, 0); }
		public TerminalNode CURRENT() { return getToken(JdScriptQuerySqlParser.CURRENT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public FrameBoundContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_frameBound; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JdScriptQuerySqlListener ) ((JdScriptQuerySqlListener)listener).enterFrameBound(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JdScriptQuerySqlListener ) ((JdScriptQuerySqlListener)listener).exitFrameBound(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JdScriptQuerySqlVisitor ) return ((JdScriptQuerySqlVisitor<? extends T>)visitor).visitFrameBound(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FrameBoundContext frameBound() throws RecognitionException {
		FrameBoundContext _localctx = new FrameBoundContext(_ctx, getState());
		enterRule(_localctx, 202, RULE_frameBound);
		int _la;
		try {
			setState(2270);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,299,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2263);
				match(UNBOUNDED);
				setState(2264);
				((FrameBoundContext)_localctx).boundType = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==PRECEDING || _la==FOLLOWING) ) {
					((FrameBoundContext)_localctx).boundType = (Token)_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2265);
				((FrameBoundContext)_localctx).boundType = match(CURRENT);
				setState(2266);
				match(ROW);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2267);
				expression();
				setState(2268);
				((FrameBoundContext)_localctx).boundType = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==PRECEDING || _la==FOLLOWING) ) {
					((FrameBoundContext)_localctx).boundType = (Token)_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QualifiedNameContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public QualifiedNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifiedName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JdScriptQuerySqlListener ) ((JdScriptQuerySqlListener)listener).enterQualifiedName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JdScriptQuerySqlListener ) ((JdScriptQuerySqlListener)listener).exitQualifiedName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JdScriptQuerySqlVisitor ) return ((JdScriptQuerySqlVisitor<? extends T>)visitor).visitQualifiedName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QualifiedNameContext qualifiedName() throws RecognitionException {
		QualifiedNameContext _localctx = new QualifiedNameContext(_ctx, getState());
		enterRule(_localctx, 204, RULE_qualifiedName);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2272);
			identifier();
			setState(2277);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,300,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2273);
					match(T__14);
					setState(2274);
					identifier();
					}
					} 
				}
				setState(2279);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,300,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdentifierContext extends ParserRuleContext {
		public StrictIdentifierContext strictIdentifier() {
			return getRuleContext(StrictIdentifierContext.class,0);
		}
		public TerminalNode ANTI() { return getToken(JdScriptQuerySqlParser.ANTI, 0); }
		public TerminalNode FULL() { return getToken(JdScriptQuerySqlParser.FULL, 0); }
		public TerminalNode INNER() { return getToken(JdScriptQuerySqlParser.INNER, 0); }
		public TerminalNode LEFT() { return getToken(JdScriptQuerySqlParser.LEFT, 0); }
		public TerminalNode SEMI() { return getToken(JdScriptQuerySqlParser.SEMI, 0); }
		public TerminalNode RIGHT() { return getToken(JdScriptQuerySqlParser.RIGHT, 0); }
		public TerminalNode NATURAL() { return getToken(JdScriptQuerySqlParser.NATURAL, 0); }
		public TerminalNode JOIN() { return getToken(JdScriptQuerySqlParser.JOIN, 0); }
		public TerminalNode CROSS() { return getToken(JdScriptQuerySqlParser.CROSS, 0); }
		public TerminalNode ON() { return getToken(JdScriptQuerySqlParser.ON, 0); }
		public TerminalNode UNION() { return getToken(JdScriptQuerySqlParser.UNION, 0); }
		public TerminalNode INTERSECT() { return getToken(JdScriptQuerySqlParser.INTERSECT, 0); }
		public TerminalNode EXCEPT() { return getToken(JdScriptQuerySqlParser.EXCEPT, 0); }
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JdScriptQuerySqlListener ) ((JdScriptQuerySqlListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JdScriptQuerySqlListener ) ((JdScriptQuerySqlListener)listener).exitIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JdScriptQuerySqlVisitor ) return ((JdScriptQuerySqlVisitor<? extends T>)visitor).visitIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 206, RULE_identifier);
		try {
			setState(2294);
			switch (_input.LA(1)) {
			case SELECT:
			case FROM:
			case ADD:
			case AS:
			case ALL:
			case DISTINCT:
			case WHERE:
			case GROUP:
			case BY:
			case GROUPING:
			case SETS:
			case CUBE:
			case ROLLUP:
			case ORDER:
			case HAVING:
			case LIMIT:
			case AT:
			case OR:
			case AND:
			case IN:
			case NOT:
			case NO:
			case EXISTS:
			case BETWEEN:
			case LIKE:
			case RLIKE:
			case IS:
			case NULL:
			case TRUE:
			case FALSE:
			case NULLS:
			case ASC:
			case DESC:
			case FOR:
			case INTERVAL:
			case CASE:
			case WHEN:
			case THEN:
			case ELSE:
			case END:
			case OUTER:
			case LATERAL:
			case WINDOW:
			case OVER:
			case PARTITION:
			case RANGE:
			case ROWS:
			case UNBOUNDED:
			case PRECEDING:
			case FOLLOWING:
			case CURRENT:
			case ROW:
			case WITH:
			case VALUES:
			case CREATE:
			case TABLE:
			case VIEW:
			case REPLACE:
			case INSERT:
			case DELETE:
			case INTO:
			case DESCRIBE:
			case EXPLAIN:
			case FORMAT:
			case LOGICAL:
			case CODEGEN:
			case CAST:
			case SHOW:
			case TABLES:
			case COLUMNS:
			case COLUMN:
			case USE:
			case PARTITIONS:
			case FUNCTIONS:
			case DROP:
			case TO:
			case TABLESAMPLE:
			case STRATIFY:
			case ALTER:
			case RENAME:
			case ARRAY:
			case MAP:
			case STRUCT:
			case COMMENT:
			case SET:
			case RESET:
			case DATA:
			case START:
			case TRANSACTION:
			case COMMIT:
			case ROLLBACK:
			case MACRO:
			case IF:
			case DIV:
			case PERCENTLIT:
			case BUCKET:
			case OUT:
			case OF:
			case SORT:
			case CLUSTER:
			case DISTRIBUTE:
			case OVERWRITE:
			case TRANSFORM:
			case REDUCE:
			case USING:
			case SERDE:
			case SERDEPROPERTIES:
			case RECORDREADER:
			case RECORDWRITER:
			case DELIMITED:
			case FIELDS:
			case TERMINATED:
			case COLLECTION:
			case ITEMS:
			case KEYS:
			case ESCAPED:
			case LINES:
			case SEPARATED:
			case FUNCTION:
			case EXTENDED:
			case REFRESH:
			case CLEAR:
			case CACHE:
			case UNCACHE:
			case LAZY:
			case FORMATTED:
			case TEMPORARY:
			case OPTIONS:
			case UNSET:
			case TBLPROPERTIES:
			case DBPROPERTIES:
			case BUCKETS:
			case SKEWED:
			case STORED:
			case DIRECTORIES:
			case LOCATION:
			case EXCHANGE:
			case ARCHIVE:
			case UNARCHIVE:
			case FILEFORMAT:
			case TOUCH:
			case COMPACT:
			case CONCATENATE:
			case CHANGE:
			case CASCADE:
			case RESTRICT:
			case CLUSTERED:
			case SORTED:
			case PURGE:
			case INPUTFORMAT:
			case OUTPUTFORMAT:
			case DATABASE:
			case DATABASES:
			case DFS:
			case TRUNCATE:
			case ANALYZE:
			case COMPUTE:
			case LIST:
			case STATISTICS:
			case PARTITIONED:
			case EXTERNAL:
			case DEFINED:
			case REVOKE:
			case GRANT:
			case LOCK:
			case UNLOCK:
			case MSCK:
			case REPAIR:
			case EXPORT:
			case IMPORT:
			case LOAD:
			case ROLE:
			case ROLES:
			case COMPACTIONS:
			case PRINCIPALS:
			case TRANSACTIONS:
			case INDEX:
			case INDEXES:
			case LOCKS:
			case OPTION:
			case LOCAL:
			case INPATH:
			case IDENTIFIER:
			case BACKQUOTED_IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(2280);
				strictIdentifier();
				}
				break;
			case ANTI:
				enterOuterAlt(_localctx, 2);
				{
				setState(2281);
				match(ANTI);
				}
				break;
			case FULL:
				enterOuterAlt(_localctx, 3);
				{
				setState(2282);
				match(FULL);
				}
				break;
			case INNER:
				enterOuterAlt(_localctx, 4);
				{
				setState(2283);
				match(INNER);
				}
				break;
			case LEFT:
				enterOuterAlt(_localctx, 5);
				{
				setState(2284);
				match(LEFT);
				}
				break;
			case SEMI:
				enterOuterAlt(_localctx, 6);
				{
				setState(2285);
				match(SEMI);
				}
				break;
			case RIGHT:
				enterOuterAlt(_localctx, 7);
				{
				setState(2286);
				match(RIGHT);
				}
				break;
			case NATURAL:
				enterOuterAlt(_localctx, 8);
				{
				setState(2287);
				match(NATURAL);
				}
				break;
			case JOIN:
				enterOuterAlt(_localctx, 9);
				{
				setState(2288);
				match(JOIN);
				}
				break;
			case CROSS:
				enterOuterAlt(_localctx, 10);
				{
				setState(2289);
				match(CROSS);
				}
				break;
			case ON:
				enterOuterAlt(_localctx, 11);
				{
				setState(2290);
				match(ON);
				}
				break;
			case UNION:
				enterOuterAlt(_localctx, 12);
				{
				setState(2291);
				match(UNION);
				}
				break;
			case INTERSECT:
				enterOuterAlt(_localctx, 13);
				{
				setState(2292);
				match(INTERSECT);
				}
				break;
			case EXCEPT:
				enterOuterAlt(_localctx, 14);
				{
				setState(2293);
				match(EXCEPT);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StrictIdentifierContext extends ParserRuleContext {
		public StrictIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_strictIdentifier; }
	 
		public StrictIdentifierContext() { }
		public void copyFrom(StrictIdentifierContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class QuotedIdentifierAlternativeContext extends StrictIdentifierContext {
		public QuotedIdentifierContext quotedIdentifier() {
			return getRuleContext(QuotedIdentifierContext.class,0);
		}
		public QuotedIdentifierAlternativeContext(StrictIdentifierContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JdScriptQuerySqlListener ) ((JdScriptQuerySqlListener)listener).enterQuotedIdentifierAlternative(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JdScriptQuerySqlListener ) ((JdScriptQuerySqlListener)listener).exitQuotedIdentifierAlternative(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JdScriptQuerySqlVisitor ) return ((JdScriptQuerySqlVisitor<? extends T>)visitor).visitQuotedIdentifierAlternative(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UnquotedIdentifierContext extends StrictIdentifierContext {
		public TerminalNode IDENTIFIER() { return getToken(JdScriptQuerySqlParser.IDENTIFIER, 0); }
		public NonReservedContext nonReserved() {
			return getRuleContext(NonReservedContext.class,0);
		}
		public UnquotedIdentifierContext(StrictIdentifierContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JdScriptQuerySqlListener ) ((JdScriptQuerySqlListener)listener).enterUnquotedIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JdScriptQuerySqlListener ) ((JdScriptQuerySqlListener)listener).exitUnquotedIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JdScriptQuerySqlVisitor ) return ((JdScriptQuerySqlVisitor<? extends T>)visitor).visitUnquotedIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StrictIdentifierContext strictIdentifier() throws RecognitionException {
		StrictIdentifierContext _localctx = new StrictIdentifierContext(_ctx, getState());
		enterRule(_localctx, 208, RULE_strictIdentifier);
		try {
			setState(2299);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				_localctx = new UnquotedIdentifierContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2296);
				match(IDENTIFIER);
				}
				break;
			case BACKQUOTED_IDENTIFIER:
				_localctx = new QuotedIdentifierAlternativeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2297);
				quotedIdentifier();
				}
				break;
			case SELECT:
			case FROM:
			case ADD:
			case AS:
			case ALL:
			case DISTINCT:
			case WHERE:
			case GROUP:
			case BY:
			case GROUPING:
			case SETS:
			case CUBE:
			case ROLLUP:
			case ORDER:
			case HAVING:
			case LIMIT:
			case AT:
			case OR:
			case AND:
			case IN:
			case NOT:
			case NO:
			case EXISTS:
			case BETWEEN:
			case LIKE:
			case RLIKE:
			case IS:
			case NULL:
			case TRUE:
			case FALSE:
			case NULLS:
			case ASC:
			case DESC:
			case FOR:
			case INTERVAL:
			case CASE:
			case WHEN:
			case THEN:
			case ELSE:
			case END:
			case OUTER:
			case LATERAL:
			case WINDOW:
			case OVER:
			case PARTITION:
			case RANGE:
			case ROWS:
			case UNBOUNDED:
			case PRECEDING:
			case FOLLOWING:
			case CURRENT:
			case ROW:
			case WITH:
			case VALUES:
			case CREATE:
			case TABLE:
			case VIEW:
			case REPLACE:
			case INSERT:
			case DELETE:
			case INTO:
			case DESCRIBE:
			case EXPLAIN:
			case FORMAT:
			case LOGICAL:
			case CODEGEN:
			case CAST:
			case SHOW:
			case TABLES:
			case COLUMNS:
			case COLUMN:
			case USE:
			case PARTITIONS:
			case FUNCTIONS:
			case DROP:
			case TO:
			case TABLESAMPLE:
			case STRATIFY:
			case ALTER:
			case RENAME:
			case ARRAY:
			case MAP:
			case STRUCT:
			case COMMENT:
			case SET:
			case RESET:
			case DATA:
			case START:
			case TRANSACTION:
			case COMMIT:
			case ROLLBACK:
			case MACRO:
			case IF:
			case DIV:
			case PERCENTLIT:
			case BUCKET:
			case OUT:
			case OF:
			case SORT:
			case CLUSTER:
			case DISTRIBUTE:
			case OVERWRITE:
			case TRANSFORM:
			case REDUCE:
			case USING:
			case SERDE:
			case SERDEPROPERTIES:
			case RECORDREADER:
			case RECORDWRITER:
			case DELIMITED:
			case FIELDS:
			case TERMINATED:
			case COLLECTION:
			case ITEMS:
			case KEYS:
			case ESCAPED:
			case LINES:
			case SEPARATED:
			case FUNCTION:
			case EXTENDED:
			case REFRESH:
			case CLEAR:
			case CACHE:
			case UNCACHE:
			case LAZY:
			case FORMATTED:
			case TEMPORARY:
			case OPTIONS:
			case UNSET:
			case TBLPROPERTIES:
			case DBPROPERTIES:
			case BUCKETS:
			case SKEWED:
			case STORED:
			case DIRECTORIES:
			case LOCATION:
			case EXCHANGE:
			case ARCHIVE:
			case UNARCHIVE:
			case FILEFORMAT:
			case TOUCH:
			case COMPACT:
			case CONCATENATE:
			case CHANGE:
			case CASCADE:
			case RESTRICT:
			case CLUSTERED:
			case SORTED:
			case PURGE:
			case INPUTFORMAT:
			case OUTPUTFORMAT:
			case DATABASE:
			case DATABASES:
			case DFS:
			case TRUNCATE:
			case ANALYZE:
			case COMPUTE:
			case LIST:
			case STATISTICS:
			case PARTITIONED:
			case EXTERNAL:
			case DEFINED:
			case REVOKE:
			case GRANT:
			case LOCK:
			case UNLOCK:
			case MSCK:
			case REPAIR:
			case EXPORT:
			case IMPORT:
			case LOAD:
			case ROLE:
			case ROLES:
			case COMPACTIONS:
			case PRINCIPALS:
			case TRANSACTIONS:
			case INDEX:
			case INDEXES:
			case LOCKS:
			case OPTION:
			case LOCAL:
			case INPATH:
				_localctx = new UnquotedIdentifierContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(2298);
				nonReserved();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QuotedIdentifierContext extends ParserRuleContext {
		public TerminalNode BACKQUOTED_IDENTIFIER() { return getToken(JdScriptQuerySqlParser.BACKQUOTED_IDENTIFIER, 0); }
		public QuotedIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_quotedIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JdScriptQuerySqlListener ) ((JdScriptQuerySqlListener)listener).enterQuotedIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JdScriptQuerySqlListener ) ((JdScriptQuerySqlListener)listener).exitQuotedIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JdScriptQuerySqlVisitor ) return ((JdScriptQuerySqlVisitor<? extends T>)visitor).visitQuotedIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QuotedIdentifierContext quotedIdentifier() throws RecognitionException {
		QuotedIdentifierContext _localctx = new QuotedIdentifierContext(_ctx, getState());
		enterRule(_localctx, 210, RULE_quotedIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2301);
			match(BACKQUOTED_IDENTIFIER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NumberContext extends ParserRuleContext {
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
	 
		public NumberContext() { }
		public void copyFrom(NumberContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DecimalLiteralContext extends NumberContext {
		public TerminalNode DECIMAL_VALUE() { return getToken(JdScriptQuerySqlParser.DECIMAL_VALUE, 0); }
		public DecimalLiteralContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JdScriptQuerySqlListener ) ((JdScriptQuerySqlListener)listener).enterDecimalLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JdScriptQuerySqlListener ) ((JdScriptQuerySqlListener)listener).exitDecimalLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JdScriptQuerySqlVisitor ) return ((JdScriptQuerySqlVisitor<? extends T>)visitor).visitDecimalLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BigIntLiteralContext extends NumberContext {
		public TerminalNode BIGINT_LITERAL() { return getToken(JdScriptQuerySqlParser.BIGINT_LITERAL, 0); }
		public BigIntLiteralContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JdScriptQuerySqlListener ) ((JdScriptQuerySqlListener)listener).enterBigIntLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JdScriptQuerySqlListener ) ((JdScriptQuerySqlListener)listener).exitBigIntLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JdScriptQuerySqlVisitor ) return ((JdScriptQuerySqlVisitor<? extends T>)visitor).visitBigIntLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TinyIntLiteralContext extends NumberContext {
		public TerminalNode TINYINT_LITERAL() { return getToken(JdScriptQuerySqlParser.TINYINT_LITERAL, 0); }
		public TinyIntLiteralContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JdScriptQuerySqlListener ) ((JdScriptQuerySqlListener)listener).enterTinyIntLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JdScriptQuerySqlListener ) ((JdScriptQuerySqlListener)listener).exitTinyIntLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JdScriptQuerySqlVisitor ) return ((JdScriptQuerySqlVisitor<? extends T>)visitor).visitTinyIntLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DoubleLiteralContext extends NumberContext {
		public TerminalNode DOUBLE_LITERAL() { return getToken(JdScriptQuerySqlParser.DOUBLE_LITERAL, 0); }
		public DoubleLiteralContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JdScriptQuerySqlListener ) ((JdScriptQuerySqlListener)listener).enterDoubleLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JdScriptQuerySqlListener ) ((JdScriptQuerySqlListener)listener).exitDoubleLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JdScriptQuerySqlVisitor ) return ((JdScriptQuerySqlVisitor<? extends T>)visitor).visitDoubleLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntegerLiteralContext extends NumberContext {
		public TerminalNode INTEGER_VALUE() { return getToken(JdScriptQuerySqlParser.INTEGER_VALUE, 0); }
		public IntegerLiteralContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JdScriptQuerySqlListener ) ((JdScriptQuerySqlListener)listener).enterIntegerLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JdScriptQuerySqlListener ) ((JdScriptQuerySqlListener)listener).exitIntegerLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JdScriptQuerySqlVisitor ) return ((JdScriptQuerySqlVisitor<? extends T>)visitor).visitIntegerLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SmallIntLiteralContext extends NumberContext {
		public TerminalNode SMALLINT_LITERAL() { return getToken(JdScriptQuerySqlParser.SMALLINT_LITERAL, 0); }
		public SmallIntLiteralContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JdScriptQuerySqlListener ) ((JdScriptQuerySqlListener)listener).enterSmallIntLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JdScriptQuerySqlListener ) ((JdScriptQuerySqlListener)listener).exitSmallIntLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JdScriptQuerySqlVisitor ) return ((JdScriptQuerySqlVisitor<? extends T>)visitor).visitSmallIntLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ScientificDecimalLiteralContext extends NumberContext {
		public TerminalNode SCIENTIFIC_DECIMAL_VALUE() { return getToken(JdScriptQuerySqlParser.SCIENTIFIC_DECIMAL_VALUE, 0); }
		public ScientificDecimalLiteralContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JdScriptQuerySqlListener ) ((JdScriptQuerySqlListener)listener).enterScientificDecimalLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JdScriptQuerySqlListener ) ((JdScriptQuerySqlListener)listener).exitScientificDecimalLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JdScriptQuerySqlVisitor ) return ((JdScriptQuerySqlVisitor<? extends T>)visitor).visitScientificDecimalLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 212, RULE_number);
		try {
			setState(2310);
			switch (_input.LA(1)) {
			case DECIMAL_VALUE:
				_localctx = new DecimalLiteralContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2303);
				match(DECIMAL_VALUE);
				}
				break;
			case SCIENTIFIC_DECIMAL_VALUE:
				_localctx = new ScientificDecimalLiteralContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2304);
				match(SCIENTIFIC_DECIMAL_VALUE);
				}
				break;
			case INTEGER_VALUE:
				_localctx = new IntegerLiteralContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(2305);
				match(INTEGER_VALUE);
				}
				break;
			case BIGINT_LITERAL:
				_localctx = new BigIntLiteralContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(2306);
				match(BIGINT_LITERAL);
				}
				break;
			case SMALLINT_LITERAL:
				_localctx = new SmallIntLiteralContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(2307);
				match(SMALLINT_LITERAL);
				}
				break;
			case TINYINT_LITERAL:
				_localctx = new TinyIntLiteralContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(2308);
				match(TINYINT_LITERAL);
				}
				break;
			case DOUBLE_LITERAL:
				_localctx = new DoubleLiteralContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(2309);
				match(DOUBLE_LITERAL);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NonReservedContext extends ParserRuleContext {
		public TerminalNode SHOW() { return getToken(JdScriptQuerySqlParser.SHOW, 0); }
		public TerminalNode TABLES() { return getToken(JdScriptQuerySqlParser.TABLES, 0); }
		public TerminalNode COLUMNS() { return getToken(JdScriptQuerySqlParser.COLUMNS, 0); }
		public TerminalNode COLUMN() { return getToken(JdScriptQuerySqlParser.COLUMN, 0); }
		public TerminalNode PARTITIONS() { return getToken(JdScriptQuerySqlParser.PARTITIONS, 0); }
		public TerminalNode FUNCTIONS() { return getToken(JdScriptQuerySqlParser.FUNCTIONS, 0); }
		public TerminalNode DATABASES() { return getToken(JdScriptQuerySqlParser.DATABASES, 0); }
		public TerminalNode ADD() { return getToken(JdScriptQuerySqlParser.ADD, 0); }
		public TerminalNode OVER() { return getToken(JdScriptQuerySqlParser.OVER, 0); }
		public TerminalNode PARTITION() { return getToken(JdScriptQuerySqlParser.PARTITION, 0); }
		public TerminalNode RANGE() { return getToken(JdScriptQuerySqlParser.RANGE, 0); }
		public TerminalNode ROWS() { return getToken(JdScriptQuerySqlParser.ROWS, 0); }
		public TerminalNode PRECEDING() { return getToken(JdScriptQuerySqlParser.PRECEDING, 0); }
		public TerminalNode FOLLOWING() { return getToken(JdScriptQuerySqlParser.FOLLOWING, 0); }
		public TerminalNode CURRENT() { return getToken(JdScriptQuerySqlParser.CURRENT, 0); }
		public TerminalNode ROW() { return getToken(JdScriptQuerySqlParser.ROW, 0); }
		public TerminalNode MAP() { return getToken(JdScriptQuerySqlParser.MAP, 0); }
		public TerminalNode ARRAY() { return getToken(JdScriptQuerySqlParser.ARRAY, 0); }
		public TerminalNode STRUCT() { return getToken(JdScriptQuerySqlParser.STRUCT, 0); }
		public TerminalNode LATERAL() { return getToken(JdScriptQuerySqlParser.LATERAL, 0); }
		public TerminalNode WINDOW() { return getToken(JdScriptQuerySqlParser.WINDOW, 0); }
		public TerminalNode REDUCE() { return getToken(JdScriptQuerySqlParser.REDUCE, 0); }
		public TerminalNode TRANSFORM() { return getToken(JdScriptQuerySqlParser.TRANSFORM, 0); }
		public TerminalNode USING() { return getToken(JdScriptQuerySqlParser.USING, 0); }
		public TerminalNode SERDE() { return getToken(JdScriptQuerySqlParser.SERDE, 0); }
		public TerminalNode SERDEPROPERTIES() { return getToken(JdScriptQuerySqlParser.SERDEPROPERTIES, 0); }
		public TerminalNode RECORDREADER() { return getToken(JdScriptQuerySqlParser.RECORDREADER, 0); }
		public TerminalNode DELIMITED() { return getToken(JdScriptQuerySqlParser.DELIMITED, 0); }
		public TerminalNode FIELDS() { return getToken(JdScriptQuerySqlParser.FIELDS, 0); }
		public TerminalNode TERMINATED() { return getToken(JdScriptQuerySqlParser.TERMINATED, 0); }
		public TerminalNode COLLECTION() { return getToken(JdScriptQuerySqlParser.COLLECTION, 0); }
		public TerminalNode ITEMS() { return getToken(JdScriptQuerySqlParser.ITEMS, 0); }
		public TerminalNode KEYS() { return getToken(JdScriptQuerySqlParser.KEYS, 0); }
		public TerminalNode ESCAPED() { return getToken(JdScriptQuerySqlParser.ESCAPED, 0); }
		public TerminalNode LINES() { return getToken(JdScriptQuerySqlParser.LINES, 0); }
		public TerminalNode SEPARATED() { return getToken(JdScriptQuerySqlParser.SEPARATED, 0); }
		public TerminalNode EXTENDED() { return getToken(JdScriptQuerySqlParser.EXTENDED, 0); }
		public TerminalNode REFRESH() { return getToken(JdScriptQuerySqlParser.REFRESH, 0); }
		public TerminalNode CLEAR() { return getToken(JdScriptQuerySqlParser.CLEAR, 0); }
		public TerminalNode CACHE() { return getToken(JdScriptQuerySqlParser.CACHE, 0); }
		public TerminalNode UNCACHE() { return getToken(JdScriptQuerySqlParser.UNCACHE, 0); }
		public TerminalNode LAZY() { return getToken(JdScriptQuerySqlParser.LAZY, 0); }
		public TerminalNode TEMPORARY() { return getToken(JdScriptQuerySqlParser.TEMPORARY, 0); }
		public TerminalNode OPTIONS() { return getToken(JdScriptQuerySqlParser.OPTIONS, 0); }
		public TerminalNode GROUPING() { return getToken(JdScriptQuerySqlParser.GROUPING, 0); }
		public TerminalNode CUBE() { return getToken(JdScriptQuerySqlParser.CUBE, 0); }
		public TerminalNode ROLLUP() { return getToken(JdScriptQuerySqlParser.ROLLUP, 0); }
		public TerminalNode EXPLAIN() { return getToken(JdScriptQuerySqlParser.EXPLAIN, 0); }
		public TerminalNode FORMAT() { return getToken(JdScriptQuerySqlParser.FORMAT, 0); }
		public TerminalNode LOGICAL() { return getToken(JdScriptQuerySqlParser.LOGICAL, 0); }
		public TerminalNode FORMATTED() { return getToken(JdScriptQuerySqlParser.FORMATTED, 0); }
		public TerminalNode CODEGEN() { return getToken(JdScriptQuerySqlParser.CODEGEN, 0); }
		public TerminalNode TABLESAMPLE() { return getToken(JdScriptQuerySqlParser.TABLESAMPLE, 0); }
		public TerminalNode USE() { return getToken(JdScriptQuerySqlParser.USE, 0); }
		public List<TerminalNode> TO() { return getTokens(JdScriptQuerySqlParser.TO); }
		public TerminalNode TO(int i) {
			return getToken(JdScriptQuerySqlParser.TO, i);
		}
		public TerminalNode BUCKET() { return getToken(JdScriptQuerySqlParser.BUCKET, 0); }
		public TerminalNode PERCENTLIT() { return getToken(JdScriptQuerySqlParser.PERCENTLIT, 0); }
		public TerminalNode OUT() { return getToken(JdScriptQuerySqlParser.OUT, 0); }
		public TerminalNode OF() { return getToken(JdScriptQuerySqlParser.OF, 0); }
		public TerminalNode SET() { return getToken(JdScriptQuerySqlParser.SET, 0); }
		public TerminalNode RESET() { return getToken(JdScriptQuerySqlParser.RESET, 0); }
		public TerminalNode VIEW() { return getToken(JdScriptQuerySqlParser.VIEW, 0); }
		public TerminalNode REPLACE() { return getToken(JdScriptQuerySqlParser.REPLACE, 0); }
		public TerminalNode IF() { return getToken(JdScriptQuerySqlParser.IF, 0); }
		public TerminalNode NO() { return getToken(JdScriptQuerySqlParser.NO, 0); }
		public TerminalNode DATA() { return getToken(JdScriptQuerySqlParser.DATA, 0); }
		public TerminalNode START() { return getToken(JdScriptQuerySqlParser.START, 0); }
		public TerminalNode TRANSACTION() { return getToken(JdScriptQuerySqlParser.TRANSACTION, 0); }
		public TerminalNode COMMIT() { return getToken(JdScriptQuerySqlParser.COMMIT, 0); }
		public TerminalNode ROLLBACK() { return getToken(JdScriptQuerySqlParser.ROLLBACK, 0); }
		public TerminalNode SORT() { return getToken(JdScriptQuerySqlParser.SORT, 0); }
		public TerminalNode CLUSTER() { return getToken(JdScriptQuerySqlParser.CLUSTER, 0); }
		public TerminalNode DISTRIBUTE() { return getToken(JdScriptQuerySqlParser.DISTRIBUTE, 0); }
		public TerminalNode UNSET() { return getToken(JdScriptQuerySqlParser.UNSET, 0); }
		public TerminalNode TBLPROPERTIES() { return getToken(JdScriptQuerySqlParser.TBLPROPERTIES, 0); }
		public TerminalNode SKEWED() { return getToken(JdScriptQuerySqlParser.SKEWED, 0); }
		public TerminalNode STORED() { return getToken(JdScriptQuerySqlParser.STORED, 0); }
		public TerminalNode DIRECTORIES() { return getToken(JdScriptQuerySqlParser.DIRECTORIES, 0); }
		public TerminalNode LOCATION() { return getToken(JdScriptQuerySqlParser.LOCATION, 0); }
		public TerminalNode EXCHANGE() { return getToken(JdScriptQuerySqlParser.EXCHANGE, 0); }
		public TerminalNode ARCHIVE() { return getToken(JdScriptQuerySqlParser.ARCHIVE, 0); }
		public TerminalNode UNARCHIVE() { return getToken(JdScriptQuerySqlParser.UNARCHIVE, 0); }
		public TerminalNode FILEFORMAT() { return getToken(JdScriptQuerySqlParser.FILEFORMAT, 0); }
		public TerminalNode TOUCH() { return getToken(JdScriptQuerySqlParser.TOUCH, 0); }
		public TerminalNode COMPACT() { return getToken(JdScriptQuerySqlParser.COMPACT, 0); }
		public TerminalNode CONCATENATE() { return getToken(JdScriptQuerySqlParser.CONCATENATE, 0); }
		public TerminalNode CHANGE() { return getToken(JdScriptQuerySqlParser.CHANGE, 0); }
		public TerminalNode CASCADE() { return getToken(JdScriptQuerySqlParser.CASCADE, 0); }
		public TerminalNode RESTRICT() { return getToken(JdScriptQuerySqlParser.RESTRICT, 0); }
		public TerminalNode BUCKETS() { return getToken(JdScriptQuerySqlParser.BUCKETS, 0); }
		public TerminalNode CLUSTERED() { return getToken(JdScriptQuerySqlParser.CLUSTERED, 0); }
		public TerminalNode SORTED() { return getToken(JdScriptQuerySqlParser.SORTED, 0); }
		public TerminalNode PURGE() { return getToken(JdScriptQuerySqlParser.PURGE, 0); }
		public TerminalNode INPUTFORMAT() { return getToken(JdScriptQuerySqlParser.INPUTFORMAT, 0); }
		public TerminalNode OUTPUTFORMAT() { return getToken(JdScriptQuerySqlParser.OUTPUTFORMAT, 0); }
		public TerminalNode DBPROPERTIES() { return getToken(JdScriptQuerySqlParser.DBPROPERTIES, 0); }
		public TerminalNode DFS() { return getToken(JdScriptQuerySqlParser.DFS, 0); }
		public TerminalNode TRUNCATE() { return getToken(JdScriptQuerySqlParser.TRUNCATE, 0); }
		public TerminalNode COMPUTE() { return getToken(JdScriptQuerySqlParser.COMPUTE, 0); }
		public TerminalNode LIST() { return getToken(JdScriptQuerySqlParser.LIST, 0); }
		public TerminalNode STATISTICS() { return getToken(JdScriptQuerySqlParser.STATISTICS, 0); }
		public TerminalNode ANALYZE() { return getToken(JdScriptQuerySqlParser.ANALYZE, 0); }
		public TerminalNode PARTITIONED() { return getToken(JdScriptQuerySqlParser.PARTITIONED, 0); }
		public TerminalNode EXTERNAL() { return getToken(JdScriptQuerySqlParser.EXTERNAL, 0); }
		public TerminalNode DEFINED() { return getToken(JdScriptQuerySqlParser.DEFINED, 0); }
		public TerminalNode RECORDWRITER() { return getToken(JdScriptQuerySqlParser.RECORDWRITER, 0); }
		public TerminalNode REVOKE() { return getToken(JdScriptQuerySqlParser.REVOKE, 0); }
		public TerminalNode GRANT() { return getToken(JdScriptQuerySqlParser.GRANT, 0); }
		public TerminalNode LOCK() { return getToken(JdScriptQuerySqlParser.LOCK, 0); }
		public TerminalNode UNLOCK() { return getToken(JdScriptQuerySqlParser.UNLOCK, 0); }
		public TerminalNode MSCK() { return getToken(JdScriptQuerySqlParser.MSCK, 0); }
		public TerminalNode REPAIR() { return getToken(JdScriptQuerySqlParser.REPAIR, 0); }
		public TerminalNode EXPORT() { return getToken(JdScriptQuerySqlParser.EXPORT, 0); }
		public TerminalNode IMPORT() { return getToken(JdScriptQuerySqlParser.IMPORT, 0); }
		public TerminalNode LOAD() { return getToken(JdScriptQuerySqlParser.LOAD, 0); }
		public TerminalNode VALUES() { return getToken(JdScriptQuerySqlParser.VALUES, 0); }
		public TerminalNode COMMENT() { return getToken(JdScriptQuerySqlParser.COMMENT, 0); }
		public TerminalNode ROLE() { return getToken(JdScriptQuerySqlParser.ROLE, 0); }
		public TerminalNode ROLES() { return getToken(JdScriptQuerySqlParser.ROLES, 0); }
		public TerminalNode COMPACTIONS() { return getToken(JdScriptQuerySqlParser.COMPACTIONS, 0); }
		public TerminalNode PRINCIPALS() { return getToken(JdScriptQuerySqlParser.PRINCIPALS, 0); }
		public TerminalNode TRANSACTIONS() { return getToken(JdScriptQuerySqlParser.TRANSACTIONS, 0); }
		public TerminalNode INDEX() { return getToken(JdScriptQuerySqlParser.INDEX, 0); }
		public TerminalNode INDEXES() { return getToken(JdScriptQuerySqlParser.INDEXES, 0); }
		public TerminalNode LOCKS() { return getToken(JdScriptQuerySqlParser.LOCKS, 0); }
		public TerminalNode OPTION() { return getToken(JdScriptQuerySqlParser.OPTION, 0); }
		public TerminalNode LOCAL() { return getToken(JdScriptQuerySqlParser.LOCAL, 0); }
		public TerminalNode INPATH() { return getToken(JdScriptQuerySqlParser.INPATH, 0); }
		public TerminalNode ASC() { return getToken(JdScriptQuerySqlParser.ASC, 0); }
		public TerminalNode DESC() { return getToken(JdScriptQuerySqlParser.DESC, 0); }
		public TerminalNode LIMIT() { return getToken(JdScriptQuerySqlParser.LIMIT, 0); }
		public TerminalNode RENAME() { return getToken(JdScriptQuerySqlParser.RENAME, 0); }
		public TerminalNode SETS() { return getToken(JdScriptQuerySqlParser.SETS, 0); }
		public TerminalNode AT() { return getToken(JdScriptQuerySqlParser.AT, 0); }
		public TerminalNode NULLS() { return getToken(JdScriptQuerySqlParser.NULLS, 0); }
		public TerminalNode OVERWRITE() { return getToken(JdScriptQuerySqlParser.OVERWRITE, 0); }
		public TerminalNode ALL() { return getToken(JdScriptQuerySqlParser.ALL, 0); }
		public TerminalNode ALTER() { return getToken(JdScriptQuerySqlParser.ALTER, 0); }
		public TerminalNode AS() { return getToken(JdScriptQuerySqlParser.AS, 0); }
		public TerminalNode BETWEEN() { return getToken(JdScriptQuerySqlParser.BETWEEN, 0); }
		public TerminalNode BY() { return getToken(JdScriptQuerySqlParser.BY, 0); }
		public TerminalNode CREATE() { return getToken(JdScriptQuerySqlParser.CREATE, 0); }
		public TerminalNode DELETE() { return getToken(JdScriptQuerySqlParser.DELETE, 0); }
		public TerminalNode DESCRIBE() { return getToken(JdScriptQuerySqlParser.DESCRIBE, 0); }
		public TerminalNode DROP() { return getToken(JdScriptQuerySqlParser.DROP, 0); }
		public TerminalNode EXISTS() { return getToken(JdScriptQuerySqlParser.EXISTS, 0); }
		public TerminalNode FALSE() { return getToken(JdScriptQuerySqlParser.FALSE, 0); }
		public TerminalNode FOR() { return getToken(JdScriptQuerySqlParser.FOR, 0); }
		public TerminalNode GROUP() { return getToken(JdScriptQuerySqlParser.GROUP, 0); }
		public TerminalNode IN() { return getToken(JdScriptQuerySqlParser.IN, 0); }
		public TerminalNode INSERT() { return getToken(JdScriptQuerySqlParser.INSERT, 0); }
		public TerminalNode INTO() { return getToken(JdScriptQuerySqlParser.INTO, 0); }
		public TerminalNode IS() { return getToken(JdScriptQuerySqlParser.IS, 0); }
		public TerminalNode LIKE() { return getToken(JdScriptQuerySqlParser.LIKE, 0); }
		public TerminalNode NULL() { return getToken(JdScriptQuerySqlParser.NULL, 0); }
		public TerminalNode ORDER() { return getToken(JdScriptQuerySqlParser.ORDER, 0); }
		public TerminalNode OUTER() { return getToken(JdScriptQuerySqlParser.OUTER, 0); }
		public List<TerminalNode> TABLE() { return getTokens(JdScriptQuerySqlParser.TABLE); }
		public TerminalNode TABLE(int i) {
			return getToken(JdScriptQuerySqlParser.TABLE, i);
		}
		public TerminalNode TRUE() { return getToken(JdScriptQuerySqlParser.TRUE, 0); }
		public List<TerminalNode> WITH() { return getTokens(JdScriptQuerySqlParser.WITH); }
		public TerminalNode WITH(int i) {
			return getToken(JdScriptQuerySqlParser.WITH, i);
		}
		public TerminalNode RLIKE() { return getToken(JdScriptQuerySqlParser.RLIKE, 0); }
		public TerminalNode AND() { return getToken(JdScriptQuerySqlParser.AND, 0); }
		public TerminalNode CASE() { return getToken(JdScriptQuerySqlParser.CASE, 0); }
		public TerminalNode CAST() { return getToken(JdScriptQuerySqlParser.CAST, 0); }
		public TerminalNode DISTINCT() { return getToken(JdScriptQuerySqlParser.DISTINCT, 0); }
		public TerminalNode DIV() { return getToken(JdScriptQuerySqlParser.DIV, 0); }
		public TerminalNode ELSE() { return getToken(JdScriptQuerySqlParser.ELSE, 0); }
		public TerminalNode END() { return getToken(JdScriptQuerySqlParser.END, 0); }
		public TerminalNode FUNCTION() { return getToken(JdScriptQuerySqlParser.FUNCTION, 0); }
		public TerminalNode INTERVAL() { return getToken(JdScriptQuerySqlParser.INTERVAL, 0); }
		public TerminalNode MACRO() { return getToken(JdScriptQuerySqlParser.MACRO, 0); }
		public TerminalNode OR() { return getToken(JdScriptQuerySqlParser.OR, 0); }
		public TerminalNode STRATIFY() { return getToken(JdScriptQuerySqlParser.STRATIFY, 0); }
		public TerminalNode THEN() { return getToken(JdScriptQuerySqlParser.THEN, 0); }
		public TerminalNode UNBOUNDED() { return getToken(JdScriptQuerySqlParser.UNBOUNDED, 0); }
		public TerminalNode WHEN() { return getToken(JdScriptQuerySqlParser.WHEN, 0); }
		public TerminalNode DATABASE() { return getToken(JdScriptQuerySqlParser.DATABASE, 0); }
		public TerminalNode SELECT() { return getToken(JdScriptQuerySqlParser.SELECT, 0); }
		public TerminalNode FROM() { return getToken(JdScriptQuerySqlParser.FROM, 0); }
		public TerminalNode WHERE() { return getToken(JdScriptQuerySqlParser.WHERE, 0); }
		public TerminalNode HAVING() { return getToken(JdScriptQuerySqlParser.HAVING, 0); }
		public TerminalNode NOT() { return getToken(JdScriptQuerySqlParser.NOT, 0); }
		public NonReservedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nonReserved; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JdScriptQuerySqlListener ) ((JdScriptQuerySqlListener)listener).enterNonReserved(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JdScriptQuerySqlListener ) ((JdScriptQuerySqlListener)listener).exitNonReserved(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JdScriptQuerySqlVisitor ) return ((JdScriptQuerySqlVisitor<? extends T>)visitor).visitNonReserved(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NonReservedContext nonReserved() throws RecognitionException {
		NonReservedContext _localctx = new NonReservedContext(_ctx, getState());
		enterRule(_localctx, 214, RULE_nonReserved);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2312);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SELECT) | (1L << FROM) | (1L << ADD) | (1L << AS) | (1L << ALL) | (1L << DISTINCT) | (1L << WHERE) | (1L << GROUP) | (1L << BY) | (1L << GROUPING) | (1L << SETS) | (1L << CUBE) | (1L << ROLLUP) | (1L << ORDER) | (1L << HAVING) | (1L << LIMIT) | (1L << AT) | (1L << OR) | (1L << AND) | (1L << IN) | (1L << NOT) | (1L << NO) | (1L << EXISTS) | (1L << BETWEEN) | (1L << LIKE) | (1L << RLIKE) | (1L << IS) | (1L << NULL) | (1L << TRUE) | (1L << FALSE) | (1L << NULLS) | (1L << ASC) | (1L << DESC) | (1L << FOR) | (1L << INTERVAL) | (1L << CASE) | (1L << WHEN) | (1L << THEN) | (1L << ELSE) | (1L << END) | (1L << OUTER))) != 0) || ((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & ((1L << (LATERAL - 71)) | (1L << (WINDOW - 71)) | (1L << (OVER - 71)) | (1L << (PARTITION - 71)) | (1L << (RANGE - 71)) | (1L << (ROWS - 71)) | (1L << (UNBOUNDED - 71)) | (1L << (PRECEDING - 71)) | (1L << (FOLLOWING - 71)) | (1L << (CURRENT - 71)) | (1L << (ROW - 71)) | (1L << (WITH - 71)) | (1L << (VALUES - 71)) | (1L << (CREATE - 71)) | (1L << (TABLE - 71)) | (1L << (VIEW - 71)) | (1L << (REPLACE - 71)) | (1L << (INSERT - 71)) | (1L << (DELETE - 71)) | (1L << (INTO - 71)) | (1L << (DESCRIBE - 71)) | (1L << (EXPLAIN - 71)) | (1L << (FORMAT - 71)) | (1L << (LOGICAL - 71)) | (1L << (CODEGEN - 71)) | (1L << (CAST - 71)) | (1L << (SHOW - 71)) | (1L << (TABLES - 71)) | (1L << (COLUMNS - 71)) | (1L << (COLUMN - 71)) | (1L << (USE - 71)) | (1L << (PARTITIONS - 71)) | (1L << (FUNCTIONS - 71)) | (1L << (DROP - 71)) | (1L << (TO - 71)) | (1L << (TABLESAMPLE - 71)) | (1L << (STRATIFY - 71)) | (1L << (ALTER - 71)) | (1L << (RENAME - 71)) | (1L << (ARRAY - 71)) | (1L << (MAP - 71)) | (1L << (STRUCT - 71)) | (1L << (COMMENT - 71)) | (1L << (SET - 71)) | (1L << (RESET - 71)) | (1L << (DATA - 71)) | (1L << (START - 71)) | (1L << (TRANSACTION - 71)) | (1L << (COMMIT - 71)) | (1L << (ROLLBACK - 71)) | (1L << (MACRO - 71)) | (1L << (IF - 71)))) != 0) || ((((_la - 139)) & ~0x3f) == 0 && ((1L << (_la - 139)) & ((1L << (DIV - 139)) | (1L << (PERCENTLIT - 139)) | (1L << (BUCKET - 139)) | (1L << (OUT - 139)) | (1L << (OF - 139)) | (1L << (SORT - 139)) | (1L << (CLUSTER - 139)) | (1L << (DISTRIBUTE - 139)) | (1L << (OVERWRITE - 139)) | (1L << (TRANSFORM - 139)) | (1L << (REDUCE - 139)) | (1L << (USING - 139)) | (1L << (SERDE - 139)) | (1L << (SERDEPROPERTIES - 139)) | (1L << (RECORDREADER - 139)) | (1L << (RECORDWRITER - 139)) | (1L << (DELIMITED - 139)) | (1L << (FIELDS - 139)) | (1L << (TERMINATED - 139)) | (1L << (COLLECTION - 139)) | (1L << (ITEMS - 139)) | (1L << (KEYS - 139)) | (1L << (ESCAPED - 139)) | (1L << (LINES - 139)) | (1L << (SEPARATED - 139)) | (1L << (FUNCTION - 139)) | (1L << (EXTENDED - 139)) | (1L << (REFRESH - 139)) | (1L << (CLEAR - 139)) | (1L << (CACHE - 139)) | (1L << (UNCACHE - 139)) | (1L << (LAZY - 139)) | (1L << (FORMATTED - 139)) | (1L << (TEMPORARY - 139)) | (1L << (OPTIONS - 139)) | (1L << (UNSET - 139)) | (1L << (TBLPROPERTIES - 139)) | (1L << (DBPROPERTIES - 139)) | (1L << (BUCKETS - 139)) | (1L << (SKEWED - 139)) | (1L << (STORED - 139)) | (1L << (DIRECTORIES - 139)) | (1L << (LOCATION - 139)) | (1L << (EXCHANGE - 139)) | (1L << (ARCHIVE - 139)) | (1L << (UNARCHIVE - 139)) | (1L << (FILEFORMAT - 139)) | (1L << (TOUCH - 139)) | (1L << (COMPACT - 139)) | (1L << (CONCATENATE - 139)) | (1L << (CHANGE - 139)) | (1L << (CASCADE - 139)) | (1L << (RESTRICT - 139)) | (1L << (CLUSTERED - 139)) | (1L << (SORTED - 139)) | (1L << (PURGE - 139)) | (1L << (INPUTFORMAT - 139)) | (1L << (OUTPUTFORMAT - 139)) | (1L << (DATABASE - 139)) | (1L << (DATABASES - 139)))) != 0) || ((((_la - 203)) & ~0x3f) == 0 && ((1L << (_la - 203)) & ((1L << (DFS - 203)) | (1L << (TRUNCATE - 203)) | (1L << (ANALYZE - 203)) | (1L << (COMPUTE - 203)) | (1L << (LIST - 203)) | (1L << (STATISTICS - 203)) | (1L << (PARTITIONED - 203)) | (1L << (EXTERNAL - 203)) | (1L << (DEFINED - 203)) | (1L << (REVOKE - 203)) | (1L << (GRANT - 203)) | (1L << (LOCK - 203)) | (1L << (UNLOCK - 203)) | (1L << (MSCK - 203)) | (1L << (REPAIR - 203)) | (1L << (EXPORT - 203)) | (1L << (IMPORT - 203)) | (1L << (LOAD - 203)) | (1L << (ROLE - 203)) | (1L << (ROLES - 203)) | (1L << (COMPACTIONS - 203)) | (1L << (PRINCIPALS - 203)) | (1L << (TRANSACTIONS - 203)) | (1L << (INDEX - 203)) | (1L << (INDEXES - 203)) | (1L << (LOCKS - 203)) | (1L << (OPTION - 203)) | (1L << (LOCAL - 203)) | (1L << (INPATH - 203)))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 54:
			return queryTerm_sempred((QueryTermContext)_localctx, predIndex);
		case 63:
			return relation_sempred((RelationContext)_localctx, predIndex);
		case 80:
			return booleanExpression_sempred((BooleanExpressionContext)_localctx, predIndex);
		case 83:
			return valueExpression_sempred((ValueExpressionContext)_localctx, predIndex);
		case 84:
			return primaryExpression_sempred((PrimaryExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean queryTerm_sempred(QueryTermContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean relation_sempred(RelationContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean booleanExpression_sempred(BooleanExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 3);
		case 3:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean valueExpression_sempred(ValueExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return precpred(_ctx, 6);
		case 5:
			return precpred(_ctx, 5);
		case 6:
			return precpred(_ctx, 4);
		case 7:
			return precpred(_ctx, 3);
		case 8:
			return precpred(_ctx, 2);
		case 9:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean primaryExpression_sempred(PrimaryExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 10:
			return precpred(_ctx, 4);
		case 11:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\u00fa\u090d\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\4"+
		"`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\4f\tf\4g\tg\4h\th\4i\ti\4j\tj\4k\t"+
		"k\4l\tl\4m\tm\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\7\2\u00e4\n\2\f\2\16"+
		"\2\u00e7\13\2\3\2\3\2\3\2\7\2\u00ec\n\2\f\2\16\2\u00ef\13\2\3\2\3\2\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\4\7\4\u00fa\n\4\f\4\16\4\u00fd\13\4\3\4\3\4\3"+
		"\5\3\5\3\5\3\5\3\5\5\5\u0106\n\5\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3"+
		"\t\7\t\u0112\n\t\f\t\16\t\u0115\13\t\3\t\3\t\3\t\3\t\7\t\u011b\n\t\f\t"+
		"\16\t\u011e\13\t\3\t\5\t\u0121\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3"+
		"\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\7\21\u0142\n\21\f\21\16\21\u0145\13"+
		"\21\3\21\3\21\5\21\u0149\n\21\3\22\3\22\3\23\3\23\3\23\3\23\7\23\u0151"+
		"\n\23\f\23\16\23\u0154\13\23\3\23\3\23\3\23\3\23\5\23\u015a\n\23\3\24"+
		"\3\24\3\24\3\24\7\24\u0160\n\24\f\24\16\24\u0163\13\24\3\24\3\24\3\24"+
		"\3\24\5\24\u0169\n\24\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\5\26\u0175\n\26\3\27\3\27\3\27\3\30\3\30\3\30\3\31\3\31\3\31\3\32\3\32"+
		"\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\5\33\u018b\n\33\3\33\3\33"+
		"\3\33\5\33\u0190\n\33\3\33\5\33\u0193\n\33\3\33\3\33\3\33\5\33\u0198\n"+
		"\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\5\33\u01a5"+
		"\n\33\3\33\3\33\5\33\u01a9\n\33\3\33\3\33\3\33\3\33\3\33\5\33\u01b0\n"+
		"\33\3\33\3\33\3\33\5\33\u01b5\n\33\3\33\3\33\3\33\5\33\u01ba\n\33\3\33"+
		"\5\33\u01bd\n\33\3\33\3\33\3\33\3\33\5\33\u01c3\n\33\3\33\3\33\3\33\5"+
		"\33\u01c8\n\33\3\33\5\33\u01cb\n\33\3\33\5\33\u01ce\n\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\5\33\u01d7\n\33\3\33\3\33\5\33\u01db\n\33\3\33\3"+
		"\33\3\33\3\33\3\33\3\33\5\33\u01e3\n\33\3\33\5\33\u01e6\n\33\3\33\5\33"+
		"\u01e9\n\33\3\33\5\33\u01ec\n\33\3\33\5\33\u01ef\n\33\3\33\5\33\u01f2"+
		"\n\33\3\33\3\33\5\33\u01f6\n\33\3\33\5\33\u01f9\n\33\3\33\5\33\u01fc\n"+
		"\33\3\33\3\33\3\33\3\33\3\33\5\33\u0203\n\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\5\33\u020d\n\33\3\33\3\33\3\33\3\33\3\33\3\33\5\33\u0215"+
		"\n\33\5\33\u0217\n\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\5\33\u022e\n\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\5\33\u0236\n\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\5\33\u023e\n\33\3\33\3\33\3\33\3\33\5\33\u0244\n\33\3\33\3\33\3"+
		"\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\5\33\u0251\n\33\3\33\6\33"+
		"\u0254\n\33\r\33\16\33\u0255\3\33\3\33\3\33\3\33\3\33\3\33\3\33\5\33\u025f"+
		"\n\33\3\33\6\33\u0262\n\33\r\33\16\33\u0263\3\33\3\33\3\33\3\33\3\33\3"+
		"\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\5\33\u0274\n\33\3\33\3\33"+
		"\3\33\7\33\u0279\n\33\f\33\16\33\u027c\13\33\3\33\5\33\u027f\n\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\5\33\u0287\n\33\3\33\3\33\3\33\7\33\u028c\n"+
		"\33\f\33\16\33\u028f\13\33\3\33\3\33\3\33\3\33\5\33\u0295\n\33\3\33\3"+
		"\33\3\33\3\33\3\33\3\33\3\33\5\33\u029e\n\33\3\33\3\33\5\33\u02a2\n\33"+
		"\3\33\3\33\3\33\3\33\5\33\u02a8\n\33\3\33\3\33\3\33\3\33\5\33\u02ae\n"+
		"\33\3\33\5\33\u02b1\n\33\3\33\3\33\3\33\3\33\5\33\u02b7\n\33\3\33\3\33"+
		"\5\33\u02bb\n\33\3\33\3\33\5\33\u02bf\n\33\3\33\3\33\3\33\5\33\u02c4\n"+
		"\33\3\33\3\33\5\33\u02c8\n\33\3\33\3\33\3\33\3\33\3\33\3\33\5\33\u02d0"+
		"\n\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\5\33\u02d9\n\33\3\33\3\33\3\33"+
		"\5\33\u02de\n\33\3\33\3\33\3\33\3\33\5\33\u02e4\n\33\3\33\3\33\3\33\3"+
		"\33\5\33\u02ea\n\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\7\33\u02f4"+
		"\n\33\f\33\16\33\u02f7\13\33\5\33\u02f9\n\33\3\33\3\33\5\33\u02fd\n\33"+
		"\3\33\3\33\3\33\5\33\u0302\n\33\3\33\3\33\3\33\5\33\u0307\n\33\3\33\3"+
		"\33\3\33\3\33\3\33\5\33\u030e\n\33\3\33\5\33\u0311\n\33\3\33\5\33\u0314"+
		"\n\33\3\33\3\33\3\33\3\33\5\33\u031a\n\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\5\33\u0323\n\33\3\33\3\33\3\33\3\33\3\33\3\33\5\33\u032b\n\33\3"+
		"\33\3\33\3\33\3\33\5\33\u0331\n\33\3\33\3\33\5\33\u0335\n\33\3\33\3\33"+
		"\5\33\u0339\n\33\3\33\3\33\5\33\u033d\n\33\5\33\u033f\n\33\3\33\3\33\3"+
		"\33\3\33\3\33\3\33\3\33\5\33\u0348\n\33\3\33\3\33\3\33\3\33\5\33\u034e"+
		"\n\33\3\33\3\33\3\33\5\33\u0353\n\33\3\33\3\33\5\33\u0357\n\33\3\33\5"+
		"\33\u035a\n\33\3\33\3\33\3\33\3\33\3\33\7\33\u0361\n\33\f\33\16\33\u0364"+
		"\13\33\3\33\3\33\5\33\u0368\n\33\3\33\3\33\3\33\5\33\u036d\n\33\3\33\5"+
		"\33\u0370\n\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\5\33\u037a\n\33"+
		"\3\33\3\33\3\33\5\33\u037f\n\33\3\33\3\33\3\33\3\33\5\33\u0385\n\33\3"+
		"\33\3\33\3\33\3\33\5\33\u038b\n\33\3\33\3\33\3\33\7\33\u0390\n\33\f\33"+
		"\16\33\u0393\13\33\3\33\3\33\3\33\7\33\u0398\n\33\f\33\16\33\u039b\13"+
		"\33\3\33\3\33\7\33\u039f\n\33\f\33\16\33\u03a2\13\33\3\33\3\33\3\33\7"+
		"\33\u03a7\n\33\f\33\16\33\u03aa\13\33\5\33\u03ac\n\33\3\34\3\34\3\34\3"+
		"\34\3\34\3\34\5\34\u03b4\n\34\3\34\3\34\5\34\u03b8\n\34\3\34\3\34\3\34"+
		"\3\34\3\34\5\34\u03bf\n\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\5\34\u0436\n\34\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\5\34\u043e\n\34\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\5\34\u0446\n\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\5\34\u044f\n\34\3"+
		"\34\3\34\3\34\3\34\3\34\3\34\3\34\5\34\u0458\n\34\3\34\3\34\5\34\u045c"+
		"\n\34\3\34\3\34\3\34\3\34\5\34\u0462\n\34\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\3\34\5\34\u046e\n\34\3\35\3\35\5\35\u0472\n\35\3\35\5"+
		"\35\u0475\n\35\3\35\3\35\3\35\3\35\5\35\u047b\n\35\3\35\3\35\3\36\3\36"+
		"\3\36\3\36\3\36\3\36\5\36\u0485\n\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37"+
		"\3\37\3\37\3\37\5\37\u0491\n\37\3\37\3\37\3\37\5\37\u0496\n\37\3 \3 \3"+
		" \3!\5!\u049c\n!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\5\"\u04a8\n\"\5"+
		"\"\u04aa\n\"\3\"\3\"\3\"\5\"\u04af\n\"\3\"\3\"\5\"\u04b3\n\"\5\"\u04b5"+
		"\n\"\3#\3#\5#\u04b9\n#\3$\3$\3$\3$\3$\7$\u04c0\n$\f$\16$\u04c3\13$\3$"+
		"\3$\3%\3%\3%\5%\u04ca\n%\3&\3&\3&\3&\3&\5&\u04d1\n&\3\'\3\'\3\'\3\'\5"+
		"\'\u04d7\n\'\7\'\u04d9\n\'\f\'\16\'\u04dc\13\'\3(\3(\3(\3(\7(\u04e2\n"+
		"(\f(\16(\u04e5\13(\3)\3)\5)\u04e9\n)\3)\3)\3)\3)\3*\3*\3*\3+\3+\3+\3+"+
		"\7+\u04f6\n+\f+\16+\u04f9\13+\3+\3+\3,\3,\5,\u04ff\n,\3,\5,\u0502\n,\3"+
		"-\3-\3-\7-\u0507\n-\f-\16-\u050a\13-\3-\5-\u050d\n-\3.\3.\3.\3.\5.\u0513"+
		"\n.\3/\3/\3/\3/\7/\u0519\n/\f/\16/\u051c\13/\3/\3/\3\60\3\60\3\60\3\60"+
		"\7\60\u0524\n\60\f\60\16\60\u0527\13\60\3\60\3\60\3\61\3\61\3\61\3\61"+
		"\3\61\3\61\5\61\u0531\n\61\3\62\3\62\3\62\3\62\3\62\5\62\u0538\n\62\3"+
		"\63\3\63\3\63\3\63\5\63\u053e\n\63\3\64\3\64\3\64\3\65\5\65\u0544\n\65"+
		"\3\65\3\65\3\65\3\65\3\65\6\65\u054b\n\65\r\65\16\65\u054c\5\65\u054f"+
		"\n\65\3\66\3\66\3\66\3\66\3\66\7\66\u0556\n\66\f\66\16\66\u0559\13\66"+
		"\5\66\u055b\n\66\3\66\3\66\3\66\3\66\3\66\7\66\u0562\n\66\f\66\16\66\u0565"+
		"\13\66\5\66\u0567\n\66\3\66\3\66\3\66\3\66\3\66\7\66\u056e\n\66\f\66\16"+
		"\66\u0571\13\66\5\66\u0573\n\66\3\66\3\66\3\66\3\66\3\66\7\66\u057a\n"+
		"\66\f\66\16\66\u057d\13\66\5\66\u057f\n\66\3\66\5\66\u0582\n\66\3\66\3"+
		"\66\5\66\u0586\n\66\3\67\5\67\u0589\n\67\3\67\3\67\3\67\38\38\38\38\3"+
		"8\38\58\u0594\n8\38\78\u0597\n8\f8\168\u059a\138\39\39\39\39\39\39\39"+
		"\39\59\u05a4\n9\3:\3:\5:\u05a8\n:\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\5;\u05b4"+
		"\n;\3;\5;\u05b7\n;\3;\3;\5;\u05bb\n;\3;\3;\3;\3;\3;\3;\3;\3;\5;\u05c5"+
		"\n;\3;\3;\5;\u05c9\n;\5;\u05cb\n;\3;\5;\u05ce\n;\3;\3;\5;\u05d2\n;\3;"+
		"\5;\u05d5\n;\3;\3;\5;\u05d9\n;\3;\3;\5;\u05dd\n;\3;\3;\5;\u05e1\n;\3;"+
		"\3;\3;\5;\u05e6\n;\3;\5;\u05e9\n;\5;\u05eb\n;\3;\7;\u05ee\n;\f;\16;\u05f1"+
		"\13;\3;\3;\5;\u05f5\n;\3;\5;\u05f8\n;\3;\3;\5;\u05fc\n;\3;\5;\u05ff\n"+
		";\5;\u0601\n;\3<\3<\3<\3<\7<\u0607\n<\f<\16<\u060a\13<\3<\7<\u060d\n<"+
		"\f<\16<\u0610\13<\3=\3=\3=\3=\3=\7=\u0617\n=\f=\16=\u061a\13=\3=\3=\3"+
		"=\3=\3=\3=\3=\3=\3=\3=\7=\u0626\n=\f=\16=\u0629\13=\3=\3=\5=\u062d\n="+
		"\3>\3>\3>\3>\7>\u0633\n>\f>\16>\u0636\13>\5>\u0638\n>\3>\3>\5>\u063c\n"+
		">\3?\3?\3?\5?\u0641\n?\3?\3?\3?\3?\3?\7?\u0648\n?\f?\16?\u064b\13?\5?"+
		"\u064d\n?\3?\3?\3?\5?\u0652\n?\3?\3?\3?\7?\u0657\n?\f?\16?\u065a\13?\5"+
		"?\u065c\n?\3@\3@\3A\3A\3A\3A\3A\3A\5A\u0666\nA\3A\3A\3A\5A\u066b\nA\3"+
		"A\3A\3A\3A\3A\5A\u0672\nA\7A\u0674\nA\fA\16A\u0677\13A\3B\5B\u067a\nB"+
		"\3B\3B\5B\u067e\nB\3B\3B\3B\3B\5B\u0684\nB\3B\3B\5B\u0688\nB\3B\5B\u068b"+
		"\nB\3B\5B\u068e\nB\3C\3C\3C\3C\3C\3C\3C\7C\u0697\nC\fC\16C\u069a\13C\3"+
		"C\3C\5C\u069e\nC\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\3"+
		"D\3D\5D\u06b3\nD\5D\u06b5\nD\5D\u06b7\nD\3D\3D\3E\3E\3E\3E\3F\3F\3F\7"+
		"F\u06c2\nF\fF\16F\u06c5\13F\3G\3G\3G\3G\7G\u06cb\nG\fG\16G\u06ce\13G\3"+
		"G\3G\3H\3H\5H\u06d4\nH\3I\3I\3I\3I\7I\u06da\nI\fI\16I\u06dd\13I\3I\3I"+
		"\3J\3J\3J\5J\u06e4\nJ\3K\3K\5K\u06e8\nK\3K\5K\u06eb\nK\3K\5K\u06ee\nK"+
		"\3K\3K\3K\3K\5K\u06f4\nK\3K\5K\u06f7\nK\3K\5K\u06fa\nK\3K\3K\3K\3K\5K"+
		"\u0700\nK\3K\5K\u0703\nK\3K\5K\u0706\nK\3K\5K\u0709\nK\3L\3L\3L\3L\7L"+
		"\u070f\nL\fL\16L\u0712\13L\3L\5L\u0715\nL\3L\3L\5L\u0719\nL\5L\u071b\n"+
		"L\3M\3M\3M\3M\3M\3M\3M\5M\u0724\nM\3M\3M\3M\3M\3M\3M\3M\3M\3M\3M\5M\u0730"+
		"\nM\5M\u0732\nM\3M\3M\3M\3M\3M\5M\u0739\nM\3M\3M\3M\3M\3M\5M\u0740\nM"+
		"\3M\3M\3M\3M\5M\u0746\nM\3M\3M\3M\3M\5M\u074c\nM\5M\u074e\nM\3N\3N\3N"+
		"\5N\u0753\nN\3N\3N\3O\3O\5O\u0759\nO\3O\3O\5O\u075d\nO\5O\u075f\nO\3P"+
		"\3P\3P\7P\u0764\nP\fP\16P\u0767\13P\3Q\3Q\3R\3R\3R\3R\3R\3R\3R\3R\3R\5"+
		"R\u0774\nR\3R\3R\3R\3R\3R\3R\7R\u077c\nR\fR\16R\u077f\13R\3S\3S\5S\u0783"+
		"\nS\3T\5T\u0786\nT\3T\3T\3T\3T\3T\3T\5T\u078e\nT\3T\3T\3T\3T\3T\7T\u0795"+
		"\nT\fT\16T\u0798\13T\3T\3T\3T\5T\u079d\nT\3T\3T\3T\3T\3T\3T\5T\u07a5\n"+
		"T\3T\3T\3T\3T\5T\u07ab\nT\3T\5T\u07ae\nT\3U\3U\3U\3U\5U\u07b4\nU\3U\3"+
		"U\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\3U\7U\u07c9\nU\fU\16"+
		"U\u07cc\13U\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\6V\u07d9\nV\rV\16V\u07da"+
		"\3V\3V\3V\3V\3V\5V\u07e2\nV\3V\3V\3V\7V\u07e7\nV\fV\16V\u07ea\13V\5V\u07ec"+
		"\nV\3V\3V\3V\5V\u07f1\nV\3V\3V\3V\3V\3V\3V\3V\6V\u07fa\nV\rV\16V\u07fb"+
		"\3V\3V\5V\u0800\nV\3V\3V\3V\3V\6V\u0806\nV\rV\16V\u0807\3V\3V\5V\u080c"+
		"\nV\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\5V\u081c\nV\3V\3V\3V\3V"+
		"\3V\3V\3V\3V\7V\u0826\nV\fV\16V\u0829\13V\3W\3W\3W\3W\3W\3W\3W\3W\6W\u0833"+
		"\nW\rW\16W\u0834\5W\u0837\nW\3X\3X\3Y\3Y\3Z\3Z\3[\3[\3\\\3\\\7\\\u0843"+
		"\n\\\f\\\16\\\u0846\13\\\3]\3]\3]\3]\5]\u084c\n]\3^\5^\u084f\n^\3^\3^"+
		"\5^\u0853\n^\3_\3_\3_\3_\3_\3_\3_\3_\3_\3_\3_\3_\3_\3_\3_\5_\u0864\n_"+
		"\3_\3_\5_\u0868\n_\3_\3_\3_\3_\3_\7_\u086f\n_\f_\16_\u0872\13_\3_\5_\u0875"+
		"\n_\5_\u0877\n_\3`\3`\3`\7`\u087c\n`\f`\16`\u087f\13`\3a\3a\5a\u0883\n"+
		"a\3a\3a\3a\5a\u0888\na\3b\3b\3b\3b\3b\3c\3c\3c\3c\7c\u0893\nc\fc\16c\u0896"+
		"\13c\3d\3d\3d\3d\3e\3e\3e\3e\3e\3e\3e\7e\u08a3\ne\fe\16e\u08a6\13e\3e"+
		"\3e\3e\3e\3e\7e\u08ad\ne\fe\16e\u08b0\13e\5e\u08b2\ne\3e\3e\3e\3e\3e\7"+
		"e\u08b9\ne\fe\16e\u08bc\13e\5e\u08be\ne\5e\u08c0\ne\3e\5e\u08c3\ne\3e"+
		"\5e\u08c6\ne\3f\3f\3f\3f\3f\3f\3f\3f\3f\3f\3f\3f\3f\3f\3f\3f\5f\u08d8"+
		"\nf\3g\3g\3g\3g\3g\3g\3g\5g\u08e1\ng\3h\3h\3h\7h\u08e6\nh\fh\16h\u08e9"+
		"\13h\3i\3i\3i\3i\3i\3i\3i\3i\3i\3i\3i\3i\3i\3i\5i\u08f9\ni\3j\3j\3j\5"+
		"j\u08fe\nj\3k\3k\3l\3l\3l\3l\3l\3l\3l\5l\u0909\nl\3m\3m\3m\7\u0362\u0391"+
		"\u0399\u03a0\u03a8\7n\u0080\u00a2\u00a8\u00aan\2\4\6\b\n\f\16\20\22\24"+
		"\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtv"+
		"xz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\u008e\u0090\u0092\u0094"+
		"\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac"+
		"\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8\u00ba\u00bc\u00be\u00c0\u00c2\u00c4"+
		"\u00c6\u00c8\u00ca\u00cc\u00ce\u00d0\u00d2\u00d4\u00d6\u00d8\2\36\3\2"+
		"\4\5\4\2\6\7tt\3\2\23\26\4\2\22\22\u00eb\u00eb\4\2\u00eb\u00eb\u00f4\u00f4"+
		"\3\2\u00c4\u00c5\3\2WX\5\2`a\u00ab\u00ab\u00b1\u00b1\4\2\30\30**\4\2\67"+
		"\67]]\4\2\u00ab\u00ab\u00b1\u00b1\4\2\31\31\u00d1\u00d1\3\2km\3\2\66\67"+
		"\3\2\33\34\3\2\u00f0\u00f1\3\2/\60\4\2\u0088\u0089\u008e\u008e\3\2\u008a"+
		"\u008d\3\2\u0088\u0089\3\2\u0080\u0087\3\2\u0088\u0091\3\2(+\3\2\63\64"+
		"\4\2LL\u0098\u0098\4\2$$\u0096\u0096\3\2PQ\t\2\27>AAIjn\177\u008d\u008d"+
		"\u0092\u00e7\u00e9\u00ea\u0a74\2\u00e5\3\2\2\2\4\u00f2\3\2\2\2\6\u00fb"+
		"\3\2\2\2\b\u0100\3\2\2\2\n\u0109\3\2\2\2\f\u010b\3\2\2\2\16\u010d\3\2"+
		"\2\2\20\u0120\3\2\2\2\22\u0122\3\2\2\2\24\u0128\3\2\2\2\26\u012a\3\2\2"+
		"\2\30\u012c\3\2\2\2\32\u0132\3\2\2\2\34\u0134\3\2\2\2\36\u0136\3\2\2\2"+
		" \u0148\3\2\2\2\"\u014a\3\2\2\2$\u0159\3\2\2\2&\u0168\3\2\2\2(\u016a\3"+
		"\2\2\2*\u0174\3\2\2\2,\u0176\3\2\2\2.\u0179\3\2\2\2\60\u017c\3\2\2\2\62"+
		"\u017f\3\2\2\2\64\u03ab\3\2\2\2\66\u046d\3\2\2\28\u046f\3\2\2\2:\u047e"+
		"\3\2\2\2<\u048a\3\2\2\2>\u0497\3\2\2\2@\u049b\3\2\2\2B\u04b4\3\2\2\2D"+
		"\u04b6\3\2\2\2F\u04ba\3\2\2\2H\u04c6\3\2\2\2J\u04d0\3\2\2\2L\u04d2\3\2"+
		"\2\2N\u04dd\3\2\2\2P\u04e6\3\2\2\2R\u04ee\3\2\2\2T\u04f1\3\2\2\2V\u04fc"+
		"\3\2\2\2X\u050c\3\2\2\2Z\u0512\3\2\2\2\\\u0514\3\2\2\2^\u051f\3\2\2\2"+
		"`\u0530\3\2\2\2b\u0537\3\2\2\2d\u0539\3\2\2\2f\u053f\3\2\2\2h\u054e\3"+
		"\2\2\2j\u055a\3\2\2\2l\u0588\3\2\2\2n\u058d\3\2\2\2p\u05a3\3\2\2\2r\u05a5"+
		"\3\2\2\2t\u0600\3\2\2\2v\u0602\3\2\2\2x\u0611\3\2\2\2z\u063b\3\2\2\2|"+
		"\u063d\3\2\2\2~\u065d\3\2\2\2\u0080\u065f\3\2\2\2\u0082\u068d\3\2\2\2"+
		"\u0084\u069d\3\2\2\2\u0086\u069f\3\2\2\2\u0088\u06ba\3\2\2\2\u008a\u06be"+
		"\3\2\2\2\u008c\u06c6\3\2\2\2\u008e\u06d1\3\2\2\2\u0090\u06d5\3\2\2\2\u0092"+
		"\u06e0\3\2\2\2\u0094\u0708\3\2\2\2\u0096\u070a\3\2\2\2\u0098\u074d\3\2"+
		"\2\2\u009a\u0752\3\2\2\2\u009c\u0756\3\2\2\2\u009e\u0760\3\2\2\2\u00a0"+
		"\u0768\3\2\2\2\u00a2\u0773\3\2\2\2\u00a4\u0780\3\2\2\2\u00a6\u07ad\3\2"+
		"\2\2\u00a8\u07b3\3\2\2\2\u00aa\u081b\3\2\2\2\u00ac\u0836\3\2\2\2\u00ae"+
		"\u0838\3\2\2\2\u00b0\u083a\3\2\2\2\u00b2\u083c\3\2\2\2\u00b4\u083e\3\2"+
		"\2\2\u00b6\u0840\3\2\2\2\u00b8\u0847\3\2\2\2\u00ba\u0852\3\2\2\2\u00bc"+
		"\u0876\3\2\2\2\u00be\u0878\3\2\2\2\u00c0\u0880\3\2\2\2\u00c2\u0889\3\2"+
		"\2\2\u00c4\u088e\3\2\2\2\u00c6\u0897\3\2\2\2\u00c8\u08c5\3\2\2\2\u00ca"+
		"\u08d7\3\2\2\2\u00cc\u08e0\3\2\2\2\u00ce\u08e2\3\2\2\2\u00d0\u08f8\3\2"+
		"\2\2\u00d2\u08fd\3\2\2\2\u00d4\u08ff\3\2\2\2\u00d6\u0908\3\2\2\2\u00d8"+
		"\u090a\3\2\2\2\u00da\u00db\5\30\r\2\u00db\u00dc\7\3\2\2\u00dc\u00e4\3"+
		"\2\2\2\u00dd\u00de\5\4\3\2\u00de\u00df\7\3\2\2\u00df\u00e4\3\2\2\2\u00e0"+
		"\u00e1\5\b\5\2\u00e1\u00e2\7\3\2\2\u00e2\u00e4\3\2\2\2\u00e3\u00da\3\2"+
		"\2\2\u00e3\u00dd\3\2\2\2\u00e3\u00e0\3\2\2\2\u00e4\u00e7\3\2\2\2\u00e5"+
		"\u00e3\3\2\2\2\u00e5\u00e6\3\2\2\2\u00e6\u00ed\3\2\2\2\u00e7\u00e5\3\2"+
		"\2\2\u00e8\u00e9\5 \21\2\u00e9\u00ea\7\3\2\2\u00ea\u00ec\3\2\2\2\u00eb"+
		"\u00e8\3\2\2\2\u00ec\u00ef\3\2\2\2\u00ed\u00eb\3\2\2\2\u00ed\u00ee\3\2"+
		"\2\2\u00ee\u00f0\3\2\2\2\u00ef\u00ed\3\2\2\2\u00f0\u00f1\7\2\2\3\u00f1"+
		"\3\3\2\2\2\u00f2\u00f3\5\n\6\2\u00f3\u00f4\7\u0080\2\2\u00f4\u00f5\7\23"+
		"\2\2\u00f5\u00f6\5\16\b\2\u00f6\u00f7\5\6\4\2\u00f7\5\3\2\2\2\u00f8\u00fa"+
		"\5\22\n\2\u00f9\u00f8\3\2\2\2\u00fa\u00fd\3\2\2\2\u00fb\u00f9\3\2\2\2"+
		"\u00fb\u00fc\3\2\2\2\u00fc\u00fe\3\2\2\2\u00fd\u00fb\3\2\2\2\u00fe\u00ff"+
		"\5$\23\2\u00ff\7\3\2\2\2\u0100\u0101\5\n\6\2\u0101\u0105\7\u0080\2\2\u0102"+
		"\u0103\5\f\7\2\u0103\u0104\5\16\b\2\u0104\u0106\3\2\2\2\u0105\u0102\3"+
		"\2\2\2\u0105\u0106\3\2\2\2\u0106\u0107\3\2\2\2\u0107\u0108\5\20\t\2\u0108"+
		"\t\3\2\2\2\u0109\u010a\7\u00f4\2\2\u010a\13\3\2\2\2\u010b\u010c\t\2\2"+
		"\2\u010c\r\3\2\2\2\u010d\u010e\5\u00d0i\2\u010e\17\3\2\2\2\u010f\u0113"+
		"\5\24\13\2\u0110\u0112\5\26\f\2\u0111\u0110\3\2\2\2\u0112\u0115\3\2\2"+
		"\2\u0113\u0111\3\2\2\2\u0113\u0114\3\2\2\2\u0114\u0116\3\2\2\2\u0115\u0113"+
		"\3\2\2\2\u0116\u0117\7\30\2\2\u0117\u0118\5\n\6\2\u0118\u0121\3\2\2\2"+
		"\u0119\u011b\5\22\n\2\u011a\u0119\3\2\2\2\u011b\u011e\3\2\2\2\u011c\u011a"+
		"\3\2\2\2\u011c\u011d\3\2\2\2\u011d\u011f\3\2\2\2\u011e\u011c\3\2\2\2\u011f"+
		"\u0121\5\64\33\2\u0120\u010f\3\2\2\2\u0120\u011c\3\2\2\2\u0121\21\3\2"+
		"\2\2\u0122\u0123\7w\2\2\u0123\u0124\5\u00ceh\2\u0124\u0125\7\u0080\2\2"+
		"\u0125\u0126\5\u00acW\2\u0126\u0127\7\3\2\2\u0127\23\3\2\2\2\u0128\u0129"+
		"\t\3\2\2\u0129\25\3\2\2\2\u012a\u012b\7\u00f4\2\2\u012b\27\3\2\2\2\u012c"+
		"\u012d\5\32\16\2\u012d\u012e\7\u0080\2\2\u012e\u012f\7\b\2\2\u012f\u0130"+
		"\5\34\17\2\u0130\u0131\5\36\20\2\u0131\31\3\2\2\2\u0132\u0133\7\u00f4"+
		"\2\2\u0133\33\3\2\2\2\u0134\u0135\t\4\2\2\u0135\35\3\2\2\2\u0136\u0137"+
		"\t\5\2\2\u0137\37\3\2\2\2\u0138\u0139\5\u00ceh\2\u0139\u013a\7\t\2\2\u013a"+
		"\u013b\7\n\2\2\u013b\u0149\3\2\2\2\u013c\u013d\5\u00ceh\2\u013d\u013e"+
		"\7\t\2\2\u013e\u0143\5\"\22\2\u013f\u0140\7\13\2\2\u0140\u0142\5\"\22"+
		"\2\u0141\u013f\3\2\2\2\u0142\u0145\3\2\2\2\u0143\u0141\3\2\2\2\u0143\u0144"+
		"\3\2\2\2\u0144\u0146\3\2\2\2\u0145\u0143\3\2\2\2\u0146\u0147\7\n\2\2\u0147"+
		"\u0149\3\2\2\2\u0148\u0138\3\2\2\2\u0148\u013c\3\2\2\2\u0149!\3\2\2\2"+
		"\u014a\u014b\t\6\2\2\u014b#\3\2\2\2\u014c\u014d\7\f\2\2\u014d\u0152\5"+
		"(\25\2\u014e\u014f\7\13\2\2\u014f\u0151\5(\25\2\u0150\u014e\3\2\2\2\u0151"+
		"\u0154\3\2\2\2\u0152\u0150\3\2\2\2\u0152\u0153\3\2\2\2\u0153\u0155\3\2"+
		"\2\2\u0154\u0152\3\2\2\2\u0155\u0156\7\r\2\2\u0156\u015a\3\2\2\2\u0157"+
		"\u0158\7\f\2\2\u0158\u015a\7\r\2\2\u0159\u014c\3\2\2\2\u0159\u0157\3\2"+
		"\2\2\u015a%\3\2\2\2\u015b\u015c\7\16\2\2\u015c\u0161\5*\26\2\u015d\u015e"+
		"\7\13\2\2\u015e\u0160\5*\26\2\u015f\u015d\3\2\2\2\u0160\u0163\3\2\2\2"+
		"\u0161\u015f\3\2\2\2\u0161\u0162\3\2\2\2\u0162\u0164\3\2\2\2\u0163\u0161"+
		"\3\2\2\2\u0164\u0165\7\17\2\2\u0165\u0169\3\2\2\2\u0166\u0167\7\16\2\2"+
		"\u0167\u0169\7\17\2\2\u0168\u015b\3\2\2\2\u0168\u0166\3\2\2\2\u0169\'"+
		"\3\2\2\2\u016a\u016b\7\u00eb\2\2\u016b\u016c\7\20\2\2\u016c\u016d\5*\26"+
		"\2\u016d)\3\2\2\2\u016e\u0175\5$\23\2\u016f\u0175\5&\24\2\u0170\u0175"+
		"\7\u00eb\2\2\u0171\u0175\5\u00d6l\2\u0172\u0175\5\u00b4[\2\u0173\u0175"+
		"\7\62\2\2\u0174\u016e\3\2\2\2\u0174\u016f\3\2\2\2\u0174\u0170\3\2\2\2"+
		"\u0174\u0171\3\2\2\2\u0174\u0172\3\2\2\2\u0174\u0173\3\2\2\2\u0175+\3"+
		"\2\2\2\u0176\u0177\5\64\33\2\u0177\u0178\7\2\2\3\u0178-\3\2\2\2\u0179"+
		"\u017a\5\u009cO\2\u017a\u017b\7\2\2\3\u017b/\3\2\2\2\u017c\u017d\5\u009a"+
		"N\2\u017d\u017e\7\2\2\3\u017e\61\3\2\2\2\u017f\u0180\5\u00bc_\2\u0180"+
		"\u0181\7\2\2\3\u0181\63\3\2\2\2\u0182\u03ac\5@!\2\u0183\u0184\7g\2\2\u0184"+
		"\u03ac\5\u00d0i\2\u0185\u0186\7V\2\2\u0186\u018a\7\u00cb\2\2\u0187\u0188"+
		"\7\177\2\2\u0188\u0189\7+\2\2\u0189\u018b\7-\2\2\u018a\u0187\3\2\2\2\u018a"+
		"\u018b\3\2\2\2\u018b\u018c\3\2\2\2\u018c\u018f\5\u00d0i\2\u018d\u018e"+
		"\7v\2\2\u018e\u0190\7\u00eb\2\2\u018f\u018d\3\2\2\2\u018f\u0190\3\2\2"+
		"\2\u0190\u0192\3\2\2\2\u0191\u0193\5> \2\u0192\u0191\3\2\2\2\u0192\u0193"+
		"\3\2\2\2\u0193\u0197\3\2\2\2\u0194\u0195\7T\2\2\u0195\u0196\7\u00b6\2"+
		"\2\u0196\u0198\5T+\2\u0197\u0194\3\2\2\2\u0197\u0198\3\2\2\2\u0198\u03ac"+
		"\3\2\2\2\u0199\u019a\7q\2\2\u019a\u019b\7\u00cb\2\2\u019b\u019c\5\u00d0"+
		"i\2\u019c\u019d\7w\2\2\u019d\u019e\7\u00b6\2\2\u019e\u019f\5T+\2\u019f"+
		"\u03ac\3\2\2\2\u01a0\u01a1\7j\2\2\u01a1\u01a4\7\u00cb\2\2\u01a2\u01a3"+
		"\7\177\2\2\u01a3\u01a5\7-\2\2\u01a4\u01a2\3\2\2\2\u01a4\u01a5\3\2\2\2"+
		"\u01a5\u01a6\3\2\2\2\u01a6\u01a8\5\u00d0i\2\u01a7\u01a9\t\7\2\2\u01a8"+
		"\u01a7\3\2\2\2\u01a8\u01a9\3\2\2\2\u01a9\u03ac\3\2\2\2\u01aa\u01af\58"+
		"\35\2\u01ab\u01ac\7\t\2\2\u01ac\u01ad\5\u00be`\2\u01ad\u01ae\7\n\2\2\u01ae"+
		"\u01b0\3\2\2\2\u01af\u01ab\3\2\2\2\u01af\u01b0\3\2\2\2\u01b0\u01b1\3\2"+
		"\2\2\u01b1\u01b4\5R*\2\u01b2\u01b3\7\u00b3\2\2\u01b3\u01b5\5T+\2\u01b4"+
		"\u01b2\3\2\2\2\u01b4\u01b5\3\2\2\2\u01b5\u01b9\3\2\2\2\u01b6\u01b7\7\u00d3"+
		"\2\2\u01b7\u01b8\7\37\2\2\u01b8\u01ba\5\u0088E\2\u01b9\u01b6\3\2\2\2\u01b9"+
		"\u01ba\3\2\2\2\u01ba\u01bc\3\2\2\2\u01bb\u01bd\5:\36\2\u01bc\u01bb\3\2"+
		"\2\2\u01bc\u01bd\3\2\2\2\u01bd\u03ac\3\2\2\2\u01be\u01bf\58\35\2\u01bf"+
		"\u01c2\5R*\2\u01c0\u01c1\7\u00b3\2\2\u01c1\u01c3\5T+\2\u01c2\u01c0\3\2"+
		"\2\2\u01c2\u01c3\3\2\2\2\u01c3\u01c7\3\2\2\2\u01c4\u01c5\7\u00d3\2\2\u01c5"+
		"\u01c6\7\37\2\2\u01c6\u01c8\5\u0088E\2\u01c7\u01c4\3\2\2\2\u01c7\u01c8"+
		"\3\2\2\2\u01c8\u01ca\3\2\2\2\u01c9\u01cb\5:\36\2\u01ca\u01c9\3\2\2\2\u01ca"+
		"\u01cb\3\2\2\2\u01cb\u01cd\3\2\2\2\u01cc\u01ce\7\32\2\2\u01cd\u01cc\3"+
		"\2\2\2\u01cd\u01ce\3\2\2\2\u01ce\u01cf\3\2\2\2\u01cf\u01d0\5@!\2\u01d0"+
		"\u03ac\3\2\2\2\u01d1\u01d6\58\35\2\u01d2\u01d3\7\t\2\2\u01d3\u01d4\5\u00be"+
		"`\2\u01d4\u01d5\7\n\2\2\u01d5\u01d7\3\2\2\2\u01d6\u01d2\3\2\2\2\u01d6"+
		"\u01d7\3\2\2\2\u01d7\u01da\3\2\2\2\u01d8\u01d9\7v\2\2\u01d9\u01db\7\u00eb"+
		"\2\2\u01da\u01d8\3\2\2\2\u01da\u01db\3\2\2\2\u01db\u01e2\3\2\2\2\u01dc"+
		"\u01dd\7\u00d3\2\2\u01dd\u01de\7\37\2\2\u01de\u01df\7\t\2\2\u01df\u01e0"+
		"\5\u00be`\2\u01e0\u01e1\7\n\2\2\u01e1\u01e3\3\2\2\2\u01e2\u01dc\3\2\2"+
		"\2\u01e2\u01e3\3\2\2\2\u01e3\u01e5\3\2\2\2\u01e4\u01e6\5:\36\2\u01e5\u01e4"+
		"\3\2\2\2\u01e5\u01e6\3\2\2\2\u01e6\u01e8\3\2\2\2\u01e7\u01e9\5<\37\2\u01e8"+
		"\u01e7\3\2\2\2\u01e8\u01e9\3\2\2\2\u01e9\u01eb\3\2\2\2\u01ea\u01ec\5\u0098"+
		"M\2\u01eb\u01ea\3\2\2\2\u01eb\u01ec\3\2\2\2\u01ec\u01ee\3\2\2\2\u01ed"+
		"\u01ef\5`\61\2\u01ee\u01ed\3\2\2\2\u01ee\u01ef\3\2\2\2\u01ef\u01f1\3\2"+
		"\2\2\u01f0\u01f2\5> \2\u01f1\u01f0\3\2\2\2\u01f1\u01f2\3\2\2\2\u01f2\u01f5"+
		"\3\2\2\2\u01f3\u01f4\7\u00b5\2\2\u01f4\u01f6\5T+\2\u01f5\u01f3\3\2\2\2"+
		"\u01f5\u01f6\3\2\2\2\u01f6\u01fb\3\2\2\2\u01f7\u01f9\7\32\2\2\u01f8\u01f7"+
		"\3\2\2\2\u01f8\u01f9\3\2\2\2\u01f9\u01fa\3\2\2\2\u01fa\u01fc\5@!\2\u01fb"+
		"\u01f8\3\2\2\2\u01fb\u01fc\3\2\2\2\u01fc\u03ac\3\2\2\2\u01fd\u01fe\7V"+
		"\2\2\u01fe\u0202\7W\2\2\u01ff\u0200\7\177\2\2\u0200\u0201\7+\2\2\u0201"+
		"\u0203\7-\2\2\u0202\u01ff\3\2\2\2\u0202\u0203\3\2\2\2\u0203\u0204\3\2"+
		"\2\2\u0204\u0205\5\u009aN\2\u0205\u0206\7/\2\2\u0206\u0207\5\u009aN\2"+
		"\u0207\u03ac\3\2\2\2\u0208\u0209\7\u00cf\2\2\u0209\u020a\7W\2\2\u020a"+
		"\u020c\5\u009aN\2\u020b\u020d\5F$\2\u020c\u020b\3\2\2\2\u020c\u020d\3"+
		"\2\2\2\u020d\u020e\3\2\2\2\u020e\u020f\7\u00d0\2\2\u020f\u0216\7\u00d2"+
		"\2\2\u0210\u0217\5\u00d0i\2\u0211\u0212\78\2\2\u0212\u0214\7e\2\2\u0213"+
		"\u0215\5\u008aF\2\u0214\u0213\3\2\2\2\u0214\u0215\3\2\2\2\u0215\u0217"+
		"\3\2\2\2\u0216\u0210\3\2\2\2\u0216\u0211\3\2\2\2\u0216\u0217\3\2\2\2\u0217"+
		"\u03ac\3\2\2\2\u0218\u0219\7q\2\2\u0219\u021a\t\b\2\2\u021a\u021b\5\u009a"+
		"N\2\u021b\u021c\7r\2\2\u021c\u021d\7n\2\2\u021d\u021e\5\u009aN\2\u021e"+
		"\u03ac\3\2\2\2\u021f\u0220\7q\2\2\u0220\u0221\t\b\2\2\u0221\u0222\5\u009a"+
		"N\2\u0222\u0223\7w\2\2\u0223\u0224\7\u00b5\2\2\u0224\u0225\5T+\2\u0225"+
		"\u03ac\3\2\2\2\u0226\u0227\7q\2\2\u0227\u0228\t\b\2\2\u0228\u0229\5\u009a"+
		"N\2\u0229\u022a\7\u00b4\2\2\u022a\u022d\7\u00b5\2\2\u022b\u022c\7\177"+
		"\2\2\u022c\u022e\7-\2\2\u022d\u022b\3\2\2\2\u022d\u022e\3\2\2\2\u022e"+
		"\u022f\3\2\2\2\u022f\u0230\5T+\2\u0230\u03ac\3\2\2\2\u0231\u0232\7q\2"+
		"\2\u0232\u0233\7W\2\2\u0233\u0235\5\u009aN\2\u0234\u0236\5F$\2\u0235\u0234"+
		"\3\2\2\2\u0235\u0236\3\2\2\2\u0236\u0237\3\2\2\2\u0237\u0238\7w\2\2\u0238"+
		"\u0239\7\u009d\2\2\u0239\u023d\7\u00eb\2\2\u023a\u023b\7T\2\2\u023b\u023c"+
		"\7\u009e\2\2\u023c\u023e\5T+\2\u023d\u023a\3\2\2\2\u023d\u023e\3\2\2\2"+
		"\u023e\u03ac\3\2\2\2\u023f\u0240\7q\2\2\u0240\u0241\7W\2\2\u0241\u0243"+
		"\5\u009aN\2\u0242\u0244\5F$\2\u0243\u0242\3\2\2\2\u0243\u0244\3\2\2\2"+
		"\u0244\u0245\3\2\2\2\u0245\u0246\7w\2\2\u0246\u0247\7\u009e\2\2\u0247"+
		"\u0248\5T+\2\u0248\u03ac\3\2\2\2\u0249\u024a\7q\2\2\u024a\u024b\7W\2\2"+
		"\u024b\u024c\5\u009aN\2\u024c\u0250\7\31\2\2\u024d\u024e\7\177\2\2\u024e"+
		"\u024f\7+\2\2\u024f\u0251\7-\2\2\u0250\u024d\3\2\2\2\u0250\u0251\3\2\2"+
		"\2\u0251\u0253\3\2\2\2\u0252\u0254\5D#\2\u0253\u0252\3\2\2\2\u0254\u0255"+
		"\3\2\2\2\u0255\u0253\3\2\2\2\u0255\u0256\3\2\2\2\u0256\u03ac\3\2\2\2\u0257"+
		"\u0258\7q\2\2\u0258\u0259\7X\2\2\u0259\u025a\5\u009aN\2\u025a\u025e\7"+
		"\31\2\2\u025b\u025c\7\177\2\2\u025c\u025d\7+\2\2\u025d\u025f\7-\2\2\u025e"+
		"\u025b\3\2\2\2\u025e\u025f\3\2\2\2\u025f\u0261\3\2\2\2\u0260\u0262\5F"+
		"$\2\u0261\u0260\3\2\2\2\u0262\u0263\3\2\2\2\u0263\u0261\3\2\2\2\u0263"+
		"\u0264\3\2\2\2\u0264\u03ac\3\2\2\2\u0265\u0266\7q\2\2\u0266\u0267\7W\2"+
		"\2\u0267\u0268\5\u009aN\2\u0268\u0269\5F$\2\u0269\u026a\7r\2\2\u026a\u026b"+
		"\7n\2\2\u026b\u026c\5F$\2\u026c\u03ac\3\2\2\2\u026d\u026e\7q\2\2\u026e"+
		"\u026f\7W\2\2\u026f\u0270\5\u009aN\2\u0270\u0273\7j\2\2\u0271\u0272\7"+
		"\177\2\2\u0272\u0274\7-\2\2\u0273\u0271\3\2\2\2\u0273\u0274\3\2\2\2\u0274"+
		"\u0275\3\2\2\2\u0275\u027a\5F$\2\u0276\u0277\7\13\2\2\u0277\u0279\5F$"+
		"\2\u0278\u0276\3\2\2\2\u0279\u027c\3\2\2\2\u027a\u0278\3\2\2\2\u027a\u027b"+
		"\3\2\2\2\u027b\u027e\3\2\2\2\u027c\u027a\3\2\2\2\u027d\u027f\7\u00c8\2"+
		"\2\u027e\u027d\3\2\2\2\u027e\u027f\3\2\2\2\u027f\u03ac\3\2\2\2\u0280\u0281"+
		"\7q\2\2\u0281\u0282\7X\2\2\u0282\u0283\5\u009aN\2\u0283\u0286\7j\2\2\u0284"+
		"\u0285\7\177\2\2\u0285\u0287\7-\2\2\u0286\u0284\3\2\2\2\u0286\u0287\3"+
		"\2\2\2\u0287\u0288\3\2\2\2\u0288\u028d\5F$\2\u0289\u028a\7\13\2\2\u028a"+
		"\u028c\5F$\2\u028b\u0289\3\2\2\2\u028c\u028f\3\2\2\2\u028d\u028b\3\2\2"+
		"\2\u028d\u028e\3\2\2\2\u028e\u03ac\3\2\2\2\u028f\u028d\3\2\2\2\u0290\u0291"+
		"\7q\2\2\u0291\u0292\7W\2\2\u0292\u0294\5\u009aN\2\u0293\u0295\5F$\2\u0294"+
		"\u0293\3\2\2\2\u0294\u0295\3\2\2\2\u0295\u0296\3\2\2\2\u0296\u0297\7w"+
		"\2\2\u0297\u0298\5> \2\u0298\u03ac\3\2\2\2\u0299\u029a\7j\2\2\u029a\u029d"+
		"\7W\2\2\u029b\u029c\7\177\2\2\u029c\u029e\7-\2\2\u029d\u029b\3\2\2\2\u029d"+
		"\u029e\3\2\2\2\u029e\u029f\3\2\2\2\u029f\u02a1\5\u009aN\2\u02a0\u02a2"+
		"\7\u00c8\2\2\u02a1\u02a0\3\2\2\2\u02a1\u02a2\3\2\2\2\u02a2\u03ac\3\2\2"+
		"\2\u02a3\u02a4\7j\2\2\u02a4\u02a7\7X\2\2\u02a5\u02a6\7\177\2\2\u02a6\u02a8"+
		"\7-\2\2\u02a7\u02a5\3\2\2\2\u02a7\u02a8\3\2\2\2\u02a8\u02a9\3\2\2\2\u02a9"+
		"\u03ac\5\u009aN\2\u02aa\u02ad\7V\2\2\u02ab\u02ac\7(\2\2\u02ac\u02ae\7"+
		"Y\2\2\u02ad\u02ab\3\2\2\2\u02ad\u02ae\3\2\2\2\u02ae\u02b0\3\2\2\2\u02af"+
		"\u02b1\7\u00b2\2\2\u02b0\u02af\3\2\2\2\u02b0\u02b1\3\2\2\2\u02b1\u02b2"+
		"\3\2\2\2\u02b2\u02b6\7X\2\2\u02b3\u02b4\7\177\2\2\u02b4\u02b5\7+\2\2\u02b5"+
		"\u02b7\7-\2\2\u02b6\u02b3\3\2\2\2\u02b6\u02b7\3\2\2\2\u02b7\u02b8\3\2"+
		"\2\2\u02b8\u02ba\5\u009aN\2\u02b9\u02bb\5\u0090I\2\u02ba\u02b9\3\2\2\2"+
		"\u02ba\u02bb\3\2\2\2\u02bb\u02be\3\2\2\2\u02bc\u02bd\7v\2\2\u02bd\u02bf"+
		"\7\u00eb\2\2\u02be\u02bc\3\2\2\2\u02be\u02bf\3\2\2\2\u02bf\u02c3\3\2\2"+
		"\2\u02c0\u02c1\7\u00d3\2\2\u02c1\u02c2\7H\2\2\u02c2\u02c4\5\u0088E\2\u02c3"+
		"\u02c0\3\2\2\2\u02c3\u02c4\3\2\2\2\u02c4\u02c7\3\2\2\2\u02c5\u02c6\7\u00b5"+
		"\2\2\u02c6\u02c8\5T+\2\u02c7\u02c5\3\2\2\2\u02c7\u02c8\3\2\2\2\u02c8\u02c9"+
		"\3\2\2\2\u02c9\u02ca\7\32\2\2\u02ca\u02cb\5@!\2\u02cb\u03ac\3\2\2\2\u02cc"+
		"\u02cf\7V\2\2\u02cd\u02ce\7(\2\2\u02ce\u02d0\7Y\2\2\u02cf\u02cd\3\2\2"+
		"\2\u02cf\u02d0\3\2\2\2\u02d0\u02d1\3\2\2\2\u02d1\u02d2\7\u00b2\2\2\u02d2"+
		"\u02d3\7X\2\2\u02d3\u02d8\5\u009aN\2\u02d4\u02d5\7\t\2\2\u02d5\u02d6\5"+
		"\u00be`\2\u02d6\u02d7\7\n\2\2\u02d7\u02d9\3\2\2\2\u02d8\u02d4\3\2\2\2"+
		"\u02d8\u02d9\3\2\2\2\u02d9\u02da\3\2\2\2\u02da\u02dd\5R*\2\u02db\u02dc"+
		"\7\u00b3\2\2\u02dc\u02de\5T+\2\u02dd\u02db\3\2\2\2\u02dd\u02de\3\2\2\2"+
		"\u02de\u03ac\3\2\2\2\u02df\u02e0\7q\2\2\u02e0\u02e1\7X\2\2\u02e1\u02e3"+
		"\5\u009aN\2\u02e2\u02e4\7\32\2\2\u02e3\u02e2\3\2\2\2\u02e3\u02e4\3\2\2"+
		"\2\u02e4\u02e5\3\2\2\2\u02e5\u02e6\5@!\2\u02e6\u03ac\3\2\2\2\u02e7\u02e9"+
		"\7V\2\2\u02e8\u02ea\7\u00b2\2\2\u02e9\u02e8\3\2\2\2\u02e9\u02ea\3\2\2"+
		"\2\u02ea\u02eb\3\2\2\2\u02eb\u02ec\7\u00aa\2\2\u02ec\u02ed\5\u00ceh\2"+
		"\u02ed\u02ee\7\32\2\2\u02ee\u02f8\7\u00eb\2\2\u02ef\u02f0\7\u009c\2\2"+
		"\u02f0\u02f5\5f\64\2\u02f1\u02f2\7\13\2\2\u02f2\u02f4\5f\64\2\u02f3\u02f1"+
		"\3\2\2\2\u02f4\u02f7\3\2\2\2\u02f5\u02f3\3\2\2\2\u02f5\u02f6\3\2\2\2\u02f6"+
		"\u02f9\3\2\2\2\u02f7\u02f5\3\2\2\2\u02f8\u02ef\3\2\2\2\u02f8\u02f9\3\2"+
		"\2\2\u02f9\u03ac\3\2\2\2\u02fa\u02fc\7j\2\2\u02fb\u02fd\7\u00b2\2\2\u02fc"+
		"\u02fb\3\2\2\2\u02fc\u02fd\3\2\2\2\u02fd\u02fe\3\2\2\2\u02fe\u0301\7\u00aa"+
		"\2\2\u02ff\u0300\7\177\2\2\u0300\u0302\7-\2\2\u0301\u02ff\3\2\2\2\u0301"+
		"\u0302\3\2\2\2\u0302\u0303\3\2\2\2\u0303\u03ac\5\u00ceh\2\u0304\u0306"+
		"\7^\2\2\u0305\u0307\t\t\2\2\u0306\u0305\3\2\2\2\u0306\u0307\3\2\2\2\u0307"+
		"\u0308\3\2\2\2\u0308\u03ac\5\64\33\2\u0309\u030a\7c\2\2\u030a\u030d\7"+
		"d\2\2\u030b\u030c\t\n\2\2\u030c\u030e\5\u00d0i\2\u030d\u030b\3\2\2\2\u030d"+
		"\u030e\3\2\2\2\u030e\u0313\3\2\2\2\u030f\u0311\7/\2\2\u0310\u030f\3\2"+
		"\2\2\u0310\u0311\3\2\2\2\u0311\u0312\3\2\2\2\u0312\u0314\7\u00eb\2\2\u0313"+
		"\u0310\3\2\2\2\u0313\u0314\3\2\2\2\u0314\u03ac\3\2\2\2\u0315\u0316\7c"+
		"\2\2\u0316\u0319\7\u00cc\2\2\u0317\u0318\7/\2\2\u0318\u031a\7\u00eb\2"+
		"\2\u0319\u0317\3\2\2\2\u0319\u031a\3\2\2\2\u031a\u03ac\3\2\2\2\u031b\u031c"+
		"\7c\2\2\u031c\u031d\7\u00b5\2\2\u031d\u0322\5\u009aN\2\u031e\u031f\7\t"+
		"\2\2\u031f\u0320\5X-\2\u0320\u0321\7\n\2\2\u0321\u0323\3\2\2\2\u0322\u031e"+
		"\3\2\2\2\u0322\u0323\3\2\2\2\u0323\u03ac\3\2\2\2\u0324\u0325\7c\2\2\u0325"+
		"\u0326\7e\2\2\u0326\u0327\t\n\2\2\u0327\u032a\5\u009aN\2\u0328\u0329\t"+
		"\n\2\2\u0329\u032b\5\u00d0i\2\u032a\u0328\3\2\2\2\u032a\u032b\3\2\2\2"+
		"\u032b\u03ac\3\2\2\2\u032c\u032d\7c\2\2\u032d\u032e\7h\2\2\u032e\u0330"+
		"\5\u009aN\2\u032f\u0331\5F$\2\u0330\u032f\3\2\2\2\u0330\u0331\3\2\2\2"+
		"\u0331\u03ac\3\2\2\2\u0332\u0334\7c\2\2\u0333\u0335\5\u00d0i\2\u0334\u0333"+
		"\3\2\2\2\u0334\u0335\3\2\2\2\u0335\u0336\3\2\2\2\u0336\u033e\7i\2\2\u0337"+
		"\u0339\7/\2\2\u0338\u0337\3\2\2\2\u0338\u0339\3\2\2\2\u0339\u033c\3\2"+
		"\2\2\u033a\u033d\5\u00ceh\2\u033b\u033d\7\u00eb\2\2\u033c\u033a\3\2\2"+
		"\2\u033c\u033b\3\2\2\2\u033d\u033f\3\2\2\2\u033e\u0338\3\2\2\2\u033e\u033f"+
		"\3\2\2\2\u033f\u03ac\3\2\2\2\u0340\u0341\7c\2\2\u0341\u0342\7V\2\2\u0342"+
		"\u0343\7W\2\2\u0343\u03ac\5\u009aN\2\u0344\u0345\t\13\2\2\u0345\u0347"+
		"\7\u00aa\2\2\u0346\u0348\7\u00ab\2\2\u0347\u0346\3\2\2\2\u0347\u0348\3"+
		"\2\2\2\u0348\u0349\3\2\2\2\u0349\u03ac\5J&\2\u034a\u034b\t\13\2\2\u034b"+
		"\u034d\7\u00cb\2\2\u034c\u034e\7\u00ab\2\2\u034d\u034c\3\2\2\2\u034d\u034e"+
		"\3\2\2\2\u034e\u034f\3\2\2\2\u034f\u03ac\5\u00d0i\2\u0350\u0352\t\13\2"+
		"\2\u0351\u0353\t\f\2\2\u0352\u0351\3\2\2\2\u0352\u0353\3\2\2\2\u0353\u0354"+
		"\3\2\2\2\u0354\u0356\5\u009aN\2\u0355\u0357\5F$\2\u0356\u0355\3\2\2\2"+
		"\u0356\u0357\3\2\2\2\u0357\u0359\3\2\2\2\u0358\u035a\5L\'\2\u0359\u0358"+
		"\3\2\2\2\u0359\u035a\3\2\2\2\u035a\u03ac\3\2\2\2\u035b\u035c\7\u00ac\2"+
		"\2\u035c\u035d\7W\2\2\u035d\u03ac\5\u009aN\2\u035e\u0362\7\u00ac\2\2\u035f"+
		"\u0361\13\2\2\2\u0360\u035f\3\2\2\2\u0361\u0364\3\2\2\2\u0362\u0363\3"+
		"\2\2\2\u0362\u0360\3\2\2\2\u0363\u03ac\3\2\2\2\u0364\u0362\3\2\2\2\u0365"+
		"\u0367\7\u00ae\2\2\u0366\u0368\7\u00b0\2\2\u0367\u0366\3\2\2\2\u0367\u0368"+
		"\3\2\2\2\u0368\u0369\3\2\2\2\u0369\u036a\7W\2\2\u036a\u036f\5\u009aN\2"+
		"\u036b\u036d\7\32\2\2\u036c\u036b\3\2\2\2\u036c\u036d\3\2\2\2\u036d\u036e"+
		"\3\2\2\2\u036e\u0370\5@!\2\u036f\u036c\3\2\2\2\u036f\u0370\3\2\2\2\u0370"+
		"\u03ac\3\2\2\2\u0371\u0372\7\u00af\2\2\u0372\u0373\7W\2\2\u0373\u03ac"+
		"\5\u009aN\2\u0374\u0375\7\u00ad\2\2\u0375\u03ac\7\u00ae\2\2\u0376\u0377"+
		"\7\u00de\2\2\u0377\u0379\7y\2\2\u0378\u037a\7\u00e9\2\2\u0379\u0378\3"+
		"\2\2\2\u0379\u037a\3\2\2\2\u037a\u037b\3\2\2\2\u037b\u037c\7\u00ea\2\2"+
		"\u037c\u037e\7\u00eb\2\2\u037d\u037f\7\u0099\2\2\u037e\u037d\3\2\2\2\u037e"+
		"\u037f\3\2\2\2\u037f\u0380\3\2\2\2\u0380\u0381\7\\\2\2\u0381\u0382\7W"+
		"\2\2\u0382\u0384\5\u009aN\2\u0383\u0385\5F$\2\u0384\u0383\3\2\2\2\u0384"+
		"\u0385\3\2\2\2\u0385\u03ac\3\2\2\2\u0386\u0387\7\u00ce\2\2\u0387\u0388"+
		"\7W\2\2\u0388\u038a\5\u009aN\2\u0389\u038b\5F$\2\u038a\u0389\3\2\2\2\u038a"+
		"\u038b\3\2\2\2\u038b\u03ac\3\2\2\2\u038c\u038d\t\r\2\2\u038d\u0391\5\u00d0"+
		"i\2\u038e\u0390\13\2\2\2\u038f\u038e\3\2\2\2\u0390\u0393\3\2\2\2\u0391"+
		"\u0392\3\2\2\2\u0391\u038f\3\2\2\2\u0392\u03ac\3\2\2\2\u0393\u0391\3\2"+
		"\2\2\u0394\u0395\7w\2\2\u0395\u0399\7\u00df\2\2\u0396\u0398\13\2\2\2\u0397"+
		"\u0396\3\2\2\2\u0398\u039b\3\2\2\2\u0399\u039a\3\2\2\2\u0399\u0397\3\2"+
		"\2\2\u039a\u03ac\3\2\2\2\u039b\u0399\3\2\2\2\u039c\u03a0\7w\2\2\u039d"+
		"\u039f\13\2\2\2\u039e\u039d\3\2\2\2\u039f\u03a2\3\2\2\2\u03a0\u03a1\3"+
		"\2\2\2\u03a0\u039e\3\2\2\2\u03a1\u03ac\3\2\2\2\u03a2\u03a0\3\2\2\2\u03a3"+
		"\u03ac\7x\2\2\u03a4\u03a8\5\66\34\2\u03a5\u03a7\13\2\2\2\u03a6\u03a5\3"+
		"\2\2\2\u03a7\u03aa\3\2\2\2\u03a8\u03a9\3\2\2\2\u03a8\u03a6\3\2\2\2\u03a9"+
		"\u03ac\3\2\2\2\u03aa\u03a8\3\2\2\2\u03ab\u0182\3\2\2\2\u03ab\u0183\3\2"+
		"\2\2\u03ab\u0185\3\2\2\2\u03ab\u0199\3\2\2\2\u03ab\u01a0\3\2\2\2\u03ab"+
		"\u01aa\3\2\2\2\u03ab\u01be\3\2\2\2\u03ab\u01d1\3\2\2\2\u03ab\u01fd\3\2"+
		"\2\2\u03ab\u0208\3\2\2\2\u03ab\u0218\3\2\2\2\u03ab\u021f\3\2\2\2\u03ab"+
		"\u0226\3\2\2\2\u03ab\u0231\3\2\2\2\u03ab\u023f\3\2\2\2\u03ab\u0249\3\2"+
		"\2\2\u03ab\u0257\3\2\2\2\u03ab\u0265\3\2\2\2\u03ab\u026d\3\2\2\2\u03ab"+
		"\u0280\3\2\2\2\u03ab\u0290\3\2\2\2\u03ab\u0299\3\2\2\2\u03ab\u02a3\3\2"+
		"\2\2\u03ab\u02aa\3\2\2\2\u03ab\u02cc\3\2\2\2\u03ab\u02df\3\2\2\2\u03ab"+
		"\u02e7\3\2\2\2\u03ab\u02fa\3\2\2\2\u03ab\u0304\3\2\2\2\u03ab\u0309\3\2"+
		"\2\2\u03ab\u0315\3\2\2\2\u03ab\u031b\3\2\2\2\u03ab\u0324\3\2\2\2\u03ab"+
		"\u032c\3\2\2\2\u03ab\u0332\3\2\2\2\u03ab\u0340\3\2\2\2\u03ab\u0344\3\2"+
		"\2\2\u03ab\u034a\3\2\2\2\u03ab\u0350\3\2\2\2\u03ab\u035b\3\2\2\2\u03ab"+
		"\u035e\3\2\2\2\u03ab\u0365\3\2\2\2\u03ab\u0371\3\2\2\2\u03ab\u0374\3\2"+
		"\2\2\u03ab\u0376\3\2\2\2\u03ab\u0386\3\2\2\2\u03ab\u038c\3\2\2\2\u03ab"+
		"\u0394\3\2\2\2\u03ab\u039c\3\2\2\2\u03ab\u03a3\3\2\2\2\u03ab\u03a4\3\2"+
		"\2\2\u03ac\65\3\2\2\2\u03ad\u03ae\7V\2\2\u03ae\u046e\7\u00df\2\2\u03af"+
		"\u03b0\7j\2\2\u03b0\u046e\7\u00df\2\2\u03b1\u03b3\7\u00d7\2\2\u03b2\u03b4"+
		"\7\u00df\2\2\u03b3\u03b2\3\2\2\2\u03b3\u03b4\3\2\2\2\u03b4\u046e\3\2\2"+
		"\2\u03b5\u03b7\7\u00d6\2\2\u03b6\u03b8\7\u00df\2\2\u03b7\u03b6\3\2\2\2"+
		"\u03b7\u03b8\3\2\2\2\u03b8\u046e\3\2\2\2\u03b9\u03ba\7c\2\2\u03ba\u046e"+
		"\7\u00d7\2\2\u03bb\u03bc\7c\2\2\u03bc\u03be\7\u00df\2\2\u03bd\u03bf\7"+
		"\u00d7\2\2\u03be\u03bd\3\2\2\2\u03be\u03bf\3\2\2\2\u03bf\u046e\3\2\2\2"+
		"\u03c0\u03c1\7c\2\2\u03c1\u046e\7\u00e2\2\2\u03c2\u03c3\7c\2\2\u03c3\u046e"+
		"\7\u00e0\2\2\u03c4\u03c5\7c\2\2\u03c5\u03c6\7R\2\2\u03c6\u046e\7\u00e0"+
		"\2\2\u03c7\u03c8\7\u00dc\2\2\u03c8\u046e\7W\2\2\u03c9\u03ca\7\u00dd\2"+
		"\2\u03ca\u046e\7W\2\2\u03cb\u03cc\7c\2\2\u03cc\u046e\7\u00e1\2\2\u03cd"+
		"\u03ce\7c\2\2\u03ce\u03cf\7V\2\2\u03cf\u046e\7W\2\2\u03d0\u03d1\7c\2\2"+
		"\u03d1\u046e\7\u00e3\2\2\u03d2\u03d3\7c\2\2\u03d3\u046e\7\u00e5\2\2\u03d4"+
		"\u03d5\7c\2\2\u03d5\u046e\7\u00e6\2\2\u03d6\u03d7\7V\2\2\u03d7\u046e\7"+
		"\u00e4\2\2\u03d8\u03d9\7j\2\2\u03d9\u046e\7\u00e4\2\2\u03da\u03db\7q\2"+
		"\2\u03db\u046e\7\u00e4\2\2\u03dc\u03dd\7\u00d8\2\2\u03dd\u046e\7W\2\2"+
		"\u03de\u03df\7\u00d8\2\2\u03df\u046e\7\u00cb\2\2\u03e0\u03e1\7\u00d9\2"+
		"\2\u03e1\u046e\7W\2\2\u03e2\u03e3\7\u00d9\2\2\u03e3\u046e\7\u00cb\2\2"+
		"\u03e4\u03e5\7V\2\2\u03e5\u03e6\7\u00b2\2\2\u03e6\u046e\7~\2\2\u03e7\u03e8"+
		"\7j\2\2\u03e8\u03e9\7\u00b2\2\2\u03e9\u046e\7~\2\2\u03ea\u03eb\7\u00da"+
		"\2\2\u03eb\u03ec\7\u00db\2\2\u03ec\u046e\7W\2\2\u03ed\u03ee\7q\2\2\u03ee"+
		"\u03ef\7W\2\2\u03ef\u03f0\5\u009aN\2\u03f0\u03f1\7+\2\2\u03f1\u03f2\7"+
		"\u00c6\2\2\u03f2\u046e\3\2\2\2\u03f3\u03f4\7q\2\2\u03f4\u03f5\7W\2\2\u03f5"+
		"\u03f6\5\u009aN\2\u03f6\u03f7\7\u00c6\2\2\u03f7\u03f8\7\37\2\2\u03f8\u046e"+
		"\3\2\2\2\u03f9\u03fa\7q\2\2\u03fa\u03fb\7W\2\2\u03fb\u03fc\5\u009aN\2"+
		"\u03fc\u03fd\7+\2\2\u03fd\u03fe\7\u00c7\2\2\u03fe\u046e\3\2\2\2\u03ff"+
		"\u0400\7q\2\2\u0400\u0401\7W\2\2\u0401\u0402\5\u009aN\2\u0402\u0403\7"+
		"\u00b8\2\2\u0403\u0404\7\37\2\2\u0404\u046e\3\2\2\2\u0405\u0406\7q\2\2"+
		"\u0406\u0407\7W\2\2\u0407\u0408\5\u009aN\2\u0408\u0409\7+\2\2\u0409\u040a"+
		"\7\u00b8\2\2\u040a\u046e\3\2\2\2\u040b\u040c\7q\2\2\u040c\u040d\7W\2\2"+
		"\u040d\u040e\5\u009aN\2\u040e\u040f\7+\2\2\u040f\u0410\7\u00b9\2\2\u0410"+
		"\u0411\7\32\2\2\u0411\u0412\7\u00ba\2\2\u0412\u046e\3\2\2\2\u0413\u0414"+
		"\7q\2\2\u0414\u0415\7W\2\2\u0415\u0416\5\u009aN\2\u0416\u0417\7w\2\2\u0417"+
		"\u0418\7\u00b8\2\2\u0418\u0419\7\u00bb\2\2\u0419\u046e\3\2\2\2\u041a\u041b"+
		"\7q\2\2\u041b\u041c\7W\2\2\u041c\u041d\5\u009aN\2\u041d\u041e\7\u00bc"+
		"\2\2\u041e\u041f\7L\2\2\u041f\u046e\3\2\2\2\u0420\u0421\7q\2\2\u0421\u0422"+
		"\7W\2\2\u0422\u0423\5\u009aN\2\u0423\u0424\7\u00bd\2\2\u0424\u0425\7L"+
		"\2\2\u0425\u046e\3\2\2\2\u0426\u0427\7q\2\2\u0427\u0428\7W\2\2\u0428\u0429"+
		"\5\u009aN\2\u0429\u042a\7\u00be\2\2\u042a\u042b\7L\2\2\u042b\u046e\3\2"+
		"\2\2\u042c\u042d\7q\2\2\u042d\u042e\7W\2\2\u042e\u042f\5\u009aN\2\u042f"+
		"\u0430\7\u00c0\2\2\u0430\u046e\3\2\2\2\u0431\u0432\7q\2\2\u0432\u0433"+
		"\7W\2\2\u0433\u0435\5\u009aN\2\u0434\u0436\5F$\2\u0435\u0434\3\2\2\2\u0435"+
		"\u0436\3\2\2\2\u0436\u0437\3\2\2\2\u0437\u0438\7\u00c1\2\2\u0438\u046e"+
		"\3\2\2\2\u0439\u043a\7q\2\2\u043a\u043b\7W\2\2\u043b\u043d\5\u009aN\2"+
		"\u043c\u043e\5F$\2\u043d\u043c\3\2\2\2\u043d\u043e\3\2\2\2\u043e\u043f"+
		"\3\2\2\2\u043f\u0440\7\u00c2\2\2\u0440\u046e\3\2\2\2\u0441\u0442\7q\2"+
		"\2\u0442\u0443\7W\2\2\u0443\u0445\5\u009aN\2\u0444\u0446\5F$\2\u0445\u0444"+
		"\3\2\2\2\u0445\u0446\3\2\2\2\u0446\u0447\3\2\2\2\u0447\u0448\7w\2\2\u0448"+
		"\u0449\7\u00bf\2\2\u0449\u046e\3\2\2\2\u044a\u044b\7q\2\2\u044b\u044c"+
		"\7W\2\2\u044c\u044e\5\u009aN\2\u044d\u044f\5F$\2\u044e\u044d\3\2\2\2\u044e"+
		"\u044f\3\2\2\2\u044f\u0450\3\2\2\2\u0450\u0451\7\31\2\2\u0451\u0452\7"+
		"e\2\2\u0452\u046e\3\2\2\2\u0453\u0454\7q\2\2\u0454\u0455\7W\2\2\u0455"+
		"\u0457\5\u009aN\2\u0456\u0458\5F$\2\u0457\u0456\3\2\2\2\u0457\u0458\3"+
		"\2\2\2\u0458\u0459\3\2\2\2\u0459\u045b\7\u00c3\2\2\u045a\u045c\7e\2\2"+
		"\u045b\u045a\3\2\2\2\u045b\u045c\3\2\2\2\u045c\u046e\3\2\2\2\u045d\u045e"+
		"\7q\2\2\u045e\u045f\7W\2\2\u045f\u0461\5\u009aN\2\u0460\u0462\5F$\2\u0461"+
		"\u0460\3\2\2\2\u0461\u0462\3\2\2\2\u0462\u0463\3\2\2\2\u0463\u0464\7Y"+
		"\2\2\u0464\u0465\7e\2\2\u0465\u046e\3\2\2\2\u0466\u0467\7z\2\2\u0467\u046e"+
		"\7{\2\2\u0468\u046e\7|\2\2\u0469\u046e\7}\2\2\u046a\u046e\7\u00cd\2\2"+
		"\u046b\u046c\7[\2\2\u046c\u046e\7\30\2\2\u046d\u03ad\3\2\2\2\u046d\u03af"+
		"\3\2\2\2\u046d\u03b1\3\2\2\2\u046d\u03b5\3\2\2\2\u046d\u03b9\3\2\2\2\u046d"+
		"\u03bb\3\2\2\2\u046d\u03c0\3\2\2\2\u046d\u03c2\3\2\2\2\u046d\u03c4\3\2"+
		"\2\2\u046d\u03c7\3\2\2\2\u046d\u03c9\3\2\2\2\u046d\u03cb\3\2\2\2\u046d"+
		"\u03cd\3\2\2\2\u046d\u03d0\3\2\2\2\u046d\u03d2\3\2\2\2\u046d\u03d4\3\2"+
		"\2\2\u046d\u03d6\3\2\2\2\u046d\u03d8\3\2\2\2\u046d\u03da\3\2\2\2\u046d"+
		"\u03dc\3\2\2\2\u046d\u03de\3\2\2\2\u046d\u03e0\3\2\2\2\u046d\u03e2\3\2"+
		"\2\2\u046d\u03e4\3\2\2\2\u046d\u03e7\3\2\2\2\u046d\u03ea\3\2\2\2\u046d"+
		"\u03ed\3\2\2\2\u046d\u03f3\3\2\2\2\u046d\u03f9\3\2\2\2\u046d\u03ff\3\2"+
		"\2\2\u046d\u0405\3\2\2\2\u046d\u040b\3\2\2\2\u046d\u0413\3\2\2\2\u046d"+
		"\u041a\3\2\2\2\u046d\u0420\3\2\2\2\u046d\u0426\3\2\2\2\u046d\u042c\3\2"+
		"\2\2\u046d\u0431\3\2\2\2\u046d\u0439\3\2\2\2\u046d\u0441\3\2\2\2\u046d"+
		"\u044a\3\2\2\2\u046d\u0453\3\2\2\2\u046d\u045d\3\2\2\2\u046d\u0466\3\2"+
		"\2\2\u046d\u0468\3\2\2\2\u046d\u0469\3\2\2\2\u046d\u046a\3\2\2\2\u046d"+
		"\u046b\3\2\2\2\u046e\67\3\2\2\2\u046f\u0471\7V\2\2\u0470\u0472\7\u00b2"+
		"\2\2\u0471\u0470\3\2\2\2\u0471\u0472\3\2\2\2\u0472\u0474\3\2\2\2\u0473"+
		"\u0475\7\u00d4\2\2\u0474\u0473\3\2\2\2\u0474\u0475\3\2\2\2\u0475\u0476"+
		"\3\2\2\2\u0476\u047a\7W\2\2\u0477\u0478\7\177\2\2\u0478\u0479\7+\2\2\u0479"+
		"\u047b\7-\2\2\u047a\u0477\3\2\2\2\u047a\u047b\3\2\2\2\u047b\u047c\3\2"+
		"\2\2\u047c\u047d\5\u009aN\2\u047d9\3\2\2\2\u047e\u047f\7\u00c6\2\2\u047f"+
		"\u0480\7\37\2\2\u0480\u0484\5\u0088E\2\u0481\u0482\7\u00c7\2\2\u0482\u0483"+
		"\7\37\2\2\u0483\u0485\5\u008cG\2\u0484\u0481\3\2\2\2\u0484\u0485\3\2\2"+
		"\2\u0485\u0486\3\2\2\2\u0486\u0487\7\\\2\2\u0487\u0488\7\u00f0\2\2\u0488"+
		"\u0489\7\u00b7\2\2\u0489;\3\2\2\2\u048a\u048b\7\u00b8\2\2\u048b\u048c"+
		"\7\37\2\2\u048c\u048d\5\u0088E\2\u048d\u0490\7H\2\2\u048e\u0491\5\\/\2"+
		"\u048f\u0491\5^\60\2\u0490\u048e\3\2\2\2\u0490\u048f\3\2\2\2\u0491\u0495"+
		"\3\2\2\2\u0492\u0493\7\u00b9\2\2\u0493\u0494\7\32\2\2\u0494\u0496\7\u00ba"+
		"\2\2\u0495\u0492\3\2\2\2\u0495\u0496\3\2\2\2\u0496=\3\2\2\2\u0497\u0498"+
		"\7\u00bb\2\2\u0498\u0499\7\u00eb\2\2\u0499?\3\2\2\2\u049a\u049c\5N(\2"+
		"\u049b\u049a\3\2\2\2\u049b\u049c\3\2\2\2\u049c\u049d\3\2\2\2\u049d\u049e"+
		"\5h\65\2\u049eA\3\2\2\2\u049f\u04a0\7Z\2\2\u04a0\u04a1\7\u0099\2\2\u04a1"+
		"\u04a2\7W\2\2\u04a2\u04a9\5\u009aN\2\u04a3\u04a7\5F$\2\u04a4\u04a5\7\177"+
		"\2\2\u04a5\u04a6\7+\2\2\u04a6\u04a8\7-\2\2\u04a7\u04a4\3\2\2\2\u04a7\u04a8"+
		"\3\2\2\2\u04a8\u04aa\3\2\2\2\u04a9\u04a3\3\2\2\2\u04a9\u04aa\3\2\2\2\u04aa"+
		"\u04b5\3\2\2\2\u04ab\u04ac\7Z\2\2\u04ac\u04ae\7\\\2\2\u04ad\u04af\7W\2"+
		"\2\u04ae\u04ad\3\2\2\2\u04ae\u04af\3\2\2\2\u04af\u04b0\3\2\2\2\u04b0\u04b2"+
		"\5\u009aN\2\u04b1\u04b3\5F$\2\u04b2\u04b1\3\2\2\2\u04b2\u04b3\3\2\2\2"+
		"\u04b3\u04b5\3\2\2\2\u04b4\u049f\3\2\2\2\u04b4\u04ab\3\2\2\2\u04b5C\3"+
		"\2\2\2\u04b6\u04b8\5F$\2\u04b7\u04b9\5> \2\u04b8\u04b7\3\2\2\2\u04b8\u04b9"+
		"\3\2\2\2\u04b9E\3\2\2\2\u04ba\u04bb\7L\2\2\u04bb\u04bc\7\t\2\2\u04bc\u04c1"+
		"\5H%\2\u04bd\u04be\7\13\2\2\u04be\u04c0\5H%\2\u04bf\u04bd\3\2\2\2\u04c0"+
		"\u04c3\3\2\2\2\u04c1\u04bf\3\2\2\2\u04c1\u04c2\3\2\2\2\u04c2\u04c4\3\2"+
		"\2\2\u04c3\u04c1\3\2\2\2\u04c4\u04c5\7\n\2\2\u04c5G\3\2\2\2\u04c6\u04c9"+
		"\5\u00d0i\2\u04c7\u04c8\7\u0080\2\2\u04c8\u04ca\5\u00acW\2\u04c9\u04c7"+
		"\3\2\2\2\u04c9\u04ca\3\2\2\2\u04caI\3\2\2\2\u04cb\u04d1\5\u00ceh\2\u04cc"+
		"\u04d1\7\u00eb\2\2\u04cd\u04d1\5\u00aeX\2\u04ce\u04d1\5\u00b0Y\2\u04cf"+
		"\u04d1\5\u00b2Z\2\u04d0\u04cb\3\2\2\2\u04d0\u04cc\3\2\2\2\u04d0\u04cd"+
		"\3\2\2\2\u04d0\u04ce\3\2\2\2\u04d0\u04cf\3\2\2\2\u04d1K\3\2\2\2\u04d2"+
		"\u04da\5\u00d0i\2\u04d3\u04d6\7\21\2\2\u04d4\u04d7\5\u00d0i\2\u04d5\u04d7"+
		"\7\u00eb\2\2\u04d6\u04d4\3\2\2\2\u04d6\u04d5\3\2\2\2\u04d7\u04d9\3\2\2"+
		"\2\u04d8\u04d3\3\2\2\2\u04d9\u04dc\3\2\2\2\u04da\u04d8\3\2\2\2\u04da\u04db"+
		"\3\2\2\2\u04dbM\3\2\2\2\u04dc\u04da\3\2\2\2\u04dd\u04de\7T\2\2\u04de\u04e3"+
		"\5P)\2\u04df\u04e0\7\13\2\2\u04e0\u04e2\5P)\2\u04e1\u04df\3\2\2\2\u04e2"+
		"\u04e5\3\2\2\2\u04e3\u04e1\3\2\2\2\u04e3\u04e4\3\2\2\2\u04e4O\3\2\2\2"+
		"\u04e5\u04e3\3\2\2\2\u04e6\u04e8\5\u00d0i\2\u04e7\u04e9\7\32\2\2\u04e8"+
		"\u04e7\3\2\2\2\u04e8\u04e9\3\2\2\2\u04e9\u04ea\3\2\2\2\u04ea\u04eb\7\t"+
		"\2\2\u04eb\u04ec\5h\65\2\u04ec\u04ed\7\n\2\2\u04edQ\3\2\2\2\u04ee\u04ef"+
		"\7\u009c\2\2\u04ef\u04f0\5\u00ceh\2\u04f0S\3\2\2\2\u04f1\u04f2\7\t\2\2"+
		"\u04f2\u04f7\5V,\2\u04f3\u04f4\7\13\2\2\u04f4\u04f6\5V,\2\u04f5\u04f3"+
		"\3\2\2\2\u04f6\u04f9\3\2\2\2\u04f7\u04f5\3\2\2\2\u04f7\u04f8\3\2\2\2\u04f8"+
		"\u04fa\3\2\2\2\u04f9\u04f7\3\2\2\2\u04fa\u04fb\7\n\2\2\u04fbU\3\2\2\2"+
		"\u04fc\u0501\5X-\2\u04fd\u04ff\7\u0080\2\2\u04fe\u04fd\3\2\2\2\u04fe\u04ff"+
		"\3\2\2\2\u04ff\u0500\3\2\2\2\u0500\u0502\5Z.\2\u0501\u04fe\3\2\2\2\u0501"+
		"\u0502\3\2\2\2\u0502W\3\2\2\2\u0503\u0508\5\u00d0i\2\u0504\u0505\7\21"+
		"\2\2\u0505\u0507\5\u00d0i\2\u0506\u0504\3\2\2\2\u0507\u050a\3\2\2\2\u0508"+
		"\u0506\3\2\2\2\u0508\u0509\3\2\2\2\u0509\u050d\3\2\2\2\u050a\u0508\3\2"+
		"\2\2\u050b\u050d\7\u00eb\2\2\u050c\u0503\3\2\2\2\u050c\u050b\3\2\2\2\u050d"+
		"Y\3\2\2\2\u050e\u0513\7\u00f0\2\2\u050f\u0513\7\u00f1\2\2\u0510\u0513"+
		"\5\u00b4[\2\u0511\u0513\7\u00eb\2\2\u0512\u050e\3\2\2\2\u0512\u050f\3"+
		"\2\2\2\u0512\u0510\3\2\2\2\u0512\u0511\3\2\2\2\u0513[\3\2\2\2\u0514\u0515"+
		"\7\t\2\2\u0515\u051a\5\u00acW\2\u0516\u0517\7\13\2\2\u0517\u0519\5\u00ac"+
		"W\2\u0518\u0516\3\2\2\2\u0519\u051c\3\2\2\2\u051a\u0518\3\2\2\2\u051a"+
		"\u051b\3\2\2\2\u051b\u051d\3\2\2\2\u051c\u051a\3\2\2\2\u051d\u051e\7\n"+
		"\2\2\u051e]\3\2\2\2\u051f\u0520\7\t\2\2\u0520\u0525\5\\/\2\u0521\u0522"+
		"\7\13\2\2\u0522\u0524\5\\/\2\u0523\u0521\3\2\2\2\u0524\u0527\3\2\2\2\u0525"+
		"\u0523\3\2\2\2\u0525\u0526\3\2\2\2\u0526\u0528\3\2\2\2\u0527\u0525\3\2"+
		"\2\2\u0528\u0529\7\n\2\2\u0529_\3\2\2\2\u052a\u052b\7\u00b9\2\2\u052b"+
		"\u052c\7\32\2\2\u052c\u0531\5b\62\2\u052d\u052e\7\u00b9\2\2\u052e\u052f"+
		"\7\37\2\2\u052f\u0531\5d\63\2\u0530\u052a\3\2\2\2\u0530\u052d\3\2\2\2"+
		"\u0531a\3\2\2\2\u0532\u0533\7\u00c9\2\2\u0533\u0534\7\u00eb\2\2\u0534"+
		"\u0535\7\u00ca\2\2\u0535\u0538\7\u00eb\2\2\u0536\u0538\5\u00d0i\2\u0537"+
		"\u0532\3\2\2\2\u0537\u0536\3\2\2\2\u0538c\3\2\2\2\u0539\u053d\7\u00eb"+
		"\2\2\u053a\u053b\7T\2\2\u053b\u053c\7\u009e\2\2\u053c\u053e\5T+\2\u053d"+
		"\u053a\3\2\2\2\u053d\u053e\3\2\2\2\u053ee\3\2\2\2\u053f\u0540\5\u00d0"+
		"i\2\u0540\u0541\7\u00eb\2\2\u0541g\3\2\2\2\u0542\u0544\5B\"\2\u0543\u0542"+
		"\3\2\2\2\u0543\u0544\3\2\2\2\u0544\u0545\3\2\2\2\u0545\u0546\5n8\2\u0546"+
		"\u0547\5j\66\2\u0547\u054f\3\2\2\2\u0548\u054a\5v<\2\u0549\u054b\5l\67"+
		"\2\u054a\u0549\3\2\2\2\u054b\u054c\3\2\2\2\u054c\u054a\3\2\2\2\u054c\u054d"+
		"\3\2\2\2\u054d\u054f\3\2\2\2\u054e\u0543\3\2\2\2\u054e\u0548\3\2\2\2\u054f"+
		"i\3\2\2\2\u0550\u0551\7$\2\2\u0551\u0552\7\37\2\2\u0552\u0557\5r:\2\u0553"+
		"\u0554\7\13\2\2\u0554\u0556\5r:\2\u0555\u0553\3\2\2\2\u0556\u0559\3\2"+
		"\2\2\u0557\u0555\3\2\2\2\u0557\u0558\3\2\2\2\u0558\u055b\3\2\2\2\u0559"+
		"\u0557\3\2\2\2\u055a\u0550\3\2\2\2\u055a\u055b\3\2\2\2\u055b\u0566\3\2"+
		"\2\2\u055c\u055d\7\u0097\2\2\u055d\u055e\7\37\2\2\u055e\u0563\5\u00a0"+
		"Q\2\u055f\u0560\7\13\2\2\u0560\u0562\5\u00a0Q\2\u0561\u055f\3\2\2\2\u0562"+
		"\u0565\3\2\2\2\u0563\u0561\3\2\2\2\u0563\u0564\3\2\2\2\u0564\u0567\3\2"+
		"\2\2\u0565\u0563\3\2\2\2\u0566\u055c\3\2\2\2\u0566\u0567\3\2\2\2\u0567"+
		"\u0572\3\2\2\2\u0568\u0569\7\u0098\2\2\u0569\u056a\7\37\2\2\u056a\u056f"+
		"\5\u00a0Q\2\u056b\u056c\7\13\2\2\u056c\u056e\5\u00a0Q\2\u056d\u056b\3"+
		"\2\2\2\u056e\u0571\3\2\2\2\u056f\u056d\3\2\2\2\u056f\u0570\3\2\2\2\u0570"+
		"\u0573\3\2\2\2\u0571\u056f\3\2\2\2\u0572\u0568\3\2\2\2\u0572\u0573\3\2"+
		"\2\2\u0573\u057e\3\2\2\2\u0574\u0575\7\u0096\2\2\u0575\u0576\7\37\2\2"+
		"\u0576\u057b\5r:\2\u0577\u0578\7\13\2\2\u0578\u057a\5r:\2\u0579\u0577"+
		"\3\2\2\2\u057a\u057d\3\2\2\2\u057b\u0579\3\2\2\2\u057b\u057c\3\2\2\2\u057c"+
		"\u057f\3\2\2\2\u057d\u057b\3\2\2\2\u057e\u0574\3\2\2\2\u057e\u057f\3\2"+
		"\2\2\u057f\u0581\3\2\2\2\u0580\u0582\5\u00c4c\2\u0581\u0580\3\2\2\2\u0581"+
		"\u0582\3\2\2\2\u0582\u0585\3\2\2\2\u0583\u0584\7&\2\2\u0584\u0586\5\u00a0"+
		"Q\2\u0585\u0583\3\2\2\2\u0585\u0586\3\2\2\2\u0586k\3\2\2\2\u0587\u0589"+
		"\5B\"\2\u0588\u0587\3\2\2\2\u0588\u0589\3\2\2\2\u0589\u058a\3\2\2\2\u058a"+
		"\u058b\5t;\2\u058b\u058c\5j\66\2\u058cm\3\2\2\2\u058d\u058e\b8\1\2\u058e"+
		"\u058f\5p9\2\u058f\u0598\3\2\2\2\u0590\u0591\f\3\2\2\u0591\u0593\t\16"+
		"\2\2\u0592\u0594\5~@\2\u0593\u0592\3\2\2\2\u0593\u0594\3\2\2\2\u0594\u0595"+
		"\3\2\2\2\u0595\u0597\5n8\4\u0596\u0590\3\2\2\2\u0597\u059a\3\2\2\2\u0598"+
		"\u0596\3\2\2\2\u0598\u0599\3\2\2\2\u0599o\3\2\2\2\u059a\u0598\3\2\2\2"+
		"\u059b\u05a4\5t;\2\u059c\u059d\7W\2\2\u059d\u05a4\5\u009aN\2\u059e\u05a4"+
		"\5\u0096L\2\u059f\u05a0\7\t\2\2\u05a0\u05a1\5h\65\2\u05a1\u05a2\7\n\2"+
		"\2\u05a2\u05a4\3\2\2\2\u05a3\u059b\3\2\2\2\u05a3\u059c\3\2\2\2\u05a3\u059e"+
		"\3\2\2\2\u05a3\u059f\3\2\2\2\u05a4q\3\2\2\2\u05a5\u05a7\5\u00a0Q\2\u05a6"+
		"\u05a8\t\17\2\2\u05a7\u05a6\3\2\2\2\u05a7\u05a8\3\2\2\2\u05a8s\3\2\2\2"+
		"\u05a9\u05aa\7\27\2\2\u05aa\u05ab\7\u009a\2\2\u05ab\u05ac\7\t\2\2\u05ac"+
		"\u05ad\5\u009eP\2\u05ad\u05ae\7\n\2\2\u05ae\u05b4\3\2\2\2\u05af\u05b0"+
		"\7t\2\2\u05b0\u05b4\5\u009eP\2\u05b1\u05b2\7\u009b\2\2\u05b2\u05b4\5\u009e"+
		"P\2\u05b3\u05a9\3\2\2\2\u05b3\u05af\3\2\2\2\u05b3\u05b1\3\2\2\2\u05b4"+
		"\u05b6\3\2\2\2\u05b5\u05b7\5\u0098M\2\u05b6\u05b5\3\2\2\2\u05b6\u05b7"+
		"\3\2\2\2\u05b7\u05ba\3\2\2\2\u05b8\u05b9\7\u00a0\2\2\u05b9\u05bb\7\u00eb"+
		"\2\2\u05ba\u05b8\3\2\2\2\u05ba\u05bb\3\2\2\2\u05bb\u05bc\3\2\2\2\u05bc"+
		"\u05bd\7\u009c\2\2\u05bd\u05ca\7\u00eb\2\2\u05be\u05c8\7\32\2\2\u05bf"+
		"\u05c9\5\u008aF\2\u05c0\u05c9\5\u00be`\2\u05c1\u05c4\7\t\2\2\u05c2\u05c5"+
		"\5\u008aF\2\u05c3\u05c5\5\u00be`\2\u05c4\u05c2\3\2\2\2\u05c4\u05c3\3\2"+
		"\2\2\u05c5\u05c6\3\2\2\2\u05c6\u05c7\7\n\2\2\u05c7\u05c9\3\2\2\2\u05c8"+
		"\u05bf\3\2\2\2\u05c8\u05c0\3\2\2\2\u05c8\u05c1\3\2\2\2\u05c9\u05cb\3\2"+
		"\2\2\u05ca\u05be\3\2\2\2\u05ca\u05cb\3\2\2\2\u05cb\u05cd\3\2\2\2\u05cc"+
		"\u05ce\5\u0098M\2\u05cd\u05cc\3\2\2\2\u05cd\u05ce\3\2\2\2\u05ce\u05d1"+
		"\3\2\2\2\u05cf\u05d0\7\u009f\2\2\u05d0\u05d2\7\u00eb\2\2\u05d1\u05cf\3"+
		"\2\2\2\u05d1\u05d2\3\2\2\2\u05d2\u05d4\3\2\2\2\u05d3\u05d5\5v<\2\u05d4"+
		"\u05d3\3\2\2\2\u05d4\u05d5\3\2\2\2\u05d5\u05d8\3\2\2\2\u05d6\u05d7\7\35"+
		"\2\2\u05d7\u05d9\5\u00a2R\2\u05d8\u05d6\3\2\2\2\u05d8\u05d9\3\2\2\2\u05d9"+
		"\u0601\3\2\2\2\u05da\u05dc\7\27\2\2\u05db\u05dd\5~@\2\u05dc\u05db\3\2"+
		"\2\2\u05dc\u05dd\3\2\2\2\u05dd\u05de\3\2\2\2\u05de\u05e0\5\u009eP\2\u05df"+
		"\u05e1\5v<\2\u05e0\u05df\3\2\2\2\u05e0\u05e1\3\2\2\2\u05e1\u05eb\3\2\2"+
		"\2\u05e2\u05e8\5v<\2\u05e3\u05e5\7\27\2\2\u05e4\u05e6\5~@\2\u05e5\u05e4"+
		"\3\2\2\2\u05e5\u05e6\3\2\2\2\u05e6\u05e7\3\2\2\2\u05e7\u05e9\5\u009eP"+
		"\2\u05e8\u05e3\3\2\2\2\u05e8\u05e9\3\2\2\2\u05e9\u05eb\3\2\2\2\u05ea\u05da"+
		"\3\2\2\2\u05ea\u05e2\3\2\2\2\u05eb\u05ef\3\2\2\2\u05ec\u05ee\5|?\2\u05ed"+
		"\u05ec\3\2\2\2\u05ee\u05f1\3\2\2\2\u05ef\u05ed\3\2\2\2\u05ef\u05f0\3\2"+
		"\2\2\u05f0\u05f4\3\2\2\2\u05f1\u05ef\3\2\2\2\u05f2\u05f3\7\35\2\2\u05f3"+
		"\u05f5\5\u00a2R\2\u05f4\u05f2\3\2\2\2\u05f4\u05f5\3\2\2\2\u05f5\u05f7"+
		"\3\2\2\2\u05f6\u05f8\5x=\2\u05f7\u05f6\3\2\2\2\u05f7\u05f8\3\2\2\2\u05f8"+
		"\u05fb\3\2\2\2\u05f9\u05fa\7%\2\2\u05fa\u05fc\5\u00a2R\2\u05fb\u05f9\3"+
		"\2\2\2\u05fb\u05fc\3\2\2\2\u05fc\u05fe\3\2\2\2\u05fd\u05ff\5\u00c4c\2"+
		"\u05fe\u05fd\3\2\2\2\u05fe\u05ff\3\2\2\2\u05ff\u0601\3\2\2\2\u0600\u05b3"+
		"\3\2\2\2\u0600\u05ea\3\2\2\2\u0601u\3\2\2\2\u0602\u0603\7\30\2\2\u0603"+
		"\u0608\5\u0080A\2\u0604\u0605\7\13\2\2\u0605\u0607\5\u0080A\2\u0606\u0604"+
		"\3\2\2\2\u0607\u060a\3\2\2\2\u0608\u0606\3\2\2\2\u0608\u0609\3\2\2\2\u0609"+
		"\u060e\3\2\2\2\u060a\u0608\3\2\2\2\u060b\u060d\5|?\2\u060c\u060b\3\2\2"+
		"\2\u060d\u0610\3\2\2\2\u060e\u060c\3\2\2\2\u060e\u060f\3\2\2\2\u060fw"+
		"\3\2\2\2\u0610\u060e\3\2\2\2\u0611\u0612\7\36\2\2\u0612\u0613\7\37\2\2"+
		"\u0613\u0618\5\u00a0Q\2\u0614\u0615\7\13\2\2\u0615\u0617\5\u00a0Q\2\u0616"+
		"\u0614\3\2\2\2\u0617\u061a\3\2\2\2\u0618\u0616\3\2\2\2\u0618\u0619\3\2"+
		"\2\2\u0619\u062c\3\2\2\2\u061a\u0618\3\2\2\2\u061b\u061c\7T\2\2\u061c"+
		"\u062d\7#\2\2\u061d\u061e\7T\2\2\u061e\u062d\7\"\2\2\u061f\u0620\7 \2"+
		"\2\u0620\u0621\7!\2\2\u0621\u0622\7\t\2\2\u0622\u0627\5z>\2\u0623\u0624"+
		"\7\13\2\2\u0624\u0626\5z>\2\u0625\u0623\3\2\2\2\u0626\u0629\3\2\2\2\u0627"+
		"\u0625\3\2\2\2\u0627\u0628\3\2\2\2\u0628\u062a\3\2\2\2\u0629\u0627\3\2"+
		"\2\2\u062a\u062b\7\n\2\2\u062b\u062d\3\2\2\2\u062c\u061b\3\2\2\2\u062c"+
		"\u061d\3\2\2\2\u062c\u061f\3\2\2\2\u062c\u062d\3\2\2\2\u062dy\3\2\2\2"+
		"\u062e\u0637\7\t\2\2\u062f\u0634\5\u00a0Q\2\u0630\u0631\7\13\2\2\u0631"+
		"\u0633\5\u00a0Q\2\u0632\u0630\3\2\2\2\u0633\u0636\3\2\2\2\u0634\u0632"+
		"\3\2\2\2\u0634\u0635\3\2\2\2\u0635\u0638\3\2\2\2\u0636\u0634\3\2\2\2\u0637"+
		"\u062f\3\2\2\2\u0637\u0638\3\2\2\2\u0638\u0639\3\2\2\2\u0639\u063c\7\n"+
		"\2\2\u063a\u063c\5\u00a0Q\2\u063b\u062e\3\2\2\2\u063b\u063a\3\2\2\2\u063c"+
		"{\3\2\2\2\u063d\u063e\7I\2\2\u063e\u0640\7X\2\2\u063f\u0641\7A\2\2\u0640"+
		"\u063f\3\2\2\2\u0640\u0641\3\2\2\2\u0641\u0642\3\2\2\2\u0642\u0643\5\u00ce"+
		"h\2\u0643\u064c\7\t\2\2\u0644\u0649\5\u00a0Q\2\u0645\u0646\7\13\2\2\u0646"+
		"\u0648\5\u00a0Q\2\u0647\u0645\3\2\2\2\u0648\u064b\3\2\2\2\u0649\u0647"+
		"\3\2\2\2\u0649\u064a\3\2\2\2\u064a\u064d\3\2\2\2\u064b\u0649\3\2\2\2\u064c"+
		"\u0644\3\2\2\2\u064c\u064d\3\2\2\2\u064d\u064e\3\2\2\2\u064e\u064f\7\n"+
		"\2\2\u064f\u065b\5\u00d0i\2\u0650\u0652\7\32\2\2\u0651\u0650\3\2\2\2\u0651"+
		"\u0652\3\2\2\2\u0652\u0653\3\2\2\2\u0653\u0658\5\u00d0i\2\u0654\u0655"+
		"\7\13\2\2\u0655\u0657\5\u00d0i\2\u0656\u0654\3\2\2\2\u0657\u065a\3\2\2"+
		"\2\u0658\u0656\3\2\2\2\u0658\u0659\3\2\2\2\u0659\u065c\3\2\2\2\u065a\u0658"+
		"\3\2\2\2\u065b\u0651\3\2\2\2\u065b\u065c\3\2\2\2\u065c}\3\2\2\2\u065d"+
		"\u065e\t\20\2\2\u065e\177\3\2\2\2\u065f\u0660\bA\1\2\u0660\u0661\5\u0094"+
		"K\2\u0661\u0675\3\2\2\2\u0662\u0671\f\4\2\2\u0663\u0666\7@\2\2\u0664\u0666"+
		"\5\u0082B\2\u0665\u0663\3\2\2\2\u0665\u0664\3\2\2\2\u0666\u0667\3\2\2"+
		"\2\u0667\u0668\7?\2\2\u0668\u066a\5\u0080A\2\u0669\u066b\5\u0084C\2\u066a"+
		"\u0669\3\2\2\2\u066a\u066b\3\2\2\2\u066b\u0672\3\2\2\2\u066c\u066d\7G"+
		"\2\2\u066d\u066e\5\u0082B\2\u066e\u066f\7?\2\2\u066f\u0670\5\u0080A\2"+
		"\u0670\u0672\3\2\2\2\u0671\u0665\3\2\2\2\u0671\u066c\3\2\2\2\u0672\u0674"+
		"\3\2\2\2\u0673\u0662\3\2\2\2\u0674\u0677\3\2\2\2\u0675\u0673\3\2\2\2\u0675"+
		"\u0676\3\2\2\2\u0676\u0081\3\2\2\2\u0677\u0675\3\2\2\2\u0678\u067a\7B"+
		"\2\2\u0679\u0678\3\2\2\2\u0679\u067a\3\2\2\2\u067a\u068e\3\2\2\2\u067b"+
		"\u067d\7C\2\2\u067c\u067e\7A\2\2\u067d\u067c\3\2\2\2\u067d\u067e\3\2\2"+
		"\2\u067e\u068e\3\2\2\2\u067f\u0680\7C\2\2\u0680\u068e\7D\2\2\u0681\u0683"+
		"\7E\2\2\u0682\u0684\7A\2\2\u0683\u0682\3\2\2\2\u0683\u0684\3\2\2\2\u0684"+
		"\u068e\3\2\2\2\u0685\u0687\7F\2\2\u0686\u0688\7A\2\2\u0687\u0686\3\2\2"+
		"\2\u0687\u0688\3\2\2\2\u0688\u068e\3\2\2\2\u0689\u068b\7C\2\2\u068a\u0689"+
		"\3\2\2\2\u068a\u068b\3\2\2\2\u068b\u068c\3\2\2\2\u068c\u068e\7\u00e8\2"+
		"\2\u068d\u0679\3\2\2\2\u068d\u067b\3\2\2\2\u068d\u067f\3\2\2\2\u068d\u0681"+
		"\3\2\2\2\u068d\u0685\3\2\2\2\u068d\u068a\3\2\2\2\u068e\u0083\3\2\2\2\u068f"+
		"\u0690\7H\2\2\u0690\u069e\5\u00a2R\2\u0691\u0692\7\u009c\2\2\u0692\u0693"+
		"\7\t\2\2\u0693\u0698\5\u00d0i\2\u0694\u0695\7\13\2\2\u0695\u0697\5\u00d0"+
		"i\2\u0696\u0694\3\2\2\2\u0697\u069a\3\2\2\2\u0698\u0696\3\2\2\2\u0698"+
		"\u0699\3\2\2\2\u0699\u069b\3\2\2\2\u069a\u0698\3\2\2\2\u069b\u069c\7\n"+
		"\2\2\u069c\u069e\3\2\2\2\u069d\u068f\3\2\2\2\u069d\u0691\3\2\2\2\u069e"+
		"\u0085\3\2\2\2\u069f\u06a0\7o\2\2\u06a0\u06b6\7\t\2\2\u06a1\u06a2\t\21"+
		"\2\2\u06a2\u06b7\7\u0092\2\2\u06a3\u06a4\5\u00a0Q\2\u06a4\u06a5\7N\2\2"+
		"\u06a5\u06b7\3\2\2\2\u06a6\u06b7\7\u00ef\2\2\u06a7\u06a8\7\u0093\2\2\u06a8"+
		"\u06a9\7\u00f0\2\2\u06a9\u06aa\7\u0094\2\2\u06aa\u06ab\7\u0095\2\2\u06ab"+
		"\u06b4\7\u00f0\2\2\u06ac\u06b2\7H\2\2\u06ad\u06b3\5\u00d0i\2\u06ae\u06af"+
		"\5\u00ceh\2\u06af\u06b0\7\t\2\2\u06b0\u06b1\7\n\2\2\u06b1\u06b3\3\2\2"+
		"\2\u06b2\u06ad\3\2\2\2\u06b2\u06ae\3\2\2\2\u06b3\u06b5\3\2\2\2\u06b4\u06ac"+
		"\3\2\2\2\u06b4\u06b5\3\2\2\2\u06b5\u06b7\3\2\2\2\u06b6\u06a1\3\2\2\2\u06b6"+
		"\u06a3\3\2\2\2\u06b6\u06a6\3\2\2\2\u06b6\u06a7\3\2\2\2\u06b7\u06b8\3\2"+
		"\2\2\u06b8\u06b9\7\n\2\2\u06b9\u0087\3\2\2\2\u06ba\u06bb\7\t\2\2\u06bb"+
		"\u06bc\5\u008aF\2\u06bc\u06bd\7\n\2\2\u06bd\u0089\3\2\2\2\u06be\u06c3"+
		"\5\u00d0i\2\u06bf\u06c0\7\13\2\2\u06c0\u06c2\5\u00d0i\2\u06c1\u06bf\3"+
		"\2\2\2\u06c2\u06c5\3\2\2\2\u06c3\u06c1\3\2\2\2\u06c3\u06c4\3\2\2\2\u06c4"+
		"\u008b\3\2\2\2\u06c5\u06c3\3\2\2\2\u06c6\u06c7\7\t\2\2\u06c7\u06cc\5\u008e"+
		"H\2\u06c8\u06c9\7\13\2\2\u06c9\u06cb\5\u008eH\2\u06ca\u06c8\3\2\2\2\u06cb"+
		"\u06ce\3\2\2\2\u06cc\u06ca\3\2\2\2\u06cc\u06cd\3\2\2\2\u06cd\u06cf\3\2"+
		"\2\2\u06ce\u06cc\3\2\2\2\u06cf\u06d0\7\n\2\2\u06d0\u008d\3\2\2\2\u06d1"+
		"\u06d3\5\u00d0i\2\u06d2\u06d4\t\17\2\2\u06d3\u06d2\3\2\2\2\u06d3\u06d4"+
		"\3\2\2\2\u06d4\u008f\3\2\2\2\u06d5\u06d6\7\t\2\2\u06d6\u06db\5\u0092J"+
		"\2\u06d7\u06d8\7\13\2\2\u06d8\u06da\5\u0092J\2\u06d9\u06d7\3\2\2\2\u06da"+
		"\u06dd\3\2\2\2\u06db\u06d9\3\2\2\2\u06db\u06dc\3\2\2\2\u06dc\u06de\3\2"+
		"\2\2\u06dd\u06db\3\2\2\2\u06de\u06df\7\n\2\2\u06df\u0091\3\2\2\2\u06e0"+
		"\u06e3\5\u00d0i\2\u06e1\u06e2\7v\2\2\u06e2\u06e4\7\u00eb\2\2\u06e3\u06e1"+
		"\3\2\2\2\u06e3\u06e4\3\2\2\2\u06e4\u0093\3\2\2\2\u06e5\u06e7\5\u009aN"+
		"\2\u06e6\u06e8\5\u0086D\2\u06e7\u06e6\3\2\2\2\u06e7\u06e8\3\2\2\2\u06e8"+
		"\u06ed\3\2\2\2\u06e9\u06eb\7\32\2\2\u06ea\u06e9\3\2\2\2\u06ea\u06eb\3"+
		"\2\2\2\u06eb\u06ec\3\2\2\2\u06ec\u06ee\5\u00d2j\2\u06ed\u06ea\3\2\2\2"+
		"\u06ed\u06ee\3\2\2\2\u06ee\u0709\3\2\2\2\u06ef\u06f0\7\t\2\2\u06f0\u06f1"+
		"\5h\65\2\u06f1\u06f3\7\n\2\2\u06f2\u06f4\5\u0086D\2\u06f3\u06f2\3\2\2"+
		"\2\u06f3\u06f4\3\2\2\2\u06f4\u06f9\3\2\2\2\u06f5\u06f7\7\32\2\2\u06f6"+
		"\u06f5\3\2\2\2\u06f6\u06f7\3\2\2\2\u06f7\u06f8\3\2\2\2\u06f8\u06fa\5\u00d2"+
		"j\2\u06f9\u06f6\3\2\2\2\u06f9\u06fa\3\2\2\2\u06fa\u0709\3\2\2\2\u06fb"+
		"\u06fc\7\t\2\2\u06fc\u06fd\5\u0080A\2\u06fd\u06ff\7\n\2\2\u06fe\u0700"+
		"\5\u0086D\2\u06ff\u06fe\3\2\2\2\u06ff\u0700\3\2\2\2\u0700\u0705\3\2\2"+
		"\2\u0701\u0703\7\32\2\2\u0702\u0701\3\2\2\2\u0702\u0703\3\2\2\2\u0703"+
		"\u0704\3\2\2\2\u0704\u0706\5\u00d2j\2\u0705\u0702\3\2\2\2\u0705\u0706"+
		"\3\2\2\2\u0706\u0709\3\2\2\2\u0707\u0709\5\u0096L\2\u0708\u06e5\3\2\2"+
		"\2\u0708\u06ef\3\2\2\2\u0708\u06fb\3\2\2\2\u0708\u0707\3\2\2\2\u0709\u0095"+
		"\3\2\2\2\u070a\u070b\7U\2\2\u070b\u0710\5\u00a0Q\2\u070c\u070d\7\13\2"+
		"\2\u070d\u070f\5\u00a0Q\2\u070e\u070c\3\2\2\2\u070f\u0712\3\2\2\2\u0710"+
		"\u070e\3\2\2\2\u0710\u0711\3\2\2\2\u0711\u071a\3\2\2\2\u0712\u0710\3\2"+
		"\2\2\u0713\u0715\7\32\2\2\u0714\u0713\3\2\2\2\u0714\u0715\3\2\2\2\u0715"+
		"\u0716\3\2\2\2\u0716\u0718\5\u00d0i\2\u0717\u0719\5\u0088E\2\u0718\u0717"+
		"\3\2\2\2\u0718\u0719\3\2\2\2\u0719\u071b\3\2\2\2\u071a\u0714\3\2\2\2\u071a"+
		"\u071b\3\2\2\2\u071b\u0097\3\2\2\2\u071c\u071d\7S\2\2\u071d\u071e\7_\2"+
		"\2\u071e\u071f\7\u009d\2\2\u071f\u0723\7\u00eb\2\2\u0720\u0721\7T\2\2"+
		"\u0721\u0722\7\u009e\2\2\u0722\u0724\5T+\2\u0723\u0720\3\2\2\2\u0723\u0724"+
		"\3\2\2\2\u0724\u074e\3\2\2\2\u0725\u0726\7S\2\2\u0726\u0727\7_\2\2\u0727"+
		"\u0731\7\u00a1\2\2\u0728\u0729\7\u00a2\2\2\u0729\u072a\7\u00a3\2\2\u072a"+
		"\u072b\7\37\2\2\u072b\u072f\7\u00eb\2\2\u072c\u072d\7\u00a7\2\2\u072d"+
		"\u072e\7\37\2\2\u072e\u0730\7\u00eb\2\2\u072f\u072c\3\2\2\2\u072f\u0730"+
		"\3\2\2\2\u0730\u0732\3\2\2\2\u0731\u0728\3\2\2\2\u0731\u0732\3\2\2\2\u0732"+
		"\u0738\3\2\2\2\u0733\u0734\7\u00a4\2\2\u0734\u0735\7\u00a5\2\2\u0735\u0736"+
		"\7\u00a3\2\2\u0736\u0737\7\37\2\2\u0737\u0739\7\u00eb\2\2\u0738\u0733"+
		"\3\2\2\2\u0738\u0739\3\2\2\2\u0739\u073f\3\2\2\2\u073a\u073b\7t\2\2\u073b"+
		"\u073c\7\u00a6\2\2\u073c\u073d\7\u00a3\2\2\u073d\u073e\7\37\2\2\u073e"+
		"\u0740\7\u00eb\2\2\u073f\u073a\3\2\2\2\u073f\u0740\3\2\2\2\u0740\u0745"+
		"\3\2\2\2\u0741\u0742\7\u00a8\2\2\u0742\u0743\7\u00a3\2\2\u0743\u0744\7"+
		"\37\2\2\u0744\u0746\7\u00eb\2\2\u0745\u0741\3\2\2\2\u0745\u0746\3\2\2"+
		"\2\u0746\u074b\3\2\2\2\u0747\u0748\7\62\2\2\u0748\u0749\7\u00d5\2\2\u0749"+
		"\u074a\7\32\2\2\u074a\u074c\7\u00eb\2\2\u074b\u0747\3\2\2\2\u074b\u074c"+
		"\3\2\2\2\u074c\u074e\3\2\2\2\u074d\u071c\3\2\2\2\u074d\u0725\3\2\2\2\u074e"+
		"\u0099\3\2\2\2\u074f\u0750\5\u00d0i\2\u0750\u0751\7\21\2\2\u0751\u0753"+
		"\3\2\2\2\u0752\u074f\3\2\2\2\u0752\u0753\3\2\2\2\u0753\u0754\3\2\2\2\u0754"+
		"\u0755\5\u00d0i\2\u0755\u009b\3\2\2\2\u0756\u075e\5\u00a0Q\2\u0757\u0759"+
		"\7\32\2\2\u0758\u0757\3\2\2\2\u0758\u0759\3\2\2\2\u0759\u075c\3\2\2\2"+
		"\u075a\u075d\5\u00d0i\2\u075b\u075d\5\u0088E\2\u075c\u075a\3\2\2\2\u075c"+
		"\u075b\3\2\2\2\u075d\u075f\3\2\2\2\u075e\u0758\3\2\2\2\u075e\u075f\3\2"+
		"\2\2\u075f\u009d\3\2\2\2\u0760\u0765\5\u009cO\2\u0761\u0762\7\13\2\2\u0762"+
		"\u0764\5\u009cO\2\u0763\u0761\3\2\2\2\u0764\u0767\3\2\2\2\u0765\u0763"+
		"\3\2\2\2\u0765\u0766\3\2\2\2\u0766\u009f\3\2\2\2\u0767\u0765\3\2\2\2\u0768"+
		"\u0769\5\u00a2R\2\u0769\u00a1\3\2\2\2\u076a\u076b\bR\1\2\u076b\u076c\7"+
		"+\2\2\u076c\u0774\5\u00a2R\7\u076d\u0774\5\u00a4S\2\u076e\u076f\7-\2\2"+
		"\u076f\u0770\7\t\2\2\u0770\u0771\5@!\2\u0771\u0772\7\n\2\2\u0772\u0774"+
		"\3\2\2\2\u0773\u076a\3\2\2\2\u0773\u076d\3\2\2\2\u0773\u076e\3\2\2\2\u0774"+
		"\u077d\3\2\2\2\u0775\u0776\f\5\2\2\u0776\u0777\7)\2\2\u0777\u077c\5\u00a2"+
		"R\6\u0778\u0779\f\4\2\2\u0779\u077a\7(\2\2\u077a\u077c\5\u00a2R\5\u077b"+
		"\u0775\3\2\2\2\u077b\u0778\3\2\2\2\u077c\u077f\3\2\2\2\u077d\u077b\3\2"+
		"\2\2\u077d\u077e\3\2\2\2\u077e\u00a3\3\2\2\2\u077f\u077d\3\2\2\2\u0780"+
		"\u0782\5\u00a8U\2\u0781\u0783\5\u00a6T\2\u0782\u0781\3\2\2\2\u0782\u0783"+
		"\3\2\2\2\u0783\u00a5\3\2\2\2\u0784\u0786\7+\2\2\u0785\u0784\3\2\2\2\u0785"+
		"\u0786\3\2\2\2\u0786\u0787\3\2\2\2\u0787\u0788\7.\2\2\u0788\u0789\5\u00a8"+
		"U\2\u0789\u078a\7)\2\2\u078a\u078b\5\u00a8U\2\u078b\u07ae\3\2\2\2\u078c"+
		"\u078e\7+\2\2\u078d\u078c\3\2\2\2\u078d\u078e\3\2\2\2\u078e\u078f\3\2"+
		"\2\2\u078f\u0790\7*\2\2\u0790\u0791\7\t\2\2\u0791\u0796\5\u00a0Q\2\u0792"+
		"\u0793\7\13\2\2\u0793\u0795\5\u00a0Q\2\u0794\u0792\3\2\2\2\u0795\u0798"+
		"\3\2\2\2\u0796\u0794\3\2\2\2\u0796\u0797\3\2\2\2\u0797\u0799\3\2\2\2\u0798"+
		"\u0796\3\2\2\2\u0799\u079a\7\n\2\2\u079a\u07ae\3\2\2\2\u079b\u079d\7+"+
		"\2\2\u079c\u079b\3\2\2\2\u079c\u079d\3\2\2\2\u079d\u079e\3\2\2\2\u079e"+
		"\u079f\7*\2\2\u079f\u07a0\7\t\2\2\u07a0\u07a1\5@!\2\u07a1\u07a2\7\n\2"+
		"\2\u07a2\u07ae\3\2\2\2\u07a3\u07a5\7+\2\2\u07a4\u07a3\3\2\2\2\u07a4\u07a5"+
		"\3\2\2\2\u07a5\u07a6\3\2\2\2\u07a6\u07a7\t\22\2\2\u07a7\u07ae\5\u00a8"+
		"U\2\u07a8\u07aa\7\61\2\2\u07a9\u07ab\7+\2\2\u07aa\u07a9\3\2\2\2\u07aa"+
		"\u07ab\3\2\2\2\u07ab\u07ac\3\2\2\2\u07ac\u07ae\7\62\2\2\u07ad\u0785\3"+
		"\2\2\2\u07ad\u078d\3\2\2\2\u07ad\u079c\3\2\2\2\u07ad\u07a4\3\2\2\2\u07ad"+
		"\u07a8\3\2\2\2\u07ae\u00a7\3\2\2\2\u07af\u07b0\bU\1\2\u07b0\u07b4\5\u00aa"+
		"V\2\u07b1\u07b2\t\23\2\2\u07b2\u07b4\5\u00a8U\t\u07b3\u07af\3\2\2\2\u07b3"+
		"\u07b1\3\2\2\2\u07b4\u07ca\3\2\2\2\u07b5\u07b6\f\b\2\2\u07b6\u07b7\t\24"+
		"\2\2\u07b7\u07c9\5\u00a8U\t\u07b8\u07b9\f\7\2\2\u07b9\u07ba\t\25\2\2\u07ba"+
		"\u07c9\5\u00a8U\b\u07bb\u07bc\f\6\2\2\u07bc\u07bd\7\u008f\2\2\u07bd\u07c9"+
		"\5\u00a8U\7\u07be\u07bf\f\5\2\2\u07bf\u07c0\7\u0091\2\2\u07c0\u07c9\5"+
		"\u00a8U\6\u07c1\u07c2\f\4\2\2\u07c2\u07c3\7\u0090\2\2\u07c3\u07c9\5\u00a8"+
		"U\5\u07c4\u07c5\f\3\2\2\u07c5\u07c6\5\u00aeX\2\u07c6\u07c7\5\u00a8U\4"+
		"\u07c7\u07c9\3\2\2\2\u07c8\u07b5\3\2\2\2\u07c8\u07b8\3\2\2\2\u07c8\u07bb"+
		"\3\2\2\2\u07c8\u07be\3\2\2\2\u07c8\u07c1\3\2\2\2\u07c8\u07c4\3\2\2\2\u07c9"+
		"\u07cc\3\2\2\2\u07ca\u07c8\3\2\2\2\u07ca\u07cb\3\2\2\2\u07cb\u00a9\3\2"+
		"\2\2\u07cc\u07ca\3\2\2\2\u07cd\u07ce\bV\1\2\u07ce\u081c\5\u00acW\2\u07cf"+
		"\u081c\7\u008a\2\2\u07d0\u07d1\5\u00ceh\2\u07d1\u07d2\7\21\2\2\u07d2\u07d3"+
		"\7\u008a\2\2\u07d3\u081c\3\2\2\2\u07d4\u07d5\7\t\2\2\u07d5\u07d8\5\u00a0"+
		"Q\2\u07d6\u07d7\7\13\2\2\u07d7\u07d9\5\u00a0Q\2\u07d8\u07d6\3\2\2\2\u07d9"+
		"\u07da\3\2\2\2\u07da\u07d8\3\2\2\2\u07da\u07db\3\2\2\2\u07db\u07dc\3\2"+
		"\2\2\u07dc\u07dd\7\n\2\2\u07dd\u081c\3\2\2\2\u07de\u07df\5\u00ceh\2\u07df"+
		"\u07eb\7\t\2\2\u07e0\u07e2\5~@\2\u07e1\u07e0\3\2\2\2\u07e1\u07e2\3\2\2"+
		"\2\u07e2\u07e3\3\2\2\2\u07e3\u07e8\5\u00a0Q\2\u07e4\u07e5\7\13\2\2\u07e5"+
		"\u07e7\5\u00a0Q\2\u07e6\u07e4\3\2\2\2\u07e7\u07ea\3\2\2\2\u07e8\u07e6"+
		"\3\2\2\2\u07e8\u07e9\3\2\2\2\u07e9\u07ec\3\2\2\2\u07ea\u07e8\3\2\2\2\u07eb"+
		"\u07e1\3\2\2\2\u07eb\u07ec\3\2\2\2\u07ec\u07ed\3\2\2\2\u07ed\u07f0\7\n"+
		"\2\2\u07ee\u07ef\7K\2\2\u07ef\u07f1\5\u00c8e\2\u07f0\u07ee\3\2\2\2\u07f0"+
		"\u07f1\3\2\2\2\u07f1\u081c\3\2\2\2\u07f2\u07f3\7\t\2\2\u07f3\u07f4\5@"+
		"!\2\u07f4\u07f5\7\n\2\2\u07f5\u081c\3\2\2\2\u07f6\u07f7\7:\2\2\u07f7\u07f9"+
		"\5\u00a8U\2\u07f8\u07fa\5\u00c2b\2\u07f9\u07f8\3\2\2\2\u07fa\u07fb\3\2"+
		"\2\2\u07fb\u07f9\3\2\2\2\u07fb\u07fc\3\2\2\2\u07fc\u07ff\3\2\2\2\u07fd"+
		"\u07fe\7=\2\2\u07fe\u0800\5\u00a0Q\2\u07ff\u07fd\3\2\2\2\u07ff\u0800\3"+
		"\2\2\2\u0800\u0801\3\2\2\2\u0801\u0802\7>\2\2\u0802\u081c\3\2\2\2\u0803"+
		"\u0805\7:\2\2\u0804\u0806\5\u00c2b\2\u0805\u0804\3\2\2\2\u0806\u0807\3"+
		"\2\2\2\u0807\u0805\3\2\2\2\u0807\u0808\3\2\2\2\u0808\u080b\3\2\2\2\u0809"+
		"\u080a\7=\2\2\u080a\u080c\5\u00a0Q\2\u080b\u0809\3\2\2\2\u080b\u080c\3"+
		"\2\2\2\u080c\u080d\3\2\2\2\u080d\u080e\7>\2\2\u080e\u081c\3\2\2\2\u080f"+
		"\u0810\7b\2\2\u0810\u0811\7\t\2\2\u0811\u0812\5\u00a0Q\2\u0812\u0813\7"+
		"\32\2\2\u0813\u0814\5\u00bc_\2\u0814\u0815\7\n\2\2\u0815\u081c\3\2\2\2"+
		"\u0816\u081c\5\u00d0i\2\u0817\u0818\7\t\2\2\u0818\u0819\5\u00a0Q\2\u0819"+
		"\u081a\7\n\2\2\u081a\u081c\3\2\2\2\u081b\u07cd\3\2\2\2\u081b\u07cf\3\2"+
		"\2\2\u081b\u07d0\3\2\2\2\u081b\u07d4\3\2\2\2\u081b\u07de\3\2\2\2\u081b"+
		"\u07f2\3\2\2\2\u081b\u07f6\3\2\2\2\u081b\u0803\3\2\2\2\u081b\u080f\3\2"+
		"\2\2\u081b\u0816\3\2\2\2\u081b\u0817\3\2\2\2\u081c\u0827\3\2\2\2\u081d"+
		"\u081e\f\6\2\2\u081e\u081f\7\16\2\2\u081f\u0820\5\u00a8U\2\u0820\u0821"+
		"\7\17\2\2\u0821\u0826\3\2\2\2\u0822\u0823\f\4\2\2\u0823\u0824\7\21\2\2"+
		"\u0824\u0826\5\u00d0i\2\u0825\u081d\3\2\2\2\u0825\u0822\3\2\2\2\u0826"+
		"\u0829\3\2\2\2\u0827\u0825\3\2\2\2\u0827\u0828\3\2\2\2\u0828\u00ab\3\2"+
		"\2\2\u0829\u0827\3\2\2\2\u082a\u0837\7\62\2\2\u082b\u0837\5\u00b6\\\2"+
		"\u082c\u082d\5\u00d0i\2\u082d\u082e\7\u00eb\2\2\u082e\u0837\3\2\2\2\u082f"+
		"\u0837\5\u00d6l\2\u0830\u0837\5\u00b4[\2\u0831\u0833\7\u00eb\2\2\u0832"+
		"\u0831\3\2\2\2\u0833\u0834\3\2\2\2\u0834\u0832\3\2\2\2\u0834\u0835\3\2"+
		"\2\2\u0835\u0837\3\2\2\2\u0836\u082a\3\2\2\2\u0836\u082b\3\2\2\2\u0836"+
		"\u082c\3\2\2\2\u0836\u082f\3\2\2\2\u0836\u0830\3\2\2\2\u0836\u0832\3\2"+
		"\2\2\u0837\u00ad\3\2\2\2\u0838\u0839\t\26\2\2\u0839\u00af\3\2\2\2\u083a"+
		"\u083b\t\27\2\2\u083b\u00b1\3\2\2\2\u083c\u083d\t\30\2\2\u083d\u00b3\3"+
		"\2\2\2\u083e\u083f\t\31\2\2\u083f\u00b5\3\2\2\2\u0840\u0844\79\2\2\u0841"+
		"\u0843\5\u00b8]\2\u0842\u0841\3\2\2\2\u0843\u0846\3\2\2\2\u0844\u0842"+
		"\3\2\2\2\u0844\u0845\3\2\2\2\u0845\u00b7\3\2\2\2\u0846\u0844\3\2\2\2\u0847"+
		"\u0848\5\u00ba^\2\u0848\u084b\5\u00d0i\2\u0849\u084a\7n\2\2\u084a\u084c"+
		"\5\u00d0i\2\u084b\u0849\3\2\2\2\u084b\u084c\3\2\2\2\u084c\u00b9\3\2\2"+
		"\2\u084d\u084f\t\25\2\2\u084e\u084d\3\2\2\2\u084e\u084f\3\2\2\2\u084f"+
		"\u0850\3\2\2\2\u0850\u0853\t\21\2\2\u0851\u0853\7\u00eb\2\2\u0852\u084e"+
		"\3\2\2\2\u0852\u0851\3\2\2\2\u0853\u00bb\3\2\2\2\u0854\u0855\7s\2\2\u0855"+
		"\u0856\7\u0084\2\2\u0856\u0857\5\u00bc_\2\u0857\u0858\7\u0086\2\2\u0858"+
		"\u0877\3\2\2\2\u0859\u085a\7t\2\2\u085a\u085b\7\u0084\2\2\u085b\u085c"+
		"\5\u00bc_\2\u085c\u085d\7\13\2\2\u085d\u085e\5\u00bc_\2\u085e\u085f\7"+
		"\u0086\2\2\u085f\u0877\3\2\2\2\u0860\u0867\7u\2\2\u0861\u0863\7\u0084"+
		"\2\2\u0862\u0864\5\u00be`\2\u0863\u0862\3\2\2\2\u0863\u0864\3\2\2\2\u0864"+
		"\u0865\3\2\2\2\u0865\u0868\7\u0086\2\2\u0866\u0868\7\u0082\2\2\u0867\u0861"+
		"\3\2\2\2\u0867\u0866\3\2\2\2\u0868\u0877\3\2\2\2\u0869\u0874\5\u00d0i"+
		"\2\u086a\u086b\7\t\2\2\u086b\u0870\7\u00f0\2\2\u086c\u086d\7\13\2\2\u086d"+
		"\u086f\7\u00f0\2\2\u086e\u086c\3\2\2\2\u086f\u0872\3\2\2\2\u0870\u086e"+
		"\3\2\2\2\u0870\u0871\3\2\2\2\u0871\u0873\3\2\2\2\u0872\u0870\3\2\2\2\u0873"+
		"\u0875\7\n\2\2\u0874\u086a\3\2\2\2\u0874\u0875\3\2\2\2\u0875\u0877\3\2"+
		"\2\2\u0876\u0854\3\2\2\2\u0876\u0859\3\2\2\2\u0876\u0860\3\2\2\2\u0876"+
		"\u0869\3\2\2\2\u0877\u00bd\3\2\2\2\u0878\u087d\5\u00c0a\2\u0879\u087a"+
		"\7\13\2\2\u087a\u087c\5\u00c0a\2\u087b\u0879\3\2\2\2\u087c\u087f\3\2\2"+
		"\2\u087d\u087b\3\2\2\2\u087d\u087e\3\2\2\2\u087e\u00bf\3\2\2\2\u087f\u087d"+
		"\3\2\2\2\u0880\u0882\5\u00d0i\2\u0881\u0883\7\20\2\2\u0882\u0881\3\2\2"+
		"\2\u0882\u0883\3\2\2\2\u0883\u0884\3\2\2\2\u0884\u0887\5\u00bc_\2\u0885"+
		"\u0886\7v\2\2\u0886\u0888\7\u00eb\2\2\u0887\u0885\3\2\2\2\u0887\u0888"+
		"\3\2\2\2\u0888\u00c1\3\2\2\2\u0889\u088a\7;\2\2\u088a\u088b\5\u00a0Q\2"+
		"\u088b\u088c\7<\2\2\u088c\u088d\5\u00a0Q\2\u088d\u00c3\3\2\2\2\u088e\u088f"+
		"\7J\2\2\u088f\u0894\5\u00c6d\2\u0890\u0891\7\13\2\2\u0891\u0893\5\u00c6"+
		"d\2\u0892\u0890\3\2\2\2\u0893\u0896\3\2\2\2\u0894\u0892\3\2\2\2\u0894"+
		"\u0895\3\2\2\2\u0895\u00c5\3\2\2\2\u0896\u0894\3\2\2\2\u0897\u0898\5\u00d0"+
		"i\2\u0898\u0899\7\32\2\2\u0899\u089a\5\u00c8e\2\u089a\u00c7\3\2\2\2\u089b"+
		"\u08c6\5\u00d0i\2\u089c\u08bf\7\t\2\2\u089d\u089e\7\u0097\2\2\u089e\u089f"+
		"\7\37\2\2\u089f\u08a4\5\u00a0Q\2\u08a0\u08a1\7\13\2\2\u08a1\u08a3\5\u00a0"+
		"Q\2\u08a2\u08a0\3\2\2\2\u08a3\u08a6\3\2\2\2\u08a4\u08a2\3\2\2\2\u08a4"+
		"\u08a5\3\2\2\2\u08a5\u08c0\3\2\2\2\u08a6\u08a4\3\2\2\2\u08a7\u08a8\t\32"+
		"\2\2\u08a8\u08a9\7\37\2\2\u08a9\u08ae\5\u00a0Q\2\u08aa\u08ab\7\13\2\2"+
		"\u08ab\u08ad\5\u00a0Q\2\u08ac\u08aa\3\2\2\2\u08ad\u08b0\3\2\2\2\u08ae"+
		"\u08ac\3\2\2\2\u08ae\u08af\3\2\2\2\u08af\u08b2\3\2\2\2\u08b0\u08ae\3\2"+
		"\2\2\u08b1\u08a7\3\2\2\2\u08b1\u08b2\3\2\2\2\u08b2\u08bd\3\2\2\2\u08b3"+
		"\u08b4\t\33\2\2\u08b4\u08b5\7\37\2\2\u08b5\u08ba\5r:\2\u08b6\u08b7\7\13"+
		"\2\2\u08b7\u08b9\5r:\2\u08b8\u08b6\3\2\2\2\u08b9\u08bc\3\2\2\2\u08ba\u08b8"+
		"\3\2\2\2\u08ba\u08bb\3\2\2\2\u08bb\u08be\3\2\2\2\u08bc\u08ba\3\2\2\2\u08bd"+
		"\u08b3\3\2\2\2\u08bd\u08be\3\2\2\2\u08be\u08c0\3\2\2\2\u08bf\u089d\3\2"+
		"\2\2\u08bf\u08b1\3\2\2\2\u08c0\u08c2\3\2\2\2\u08c1\u08c3\5\u00caf\2\u08c2"+
		"\u08c1\3\2\2\2\u08c2\u08c3\3\2\2\2\u08c3\u08c4\3\2\2\2\u08c4\u08c6\7\n"+
		"\2\2\u08c5\u089b\3\2\2\2\u08c5\u089c\3\2\2\2\u08c6\u00c9\3\2\2\2\u08c7"+
		"\u08c8\7M\2\2\u08c8\u08d8\5\u00ccg\2\u08c9\u08ca\7N\2\2\u08ca\u08d8\5"+
		"\u00ccg\2\u08cb\u08cc\7M\2\2\u08cc\u08cd\7.\2\2\u08cd\u08ce\5\u00ccg\2"+
		"\u08ce\u08cf\7)\2\2\u08cf\u08d0\5\u00ccg\2\u08d0\u08d8\3\2\2\2\u08d1\u08d2"+
		"\7N\2\2\u08d2\u08d3\7.\2\2\u08d3\u08d4\5\u00ccg\2\u08d4\u08d5\7)\2\2\u08d5"+
		"\u08d6\5\u00ccg\2\u08d6\u08d8\3\2\2\2\u08d7\u08c7\3\2\2\2\u08d7\u08c9"+
		"\3\2\2\2\u08d7\u08cb\3\2\2\2\u08d7\u08d1\3\2\2\2\u08d8\u00cb\3\2\2\2\u08d9"+
		"\u08da\7O\2\2\u08da\u08e1\t\34\2\2\u08db\u08dc\7R\2\2\u08dc\u08e1\7S\2"+
		"\2\u08dd\u08de\5\u00a0Q\2\u08de\u08df\t\34\2\2\u08df\u08e1\3\2\2\2\u08e0"+
		"\u08d9\3\2\2\2\u08e0\u08db\3\2\2\2\u08e0\u08dd\3\2\2\2\u08e1\u00cd\3\2"+
		"\2\2\u08e2\u08e7\5\u00d0i\2\u08e3\u08e4\7\21\2\2\u08e4\u08e6\5\u00d0i"+
		"\2\u08e5\u08e3\3\2\2\2\u08e6\u08e9\3\2\2\2\u08e7\u08e5\3\2\2\2\u08e7\u08e8"+
		"\3\2\2\2\u08e8\u00cf\3\2\2\2\u08e9\u08e7\3\2\2\2\u08ea\u08f9\5\u00d2j"+
		"\2\u08eb\u08f9\7\u00e8\2\2\u08ec\u08f9\7F\2\2\u08ed\u08f9\7B\2\2\u08ee"+
		"\u08f9\7C\2\2\u08ef\u08f9\7D\2\2\u08f0\u08f9\7E\2\2\u08f1\u08f9\7G\2\2"+
		"\u08f2\u08f9\7?\2\2\u08f3\u08f9\7@\2\2\u08f4\u08f9\7H\2\2\u08f5\u08f9"+
		"\7k\2\2\u08f6\u08f9\7m\2\2\u08f7\u08f9\7l\2\2\u08f8\u08ea\3\2\2\2\u08f8"+
		"\u08eb\3\2\2\2\u08f8\u08ec\3\2\2\2\u08f8\u08ed\3\2\2\2\u08f8\u08ee\3\2"+
		"\2\2\u08f8\u08ef\3\2\2\2\u08f8\u08f0\3\2\2\2\u08f8\u08f1\3\2\2\2\u08f8"+
		"\u08f2\3\2\2\2\u08f8\u08f3\3\2\2\2\u08f8\u08f4\3\2\2\2\u08f8\u08f5\3\2"+
		"\2\2\u08f8\u08f6\3\2\2\2\u08f8\u08f7\3\2\2\2\u08f9\u00d1\3\2\2\2\u08fa"+
		"\u08fe\7\u00f4\2\2\u08fb\u08fe\5\u00d4k\2\u08fc\u08fe\5\u00d8m\2\u08fd"+
		"\u08fa\3\2\2\2\u08fd\u08fb\3\2\2\2\u08fd\u08fc\3\2\2\2\u08fe\u00d3\3\2"+
		"\2\2\u08ff\u0900\7\u00f5\2\2\u0900\u00d5\3\2\2\2\u0901\u0909\7\u00f1\2"+
		"\2\u0902\u0909\7\u00f2\2\2\u0903\u0909\7\u00f0\2\2\u0904\u0909\7\u00ec"+
		"\2\2\u0905\u0909\7\u00ed\2\2\u0906\u0909\7\u00ee\2\2\u0907\u0909\7\u00f3"+
		"\2\2\u0908\u0901\3\2\2\2\u0908\u0902\3\2\2\2\u0908\u0903\3\2\2\2\u0908"+
		"\u0904\3\2\2\2\u0908\u0905\3\2\2\2\u0908\u0906\3\2\2\2\u0908\u0907\3\2"+
		"\2\2\u0909\u00d7\3\2\2\2\u090a\u090b\t\35\2\2\u090b\u00d9\3\2\2\2\u0132"+
		"\u00e3\u00e5\u00ed\u00fb\u0105\u0113\u011c\u0120\u0143\u0148\u0152\u0159"+
		"\u0161\u0168\u0174\u018a\u018f\u0192\u0197\u01a4\u01a8\u01af\u01b4\u01b9"+
		"\u01bc\u01c2\u01c7\u01ca\u01cd\u01d6\u01da\u01e2\u01e5\u01e8\u01eb\u01ee"+
		"\u01f1\u01f5\u01f8\u01fb\u0202\u020c\u0214\u0216\u022d\u0235\u023d\u0243"+
		"\u0250\u0255\u025e\u0263\u0273\u027a\u027e\u0286\u028d\u0294\u029d\u02a1"+
		"\u02a7\u02ad\u02b0\u02b6\u02ba\u02be\u02c3\u02c7\u02cf\u02d8\u02dd\u02e3"+
		"\u02e9\u02f5\u02f8\u02fc\u0301\u0306\u030d\u0310\u0313\u0319\u0322\u032a"+
		"\u0330\u0334\u0338\u033c\u033e\u0347\u034d\u0352\u0356\u0359\u0362\u0367"+
		"\u036c\u036f\u0379\u037e\u0384\u038a\u0391\u0399\u03a0\u03a8\u03ab\u03b3"+
		"\u03b7\u03be\u0435\u043d\u0445\u044e\u0457\u045b\u0461\u046d\u0471\u0474"+
		"\u047a\u0484\u0490\u0495\u049b\u04a7\u04a9\u04ae\u04b2\u04b4\u04b8\u04c1"+
		"\u04c9\u04d0\u04d6\u04da\u04e3\u04e8\u04f7\u04fe\u0501\u0508\u050c\u0512"+
		"\u051a\u0525\u0530\u0537\u053d\u0543\u054c\u054e\u0557\u055a\u0563\u0566"+
		"\u056f\u0572\u057b\u057e\u0581\u0585\u0588\u0593\u0598\u05a3\u05a7\u05b3"+
		"\u05b6\u05ba\u05c4\u05c8\u05ca\u05cd\u05d1\u05d4\u05d8\u05dc\u05e0\u05e5"+
		"\u05e8\u05ea\u05ef\u05f4\u05f7\u05fb\u05fe\u0600\u0608\u060e\u0618\u0627"+
		"\u062c\u0634\u0637\u063b\u0640\u0649\u064c\u0651\u0658\u065b\u0665\u066a"+
		"\u0671\u0675\u0679\u067d\u0683\u0687\u068a\u068d\u0698\u069d\u06b2\u06b4"+
		"\u06b6\u06c3\u06cc\u06d3\u06db\u06e3\u06e7\u06ea\u06ed\u06f3\u06f6\u06f9"+
		"\u06ff\u0702\u0705\u0708\u0710\u0714\u0718\u071a\u0723\u072f\u0731\u0738"+
		"\u073f\u0745\u074b\u074d\u0752\u0758\u075c\u075e\u0765\u0773\u077b\u077d"+
		"\u0782\u0785\u078d\u0796\u079c\u07a4\u07aa\u07ad\u07b3\u07c8\u07ca\u07da"+
		"\u07e1\u07e8\u07eb\u07f0\u07fb\u07ff\u0807\u080b\u081b\u0825\u0827\u0834"+
		"\u0836\u0844\u084b\u084e\u0852\u0863\u0867\u0870\u0874\u0876\u087d\u0882"+
		"\u0887\u0894\u08a4\u08ae\u08b1\u08ba\u08bd\u08bf\u08c2\u08c5\u08d7\u08e0"+
		"\u08e7\u08f8\u08fd\u0908";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}