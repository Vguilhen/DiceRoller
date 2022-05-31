# DICE ROLLER APP - Android Kotlin 🎲

## APP Capaz de rolar um dado de 6 lados - Um projeto de estudos baseado no "DiceRoller" do "Android Developers"
---
## 📱 Projeto

> O app gera um dado de 6 faces capaz de mostrar resultados aleatórios atualizando a imagem com a face correta, conforme imagens abaixo:

![image](https://user-images.githubusercontent.com/89861753/171263060-aa5ff410-b2b1-4530-832a-de91828c1515.png)

![image](https://user-images.githubusercontent.com/89861753/171262780-7b6d09f1-6f94-4b62-8e3e-fbdc924cd4a3.png)
![image](https://user-images.githubusercontent.com/89861753/171262791-2e93ce81-647d-41be-80de-730e3ba9ceb5.png)

> Para este projeto de estudos foi utilizada apenas uma **Activity** principal, um **botão**, uma **imageView** e uma **Text View**. Após clicar no botão **ROLL** uma função roll() gera números aleatórios de 1 a 6, através de uma condicional when a ImageView é atualizada na Activity principal, bem como a TextView e o contentDescription.

> Optei por implementar a vinculação de visualização ou **ViewBinding**.<p> Os textos do xml foram extraídos para o arquivo de **strings.xml**.<p> O arquivo de texto utiliza formatação externa proveniente do arquivo **styles.xml**.<p> O arquivo foi organizado utilizando **ConstraintLayout**. 

## 💻 Tecnologias Utilizadas durante o aprendizado:

- xml: Sintaxe Básica;
- Kotlin: Sintaxe Básica;
- Aplicação do conceito de classe, Objeto e Instância com Kotlin;
- Organização da activity utilizando Constraint Layout;
- ViewBinding - implementação da vinculação de visualização seguindo as boas práticas;
- Criação de um botão com função de gerar números aleatórios de 1 a 6;
- Utilização de Loop When para atualização da Activity e da TextView conforme número aleatório gerado;
- Extração dos textos das activities para o arquivo de strings.xml e utilização de formatações externas no arquivo styles.xml conforme recomendação de boas práticas;
