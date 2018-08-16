// Generated from ../JdScriptQuerySql.g4 by ANTLR 4.5.3

   package com.uber.uberscriptquery.antlr4.generated;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link JdScriptQuerySqlParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface JdScriptQuerySqlVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link JdScriptQuerySqlParser#root}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRoot(JdScriptQuerySqlParser.RootContext ctx);
	/**
	 * Visit a parse tree produced by {@link JdScriptQuerySqlParser#jsonQueryStatementAssignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJsonQueryStatementAssignment(JdScriptQuerySqlParser.JsonQueryStatementAssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link JdScriptQuerySqlParser#jsonQueryStatementAssignment_query}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJsonQueryStatementAssignment_query(JdScriptQuerySqlParser.JsonQueryStatementAssignment_queryContext ctx);
	/**
	 * Visit a parse tree produced by {@link JdScriptQuerySqlParser#statementAssignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementAssignment(JdScriptQuerySqlParser.StatementAssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link JdScriptQuerySqlParser#statementAssignment_tableAlias}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementAssignment_tableAlias(JdScriptQuerySqlParser.StatementAssignment_tableAliasContext ctx);
	/**
	 * Visit a parse tree produced by {@link JdScriptQuerySqlParser#statementAssignment_queryType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementAssignment_queryType(JdScriptQuerySqlParser.StatementAssignment_queryTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link JdScriptQuerySqlParser#statementAssignment_queryEngine}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementAssignment_queryEngine(JdScriptQuerySqlParser.StatementAssignment_queryEngineContext ctx);
	/**
	 * Visit a parse tree produced by {@link JdScriptQuerySqlParser#statementAssignment_query}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementAssignment_query(JdScriptQuerySqlParser.StatementAssignment_queryContext ctx);
	/**
	 * Visit a parse tree produced by {@link JdScriptQuerySqlParser#configSetting}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConfigSetting(JdScriptQuerySqlParser.ConfigSettingContext ctx);
	/**
	 * Visit a parse tree produced by {@link JdScriptQuerySqlParser#statementAssignment_udf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementAssignment_udf(JdScriptQuerySqlParser.StatementAssignment_udfContext ctx);
	/**
	 * Visit a parse tree produced by {@link JdScriptQuerySqlParser#statementAssignment_param}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementAssignment_param(JdScriptQuerySqlParser.StatementAssignment_paramContext ctx);
	/**
	 * Visit a parse tree produced by {@link JdScriptQuerySqlParser#fileAssignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFileAssignment(JdScriptQuerySqlParser.FileAssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link JdScriptQuerySqlParser#fileAssignment_tableAlias}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFileAssignment_tableAlias(JdScriptQuerySqlParser.FileAssignment_tableAliasContext ctx);
	/**
	 * Visit a parse tree produced by {@link JdScriptQuerySqlParser#fileAssignment_fileType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFileAssignment_fileType(JdScriptQuerySqlParser.FileAssignment_fileTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link JdScriptQuerySqlParser#fileAssignment_fileLocation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFileAssignment_fileLocation(JdScriptQuerySqlParser.FileAssignment_fileLocationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JdScriptQuerySqlParser#actionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitActionStatement(JdScriptQuerySqlParser.ActionStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JdScriptQuerySqlParser#actionStatement_param}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitActionStatement_param(JdScriptQuerySqlParser.ActionStatement_paramContext ctx);
	/**
	 * Visit a parse tree produced by {@link JdScriptQuerySqlParser#jsonObject}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJsonObject(JdScriptQuerySqlParser.JsonObjectContext ctx);
	/**
	 * Visit a parse tree produced by {@link JdScriptQuerySqlParser#jsonArray}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJsonArray(JdScriptQuerySqlParser.JsonArrayContext ctx);
	/**
	 * Visit a parse tree produced by {@link JdScriptQuerySqlParser#jsonPair}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJsonPair(JdScriptQuerySqlParser.JsonPairContext ctx);
	/**
	 * Visit a parse tree produced by {@link JdScriptQuerySqlParser#jsonValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJsonValue(JdScriptQuerySqlParser.JsonValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link JdScriptQuerySqlParser#singleStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleStatement(JdScriptQuerySqlParser.SingleStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JdScriptQuerySqlParser#singleExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleExpression(JdScriptQuerySqlParser.SingleExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JdScriptQuerySqlParser#singleTableIdentifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleTableIdentifier(JdScriptQuerySqlParser.SingleTableIdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link JdScriptQuerySqlParser#singleDataType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleDataType(JdScriptQuerySqlParser.SingleDataTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code statementDefault}
	 * labeled alternative in {@link JdScriptQuerySqlParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementDefault(JdScriptQuerySqlParser.StatementDefaultContext ctx);
	/**
	 * Visit a parse tree produced by the {@code use}
	 * labeled alternative in {@link JdScriptQuerySqlParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUse(JdScriptQuerySqlParser.UseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code createDatabase}
	 * labeled alternative in {@link JdScriptQuerySqlParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateDatabase(JdScriptQuerySqlParser.CreateDatabaseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code setDatabaseProperties}
	 * labeled alternative in {@link JdScriptQuerySqlParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetDatabaseProperties(JdScriptQuerySqlParser.SetDatabasePropertiesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code dropDatabase}
	 * labeled alternative in {@link JdScriptQuerySqlParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropDatabase(JdScriptQuerySqlParser.DropDatabaseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code createTableUsing}
	 * labeled alternative in {@link JdScriptQuerySqlParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateTableUsing(JdScriptQuerySqlParser.CreateTableUsingContext ctx);
	/**
	 * Visit a parse tree produced by the {@code createTable}
	 * labeled alternative in {@link JdScriptQuerySqlParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateTable(JdScriptQuerySqlParser.CreateTableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code createTableLike}
	 * labeled alternative in {@link JdScriptQuerySqlParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateTableLike(JdScriptQuerySqlParser.CreateTableLikeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code analyze}
	 * labeled alternative in {@link JdScriptQuerySqlParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnalyze(JdScriptQuerySqlParser.AnalyzeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code renameTable}
	 * labeled alternative in {@link JdScriptQuerySqlParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRenameTable(JdScriptQuerySqlParser.RenameTableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code setTableProperties}
	 * labeled alternative in {@link JdScriptQuerySqlParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetTableProperties(JdScriptQuerySqlParser.SetTablePropertiesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code unsetTableProperties}
	 * labeled alternative in {@link JdScriptQuerySqlParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnsetTableProperties(JdScriptQuerySqlParser.UnsetTablePropertiesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code setTableSerDe}
	 * labeled alternative in {@link JdScriptQuerySqlParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetTableSerDe(JdScriptQuerySqlParser.SetTableSerDeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code addTablePartition}
	 * labeled alternative in {@link JdScriptQuerySqlParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddTablePartition(JdScriptQuerySqlParser.AddTablePartitionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code renameTablePartition}
	 * labeled alternative in {@link JdScriptQuerySqlParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRenameTablePartition(JdScriptQuerySqlParser.RenameTablePartitionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code dropTablePartitions}
	 * labeled alternative in {@link JdScriptQuerySqlParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropTablePartitions(JdScriptQuerySqlParser.DropTablePartitionsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code setTableLocation}
	 * labeled alternative in {@link JdScriptQuerySqlParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetTableLocation(JdScriptQuerySqlParser.SetTableLocationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code dropTable}
	 * labeled alternative in {@link JdScriptQuerySqlParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropTable(JdScriptQuerySqlParser.DropTableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code createView}
	 * labeled alternative in {@link JdScriptQuerySqlParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateView(JdScriptQuerySqlParser.CreateViewContext ctx);
	/**
	 * Visit a parse tree produced by the {@code createTempViewUsing}
	 * labeled alternative in {@link JdScriptQuerySqlParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateTempViewUsing(JdScriptQuerySqlParser.CreateTempViewUsingContext ctx);
	/**
	 * Visit a parse tree produced by the {@code alterViewQuery}
	 * labeled alternative in {@link JdScriptQuerySqlParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterViewQuery(JdScriptQuerySqlParser.AlterViewQueryContext ctx);
	/**
	 * Visit a parse tree produced by the {@code createFunction}
	 * labeled alternative in {@link JdScriptQuerySqlParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateFunction(JdScriptQuerySqlParser.CreateFunctionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code dropFunction}
	 * labeled alternative in {@link JdScriptQuerySqlParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropFunction(JdScriptQuerySqlParser.DropFunctionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code explain}
	 * labeled alternative in {@link JdScriptQuerySqlParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExplain(JdScriptQuerySqlParser.ExplainContext ctx);
	/**
	 * Visit a parse tree produced by the {@code showTables}
	 * labeled alternative in {@link JdScriptQuerySqlParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowTables(JdScriptQuerySqlParser.ShowTablesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code showDatabases}
	 * labeled alternative in {@link JdScriptQuerySqlParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowDatabases(JdScriptQuerySqlParser.ShowDatabasesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code showTblProperties}
	 * labeled alternative in {@link JdScriptQuerySqlParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowTblProperties(JdScriptQuerySqlParser.ShowTblPropertiesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code showColumns}
	 * labeled alternative in {@link JdScriptQuerySqlParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowColumns(JdScriptQuerySqlParser.ShowColumnsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code showPartitions}
	 * labeled alternative in {@link JdScriptQuerySqlParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowPartitions(JdScriptQuerySqlParser.ShowPartitionsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code showFunctions}
	 * labeled alternative in {@link JdScriptQuerySqlParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowFunctions(JdScriptQuerySqlParser.ShowFunctionsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code showCreateTable}
	 * labeled alternative in {@link JdScriptQuerySqlParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowCreateTable(JdScriptQuerySqlParser.ShowCreateTableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code describeFunction}
	 * labeled alternative in {@link JdScriptQuerySqlParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDescribeFunction(JdScriptQuerySqlParser.DescribeFunctionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code describeDatabase}
	 * labeled alternative in {@link JdScriptQuerySqlParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDescribeDatabase(JdScriptQuerySqlParser.DescribeDatabaseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code describeTable}
	 * labeled alternative in {@link JdScriptQuerySqlParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDescribeTable(JdScriptQuerySqlParser.DescribeTableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code refreshTable}
	 * labeled alternative in {@link JdScriptQuerySqlParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRefreshTable(JdScriptQuerySqlParser.RefreshTableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code refreshResource}
	 * labeled alternative in {@link JdScriptQuerySqlParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRefreshResource(JdScriptQuerySqlParser.RefreshResourceContext ctx);
	/**
	 * Visit a parse tree produced by the {@code cacheTable}
	 * labeled alternative in {@link JdScriptQuerySqlParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCacheTable(JdScriptQuerySqlParser.CacheTableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code uncacheTable}
	 * labeled alternative in {@link JdScriptQuerySqlParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUncacheTable(JdScriptQuerySqlParser.UncacheTableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code clearCache}
	 * labeled alternative in {@link JdScriptQuerySqlParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClearCache(JdScriptQuerySqlParser.ClearCacheContext ctx);
	/**
	 * Visit a parse tree produced by the {@code loadData}
	 * labeled alternative in {@link JdScriptQuerySqlParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoadData(JdScriptQuerySqlParser.LoadDataContext ctx);
	/**
	 * Visit a parse tree produced by the {@code truncateTable}
	 * labeled alternative in {@link JdScriptQuerySqlParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTruncateTable(JdScriptQuerySqlParser.TruncateTableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code manageResource}
	 * labeled alternative in {@link JdScriptQuerySqlParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitManageResource(JdScriptQuerySqlParser.ManageResourceContext ctx);
	/**
	 * Visit a parse tree produced by the {@code failNativeCommand}
	 * labeled alternative in {@link JdScriptQuerySqlParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFailNativeCommand(JdScriptQuerySqlParser.FailNativeCommandContext ctx);
	/**
	 * Visit a parse tree produced by the {@code setConfiguration}
	 * labeled alternative in {@link JdScriptQuerySqlParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetConfiguration(JdScriptQuerySqlParser.SetConfigurationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code resetConfiguration}
	 * labeled alternative in {@link JdScriptQuerySqlParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResetConfiguration(JdScriptQuerySqlParser.ResetConfigurationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JdScriptQuerySqlParser#unsupportedHiveNativeCommands}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnsupportedHiveNativeCommands(JdScriptQuerySqlParser.UnsupportedHiveNativeCommandsContext ctx);
	/**
	 * Visit a parse tree produced by {@link JdScriptQuerySqlParser#createTableHeader}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateTableHeader(JdScriptQuerySqlParser.CreateTableHeaderContext ctx);
	/**
	 * Visit a parse tree produced by {@link JdScriptQuerySqlParser#bucketSpec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBucketSpec(JdScriptQuerySqlParser.BucketSpecContext ctx);
	/**
	 * Visit a parse tree produced by {@link JdScriptQuerySqlParser#skewSpec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSkewSpec(JdScriptQuerySqlParser.SkewSpecContext ctx);
	/**
	 * Visit a parse tree produced by {@link JdScriptQuerySqlParser#locationSpec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocationSpec(JdScriptQuerySqlParser.LocationSpecContext ctx);
	/**
	 * Visit a parse tree produced by {@link JdScriptQuerySqlParser#query}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuery(JdScriptQuerySqlParser.QueryContext ctx);
	/**
	 * Visit a parse tree produced by {@link JdScriptQuerySqlParser#insertInto}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsertInto(JdScriptQuerySqlParser.InsertIntoContext ctx);
	/**
	 * Visit a parse tree produced by {@link JdScriptQuerySqlParser#partitionSpecLocation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPartitionSpecLocation(JdScriptQuerySqlParser.PartitionSpecLocationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JdScriptQuerySqlParser#partitionSpec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPartitionSpec(JdScriptQuerySqlParser.PartitionSpecContext ctx);
	/**
	 * Visit a parse tree produced by {@link JdScriptQuerySqlParser#partitionVal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPartitionVal(JdScriptQuerySqlParser.PartitionValContext ctx);
	/**
	 * Visit a parse tree produced by {@link JdScriptQuerySqlParser#describeFuncName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDescribeFuncName(JdScriptQuerySqlParser.DescribeFuncNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link JdScriptQuerySqlParser#describeColName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDescribeColName(JdScriptQuerySqlParser.DescribeColNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link JdScriptQuerySqlParser#ctes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCtes(JdScriptQuerySqlParser.CtesContext ctx);
	/**
	 * Visit a parse tree produced by {@link JdScriptQuerySqlParser#namedQuery}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNamedQuery(JdScriptQuerySqlParser.NamedQueryContext ctx);
	/**
	 * Visit a parse tree produced by {@link JdScriptQuerySqlParser#tableProvider}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableProvider(JdScriptQuerySqlParser.TableProviderContext ctx);
	/**
	 * Visit a parse tree produced by {@link JdScriptQuerySqlParser#tablePropertyList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTablePropertyList(JdScriptQuerySqlParser.TablePropertyListContext ctx);
	/**
	 * Visit a parse tree produced by {@link JdScriptQuerySqlParser#tableProperty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableProperty(JdScriptQuerySqlParser.TablePropertyContext ctx);
	/**
	 * Visit a parse tree produced by {@link JdScriptQuerySqlParser#tablePropertyKey}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTablePropertyKey(JdScriptQuerySqlParser.TablePropertyKeyContext ctx);
	/**
	 * Visit a parse tree produced by {@link JdScriptQuerySqlParser#tablePropertyValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTablePropertyValue(JdScriptQuerySqlParser.TablePropertyValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link JdScriptQuerySqlParser#constantList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantList(JdScriptQuerySqlParser.ConstantListContext ctx);
	/**
	 * Visit a parse tree produced by {@link JdScriptQuerySqlParser#nestedConstantList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNestedConstantList(JdScriptQuerySqlParser.NestedConstantListContext ctx);
	/**
	 * Visit a parse tree produced by {@link JdScriptQuerySqlParser#createFileFormat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateFileFormat(JdScriptQuerySqlParser.CreateFileFormatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code tableFileFormat}
	 * labeled alternative in {@link JdScriptQuerySqlParser#fileFormat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableFileFormat(JdScriptQuerySqlParser.TableFileFormatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code genericFileFormat}
	 * labeled alternative in {@link JdScriptQuerySqlParser#fileFormat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenericFileFormat(JdScriptQuerySqlParser.GenericFileFormatContext ctx);
	/**
	 * Visit a parse tree produced by {@link JdScriptQuerySqlParser#storageHandler}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStorageHandler(JdScriptQuerySqlParser.StorageHandlerContext ctx);
	/**
	 * Visit a parse tree produced by {@link JdScriptQuerySqlParser#resource}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResource(JdScriptQuerySqlParser.ResourceContext ctx);
	/**
	 * Visit a parse tree produced by the {@code singleInsertQuery}
	 * labeled alternative in {@link JdScriptQuerySqlParser#queryNoWith}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleInsertQuery(JdScriptQuerySqlParser.SingleInsertQueryContext ctx);
	/**
	 * Visit a parse tree produced by the {@code multiInsertQuery}
	 * labeled alternative in {@link JdScriptQuerySqlParser#queryNoWith}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiInsertQuery(JdScriptQuerySqlParser.MultiInsertQueryContext ctx);
	/**
	 * Visit a parse tree produced by {@link JdScriptQuerySqlParser#queryOrganization}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQueryOrganization(JdScriptQuerySqlParser.QueryOrganizationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JdScriptQuerySqlParser#multiInsertQueryBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiInsertQueryBody(JdScriptQuerySqlParser.MultiInsertQueryBodyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code queryTermDefault}
	 * labeled alternative in {@link JdScriptQuerySqlParser#queryTerm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQueryTermDefault(JdScriptQuerySqlParser.QueryTermDefaultContext ctx);
	/**
	 * Visit a parse tree produced by the {@code setOperation}
	 * labeled alternative in {@link JdScriptQuerySqlParser#queryTerm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetOperation(JdScriptQuerySqlParser.SetOperationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code queryPrimaryDefault}
	 * labeled alternative in {@link JdScriptQuerySqlParser#queryPrimary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQueryPrimaryDefault(JdScriptQuerySqlParser.QueryPrimaryDefaultContext ctx);
	/**
	 * Visit a parse tree produced by the {@code table}
	 * labeled alternative in {@link JdScriptQuerySqlParser#queryPrimary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable(JdScriptQuerySqlParser.TableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code inlineTableDefault1}
	 * labeled alternative in {@link JdScriptQuerySqlParser#queryPrimary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInlineTableDefault1(JdScriptQuerySqlParser.InlineTableDefault1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code subquery}
	 * labeled alternative in {@link JdScriptQuerySqlParser#queryPrimary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubquery(JdScriptQuerySqlParser.SubqueryContext ctx);
	/**
	 * Visit a parse tree produced by {@link JdScriptQuerySqlParser#sortItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSortItem(JdScriptQuerySqlParser.SortItemContext ctx);
	/**
	 * Visit a parse tree produced by {@link JdScriptQuerySqlParser#querySpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuerySpecification(JdScriptQuerySqlParser.QuerySpecificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JdScriptQuerySqlParser#fromClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFromClause(JdScriptQuerySqlParser.FromClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link JdScriptQuerySqlParser#aggregation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAggregation(JdScriptQuerySqlParser.AggregationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JdScriptQuerySqlParser#groupingSet}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGroupingSet(JdScriptQuerySqlParser.GroupingSetContext ctx);
	/**
	 * Visit a parse tree produced by {@link JdScriptQuerySqlParser#lateralView}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLateralView(JdScriptQuerySqlParser.LateralViewContext ctx);
	/**
	 * Visit a parse tree produced by {@link JdScriptQuerySqlParser#setQuantifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetQuantifier(JdScriptQuerySqlParser.SetQuantifierContext ctx);
	/**
	 * Visit a parse tree produced by the {@code relationDefault}
	 * labeled alternative in {@link JdScriptQuerySqlParser#relation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelationDefault(JdScriptQuerySqlParser.RelationDefaultContext ctx);
	/**
	 * Visit a parse tree produced by the {@code joinRelation}
	 * labeled alternative in {@link JdScriptQuerySqlParser#relation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoinRelation(JdScriptQuerySqlParser.JoinRelationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JdScriptQuerySqlParser#joinType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoinType(JdScriptQuerySqlParser.JoinTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link JdScriptQuerySqlParser#joinCriteria}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoinCriteria(JdScriptQuerySqlParser.JoinCriteriaContext ctx);
	/**
	 * Visit a parse tree produced by {@link JdScriptQuerySqlParser#sample}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSample(JdScriptQuerySqlParser.SampleContext ctx);
	/**
	 * Visit a parse tree produced by {@link JdScriptQuerySqlParser#identifierList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifierList(JdScriptQuerySqlParser.IdentifierListContext ctx);
	/**
	 * Visit a parse tree produced by {@link JdScriptQuerySqlParser#identifierSeq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifierSeq(JdScriptQuerySqlParser.IdentifierSeqContext ctx);
	/**
	 * Visit a parse tree produced by {@link JdScriptQuerySqlParser#orderedIdentifierList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrderedIdentifierList(JdScriptQuerySqlParser.OrderedIdentifierListContext ctx);
	/**
	 * Visit a parse tree produced by {@link JdScriptQuerySqlParser#orderedIdentifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrderedIdentifier(JdScriptQuerySqlParser.OrderedIdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link JdScriptQuerySqlParser#identifierCommentList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifierCommentList(JdScriptQuerySqlParser.IdentifierCommentListContext ctx);
	/**
	 * Visit a parse tree produced by {@link JdScriptQuerySqlParser#identifierComment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifierComment(JdScriptQuerySqlParser.IdentifierCommentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code tableName}
	 * labeled alternative in {@link JdScriptQuerySqlParser#relationPrimary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableName(JdScriptQuerySqlParser.TableNameContext ctx);
	/**
	 * Visit a parse tree produced by the {@code aliasedQuery}
	 * labeled alternative in {@link JdScriptQuerySqlParser#relationPrimary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAliasedQuery(JdScriptQuerySqlParser.AliasedQueryContext ctx);
	/**
	 * Visit a parse tree produced by the {@code aliasedRelation}
	 * labeled alternative in {@link JdScriptQuerySqlParser#relationPrimary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAliasedRelation(JdScriptQuerySqlParser.AliasedRelationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code inlineTableDefault2}
	 * labeled alternative in {@link JdScriptQuerySqlParser#relationPrimary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInlineTableDefault2(JdScriptQuerySqlParser.InlineTableDefault2Context ctx);
	/**
	 * Visit a parse tree produced by {@link JdScriptQuerySqlParser#inlineTable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInlineTable(JdScriptQuerySqlParser.InlineTableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code rowFormatSerde}
	 * labeled alternative in {@link JdScriptQuerySqlParser#rowFormat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRowFormatSerde(JdScriptQuerySqlParser.RowFormatSerdeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code rowFormatDelimited}
	 * labeled alternative in {@link JdScriptQuerySqlParser#rowFormat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRowFormatDelimited(JdScriptQuerySqlParser.RowFormatDelimitedContext ctx);
	/**
	 * Visit a parse tree produced by {@link JdScriptQuerySqlParser#tableIdentifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableIdentifier(JdScriptQuerySqlParser.TableIdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link JdScriptQuerySqlParser#namedExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNamedExpression(JdScriptQuerySqlParser.NamedExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JdScriptQuerySqlParser#namedExpressionSeq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNamedExpressionSeq(JdScriptQuerySqlParser.NamedExpressionSeqContext ctx);
	/**
	 * Visit a parse tree produced by {@link JdScriptQuerySqlParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(JdScriptQuerySqlParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code logicalNot}
	 * labeled alternative in {@link JdScriptQuerySqlParser#booleanExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalNot(JdScriptQuerySqlParser.LogicalNotContext ctx);
	/**
	 * Visit a parse tree produced by the {@code booleanDefault}
	 * labeled alternative in {@link JdScriptQuerySqlParser#booleanExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanDefault(JdScriptQuerySqlParser.BooleanDefaultContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exists}
	 * labeled alternative in {@link JdScriptQuerySqlParser#booleanExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExists(JdScriptQuerySqlParser.ExistsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code logicalBinary}
	 * labeled alternative in {@link JdScriptQuerySqlParser#booleanExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalBinary(JdScriptQuerySqlParser.LogicalBinaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link JdScriptQuerySqlParser#predicated}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPredicated(JdScriptQuerySqlParser.PredicatedContext ctx);
	/**
	 * Visit a parse tree produced by {@link JdScriptQuerySqlParser#predicate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPredicate(JdScriptQuerySqlParser.PredicateContext ctx);
	/**
	 * Visit a parse tree produced by the {@code valueExpressionDefault}
	 * labeled alternative in {@link JdScriptQuerySqlParser#valueExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValueExpressionDefault(JdScriptQuerySqlParser.ValueExpressionDefaultContext ctx);
	/**
	 * Visit a parse tree produced by the {@code comparison}
	 * labeled alternative in {@link JdScriptQuerySqlParser#valueExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparison(JdScriptQuerySqlParser.ComparisonContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arithmeticBinary}
	 * labeled alternative in {@link JdScriptQuerySqlParser#valueExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArithmeticBinary(JdScriptQuerySqlParser.ArithmeticBinaryContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arithmeticUnary}
	 * labeled alternative in {@link JdScriptQuerySqlParser#valueExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArithmeticUnary(JdScriptQuerySqlParser.ArithmeticUnaryContext ctx);
	/**
	 * Visit a parse tree produced by the {@code dereference}
	 * labeled alternative in {@link JdScriptQuerySqlParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDereference(JdScriptQuerySqlParser.DereferenceContext ctx);
	/**
	 * Visit a parse tree produced by the {@code simpleCase}
	 * labeled alternative in {@link JdScriptQuerySqlParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleCase(JdScriptQuerySqlParser.SimpleCaseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code cast}
	 * labeled alternative in {@link JdScriptQuerySqlParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCast(JdScriptQuerySqlParser.CastContext ctx);
	/**
	 * Visit a parse tree produced by the {@code constantDefault}
	 * labeled alternative in {@link JdScriptQuerySqlParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantDefault(JdScriptQuerySqlParser.ConstantDefaultContext ctx);
	/**
	 * Visit a parse tree produced by the {@code columnReference}
	 * labeled alternative in {@link JdScriptQuerySqlParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnReference(JdScriptQuerySqlParser.ColumnReferenceContext ctx);
	/**
	 * Visit a parse tree produced by the {@code rowConstructor}
	 * labeled alternative in {@link JdScriptQuerySqlParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRowConstructor(JdScriptQuerySqlParser.RowConstructorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parenthesizedExpression}
	 * labeled alternative in {@link JdScriptQuerySqlParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenthesizedExpression(JdScriptQuerySqlParser.ParenthesizedExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code star}
	 * labeled alternative in {@link JdScriptQuerySqlParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStar(JdScriptQuerySqlParser.StarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code subscript}
	 * labeled alternative in {@link JdScriptQuerySqlParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubscript(JdScriptQuerySqlParser.SubscriptContext ctx);
	/**
	 * Visit a parse tree produced by the {@code functionCall}
	 * labeled alternative in {@link JdScriptQuerySqlParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCall(JdScriptQuerySqlParser.FunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code searchedCase}
	 * labeled alternative in {@link JdScriptQuerySqlParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSearchedCase(JdScriptQuerySqlParser.SearchedCaseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code subqueryExpression}
	 * labeled alternative in {@link JdScriptQuerySqlParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubqueryExpression(JdScriptQuerySqlParser.SubqueryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code nullLiteral}
	 * labeled alternative in {@link JdScriptQuerySqlParser#constant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNullLiteral(JdScriptQuerySqlParser.NullLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code intervalLiteral}
	 * labeled alternative in {@link JdScriptQuerySqlParser#constant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntervalLiteral(JdScriptQuerySqlParser.IntervalLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code typeConstructor}
	 * labeled alternative in {@link JdScriptQuerySqlParser#constant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeConstructor(JdScriptQuerySqlParser.TypeConstructorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code numericLiteral}
	 * labeled alternative in {@link JdScriptQuerySqlParser#constant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumericLiteral(JdScriptQuerySqlParser.NumericLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code booleanLiteral}
	 * labeled alternative in {@link JdScriptQuerySqlParser#constant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanLiteral(JdScriptQuerySqlParser.BooleanLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stringLiteral}
	 * labeled alternative in {@link JdScriptQuerySqlParser#constant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringLiteral(JdScriptQuerySqlParser.StringLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link JdScriptQuerySqlParser#comparisonOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparisonOperator(JdScriptQuerySqlParser.ComparisonOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link JdScriptQuerySqlParser#arithmeticOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArithmeticOperator(JdScriptQuerySqlParser.ArithmeticOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link JdScriptQuerySqlParser#predicateOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPredicateOperator(JdScriptQuerySqlParser.PredicateOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link JdScriptQuerySqlParser#booleanValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanValue(JdScriptQuerySqlParser.BooleanValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link JdScriptQuerySqlParser#interval}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterval(JdScriptQuerySqlParser.IntervalContext ctx);
	/**
	 * Visit a parse tree produced by {@link JdScriptQuerySqlParser#intervalField}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntervalField(JdScriptQuerySqlParser.IntervalFieldContext ctx);
	/**
	 * Visit a parse tree produced by {@link JdScriptQuerySqlParser#intervalValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntervalValue(JdScriptQuerySqlParser.IntervalValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code complexDataType}
	 * labeled alternative in {@link JdScriptQuerySqlParser#dataType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComplexDataType(JdScriptQuerySqlParser.ComplexDataTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code primitiveDataType}
	 * labeled alternative in {@link JdScriptQuerySqlParser#dataType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimitiveDataType(JdScriptQuerySqlParser.PrimitiveDataTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link JdScriptQuerySqlParser#colTypeList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColTypeList(JdScriptQuerySqlParser.ColTypeListContext ctx);
	/**
	 * Visit a parse tree produced by {@link JdScriptQuerySqlParser#colType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColType(JdScriptQuerySqlParser.ColTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link JdScriptQuerySqlParser#whenClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhenClause(JdScriptQuerySqlParser.WhenClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link JdScriptQuerySqlParser#windows}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWindows(JdScriptQuerySqlParser.WindowsContext ctx);
	/**
	 * Visit a parse tree produced by {@link JdScriptQuerySqlParser#namedWindow}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNamedWindow(JdScriptQuerySqlParser.NamedWindowContext ctx);
	/**
	 * Visit a parse tree produced by the {@code windowRef}
	 * labeled alternative in {@link JdScriptQuerySqlParser#windowSpec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWindowRef(JdScriptQuerySqlParser.WindowRefContext ctx);
	/**
	 * Visit a parse tree produced by the {@code windowDef}
	 * labeled alternative in {@link JdScriptQuerySqlParser#windowSpec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWindowDef(JdScriptQuerySqlParser.WindowDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link JdScriptQuerySqlParser#windowFrame}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWindowFrame(JdScriptQuerySqlParser.WindowFrameContext ctx);
	/**
	 * Visit a parse tree produced by {@link JdScriptQuerySqlParser#frameBound}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFrameBound(JdScriptQuerySqlParser.FrameBoundContext ctx);
	/**
	 * Visit a parse tree produced by {@link JdScriptQuerySqlParser#qualifiedName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQualifiedName(JdScriptQuerySqlParser.QualifiedNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link JdScriptQuerySqlParser#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(JdScriptQuerySqlParser.IdentifierContext ctx);
	/**
	 * Visit a parse tree produced by the {@code unquotedIdentifier}
	 * labeled alternative in {@link JdScriptQuerySqlParser#strictIdentifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnquotedIdentifier(JdScriptQuerySqlParser.UnquotedIdentifierContext ctx);
	/**
	 * Visit a parse tree produced by the {@code quotedIdentifierAlternative}
	 * labeled alternative in {@link JdScriptQuerySqlParser#strictIdentifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuotedIdentifierAlternative(JdScriptQuerySqlParser.QuotedIdentifierAlternativeContext ctx);
	/**
	 * Visit a parse tree produced by {@link JdScriptQuerySqlParser#quotedIdentifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuotedIdentifier(JdScriptQuerySqlParser.QuotedIdentifierContext ctx);
	/**
	 * Visit a parse tree produced by the {@code decimalLiteral}
	 * labeled alternative in {@link JdScriptQuerySqlParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecimalLiteral(JdScriptQuerySqlParser.DecimalLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code scientificDecimalLiteral}
	 * labeled alternative in {@link JdScriptQuerySqlParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScientificDecimalLiteral(JdScriptQuerySqlParser.ScientificDecimalLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code integerLiteral}
	 * labeled alternative in {@link JdScriptQuerySqlParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntegerLiteral(JdScriptQuerySqlParser.IntegerLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code bigIntLiteral}
	 * labeled alternative in {@link JdScriptQuerySqlParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBigIntLiteral(JdScriptQuerySqlParser.BigIntLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code smallIntLiteral}
	 * labeled alternative in {@link JdScriptQuerySqlParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSmallIntLiteral(JdScriptQuerySqlParser.SmallIntLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code tinyIntLiteral}
	 * labeled alternative in {@link JdScriptQuerySqlParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTinyIntLiteral(JdScriptQuerySqlParser.TinyIntLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code doubleLiteral}
	 * labeled alternative in {@link JdScriptQuerySqlParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoubleLiteral(JdScriptQuerySqlParser.DoubleLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link JdScriptQuerySqlParser#nonReserved}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNonReserved(JdScriptQuerySqlParser.NonReservedContext ctx);
}