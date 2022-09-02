# AWS Lambda を Java で開発する最小？構成

## ファイル構造

基本的なものだけ載せます

- `gradle, gradlew など` : ビルド関連のファイル群
- `lib/src/main/java` : Java package を配置する空間
- `Dockerfile` : AWS Lambda が配布しているベースイメージを改造したもの

## 実行方法

1. ビルド

```
$ ./gradlew build
```

2. Dockerのコンテナイメージ作成

```
$ docker build -t byjavatest .
$ docker run -p 9000:8080 byjavatest:latest
```

3. テスト実行用のリクエスト

```
$ curl -XPOST "http://localhost:9000/2015-03-31/functions/function/invocations" -d '{"value":"42"}'
> {"message":"equal!"} // return の例
```
