### Helm 설치
```
#명령어 다운
https://get.helm.sh/helm-v3.14.1-windows-amd64.zip

#압축해제 후 환경변수에 helm.exe 파일의 경로 추가
```

### 배포
```
helm upgrade -- install {name} - {namespace} -f values.yaml
```

### 삭제
```
heml delete {name} -n {namespace}
```

## parameters

### common parameters
|Name				|Description		|Value	|
|---				|---				|---	|
|`imagePullSecrets`	|Image pull secret	|`[]`	|
|`secrets`			|공용 secrets		|`[]`	|
|`configmaps`		|공용 configmaps		|`[]`	|

### backend parameter

### batch dscloud parameter
|Name						|Description				|Value				|
|---						|---						|---				|
|`batchCleancode.enable`	|배포 여부						|`true`				|
|`batchCleancode.name`		|리소스 이름 					|`batch-cleancdoe	|