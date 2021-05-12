package Tiger078

import Tiger078.buildTypes.*
import Tiger078.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger078")
    name = "Tiger078"

    vcsRoot(Tiger078_cVCSroot)

    buildType(Tiger078_Hi0)
    buildType(Tiger078_Hi1)
    buildType(Tiger078_Hi2)
    buildType(Tiger078_Hi3)
})
