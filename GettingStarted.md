# Download #

The dependency is now available in Maven Central and may be added to your project with the following dependency:

```
<dependency>
    <groupId>com.lassitercg</groupId>
    <artifactId>jsf-sheet</artifactId>
    <version>1.0</version>
    <scope>compile</scope>
</dependency>
```

In addition to this dependency, you must add the latest Primefaces 4.0 dependency.

# Using the Component #
To use the component, add the following namespace to your .xhtml page:

```
xmlns:lcg="http://www.lassitercg.com/jsf"
```

The component can then be used in your page like so:

```
<lcg:sheet id="sheet" value="#{assets}" var="row" height="400" label="Sheet" 
  fixedCols="2" showRowHeaders="false" sortBy="#{row.assetId}" sortOrder="ascending" >
	            	
	<p:ajax listener="#{assetController.cellEditEvent}" />

	<f:facet name="header">
		<h:outputText value="Assets" />
	</f:facet>	            	

	<f:facet name="footer">
		<h:outputText value="#{assets.size()} Records" />						
	</f:facet>
					
	<lcg:column headerText="Assset Id" readonly="true" value="#{row.assetId}" sortBy="#{row.assetId}" colWidth="100" filterBy="#{row.assetId}" />
	<lcg:column headerText="Host Name" value="#{row.hostName}" colWidth="200" sortBy="#{row.hostName}" filterBy="#{row.hostName}" />
	<lcg:column headerText="Type" value="#{row.assetType}" readonly="true" colWidth="100" sortBy="#{row.assetType}" filterBy="#{row.assetType}" filterOptions="#{assetTypes}" />
	<lcg:column headerText="Platform" value="#{row.platform}" readonly="true" colWidth="100" sortBy="#{row.platform}" filterBy="#{row.platform}" filterOptions="#{platformTypes}" />
	<lcg:column headerText="Arch" value="#{row.platformArch}" readonly="true" colWidth="100" sortBy="#{row.platformArch}" filterBy="#{row.platformArch}" filterOptions="#{archTypes}" />
	<lcg:column headerText="Comments" value="#{row.comment}" colWidth="200" sortBy="#{row.comment}" />
	<lcg:column headerText="Updated" value="#{row.lastUpdated}" colWidth="150" sortBy="#{row.lastUpdated}">
		<f:convertDateTime type="both" />
	</lcg:column>
	<lcg:column headerText="Total" value="#{row.total}" readonly="true" colWidth="100" />
	<lcg:column headerText="Value 1" value="#{row.value1}" colWidth="100" />
	<lcg:column headerText="Value 2" value="#{row.value2}" colWidth="100" />
	<lcg:column headerText="Value 3" value="#{row.value3}" colWidth="100" />
	<lcg:column headerText="Value 4" value="#{row.value4}" colWidth="100" />
	<lcg:column headerText="Value 5" value="#{row.value5}" colWidth="100" />
	<lcg:column headerText="Value 6" value="#{row.value6}" colWidth="100" />
	<lcg:column headerText="Value 7" value="#{row.value7}" colWidth="100" />
	<lcg:column headerText="Value 8" value="#{row.value8}" colWidth="100" />
	<lcg:column headerText="Value 9" value="#{row.value9}" colWidth="100" />
	<lcg:column headerText="Value 10" value="#{row.value10}" colWidth="100" />
</lcg:sheet>	            
```

# Demo #
A showcase of the component can be found here:
http://server.brainhemorage.com/jsfdemo/demo.jsf


# Building from Source #
To build from source:

```
svn checkout https://jsf-sheet.googlecode.com/svn/trunk/ jsf-sheet 
cd jsf-sheet
mvn clean install
```