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

### 프로세스 (jenkins 빌드 시 update)
```
stages{
	stage('Update Chart Image) {
		steps {
			build job: 'CLEANCODE-DEV/UPDATE_CHART_IMAGE', wait: true, propagate: true, parameters: [
				string(name: 'APP', value: "cleancode-mongo-management"),
				string(name: 'IMAGE', value: "${HARBOR_PROJECT}/${IMAGE_NAME}"),
				string(name: 'TAG', value: "${scmVars.GIT_COMMIT}")
			]
		}
	}
}
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