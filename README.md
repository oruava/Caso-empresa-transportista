# Caso-empresa-transportista

# Integrantes
- Arturo Avalos
- Lian Canio
- Sebastian Llanos
## Notas: 
- En la etapa de integración del taller, se hizo omisión a ciertos métodos que están descritos en el diagrama de clases. Estos son:
	- Clase Producto: SE OMITIÓ GETTER Y SETTER.
	- Clase Flete: SE OMITIÓ GETTER Y SETTER.
	- Clase Empresa: SE OMITIÓ GETTER Y SETTER. (operation() está demás)
	- Clase Sucursal: SE OMITIÓ GETTER Y SETTER.
	- Clase Camion: SE OMITIÓ SETTER. (a excepción de setEstado())

-  Adicionalmente se agregaron los siguientes métodos que no estaban anteriormente en el diagrama, que son:
   - Clase Pack: agregarProducto(), quitarProducto(), getProducto().
   - Clase Flete: agregarPack(), getPacks(), quitarPack(), calcularValorTotal().
   - Clase Empresa: agregarSucursal().
   - Clase Sucursal: agregarCamion(), quitarCamion().

- En este caso, no se desarrollaron pruebas unitarias.
