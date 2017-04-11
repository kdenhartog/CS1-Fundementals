package edu.purdue.cs.cs180.safewalk;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import edu.purdue.cs.cs180.channel.Channel;
import edu.purdue.cs.cs180.channel.MessageListener;
import edu.purdue.cs.cs180.channel.ChannelException;
import edu.purdue.cs.cs180.channel.TCPChannel;

public class RequestActivity extends Activity implements MessageListener {

	//TCPChannel channel = null;
	Handler mHandler = null;
	
	protected int clientId;
	protected Channel channel;
	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_request);

		// the submit button.
		// implements the submit on the kindle
		final Button button = (Button) findViewById(R.id.submit_button);
		final Spinner locations = (Spinner) findViewById(R.id.locations_spinner);
		final Spinner urgencies = (Spinner) findViewById(R.id.urgencies_spinner);
		final TextView status = (TextView) findViewById(R.id.status_textview);

		//TODO: Add channel creation code here.
		try{
			channel = new TCPChannel("hostname", 8264); // contacting the server
		}
		catch (ChannelException ex) {
			ex.printStackTrace();
			System.exit(1);
		}
		channel.setMessageListener(this);
		clientId = channel.getID();
		
		// initialize the JFrame.
		// A handler is needed since the message received is called from a
		// different Thread, and only the main thread can update the UI.
		// As a workaround, we create a handler in the main thread that displays
		// whatever it receives from the message received.
		mHandler = new Handler() {
			@Override
			public void handleMessage(android.os.Message msg) {
				Message safeWalkMessage = (Message) msg.obj;
				//TODO: handle the received message.
			}
				
		};

		// The on click event.
		button.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				Spinner locations = (Spinner) findViewById(R.id.locations_spinner);
				String selectedItem = (String) locations.getSelectedItem();
                                String level = (String) urgencies.getSelectedItem();
				urgencies.setEnabled(false);
				locations.setEnabled(false);
				button.setEnabled(false);
				//TODO: send a message to the Server.
				try {
					// send a message.
					//sends message based on selected item from the list 
					channel.sendMessage(new Message(Message.Type.Request, selectedItem + " " + level, clientId).toString());
				} catch (ChannelException ex) {
					ex.printStackTrace();
					System.exit(1);
				}
			}
		});
	}

	@Override
	public void messageReceived(String message, int clientID) {
		// Create a handler message, and send it to the Main Thread.
		Message safeWalkMessage = new Message(message, clientID);
		android.os.Message msg = new android.os.Message();
		msg.obj = safeWalkMessage;
		mHandler.sendMessage(msg);
	}
	
	/**
	 * Close the application if sent to the background.
	 */
	@Override
	//pauses the application and exits
	protected void onPause() {
	    super.onPause();
	    System.exit(0);
	}
}
