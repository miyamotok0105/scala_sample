package com.github.kimutansk.akka.exercise

import akka.actor.{ActorSystem, Props}

/**
 * Akka Actor用のHello World起動クラス
 *
 * @author kimutansk
 */
object HelloWorldApp extends App {
  override def main(args: Array[String]): Unit = {
    val system = ActorSystem.apply("HelloWorldApp") // AkkaActorSystemを生成
    val helloWorldActor = system.actorOf(Props.apply[HelloWorldActor], "HelloWorldActor") // 空設定でHelloWorldActorを生成

    helloWorldActor ! """Test1""" // HelloWorldActorに"Test1"というメッセージを渡す
    helloWorldActor ! """Test2""" // HelloWorldActorに"Test2"というメッセージを渡す

    system.shutdown()  // AkkaActorSystemを終了
  }
}