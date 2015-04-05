# Gradleの勉強

[gradle java plugin]: http://gradle.monochromeroad.com/docs/userguide/java_plugin.html

## 本リポジトリの目的

個人的なGradleの勉強を目的としています。

### ゴール

下記に列挙された内容を含むプロダクトの開発を即時に始めることが可能な状態にする。

* Javaアプリケーション(Java + Selenium)
* 単体テスト(jUnit)
* IDE開発(Eclipse)

## 実行方法

Gradleのインストールなど事前作業を必要としないように、***Gradle Wrapper***による実行方法を記載している。

※ 他のGradleタスクは[こちら][gradle java plugin]を参照。

### アプリケーションを実行する

Gradleから直接アプリケーションを起動する。

```sh
$ ./gradlew run

# 下記のようにタスクを複数実行することも可能
$ ./gradlew clean run
```

### アプリケーションの実行ファイルを生成する。

実行ライブラリとOS依存スクリプトを含んだディストリビューションファイルを生成する。

```sh
$ ./gradlew build

$ cd build/distributions/
$ unzip study_gradle.zip
$ ./study_gradle/bin/study_gradle # Windowsの場合は~.batを実行
```


zipやtarファイルを個別に出力したい場合は下記コマンドを実行。
```sh
$ ./gradlew distZip # or distTar

```

### Javadocの生成

ビルドディレクトリ(build/docs/javadoc)にAPIドキュメントを生成する。

```sh
$ ./gradlew javadoc
```

### ビルドディレクトリの削除

プロジェクトのビルドディレクトリ(./build)を削除する。

```sh
$ ./gradlew clean
```
