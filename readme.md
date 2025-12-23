# Sistema de Gestão Empresarial
![alt text](imagem/image.png)
## Sobre

Este é um sistema gerado empresarial voltado para lojas que trabalham com sistema manual de caixa e atendimento, mas tem a separação de atendente e caixa. O sistema permite agilizar o processo de venda de produtos e ajudar na tomada de decisões da empresa.

## Funcionalidades 

Existem 3 atores diferentes com papeis diferentes no sistema.

### Atendente

- Pode cadastrar e visualizar vendas:
    - Vendas contém lista de produtos, preço total, nome do cliente e identificador único.
- Pode cadastrar, visualizar, alterar e realizar soft delete de clientes:
    - Cliente contém seus dados pessoais, dados de contato, endereço e "fiado".
- Pode cadastrar, visualizar, alterar e realizar soft delete de produtos:
    - Produtos contém seus dados básicos, preço de compra, preço de venda, valor minimo (valor minimo para venda que esteja entre o preço de compra e preço de venda, o usuário na venda pode dar desconto na venda entre a soma dos valores minimos e ovalor total da venda).
- Pode receber devolução de produto:
    - O atendente pode realizar o pedido de devolução que então se aprovado pelo atendente é indicado para o caixa.
- Atendentes especificos podem cadastrar e finalizar contas:
    - O atendente com permissão pode cadastrar uma conta e finaliza-la.

### Caixa

- Pode cadastrar, visualizar e finalizar vendas:
    - Além das funções de vendas do atendente o caixa tem a função de finalização da venda.
- Pode finalizar devolução:
    - Após a devolução confirmada pelo atendente o caixa finaliza a devolução ao cliente.

### Gerente
- Todas as funcionalidades dos dois atores anteriores.
- Pode visualizar as informações geradas no sistema com os dados das vendas, devoluções e contas.
- Pode criar, alterar e visualizar metas de vendas.

## Requisitos funcionais

[-] Gerenciamento de cadastros básicos 
    [-] CRUD de Clientes (Prioridade: Alta )
    [-] CRUD de Produtos (Prioridade: Alta)
    [-] CRUD de Funcionários (Prioridade: Alta)
[-] Módulo de Vendas:
    [-] Cadastro de vendas (Prioridade: Alta)
    [ ] Baixa automatica no estoque (Prioridade: Média)
    [ ] Devolução de produtos (Prioridade: Média)
    [ ] Emissão de comprovante não fiscal (Prioridade: Baixa)
    [ ] Pagamento creditos do cliente (fiado) (Prioridade: Baixa)
[ ] Relatórios:
    [ ] Lista de produtos com estoque baixo (Prioridade: Baixa)
    [ ] Indicativos e gráficos de vendas (Prioridade: Baixa)
    [ ] Indicativos e gráficos de gastos (Prioridade: Baixa)
    [ ] Criação, alteração e visualização de metas (Prioridade: Baixa)

Legenda: [ ] Não começado | [-] Começado, mas não finalizado | [X] Finalizado

### Prioridades dos requisitos funcionais no desenvolvimento

As funcionalidades mais importantes no sistema são as que irão realizar a agilização das atividades diarias do sistema para os usuários, também foi considerado a média as funcionalidades que impactam no cotidiano da empresa, mas, não são as funcionalidades mais usadas e por fim foram considerados como baixo as funcionalidades que transformam os dados em informações.


## Requisitos não funcionais

[-] Segurança:
    [ ] Autenticação e Autorização. (Prioridade: Médio )
        - O sistema deve pedir login e senha para CRUD de clientes e produtos, também deve pedir para acesso de funções administrativas.
        - O sistema deve pedir Pin do usuário para cadastrar venda e finalizar devolução.
    [-] Criptografia de dados sensiveis. (Prioridade: Alta)
        - O sistema deve criptografar dados sensiveis de clientes e funcionários.

[-] Auditabilidade:
    [-] Rastreabilidade. (Prioridade: Média)
        - O sistema deve demonstrar quem foi a ultima pessoa que realizou uma alteração em algum item das tabelas do sistema.
    [ ] Logs do sistema. (Prioridade: Baixa)
        - O sistema deve gerar logs tanto para erros quanto para ações criticas no sistema.

[ ] Disponibilidade e Confiabilidade: 
    [ ] Disponibilidade. (Prioridade: Alta)
        - O sistema deve permanecer disponível o tempo todo.
    [ ] Backup. (Prioridade: Baixa)
        - O sistema deve realizar backups automaticos diarios e deverá mandar backups semanais para nuvem. 
[ ] Desempenho
    [ ] Concorrência. (Prioridade: Alta)
        - Um atendente não deve ter que esperar outra pessoa terminar um atendimento.

[ ] Usabilidade
    [ ] Responsividade. (Prioridade: Alta)
        - O sistema deve se adaptar a diferentes tamanhos de tela, seja pequenas ou grandes.
    [ ] Facilidade de aprendizado. (Prioridade: Alta)
        - O sistema deve ser facil de se aprender como funciona o fluxo
    [ ] Clareza Visual. (Prioridade: Média)
        - O sistema deve ter a interface limpa para evitar colocar elementos desnecessários visando reduzir a carga cognitiva e otimizando o tempo de decisão do ator do sistema.

Legenda: [ ] Não começado | [-] Começado, mas não finalizado | [X] Finalizado

### Prioridades dos requisitos não funcionais no desenvolvimento

Foram considerados como prioridades altas os requisitos que impactam a estrutura dos dados no cotidiano, a disponibilidade do sistema e os requisitos relacionados a utilização do sistema pelos usuários, para a prioridade média foram considerados as funcionalidade que remetem a autenticação pois o sistema só será usado por funcionários, a rastreabilidade e a melhoria do design do sistema. Já a prioridade baixa foi escolhida para as funcionalidades não essenciais no dia a dia, mas que ainda assim devem estar no projeto.