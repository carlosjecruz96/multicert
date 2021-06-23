# multicert

Endpoint para listar clientes
curl -X GET \
http://18.133.188.48:8080/pessoas



Endpoint para adicionar clientes
curl -X POST \
-d '{"nome": "carlos cruz","nif": 123456785, "morada": "rua xxx","telefone": 912345678}' \
http://18.133.188.48:8080/pessoas



Endpoint para apagar clientes
curl -X DELETE \
http://18.133.188.48:8080/pessoas?id=1 -> RequestParam("id") (User ID)



Endpoint para obter cliente a partir do nif clientes
curl -X GET \
http://18.133.188.48:8080/pessoas/nif?nif=123456785 -> RequestParam("nif") (User nif)


Endpoint para  obter clientes com um determinado nome
curl -X GET \
http://18.133.188.48:8080/pessoas/nome?nome=cruz  -> RequestParam("nome") (User nome)


