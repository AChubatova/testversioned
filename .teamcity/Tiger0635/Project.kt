package Tiger0635

import Tiger0635.buildTypes.*
import Tiger0635.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0635")
    name = "Tiger0635"

    vcsRoot(Tiger0635_cVCSroot)

    buildType(Tiger0635_Hi2)
    buildType(Tiger0635_Hi1)
    buildType(Tiger0635_Hi3)
    buildType(Tiger0635_Hi0)
})
