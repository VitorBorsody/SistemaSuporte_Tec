public class System {
    Node first;
    Node last;

    public void AdicionarChamado(Client client) {
        Node newNode = new Node(client);
        if (first == null) {
            first = newNode;
        } else {
            last.next = newNode;
        }
        last = newNode;
    }
    public void dequeue(){
        if(first==null){
            java.lang.System.out.println("Não há ninguém na fila");
        }
        else {
            Client removedClient=first.client;

            java.lang.System.out.println("Cliente que acabou de sair da fila: " + removedClient.getName());
            first=first.next;

            if(first!=null){
                Client client = first.client;
                java.lang.System.out.println("Próximo cliente que será atendido: " + first.client.getName());
                java.lang.System.out.println("Data e hora de saída: " + first.client.getFormatted());
                java.lang.System.out.println();
            }
            else {
                last=null;
                java.lang.System.out.println("Não há clientes na fila!!!");
            }

        }
    }
    public void displayInfo(){
        if(first==null){
            java.lang.System.out.println("Fila vazia");
        }
        else {
            Node temp = first;
            while(temp!=null){
                Client client = temp.client;
                java.lang.System.out.println("Nome de cliente: " + client.getName());
                java.lang.System.out.println("Horário de abertura do chamado: " + client.getFormatted());;
                java.lang.System.out.println("Número do chamado: " + client.getNum_chamado());
                temp = temp.next;

                java.lang.System.out.println(" ");


            }
        }
    }
    public void queueSize(){
        int i=0;
        Node temp = first;
        while(temp!=null){
            temp=temp.next;
            i++;
        }
        java.lang.System.out.println("Tamanho da fila: " + i);
    }
    public void isNull(){
        if(first==null){
            java.lang.System.out.println("Não há ninguém na fila!!!");
        }
        else {
            java.lang.System.out.println("Há pessoas na fila!");
        }
    }
    public void RemoverChamadoEspecifico(int Chamado){
        if(first==null){
            java.lang.System.out.println("Neste momento não há ninguém na fila!!!");
        }
        else {
            Node temp = first;
            while(temp!=null){
                if(temp.client.getNum_chamado()==Chamado && temp.next!=null){
                    temp=temp.next;
                    java.lang.System.out.println("Próximo cliente da fila: " + temp.client.getName());
                    break;


                }
                if(temp.next==null){
                    java.lang.System.out.println("Não há próximos clientes!!!");
                    break;
                }
            }

        }

    }


    }

