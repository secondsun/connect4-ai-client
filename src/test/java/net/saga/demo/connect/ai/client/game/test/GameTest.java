/*
 * Copyright (C) 2016 summers.
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston,
 * MA 02110-1301  USA
 */
package net.saga.demo.connect.ai.client.game.test;

import net.saga.demo.connect.ai.client.game.Game;
import org.junit.Test;

/**
 *
 * @author summers
 */
public class GameTest {
    
    @Test
    public void testIsWon() {
        Game game = new Game();
        assertFalse(game.isWon());//initial Condition
        Move move1 = new Move(game.getLocalPlayer(), Game.Column1);//Create four plays in the first column
        Move move2 = new Move(game.getLocalPlayer(), Game.Column1);
        Move move3 = new Move(game.getLocalPlayer(), Game.Column1);
        Move move4 = new Move(game.getLocalPlayer(), Game.Column1);
        Move skip = new Move(game.getRemotePlayer(), Game.Skip);//Player two skips his turns
        
        game.addMove(move1);//play switching turns
        game.addMove(skip);
        game.addMove(move2);
        game.addMove(skip);
        game.addMove(move3);
        game.addMove(skip);
        game.addMove(move4);
        game.addMove(skip);
        
        assertTrue(game.isWon());//game should be won now.
    }
    
}
