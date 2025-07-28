# 📱 Android MVVM Architecture Sample

Um projeto de exemplo Android moderno usando a arquitetura **MVVM**, com **Jetpack Compose**, **Room** para persistência local e **Hilt** para injeção de dependência. Ideal para aprendizado, referência ou como base para novos apps.

---

## ✨ Tecnologias Utilizadas

- **Kotlin**
- **Jetpack Compose** – UI moderna declarativa
- **Room** – Persistência local (SQLite)
- **ViewModel** – Gerenciamento de estado
- **Hilt** – Injeção de dependência
- **StateFlow** – Fluxo de dados reativo
- **Navigation-Compose** – Navegação entre telas

---

## 📱 Funcionalidades

- Adicionar itens (notas, tarefas, etc.)
- Editar itens existentes
- Excluir itens
- Listar todos os itens salvos
- Interface responsiva com Jetpack Compose
---
---

## 🚀 Como Rodar

1. Clone o repositório:
   ```bash
   git clone https://github.com/seu-usuario/Android-MVVM-Architecture-Sample.git

2. Abra no Android Studio.

3. Conecte um emulador ou dispositivo físico.

4. Clique em Run ▶️.


## 🧱 Arquitetura

Este projeto segue o padrão **MVVM (Model - View - ViewModel)** com separação em camadas claras:
- presentation/
- ├── view/ # Telas (Compose)
- ├── viewmodel/ # ViewModels
- domain/
- ├── model/ # Modelos (data class)
- ├── repository/ # Interfaces de repositório
- data/
- ├── local/ # Room DAO e Database
- ├── repository/ # Implementação do repositório
- di/ # Módulos do Hilt

🧠 Aprendizados
Este projeto demonstra:

- Como aplicar o padrão MVVM em projetos Android modernos

- Como usar Room para persistência local

- Como implementar injeção de dependência com Hilt

- Como estruturar um app com camadas limpas e reutilizáveis

- Como criar interfaces com Jetpack Compose

🤝 Contribuição
Contribuições são bem-vindas! Sinta-se à vontade para abrir issues ou enviar pull requests.

🧑‍💻 Autor
Roni-Macedo
