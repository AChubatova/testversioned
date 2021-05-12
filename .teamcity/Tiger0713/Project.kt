package Tiger0713

import Tiger0713.buildTypes.*
import Tiger0713.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0713")
    name = "Tiger0713"

    vcsRoot(Tiger0713_cVCSroot)

    buildType(Tiger0713_Hi1)
    buildType(Tiger0713_Hi0)
    buildType(Tiger0713_Hi3)
    buildType(Tiger0713_Hi2)
})
