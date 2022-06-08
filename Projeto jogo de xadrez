(1: Primeira classe: Posição)

 Posição de classe [público]
 Tópicos de POO:
o Encapsulamento
o Construtores
o ToString (objeto / substituindo

(2: omeçando a implementar Board and Piece)

 Peça de Aulas, Tabuleiro [público]
 Tópicos de POO:
o Associações
o Encapsulamento / Modificadores de Acesso
 Tópicos de Estruturas de Dados:
o Matriz

( 3: Camada de xadrez e impressão do tabuleiro)
8 - - - - - - - -
7 - - - - - - - -
6 - - - - - - - -
5 - - - - - - - -
4 - - - - - - - -
3 - - - - - - - -
2 - - - - - - - -
1 - - - - - - - -
 a b c d e f g h

 Métodos: Tabuleiro.Peça(linha, coluna) e Tabuleiro.Peça(posição)
 Enum Chess.Color
 Classe Chess.ChessPiece [público]
 Classe Chess.ChessMatch [público]
 Classe ChessConsole.UI
 Tópicos de POO:
o Enumerações
o Encapsulamento / Modificadores de Acesso
o Herança
o Downcasting
o Membros estáticos
o Padrão de camadas
 Tópicos de Estruturas de Dados:
o Matriz

 (4: Colocando peças no tabuleiro )
Lista de controle:
 Método: Board.PlacePiece(peça, posição)
 Classes: Torre, Rei [público]
 Método: ChessMatch.InitialSetup
 Tópicos de POO:
o Herança
o Substituição
o Polimorfismo (ToString)



( 5: Exceção de placa e programação defensiva)

 Classe BoardException [public]
 Métodos: Board.PositionExists, Board.ThereIsAPiece
 Implementar programação defensiva nos métodos do Board
 Tópicos de POO:
o Exceções
o Construtores (uma string deve ser informada para a exceção)



(6: Exceção de Xadrez e Posição de Xadrez)

 Classe ChessException [public]
 Class ChessPosition [public]
 Refatorar ChessMatch.InitialSetup
 Tópicos de POO:
o Exceções
o Encapsulamento
o Construtores (uma string deve ser informada para a exceção)
o Substituição
o Membros estáticos
o Padrão de camadas


(7: Pouca melhoria na impressão do cartão)
Cor no terminal:
 Windows: Git Bash
 Mac: Google "cor do terminal osx"
Lista de controle:
 Coloque mais peças no tabuleiro
 Distinguir as cores das peças no método UI.PrintPiece


(8:Tratamento de exceções e tela de limpeza)
Limpar tela usando Java:
// https://stackoverflow.com/questions/2979383/java-clear-the-console
public static void clearScreen() {
 System.out.print("\033[H\033[2J");
 System.out.flush();
}
Lista de controle:
 ChessException
 InputMismatchException



Lista de controle:
 Métodos em Peça:
o Possíveis Movimentos [resumo]
o Possível Mover
o IsThereAnyPossibleMove
 Implementação básica de PossibleMove para Rook e King
 Atualizar ChessMatch.ValidadeSourcePosition
 Tópicos de POO:
o Método/classe abstrata
o Exceções


(9: Implementando possíveis movimentos de Rook )

 Método ChessPiece.IsThereOpponentPiece(posição) [protegido]
 Implementar Rook.PossibleMoves
 Método ChessMatch.ValidateTargetPosition
 Tópicos de POO:
o Polimorfismo
o Modificadores de encapsulamento/acesso [protegidos]
o Exceções


Imprimindo movimentos possíveis
Lista de controle:
 Método ChessMatch.PossibleMoves
 Método UI.PrintBoard [sobrecarga]
 Refatorar a lógica do programa principal
 Tópicos de POO:
o Sobrecarga


Implementando possíveis movimentos de King
Lista de controle:
 Método King.CanMove(posição) [privado]
 Implementar King.PossibleMoves
 Tópicos de POO:
o Encapsulamento
o Polimorfismo

(10: Trocando de jogador a cada turno)
Lista de controle:
 Classe ChessMatch:
o Propriedades Turn, CurrentPlayer [conjunto privado]
o Método NextTurn [privado]
o Atualizar PerformChessMove
o Atualizar ValidadeSourcePosition
 Método UI.PrintMatch
 Tópicos de POO:
o Encapsulamento
o Exceções


Manipulação de peças capturadas
Lista de controle:
 Método UI.PrintCapturedPieces
 Atualizar UI.PrintMatch
 Atualizar a lógica do programa
 Listas no ChessMatch: _piecesOnTheBoard, _capturedPieces
o Atualizar construtor
o Atualizar PlaceNewPiece
o Atualizar MakeMove
 Tópicos de POO:
o Encapsulamento
o Construtores
 Tópicos de Estruturas de Dados:
o Lista


Verifique a lógica
Regras:
 Check significa que seu rei está ameaçado por pelo menos uma peça adversária
 Você não pode se colocar em cheque
Lista de controle:
 Propriedade ChessPiece.ChessPosition [get]
 Classe ChessMatch:
o Método UndoMove
o Verificação de propriedade [conjunto privado]
o Oponente do método [privado]
o Método King(color) [privado]
o Método TestCheck
o Atualizar PerformChessMove
 Atualizar UI.PrintMatch

(11: Lógica de xeque-mate)
Lista de controle:
 Classe ChessMatch:
o Propriedade Checkmate [conjunto privado]
o Método TestCheckmate [privado]
o Atualizar PerformChessMove
 Atualizar UI.PrintMatch
 Atualizar a lógica do programa


Contagem de movimento de peças
Lista de controle:
 Peça de Xadrez da Classe:
o Propriedade MoveCount [conjunto privado]
o Método IncreaseMoveCount [interno]
o Método DecreaseMoveCount [interno]
 Classe ChessMatch:
o Atualizar MakeMove
o Atualizar UndoMove
 Tópicos de POO:
o Encapsulamento

Penhor
Lista de controle:
 Peão de classe
 Atualizar ChessMatch.InitialSetup
 Tópicos de POO:
o Encapsulamento
o Herança
o Polimorfismo

Bispo
Lista de controle:
 Bispo de classe
 Atualizar ChessMatch.InitialSetup
 Tópicos de POO:
o Encapsulamento
o Herança
o Polimorfismo
Cavaleiro
Lista de controle:
 Classe Cavaleiro
 Atualizar ChessMatch.InitialSetup
 Tópicos de POO:
o Encapsulamento
o Herança
o Polimorfismo

Rainha
Lista de controle:
 Classe Rainha
 Atualizar ChessMatch.InitialSetup
 Tópicos de POO:
o Encapsulamento
o Herança
o Polimorfismo


(Movimento especial - Roque)
Lista de controle:
 Atualizar Rei
 Atualizar ChessMatch.MakeMove
 Atualizar ChessMatch.UndoMove


( Movimento especial - En Passant )
Lista de controle:
 Registre um peão que pode ser capturado por en passant no próximo turno
o Propriedade ChessMatch.EnPassantVulnerable
o Atualizar ChessMatch.PerformChessMove
 Atualizar Pawn.PossibleMoves
 Atualizar ChessMatch.MakeMove
 Atualizar ChessMatch.UndoMove
 Atualizar ChessMatch.InitialSetup


( Movimento especial - Promoção )
Lista de controle:
 Propriedade ChessMatch.Promovido
 Atualizar ChessMatch.PerformChessMove
 Método ChessMatch.ReplacePromotedPiece
 Atualizar a lógica do programa
