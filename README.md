
# 環境


```
#インストール(macの場合)
brew install scala

#バージョン確認
scala --version
#Akkaのインストール(Akkaは並列・分散プログラミングのフレームワーク)
brew install akka

brew install sbt

sbt -version
```

ドワンゴ研修テキスト
https://scala-text.github.io/scala_text/

Scalaで並行処理#1
https://dev.classmethod.jp/articles/scala-actor/



# 基本：001basic1

### 001:hello world

    scala 001.scala

### 002:基本の型

    scala 002.scala

### 002:関数

    scala 002_3.scala

### 002:例外処理

    scala 002_4.scala


# akka

https://livebook.manning.com/book/akka-in-action/about-this-book/

https://ficus-forum.myvnc.com/t/topic/394

https://doc.akka.io/docs/akka/current/typed/guide/tutorial_1.html

https://kimutansk.hatenablog.com/entry/20140721/1405949716


# nlp001


    wget http://www.phontron.com/data/nlp-programming-data.zip
    unzip nlp-programming-data.zip
    rm nlp-programming-data.zip

    scala Count_Freq.scala nlp-programming/test/00-input.txt