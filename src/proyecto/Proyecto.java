package proyecto;

import Datos.Edificios;
import Datos.Facultad;
import java.util.ArrayList;

public class Proyecto {

    public static void main(String[] args) {
            ArrayList<Edificios> Che = null;
            ArrayList<Edificios> Ciencias = null;
            ArrayList<Edificios> Leyes = null;
            ArrayList<Edificios> Salud = null;
            ArrayList<Edificios> CienciasAgrarias = null;
            ArrayList<Edificios> Artes = null;
            ArrayList<Edificios> Ingenieria = null;
            ArrayList<Edificios> Fumanas= null;
            
            //Che 
            ArrayList<Edificios> contiguosChe = null;
            Edificios che = new Edificios("Che");
            Che.add(che);
            
            //Ciencias
            ArrayList<Edificios> contiguosFEM = null;
            Edificios FEM = new Edificios("FEM");
            ArrayList<Edificios> contiguosBiologia  = null;
            Edificios Biologia = new Edificios("Biologia");
            ArrayList<Edificios> contiguosGenetica = null;
            Edificios Genetica  = new Edificios("CienciasNaturales");
            ArrayList<Edificios> contiguosQuimica  = null;
            Edificios Quimica = new Edificios("Quimica");
            ArrayList<Edificios> contiguosFarmacia  = null;
            Edificios Farmacia = new Edificios("Farmacia");
            ArrayList<Edificios> contiguosFacultasCiencias = null;
            Edificios FacultasCiencias = new Edificios("FacultasCiencias");
            Ciencias.add(FEM);
            Ciencias.add(Biologia);
            Ciencias.add(Genetica);
            Ciencias.add(Quimica);
            Ciencias.add(Farmacia);
            Ciencias.add(FacultasCiencias);
            
            //Derecho
            ArrayList<Edificios> contiguosDerecho = null;
            Edificios Derecho  = new Edificios("Derecho");
            Leyes.add(Derecho);
            
            
            //Medicina
            ArrayList<Edificios> contiguosMedicina = null;
            Edificios Medicina   = new Edificios("Medicina" );
            ArrayList<Edificios> contiguosEnfermeria = null;
            Edificios Enfermeria = new Edificios("Enfermeria" );
            ArrayList<Edificios> contiguosOdontologia = null;
            Edificios Odontologia = new Edificios("Odontologia" );
            Salud.add(Medicina);
            Salud.add(Enfermeria);
            Salud.add(Odontologia);
            
            
            //CienciasAgrarias
            ArrayList<Edificios> contiguosPequeñosAnimales = null;
            Edificios PequeñosAnimales = new Edificios("Pequeños Animales" );
            ArrayList<Edificios> contiguosVeterinaria = null;
            Edificios Veterinaria = new Edificios("Veterinaria" );
            ArrayList<Edificios> contiguosSaludAnimal = null;
            Edificios SaludAnimal  = new Edificios("SaludAnimal" );
            ArrayList<Edificios> contiguosAgronomia = null;
            Edificios Agronomia = new Edificios("Agronomia" );
            CienciasAgrarias.add(PequeñosAnimales);
            CienciasAgrarias.add(Veterinaria);
            CienciasAgrarias.add(SaludAnimal);
            CienciasAgrarias.add(Agronomia);
            
            
            //Artes
            ArrayList<Edificios> contiguosArquitectura = null;
            Edificios Arquitectura = new Edificios("Arquitectura" );
            ArrayList<Edificios> contiguosBellasArtes  = null;
            Edificios BellasArtes = new Edificios("BellasArtes");
            ArrayList<Edificios> contiguosConservatorio  = null;
            Edificios Conservatorio = new Edificios("Conservatorio");
            ArrayList<Edificios> contiguosMuseo  = null;
            Edificios Museo = new Edificios("Museo de Arte");
            ArrayList<Edificios> contiguosAulas  = null;
            Edificios Aulas = new Edificios("Aulas de Construiccion");
            Artes.add(Arquitectura);
            Artes.add(BellasArtes);
            Artes.add(Conservatorio);
            Artes.add(Museo);
            Artes.add(Aulas);
            
            
            //Ingenieria
            ArrayList<Edificios> contiguosAulasIngenieria  = null;
            Edificios AulasIngenieria = new Edificios("Aulas de Ingenieria");
            ArrayList<Edificios> contiguosCYT  = null;
            Edificios CYT = new Edificios("CYT");
            ArrayList<Edificios> contiguosPatios  = null;
            Edificios Patios = new Edificios("Patios");
            ArrayList<Edificios> contiguosLabIngenieriaQuimica  = null;
            Edificios LabIngenieriaQuimica = new Edificios("LabIngenieriaQuimica");
            ArrayList<Edificios> contiguosViejo  = null;
            Edificios Viejo  = new Edificios("Viejo ");
            ArrayList<Edificios> contiguosCADE  = null;
            Edificios CADE = new Edificios("CADE");
            ArrayList<Edificios> contiguosIEI  = null;
            Edificios IEI = new Edificios("IEI");
            Ingenieria.add(AulasIngenieria);
            Ingenieria.add(IEI);
            Ingenieria.add(CYT);
            Ingenieria.add(Patios);
            Ingenieria.add(LabIngenieriaQuimica);
            Ingenieria.add(CADE);
            
            //Fumanas
            ArrayList<Edificios> contiguosAulasHumanas  = null;
            Edificios AulasHumanas = new Edificios("Aulas de Humanas");
            ArrayList<Edificios> contiguosCienciasHumanas  = null;
            Edificios CienciasHumanas  = new Edificios("Ciencias Humanas ");
            ArrayList<Edificios> contiguosPosgradosHumanas  = null;
            Edificios PosgradosHumanas = new Edificios("Posgrados Humanas");
            
            //Conexiones
            contiguosFEM.add(Arquitectura);
            contiguosFEM.add(CADE);
            contiguosFEM.add(Biologia);
            contiguosFEM.add(IEI);
            contiguosFEM.add(Quimica);
            contiguosFEM.add(Viejo);
            contiguosBiologia.add(Genetica);
            contiguosBiologia.add(FEM);
            contiguosBiologia.add(Patios);
            contiguosGenetica.add(Biologia);
            contiguosFarmacia.add(Quimica);
            contiguosFarmacia.add(che);
            contiguosFacultasCiencias.add(PequeñosAnimales);
            contiguosFacultasCiencias.add(Quimica);
            contiguosQuimica.add(FacultasCiencias);
            contiguosQuimica.add(CYT);
            contiguosQuimica.add(Aulas);
            contiguosQuimica.add(IEI);
            contiguosQuimica.add(FEM);
            contiguosQuimica.add(Viejo);
            contiguosQuimica.add(Farmacia);
            contiguosQuimica.add(Medicina);
            
            contiguosChe.add(BellasArtes);
            contiguosChe.add(Museo);
            contiguosChe.add(Conservatorio);
            contiguosChe.add(Viejo);
            contiguosChe.add(Farmacia);
            contiguosChe.add(Medicina);
            contiguosChe.add(Derecho);
            contiguosChe.add(CienciasHumanas);
            
            contiguosDerecho.add(che);
            contiguosDerecho.add(Enfermeria);
            contiguosDerecho.add(CienciasHumanas);
            
            contiguosPequeñosAnimales.add(Agronomia);
            contiguosPequeñosAnimales.add(FacultasCiencias);
            contiguosPequeñosAnimales.add(Veterinaria);
            contiguosPequeñosAnimales.add(PosgradosHumanas);
            
            contiguosAgronomia.add(PequeñosAnimales);
                        
            contiguosSaludAnimal.add(FacultasCiencias);
            contiguosSaludAnimal.add(Veterinaria);
            contiguosSaludAnimal.add(PosgradosHumanas);
            
            contiguosVeterinaria.add(SaludAnimal);
            
            contiguosArquitectura.add(BellasArtes);
            contiguosArquitectura.add(Conservatorio);
            contiguosArquitectura.add(FEM);
              contiguosMuseo.add(che);
            
            contiguosAulas.add(Arquitectura);
            
            contiguosBellasArtes.add(che);
            contiguosBellasArtes.add(Viejo);
            contiguosBellasArtes.add(Arquitectura);
            
            contiguosAulasHumanas.add(Odontologia);
            contiguosAulasHumanas.add(PosgradosHumanas);
            contiguosAulasHumanas.add(CienciasHumanas);
            
            contiguosPosgradosHumanas.add(AulasHumanas);
            contiguosPosgradosHumanas.add(Odontologia);
            contiguosPosgradosHumanas.add(SaludAnimal);
            
            contiguosMedicina.add(Quimica);
            contiguosMedicina.add(Enfermeria);
            contiguosMedicina.add(che);
            
            contiguosOdontologia.add(PosgradosHumanas);
            contiguosOdontologia.add(AulasHumanas);
            contiguosOdontologia.add(Enfermeria);
            
            contiguosEnfermeria.add(Medicina);
            contiguosEnfermeria.add(Odontologia);
            contiguosEnfermeria.add(CienciasHumanas);
            contiguosEnfermeria.add(Derecho);
            
            //Facultades
            Facultad ciencias= new Facultad("ciencias", 5, Ciencias);
            Facultad artes = new Facultad("Artes", 5, Artes);
            Facultad plazache= new Facultad("Plaza Che", 3, Che);
            Facultad medicina= new Facultad("Medicina", 3, Che);
            Facultad ingenieria=new Facultad("Ingenieria", 7, Ingenieria);
            Facultad leyes=new Facultad("leyes", 1,Leyes);
            Facultad cienciasAgrarias=new Facultad("ciencias Agrarias", 7,CienciasAgrarias);
            Facultad fumanas=new Facultad("Fumanas", 7,Fumanas);
    }
    
}
