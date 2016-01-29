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
package net.saga.demo.connect.ai.client.network.test;

import net.saga.demo.connect.ai.client.game.Game;
import net.saga.demo.connect.ai.client.network.Connection;
import static org.junit.Assert.assertEquals;
import org.junit.Test;


public class ConnectionTest {
    
    public ConnectionTest() {
    }

    @Test
    /**
     * Tests that a connection is made by checking for the userName being set.
     */
    public void testConnect() {
        Connection connection = Connection.connect("Test Name");
        assertEquals("test_name", connection.getUserName());
    }
    
    @Test
    /**
     * Tests that a connection has been made and a game returned.  The Game should have a board and two connected players.
     */
    public void connectToGame() {
        Connection connection = Connection.connect("Test Local");
        Game game = connection.startGame();
        assertEquals("Test Local", game.getLocalName() );
        assertEquals("Test Remote", game.getRemoteName() );
    }
    
}
