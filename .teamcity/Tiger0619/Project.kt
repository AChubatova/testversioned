package Tiger0619

import Tiger0619.buildTypes.*
import Tiger0619.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0619")
    name = "Tiger0619"

    vcsRoot(Tiger0619_cVCSroot)

    buildType(Tiger0619_Hi3)
    buildType(Tiger0619_Hi2)
    buildType(Tiger0619_Hi1)
    buildType(Tiger0619_Hi0)
})
