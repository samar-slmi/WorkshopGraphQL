package graphql;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import entities.Module;
import repository.ModuleBusiness;

import java.util.List;

public class query implements GraphQLQueryResolver {

    private ModuleBusiness mb;

    public query(ModuleBusiness mb) {
        this.mb = mb;
    }

    public List<Module> getallmodules() {
        return mb.getAllModules();
    }
}