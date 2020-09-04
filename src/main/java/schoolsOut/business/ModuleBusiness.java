package schoolsOut.business;

import schoolsOut.model.Module;
import schoolsOut.repository.ModuleRepository;

import java.util.List;

public class ModuleBusiness {
    ModuleRepository moduleRepository = new ModuleRepository();

    public Module getModuleById(Long id) {

        return moduleRepository.getModuleById(id);
    }


    public List<Module> getAllModules() {
        return moduleRepository.getAllModules();
    }

    public Module saveModule(Module module) {

        return moduleRepository.saveModule(module);
    }


    public void deleteModule(Module module) {
        moduleRepository.deleteModule(module);

    }
}
