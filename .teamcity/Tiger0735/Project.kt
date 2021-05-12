package Tiger0735

import Tiger0735.buildTypes.*
import Tiger0735.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0735")
    name = "Tiger0735"

    vcsRoot(Tiger0735_cVCSroot)

    buildType(Tiger0735_Hi3)
    buildType(Tiger0735_Hi2)
    buildType(Tiger0735_Hi1)
    buildType(Tiger0735_Hi0)
})
