/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chess_game;

import chess_game.Pieces.Coordinate;
import chess_game.Pieces.Piece;

/**
 *
 * @author Enes Kızılcın <nazifenes.kizilcin@stu.fsm.edu.tr>
 */
public class Tile {

    private Piece piece;
    private Coordinate coordinate;

    public Tile(Coordinate coordinate, Piece piece) 
    {
        this.setPiece(piece);
        this.setCoordinate(coordinate);
    }
    public Piece getPiece() {
        
        return this.piece;
    }
    public void setPiece(Piece p) 
    {    
        this.piece = p;
    }
    public Coordinate getCoordinate() {
        
        return this.coordinate;
    }
    
    public void setCoordinate(int x , int y) 
    {
        this.coordinate.setX(x);
        this.coordinate.setY(y);
    }
    public void setCoordinate(Coordinate coordinate)
    {
        this.coordinate = coordinate;
    }
    public boolean hasPiece()
    {
        return this.piece == null;
    }
}
