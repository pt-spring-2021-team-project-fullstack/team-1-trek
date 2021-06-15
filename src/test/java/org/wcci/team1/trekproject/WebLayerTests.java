package org.wcci.team1.trekproject;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@ExtendWith(SpringExtension.class)
@WebMvcTest
public class WebLayerTests {

    @MockBean
    private TrekRepository trekRepo;

    @MockBean
    private TrekTypeRepository trekTypeRepo;

    @MockBean
    private ContinentRepository continentRepo;

    @MockBean
    private RegionRepository regionRepo;

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void treksShouldBeOkAndReturnTreksViewWithTrekModelAttribute() throws Exception{
        mockMvc.perform(get("/treks"))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(view().name("treksView"))
                .andExpect(model().attributeExists("treks"));
    }
    @Test
    public void trekTypeShouldBeOkAndReturnTrekTypesViewWithModelTrekTypesAttribute() throws Exception{
        mockMvc.perform(get("/trekTypes"))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(view().name("trekTypesView"))
                .andExpect(model().attributeExists("trekTypes"));
    }

    @Test
    public void continentShouldBeOkAndReturnContinentsViewWithModelContinentsAttribute() throws Exception{
        mockMvc.perform(get("/continents"))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(view().name("continentsView"))
                .andExpect(model().attributeExists("continents"));
    }
    @Test
    public void regionShouldBeOkAndReturnRegionsViewWithModelRegionAttribute() throws Exception{
        mockMvc.perform(get("/regions"))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(view().name("regionsView"))
                .andExpect(model().attributeExists("regions"));
    }
}
