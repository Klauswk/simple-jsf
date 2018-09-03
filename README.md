## Simple JSF Example

This system uses wildfly 8.x as application server.

Add 
```
<deployment-scanner scan-interval="5000" relative-to="jboss.server.base.dir"
   path="deployments" auto-deploy-zipped="true" auto-deploy-exploded="false"/>
```

To your `standalone.xml` config to active hotdeploy.

Also, add into `WEB-INF` a empty `beans.xml` or else it won't start the WELD-CDI module.

