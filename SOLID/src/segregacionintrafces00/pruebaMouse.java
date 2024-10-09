package segregacionintrafces00;

import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

import org.w3c.dom.events.EventTarget;
import org.w3c.dom.views.AbstractView;

public class pruebaMouse {
	org.w3c.dom.events.MouseEvent mmm=new org.w3c.dom.events.MouseEvent() {
		
		@Override
		public void stopPropagation() {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void preventDefault() {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void initEvent(String eventTypeArg, boolean canBubbleArg, boolean cancelableArg) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public String getType() {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public long getTimeStamp() {
			// TODO Auto-generated method stub
			return 0;
		}
		
		@Override
		public EventTarget getTarget() {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public short getEventPhase() {
			// TODO Auto-generated method stub
			return 0;
		}
		
		@Override
		public EventTarget getCurrentTarget() {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public boolean getCancelable() {
			// TODO Auto-generated method stub
			return false;
		}
		
		@Override
		public boolean getBubbles() {
			// TODO Auto-generated method stub
			return false;
		}
		
		@Override
		public void initUIEvent(String typeArg, boolean canBubbleArg, boolean cancelableArg, AbstractView viewArg,
				int detailArg) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public AbstractView getView() {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public int getDetail() {
			// TODO Auto-generated method stub
			return 0;
		}
		
		@Override
		public void initMouseEvent(String typeArg, boolean canBubbleArg, boolean cancelableArg, AbstractView viewArg,
				int detailArg, int screenXArg, int screenYArg, int clientXArg, int clientYArg, boolean ctrlKeyArg,
				boolean altKeyArg, boolean shiftKeyArg, boolean metaKeyArg, short buttonArg, EventTarget relatedTargetArg) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public boolean getShiftKey() {
			// TODO Auto-generated method stub
			return false;
		}
		
		@Override
		public int getScreenY() {
			// TODO Auto-generated method stub
			return 0;
		}
		
		@Override
		public int getScreenX() {
			// TODO Auto-generated method stub
			return 0;
		}
		
		@Override
		public EventTarget getRelatedTarget() {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public boolean getMetaKey() {
			// TODO Auto-generated method stub
			return false;
		}
		
		@Override
		public boolean getCtrlKey() {
			// TODO Auto-generated method stub
			return false;
		}
		
		@Override
		public int getClientY() {
			// TODO Auto-generated method stub
			return 0;
		}
		
		@Override
		public int getClientX() {
			// TODO Auto-generated method stub
			return 0;
		}
		
		@Override
		public short getButton() {
			// TODO Auto-generated method stub
			return 0;
		}
		
		@Override
		public boolean getAltKey() {
			// TODO Auto-generated method stub
			return false;
		}
	};

	MouseMotionListener mm=new MouseMotionListener() {
		
		@Override
		public void mouseMoved(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void mouseDragged(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
	};
}
