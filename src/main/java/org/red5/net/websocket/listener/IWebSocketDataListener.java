/*
 * RED5 Open Source Flash Server - http://code.google.com/p/red5/
 * 
 * Copyright 2006-2014 by respective authors (see below). All rights reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.red5.net.websocket.listener;

import org.apache.mina.core.buffer.IoBuffer;
import org.red5.net.websocket.WebSocketConnection;

/**
 * Listener for WebSocket events.
 */
public interface IWebSocketDataListener {
	
	/**
	 * @return path of the scope
	 */
	public String getPath();

	/**
	 * Dispatch message.
	 * 
	 * @param message
	 */
	public void onWSMessage(IoBuffer message);

	/**
	 * Connect a WebSocket client.
	 * 
	 * @param conn WebSocketConnection
	 */
	public void onWSConnect(WebSocketConnection conn);

	/**
	 * Disconnect WebSocket client.
	 * 
	 * @param conn WebSocketConnection
	 */
	public void onWSDisconnect(WebSocketConnection conn);
	
}