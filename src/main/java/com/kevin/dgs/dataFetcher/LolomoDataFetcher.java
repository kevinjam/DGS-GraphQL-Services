package com.kevin.dgs.dataFetcher;

import java.util.List;

@DGSComponent
public class LolomoDataFetcher {

    @DGSQuery
    public List<ShowCategory> lolomo(@InputArgument String category) {
        return List.of(
                ShowCategory.builder().name("Lolomo").show(List.of("Show 1")).build()
        );
    }
}
