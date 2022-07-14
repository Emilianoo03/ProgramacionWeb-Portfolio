import { Route, Routes } from "react-router-dom";
import CreateContact from "./Pages/CreateContacto";
import Navbar from "./Components/Navbar";
import EditContacto from "./Pages/EditContacto";
import Home from "./Pages/Home";
import ShowContacto from "./Pages/ShowContacto";

function App() {
  return (
    <>
      <Navbar />
      <Routes>
            <Route path="/" element={<Home />} />
            <Route path="/contactos" element={<CreateContact />} />
            <Route path="/contactos/show/:id" element={<ShowContacto />} />
            <Route path="/contactos/edit/:id" element={<EditContacto />} />
        </Routes>
    </>
  );
}

export default App;
