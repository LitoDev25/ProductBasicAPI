# ProductBasicAPI
# Entendendo o Spring
>Essa aplicação api foi feita pra testar conhecimentos, tendo apenas o básico do básico.
>Aplicação rais roda em http://localhost:8080 (Padrão TomCat).

# Banco de dados usado
|- Banco de dados H2, usado apenas para testes( Não persiste os dados ).
|- Acesso ao console H2: http://localhost:8080/h2-console
|- JDBC URL: jdbc:h2:mem:products
|- User Name: sa
|- senha: 123456

# Requests
|- Store:   Post   => /products 
|- Show:    Get    => /products/:id 
|= Index:   Get    => /products 
|- Search:  Get    => /products/search?name 
|- Update:  Put    => /products/:id
|- Delete:  delete => /products|:id
