## 📚 Spring Boot WebSocket Chat Application

## 🚀 **Features**

* ✅ Real-time messaging with WebSocket + STOMP (Simple  Text Oriented  Messaging  Protocol)
* ✅ Join/leave notifications
* ✅ Message broadcast to all connected users
* ✅ Online presence management
* ✅ Frontend built with simple HTML, CSS, JavaScript (no frameworks)
  
## ✅ **Dependencies**

*  WebSocket
* Spring web
* Lombok
  
## 💡 **Troubleshooting**

* Make sure `MessageType` enum has `CHAT`, `JOIN`, and `LEAVE`.
* Ensure your `ChatMessage` has `getType()`, `getSender()`, `getContent()`.
* Use `@EventListener` for disconnect events.
* Use `SockJS` fallback to handle browsers that don’t support native WebSocket.
