## The Main class
 
The `PekkoQuickstart` object in Hello World creates an `ActorSystem` with a guardian. 
The guardian is the top level actor that bootstraps your application. The guardian
is typically defined with `Behaviors.setup` that contains the initial bootstrap.
 
@@snip [PekkoQuickstart.scala](/src/main/g8/src/main/scala/$package$/PekkoQuickstart.scala) { #main-class }
 
