airframe-http-plugin-repro
====

```
$ sbt clean compile
...
2020-08-19 02:50:46.309+0900 debug [HttpClientGenerator] HttpClientGeneratorConfig(com.github.takezoe.api,wvlet.airframe.http.codegen.client.SyncClient$@bf71cec,com.github.takezoe.api)  - (HttpClientGenerator.scala:124)
2020-08-19 02:50:46.395+0900 debug [RouteScanner] Found an Airframe RPC interface: com.github.takezoe.api.impl.HelloApiImpl  - (RouteScanner.scala:79)
2020-08-19 02:50:46.405+0900 debug [RouteScanner] Found an Airframe RPC interface: com.github.takezoe.api.HelloApi  - (RouteScanner.scala:79)
2020-08-19 02:50:46.423+0900  warn [HttpClientGenerator] 
java.lang.IllegalArgumentException: Found multiple matching routes: /com.github.takezoe.api.HelloApi/hello 
        at wvlet.airframe.http.router.RouteMatcher$FastRouteMatcher.$anonfun$new$2(RouteMatcher.scala:74)
        at wvlet.airframe.http.router.RouteMatcher$FastRouteMatcher.$anonfun$new$2$adapted(RouteMatcher.scala:71)
        at scala.collection.immutable.List.foreach(List.scala:392)
        at wvlet.airframe.http.router.RouteMatcher$FastRouteMatcher.<init>(RouteMatcher.scala:71)
        at wvlet.airframe.http.router.RouteMatcher$RouteMatcherByHttpMethodTypes.$anonfun$routesByMethod$3(RouteMatcher.scala:54)
  | => cat scala.collection.TraversableLike$WithFilter.$anonfun$map$2(TraversableLike.scala:862)
        at scala.collection.immutable.Map$Map1.foreach(Map.scala:154)
        at scala.collection.TraversableLike$WithFilter.map(TraversableLike.scala:861)
        at wvlet.airframe.http.router.RouteMatcher$RouteMatcherByHttpMethodTypes.<init>(RouteMatcher.scala:53)
        at wvlet.airframe.http.router.RouteMatcher$.build(RouteMatcher.scala:45)
        at wvlet.airframe.http.Router.routeMatcher$lzycompute(Router.scala:82)
        at wvlet.airframe.http.Router.routeMatcher(Router.scala:82)
        at wvlet.airframe.http.Router.verifyRoutes(Router.scala:90)
        at wvlet.airframe.http.codegen.RouteScanner$.buildRouter(RouteScanner.scala:87)
        at wvlet.airframe.http.codegen.RouteScanner$.$anonfun$buildRouter$1(RouteScanner.scala:61)
        at wvlet.airframe.http.codegen.RouteScanner$.withClassLoader(RouteScanner.scala:36)
        at wvlet.airframe.http.codegen.RouteScanner$.buildRouter(RouteScanner.scala:51)
        at wvlet.airframe.http.codegen.HttpClientGenerator.$anonfun$generate$2(HttpClientGenerator.scala:131)
        at scala.collection.TraversableLike.$anonfun$map$1(TraversableLike.scala:273)
        at scala.collection.immutable.List.foreach(List.scala:392)
        at scala.collection.TraversableLike.map(TraversableLike.scala:273)
        at scala.collection.TraversableLike.map$(TraversableLike.scala:266)
        at scala.collection.immutable.List.map(List.scala:298)
        at wvlet.airframe.http.codegen.HttpClientGenerator.generate(HttpClientGenerator.scala:122)
        at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
        at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
        at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
        at java.lang.reflect.Method.invoke(Method.java:498)
        at wvlet.airframe.surface.reflect.ReflectMethodSurface.call(ReflectMethodSurface.scala:47)
        at wvlet.airframe.launcher.CommandLauncher.$anonfun$execute$8(Launcher.scala:372)
        at scala.Option.map(Option.scala:230)
        at wvlet.airframe.launcher.CommandLauncher.execute(Launcher.scala:370)
        at wvlet.airframe.launcher.CommandLauncher.execute(Launcher.scala:336)
        at wvlet.airframe.launcher.Launcher.execute(Launcher.scala:160)
        at wvlet.airframe.http.codegen.HttpClientGenerator$.main(HttpClientGenerator.scala:85)  - (HttpClientGenerator.scala:150)
```