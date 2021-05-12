package Tiger0825

import Tiger0825.buildTypes.*
import Tiger0825.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0825")
    name = "Tiger0825"

    vcsRoot(Tiger0825_cVCSroot)

    buildType(Tiger0825_Hi0)
    buildType(Tiger0825_Hi1)
    buildType(Tiger0825_Hi2)
    buildType(Tiger0825_Hi3)
})
