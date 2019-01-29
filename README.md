# nb10-jpms-autocomplete-problem

Example project to show that in Netbeans 10.0 when using JPMS with Maven, auto-complete on test sources is limited to the scope of the module-info in the main sources.

Try:

* Typing "org." in FooTest.java will not display org.junit, but only show you the packages that are visible in the main sources. 
* Removing the imports of org.junit in FooTest.java and you'll see that "Fix Imports" can't add them back

When typing the imports manually the sources can be compiled and test successfully executes.
