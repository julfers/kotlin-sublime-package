// SYNTAX TEST "Packages/User/kotlin-sublime-package/Kotlin.sublime-syntax"
package com.example
// <- keyword.other.kotlin
//      ^ entity.name.package.kotlin

class Outer {
// <- storage.modifier.kotlin
//    ^ entity.name.type.class.kotlin
  inner class Inner {}
  // <- storage.modifier.kotlin
  //    ^ storage.modifier.kotlin
  //          ^ entity.name.type.class.kotlin
  companion class Companion {}
  // <- storage.modifier.kotlin
  //        ^ storage.modifier.kotlin
  //              ^ entity.name.type.class.kotlin
}

companion class Companion {}
// <- invalid.illegal
//        ^ storage.modifier.kotlin
//              ^ entity.name.type.class.kotlin

inner class OutsideInner {}
// <- invalid.illegal
//    ^ storage.modifier.kotlin
//          ^ entity.name.type.class.kotlin
