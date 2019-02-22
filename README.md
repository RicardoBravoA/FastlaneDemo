# Fastlane First Steps

Primeros pasos para instalar y utilizar **fastlane**

## Instalación (Mac OS)
- <kbd>xcode-select --install</kbd>
- | ********** RubyGems *********** | &nbsp;********** Homebrew *********** |<br>
 | :-------------------------------: | :--------------------------------: |<br>
| &nbsp;&nbsp;&nbsp;&nbsp;<kbd>sudo gem install fastlane -NV</kbd>&nbsp;&nbsp;&nbsp;&nbsp; | &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<kbd>brew cask install fastlane</kbd>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; | 
- Agregar estas líneas en el archivo .profile<br>
		<kbd>export LC_ALL=en_US.UTF-8<br>
		export LANG=en_US.UTF-8</kbd>
	> Sólo si aparece un mensaje sobre *UTF-8*
- Ejecutar <kbd>fastlane init</kbd>	para inicializar *fastlane*
- Escribir el *package name* del proyecto
- Si no se tiene el archivo de configuración de Google Play, solo omitir el paso presionando *enter* y *n*
	
## Uso

Los comandos que se utilizarán son:
- <kbd>fastlane test</kbd>
	> Para ejecutar los tests del proyecto
- <kbd>fastlane release</kbd>
	> Para generar un *APK* en modo *release*
- Coming soon!
				
