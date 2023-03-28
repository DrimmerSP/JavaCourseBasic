### Error on Windows

```
Running pre-create checks...
Error wirh pre-create check: "Hyper-V is installed. VirtualBox won't boot a 64bits VM when Hyper-V is activated. It it's installed but deactivated, you can use --virtualbox-no-vtx-check to try anyways"
Look like something went wrong in step 'Checking if machine default exists'...
Press any key to continue...
```
<br/>

**Возможные варианты фикса:**


1. Hyper-V и VirtualBox конфиликтуют друг с другом. Можно удалить Hyper-V или запустить следующую команду:

```docker-machine create -d virtualbox --virtualbox-no-vtx-check test```


2. По пути где установлени Docker (C:\\Program Files\\Docker Toolbox или куда установили) найти файл `start.sh`. Далее в файле необходимо найти строку связанную с VirtualBox строка будет начинаться с `"${DOCKER_MACHINE}"`, необходимо заменить содержание строки на:

`"${DOCKER_MACHINE}" create -d virtualbox --virtualbox-no-vtx-check $PROXY_ENV "${VM}"`

**Далее необходимо повторно запустить процесс установки.**
