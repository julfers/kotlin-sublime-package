// SYNTAX TEST "Packages/User/kotlin-sublime-package/Kotlin.sublime-syntax"
package com.example
// <- keyword.other.kotlin
//      ^ entity.name.package.kotlin

class Outer {
// <- storage.type.class.kotlin
//    ^ entity.name.type.class.kotlin
  inner class Inner {}
  // <- storage.modifier.kotlin
  //    ^ storage.type.class.kotlin
  //          ^ entity.name.type.class.kotlin
  companion class Companion {}
  // <- storage.modifier.kotlin
  //        ^ storage.type.class.kotlin
  //              ^ entity.name.type.class.kotlin
}

companion class Companion {}
// <- invalid.illegal
//        ^ storage.type.class.kotlin
//              ^ entity.name.type.class.kotlin

inner class OutsideInner {}
// <- invalid.illegal
//    ^ storage.type.class.kotlin
//          ^ entity.name.type.class.kotlin
