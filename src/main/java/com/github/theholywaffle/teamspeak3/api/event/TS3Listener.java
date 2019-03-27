package com.github.theholywaffle.teamspeak3.api.event;

/*
 * #%L
 * TeamSpeak 3 Java API
 * %%
 * Copyright (C) 2014 Bert De Geyter
 * %%
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 * 
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 * #L%
 */

/**
 * Interface used to listen to events from a TeamSpeak3 server.
 * <p><i>
 * Directly using this interface requires implementing all listener methods, even if you don't intend to use them.
 * Consider extending {@link TS3EventAdapter} instead.
 * </i></p>
 *
 * @see com.github.theholywaffle.teamspeak3.TS3Api#addTS3Listeners(TS3Listener...)
 * @see com.github.theholywaffle.teamspeak3.TS3ApiAsync#addTS3Listeners(TS3Listener...)
 */
public interface TS3Listener {

	void onTextMessage(TextMessageEvent e);

	void onClientJoin(ClientJoinEvent e);

	void onClientLeave(ClientLeaveEvent e);

	void onServerEdit(ServerEditedEvent e);

	void onChannelEdit(ChannelEditedEvent e);

	void onChannelDescriptionChanged(ChannelDescriptionEditedEvent e);

	void onClientMoved(ClientMovedEvent e);

	void onChannelCreate(ChannelCreateEvent e);

	void onChannelDeleted(ChannelDeletedEvent e);

	void onChannelMoved(ChannelMovedEvent e);

	void onChannelPasswordChanged(ChannelPasswordChangedEvent e);

	void onPrivilegeKeyUsed(PrivilegeKeyUsedEvent e);
}
