-- Create table product
create table product (
    id varchar(255) not null primary key,
    name varchar(50) not null,
    description varchar(300),
    price numeric(18, 2)
);

-- Inserção de dados fictícios
insert into product (id, name, description, price) values
(UUID(), 'Camiseta Básica', 'Camiseta de algodão confortável e leve', 49.90),
(UUID(), 'Calça Jeans Slim', 'Calça jeans azul escuro com modelagem slim', 139.90),
(UUID(), 'Tênis Esportivo', 'Tênis ideal para corrida e caminhada', 299.00),
(UUID(), 'Jaqueta Couro Sintético', 'Jaqueta estilosa com acabamento premium', 249.90),
(UUID(), 'Relógio Digital', 'Relógio resistente à água com cronômetro', 199.50),
(UUID(), 'Fone de Ouvido Bluetooth', 'Som de alta qualidade e bateria duradoura', 159.00),
(UUID(), 'Mochila Executiva', 'Mochila com compartimento para notebook', 189.90),
(UUID(), 'Boné Preto', 'Boné ajustável com logo bordado', 59.90),
(UUID(), 'Óculos de Sol', 'Óculos polarizado com proteção UV400', 129.00),
(UUID(), 'Camisa Polo', 'Camisa polo clássica de algodão', 89.90),
(UUID(), 'Chinelo Confort', 'Chinelo anatômico super leve', 39.90),
(UUID(), 'Smartwatch Fit', 'Relógio inteligente com monitor cardíaco', 349.90),
(UUID(), 'Cinto de Couro', 'Cinto masculino de couro legítimo', 79.90),
(UUID(), 'Bolsa Feminina', 'Bolsa de ombro em couro ecológico', 229.00),
(UUID(), 'Headset Gamer', 'Headset com microfone e som surround 7.1', 399.00),
(UUID(), 'Mouse Sem Fio', 'Mouse ergonômico com sensor óptico', 89.00),
(UUID(), 'Teclado Mecânico', 'Teclado com switches azuis e RGB', 449.00),
(UUID(), 'Pendrive 64GB', 'Pendrive USB 3.0 de alta velocidade', 59.90),
(UUID(), 'Câmera de Ação', 'Câmera compacta à prova d’água 4K', 499.00),
(UUID(), 'Carregador Portátil', 'Power bank de 10.000 mAh com 2 saídas USB', 139.90);