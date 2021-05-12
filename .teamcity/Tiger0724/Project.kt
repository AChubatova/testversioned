package Tiger0724

import Tiger0724.buildTypes.*
import Tiger0724.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0724")
    name = "Tiger0724"

    vcsRoot(Tiger0724_cVCSroot)

    buildType(Tiger0724_Hi0)
    buildType(Tiger0724_Hi1)
    buildType(Tiger0724_Hi2)
    buildType(Tiger0724_Hi3)
})
