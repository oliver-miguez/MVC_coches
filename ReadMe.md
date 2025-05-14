```mermaid
sequenceDiagram
    participant App
    participant View
    participant Controller
    participant Model
    
    App ->> View: Algo 
    activate View
    View -->> App: SI
    deactivate View
    
 ```
     