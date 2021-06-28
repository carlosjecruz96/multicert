# multicert

Endpoint para listar clientes
curl -X GET \
http://3.8.89.109:8080/pessoas



Endpoint para adicionar clientes
curl -X POST \
-d '{"nome": "carlos cruz","nif": 123456785, "morada": "rua xxx","telefone": 912345678}' \
http://3.8.89.109:8080/pessoas



Endpoint para apagar clientes
curl -X DELETE \
http://3.8.89.109:8080/pessoas?id=1 -> RequestParam("id") (User ID)



Endpoint para obter cliente a partir do nif clientes
curl -X GET \
http://3.8.89.109:8080/pessoas/nif?nif=123456785 -> RequestParam("nif") (User nif)


Endpoint para  obter clientes com um determinado nome
curl -X GET \
http://3.8.89.109:8080/pessoas/nome?nome=cruz  -> RequestParam("nome") (User nome)


