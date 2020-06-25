# modular-jna
Temporary testing.

# Install

* https://github.com/michab66/maven-jlink-plugin
* https://github.com/michab66/maven-jmod-plugin

Download repo, execute 'mvn install' for both.

# Prepare .module packages
Perform 'mvn install' in CreateModular*

# Big Time
Execute 'mvn clean package' in the .../maven-jlink-example dir.

# Execute result
`cd thejar`

`target/maven-jlink/bin/java -m thejar/biz.dsuk.jar.Main`



